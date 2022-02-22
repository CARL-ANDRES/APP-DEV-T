package com.example.kiddiestories;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class QuizScoresActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_scores);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
    }

    public void q1(View view) {
        startActivity(new Intent(this, ScoresActivity.class)
                .putExtra("q", 1)
                .putExtra("quizName", btn1.getText().toString()));
    }

    public void q2(View view) {
        startActivity(new Intent(this, ScoresActivity.class)
                .putExtra("q", 2)
                .putExtra("quizName", btn2.getText().toString()));
    }

    public void q3(View view) {
        startActivity(new Intent(this, ScoresActivity.class)
                .putExtra("q", 3)
                .putExtra("quizName", btn3.getText().toString()));
    }

    public void q4(View view) {
        startActivity(new Intent(this, ScoresActivity.class)
                .putExtra("q", 4)
                .putExtra("quizName", btn4.getText().toString()));
    }

    public void q5(View view) {
        startActivity(new Intent(this, ScoresActivity.class)
                .putExtra("q", 5)
                .putExtra("quizName", btn5.getText().toString()));
    }

    public void q6(View view) {
        startActivity(new Intent(this, ScoresActivity.class)
                .putExtra("q", 6)
                .putExtra("quizName", btn6.getText().toString()));
    }

    public void q7(View view) {
        startActivity(new Intent(this, ScoresActivity.class)
                .putExtra("q", 7)
                .putExtra("quizName", btn7.getText().toString()));
    }

    public void q8(View view) {
        startActivity(new Intent(this, ScoresActivity.class)
                .putExtra("q", 8)
                .putExtra("quizName", btn8.getText().toString()));
    }

    public void q9(View view) {
        startActivity(new Intent(this, ScoresActivity.class)
                .putExtra("q", 9)
                .putExtra("quizName", btn9.getText().toString()));
    }

    public void q10(View view) {
        startActivity(new Intent(this, ScoresActivity.class)
                .putExtra("q", 10)
                .putExtra("quizName", btn10.getText().toString()));
    }
}