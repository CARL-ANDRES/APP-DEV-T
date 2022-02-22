package com.example.kiddiestories;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.kiddiestories.classes.GlobalVariables;
import com.example.kiddiestories.classes.Quiz;
import com.example.kiddiestories.classes.Score;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class QuizActivity extends AppCompatActivity {
    private static ArrayList<Quiz> quizArrayList = new ArrayList<>();
    ImageView ivTest;
    TextView tvQuestion;
    int position = 0;
    TextView tvNumber;
    Button btn1, btn2;
    TextView tvAnswer, tvChosen, tvScore;
    int mScore = 0;
    ProgressDialog progressDialog;
    FirebaseAuth firebaseAuth;
    FirebaseUser firebaseUser;
    DatabaseReference databaseReference;
    String email;
    Date date;
    Score score;
    int q;
    GlobalVariables globalVariables;
    String quizName;
    TextView tvQuizName;
    SimpleDateFormat simpleDateFormat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        ivTest = findViewById(R.id.ivTest);
        tvQuestion = findViewById(R.id.tvQuestion);
        tvNumber = findViewById(R.id.tvNumber);
        tvAnswer = findViewById(R.id.tvAnswer);
        tvChosen = findViewById(R.id.tvChosen);
        tvScore = findViewById(R.id.tvScore);
        tvQuizName = findViewById(R.id.tvQuizName);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Getting data");
        progressDialog.setMessage("Loading please wait...");
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.show();

        firebaseAuth = FirebaseAuth.getInstance();
        firebaseUser = firebaseAuth.getCurrentUser();
        email = firebaseUser.getEmail();
        databaseReference = FirebaseDatabase.getInstance().getReference("scores");

        globalVariables = (GlobalVariables) this.getApplication();
        Intent intent = getIntent();
        q = intent.getIntExtra("q", 0);
        quizName = intent.getStringExtra("quizName");

        tvQuizName.setText(quizName);

        getQuiz();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                showQuiz(position);
            }
        }, 2000);
    }

    private void getQuiz() {
        if (q == 1) {
            quizArrayList = globalVariables.getQuiz1();
        } else if (q == 2) {
            quizArrayList = globalVariables.getQuiz2();
        } else if (q == 3) {
            quizArrayList = globalVariables.getQuiz3();
        } else if (q == 4) {
            quizArrayList = globalVariables.getQuiz4();
        } else if (q == 5) {
            quizArrayList = globalVariables.getQuiz5();
        } else if (q == 6) {
            quizArrayList = globalVariables.getQuiz6();
        } else if (q == 7) {
            quizArrayList = globalVariables.getQuiz7();
        } else if (q == 8) {
            quizArrayList = globalVariables.getQuiz8();
        } else if (q == 9) {
            quizArrayList = globalVariables.getQuiz9();
        } else if (q == 10) {
            quizArrayList = globalVariables.getQuiz10();
        } else if (q == 11) {
            quizArrayList = globalVariables.getQuiz11();
        } else if (q == 12) {
            quizArrayList = globalVariables.getQuiz12();
        } else {
            quizArrayList = globalVariables.getQuiz13();
        }

    }

    private void showQuiz(int position) {
        int img = quizArrayList.get(position).getTestImage();

        if (img != 0) {
            Glide.with(getApplicationContext()).load(img).into(ivTest);
            ivTest.setVisibility(View.VISIBLE);
        } else {
            ivTest.setVisibility(View.GONE);
        }

        tvQuestion.setText(quizArrayList.get(position).getQuestion());
        tvNumber.setText("QUESTION " + (position + 1) + "/" + quizArrayList.size());
        btn1.setText(quizArrayList.get(position).getC1());
        btn2.setText(quizArrayList.get(position).getC2());
        tvAnswer.setText(quizArrayList.get(position).getAnswer());
        tvChosen.setText("");
        tvScore.setText(String.valueOf(mScore));
        progressDialog.dismiss();
    }

    public void btn1(View view) {
        String c1 = btn1.getText().toString();
        tvChosen.setText(c1);

        btn2.setBackgroundColor(btn2.getContext().getResources().getColor(R.color.purple_500));
        btn1.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.purple_200));
    }

    public void btn2(View view) {
        String c2 = btn2.getText().toString();

        tvChosen.setText(c2);

        btn2.setBackgroundColor(btn2.getContext().getResources().getColor(R.color.purple_200));
        btn1.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.purple_500));
    }

    public void submit(View view) {
        if (tvChosen.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please select an answer...", Toast.LENGTH_SHORT).show();
        } else {
            if (tvChosen.getText().toString().equalsIgnoreCase(tvAnswer.getText().toString())) {
                mScore++;
            }
            if (position + 1 >= quizArrayList.size()) {
                AlertDialog.Builder alert = new AlertDialog.Builder(this);
                alert.setMessage("Your score is " + String.valueOf(mScore) + "/" + quizArrayList.size());
                alert.setCancelable(false);
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy ");
                        date = new Date();

                        String id = databaseReference.push().getKey();

                        score = new Score(email, quizName, mScore + "/" + quizArrayList.size(), simpleDateFormat.format(date));

                        databaseReference.child(id).setValue(score);
                        finish();
                    }
                });
                alert.show();
            } else {
                btn2.setBackgroundColor(btn2.getContext().getResources().getColor(R.color.purple_500));
                btn1.setBackgroundColor(btn1.getContext().getResources().getColor(R.color.purple_500));
                position++;
                showQuiz(position);
            }
        }
    }
}