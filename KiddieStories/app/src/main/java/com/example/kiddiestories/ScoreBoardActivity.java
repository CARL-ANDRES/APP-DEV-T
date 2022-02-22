package com.example.kiddiestories;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ScoreBoardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_board);

    }



    public void q11(View view) {
        startActivity(new Intent(this, ScoresActivity.class)
                .putExtra("q", 11)
                .putExtra("quizName", "Flash Cards"));
    }

    public void q12(View view) {
        startActivity(new Intent(this, ScoresActivity.class)
                .putExtra("q", 11)
                .putExtra("quizName", "Uppercase"));
    }
    public void q13(View view) {
        startActivity(new Intent(this, ScoresActivity.class)
                .putExtra("q", 11)
                .putExtra("quizName", "Lowercase"));
    }

    public void stories(View view) {
        startActivity(new Intent(this, QuizScoresActivity.class)
                .putExtra("q", 11)
                .putExtra("quizName", "Lowercase"));
    }
}