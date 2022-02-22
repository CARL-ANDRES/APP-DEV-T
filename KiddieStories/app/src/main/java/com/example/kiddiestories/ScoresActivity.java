package com.example.kiddiestories;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.kiddiestories.adapters.ScoresAdapter;
import com.example.kiddiestories.classes.Score;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ScoresActivity extends AppCompatActivity {

    FirebaseAuth firebaseAuth;
    FirebaseUser firebaseUser;
    String email;
    SimpleDateFormat simpleDateFormat;
    Date date;
    DatabaseReference databaseReference;
    ListView lvScore;
    ProgressDialog progressDialog;
    ScoresAdapter scoresAdapter;
    Score score;
    ArrayList<Score> scoreArrayList = new ArrayList<>();
    String quizName;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores);
        Intent intent = getIntent();
        dialog = new Dialog(this);
        quizName = intent.getStringExtra("quizName");
        firebaseAuth = FirebaseAuth.getInstance();
        firebaseUser = firebaseAuth.getCurrentUser();
        email = firebaseUser.getEmail();
        lvScore = findViewById(R.id.lvScores);
        databaseReference = FirebaseDatabase.getInstance().getReference("scores");
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Please wait...");
        progressDialog.setTitle("Getting scores");
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.show();

        getScores();
    }

    public void getScores() {
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                scoreArrayList.clear();

                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    Score score = dataSnapshot.getValue(Score.class);

                    String email = score.getEmail();
                    String qName = score.getQuizName();

                    if (email.equalsIgnoreCase(firebaseUser.getEmail()) && (qName.equalsIgnoreCase(quizName))) {
                        scoreArrayList.add(score);
                    } else {
                    }

                }

                scoresAdapter = new ScoresAdapter(ScoresActivity.this, scoreArrayList);
                lvScore.setAdapter(scoresAdapter);
                if (scoreArrayList.size() == 0) {

                    dialog.setContentView(R.layout.layout_meaning);
                    dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
                    TextView tvWord = dialog.findViewById(R.id.tvWord);
                    TextView tvMeaning = dialog.findViewById(R.id.tvMeaning);
                    Button btnClose = dialog.findViewById(R.id.btnClose);
                    dialog.setCancelable(false);

                    tvWord.setText("Error");
                    tvMeaning.setText("No Data Found!");
                    btnClose.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            dialog.dismiss();
                            finish();
                        }
                    });
                    try {
                        dialog.show();
                    } catch (WindowManager.BadTokenException e) {

                    }
                }
                progressDialog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}