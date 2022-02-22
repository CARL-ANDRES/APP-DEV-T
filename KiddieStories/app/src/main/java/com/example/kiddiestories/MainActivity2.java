package com.example.kiddiestories;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class MainActivity2 extends AppCompatActivity {
    TextView tvWelcome;

    FirebaseAuth firebaseAuth;
    FirebaseUser firebaseUser;
    DatabaseReference databaseReference;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvWelcome = findViewById(R.id.tvWelcome);
        progressDialog = new ProgressDialog(this);
        firebaseAuth = FirebaseAuth.getInstance();
        firebaseUser = firebaseAuth.getCurrentUser();
        databaseReference = FirebaseDatabase.getInstance().getReference("users");

        getUser();

    }

    public void getUser() {

        progressDialog.setMessage("Please wait...");
        progressDialog.setTitle("Getting data...");
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.show();
        Query checkUser = databaseReference.orderByChild("email");

        String email = firebaseUser.getEmail();

        checkUser.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String _email = email.replace(".com", "");
                String gEmail = snapshot.child(_email).child("email").getValue(String.class);
                String fname = snapshot.child(_email).child("fname").getValue(String.class);
                String lname = snapshot.child(_email).child("lname").getValue(String.class);

                tvWelcome.setText("WELCOME\n" + fname + " " + lname);
                progressDialog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                progressDialog.dismiss();
            }
        });
    }

    public void profile(View view) {
        Intent intent = new Intent(MainActivity2.this, profile.class);
        startActivity(intent);
    }

    public void stories(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(intent);
    }

    public void favorites(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity14.class);
        startActivity(intent);
    }

    public void quiz(View view) {
        Intent intent = new Intent(MainActivity2.this, QuizListActivity.class);
        startActivity(intent);
    }


    public void scores(View view) {
        Intent intent = new Intent(MainActivity2.this, ScoreBoardActivity.class);
        startActivity(intent);
    }

    public void dictionary(View view) {
        Intent intent = new Intent(MainActivity2.this, DictionaryActivity.class);
        startActivity(intent);
    }
}
