package com.example.kiddiestories;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class QuizListActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_list);
    }

    public void q11(View view) {
        startActivity(new Intent(this, QuizActivity.class)
                .putExtra("q", 11)
                .putExtra("quizName", "Flash Cards"));
    }

    public void q12(View view) {startActivity(new Intent(this, QuizActivity.class)
            .putExtra("q", 12)
            .putExtra("quizName", "Uppercase"));
    }

    public void q13(View view) {startActivity(new Intent(this, QuizActivity.class)
            .putExtra("q", 13)
            .putExtra("quizName", "Lowercase"));
    }

    public void stories(View view) {
        startActivity(new Intent(this,StoryQuizActivity.class));
    }
}