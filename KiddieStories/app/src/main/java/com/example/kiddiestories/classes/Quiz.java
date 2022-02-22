package com.example.kiddiestories.classes;

public class Quiz {
    private int testImage;
    private String question,c1,c2,answer;

    public Quiz(int testImage, String question, String c1, String c2, String answer) {
        this.testImage = testImage;
        this.question = question;
        this.c1 = c1;
        this.c2 = c2;
        this.answer = answer;
    }

    public int getTestImage() {
        return testImage;
    }

    public void setTestImage(int testImage) {
        this.testImage = testImage;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getC1() {
        return c1;
    }

    public void setC1(String c1) {
        this.c1 = c1;
    }

    public String getC2() {
        return c2;
    }

    public void setC2(String c2) {
        this.c2 = c2;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
