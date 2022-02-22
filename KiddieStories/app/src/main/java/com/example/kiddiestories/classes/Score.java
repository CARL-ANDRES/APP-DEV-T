package com.example.kiddiestories.classes;

public class Score {
    String email,quizName,score,date;

    public Score(){

    }

    public Score(String email, String quizName, String score, String date) {
        this.email = email;
        this.quizName = quizName;
        this.score = score;
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
