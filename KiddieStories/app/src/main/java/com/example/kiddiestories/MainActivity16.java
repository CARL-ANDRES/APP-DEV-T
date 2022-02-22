package com.example.kiddiestories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity16 extends AppCompatActivity {
    public Button button;
    TextView text1, text2, text3, text4, text5, text6, text7, text8, text9, text10, text11,
            text12, text13, text14, text15, text16, text17, text18, text19, text20, text21, text22, text23, text24, text25, text26;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);

        button = (Button) findViewById(R.id.button);
        final MediaPlayer abc = MediaPlayer.create(this, R.raw.abc);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!abc.isPlaying()) {
                    abc.start();
                } else {
                    abc.pause();
                }
            }
        });
    }

    public void a(View view) {

        text1 = (TextView) findViewById(R.id.text1);
        final MediaPlayer sound = MediaPlayer.create(this, R.raw.sound);
        sound.start();
    }

    public void b(View view) {

        text2 = (TextView) findViewById(R.id.text2);
        final MediaPlayer sound1 = MediaPlayer.create(this, R.raw.sound1);
        sound1.start();
    }

    public void c(View view) {

        text3 = (TextView) findViewById(R.id.text3);
        final MediaPlayer sound2 = MediaPlayer.create(this, R.raw.sound2);
        sound2.start();
    }

    public void d(View view) {

        text4 = (TextView) findViewById(R.id.text4);
        final MediaPlayer sound3 = MediaPlayer.create(this, R.raw.sound3);
        sound3.start();
    }

    public void e(View view) {

        text5 = (TextView) findViewById(R.id.text5);
        final MediaPlayer sound4  = MediaPlayer.create(this, R.raw.sound4);
        sound4.start();
    }

    public void f(View view) {

        text6 = (TextView) findViewById(R.id.text6);
        final MediaPlayer sound5  = MediaPlayer.create(this, R.raw.sound5);
        sound5.start();
    }

    public void g(View view) {

        text7 = (TextView) findViewById(R.id.text7);
        final MediaPlayer sound6  = MediaPlayer.create(this, R.raw.sound6);
        sound6.start();
    }

    public void h(View view) {

        text8 = (TextView) findViewById(R.id.text8);
        final MediaPlayer sound7  = MediaPlayer.create(this, R.raw.sound7);
        sound7.start();
    }

    public void i(View view) {

        text9 = (TextView) findViewById(R.id.text9);
        final MediaPlayer sound8  = MediaPlayer.create(this, R.raw.sound8);
        sound8.start();
    }

    public void j(View view) {

        text10 = (TextView) findViewById(R.id.text10);
        final MediaPlayer sound9  = MediaPlayer.create(this, R.raw.sound9);
        sound9.start();
    }

    public void k(View view) {

        text11 = (TextView) findViewById(R.id.text11);
        final MediaPlayer sound10  = MediaPlayer.create(this, R.raw.sound10);
        sound10.start();
    }

    public void l(View view) {

        text12 = (TextView) findViewById(R.id.text11);
        final MediaPlayer sound11  = MediaPlayer.create(this, R.raw.sound11);
        sound11.start();
    }

    public void m(View view) {

        text13 = (TextView) findViewById(R.id.text13);
        final MediaPlayer sound12  = MediaPlayer.create(this, R.raw.sound12);
        sound12.start();
    }

    public void n(View view) {

        text14 = (TextView) findViewById(R.id.text14);
        final MediaPlayer sound13  = MediaPlayer.create(this, R.raw.sound13);
        sound13.start();
    }

    public void o(View view) {

        text15 = (TextView) findViewById(R.id.text15);
        final MediaPlayer sound14  = MediaPlayer.create(this, R.raw.sound14);
        sound14.start();
    }

    public void p(View view) {

        text16 = (TextView) findViewById(R.id.text16);
        final MediaPlayer sound15  = MediaPlayer.create(this, R.raw.sound15);
        sound15.start();
    }

    public void q(View view) {

        text17 = (TextView) findViewById(R.id.text17);
        final MediaPlayer sound16  = MediaPlayer.create(this, R.raw.sound16);
        sound16.start();
    }

    public void r(View view) {

        text18 = (TextView) findViewById(R.id.text18);
        final MediaPlayer sound17  = MediaPlayer.create(this, R.raw.sound17);
        sound17.start();
    }

    public void s(View view) {

        text19 = (TextView) findViewById(R.id.text19);
        final MediaPlayer sound18  = MediaPlayer.create(this, R.raw.sound18);
        sound18.start();
    }

    public void t(View view) {

        text20 = (TextView) findViewById(R.id.text20);
        final MediaPlayer sound19  = MediaPlayer.create(this, R.raw.sound19);
        sound19.start();
    }
    public void u(View view) {

        text21 = (TextView) findViewById(R.id.text21);
        final MediaPlayer sound20  = MediaPlayer.create(this, R.raw.sound20);
        sound20.start();
    }
    public void v(View view) {

        text22 = (TextView) findViewById(R.id.text22);
        final MediaPlayer sound21  = MediaPlayer.create(this, R.raw.sound21);
        sound21.start();
    }
    public void w(View view) {

        text23 = (TextView) findViewById(R.id.text23);
        final MediaPlayer sound22  = MediaPlayer.create(this, R.raw.sound22);
        sound22.start();
    }
    public void x(View view) {

        text24 = (TextView) findViewById(R.id.text24);
        final MediaPlayer sound23  = MediaPlayer.create(this, R.raw.sound23);
        sound23.start();
    }
    public void y(View view) {

        text25 = (TextView) findViewById(R.id.text25);
        final MediaPlayer sound24  = MediaPlayer.create(this, R.raw.sound24);
        sound24.start();
    }
    public void z(View view) {

        text26 = (TextView) findViewById(R.id.text26);
        final MediaPlayer sound25  = MediaPlayer.create(this, R.raw.sound25);
        sound25.start();
    }



}

