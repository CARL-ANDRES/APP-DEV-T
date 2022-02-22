package com.example.kiddiestories;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity15 extends AppCompatActivity {
    public TextView textview1, textView2, textView3, textView4, textView5, textView6, textView7, textView8,
            textView9, textView10, textView11, textView12,textView13, textView14, textView15,textView16,textView17,
            textView18,textView19, textView20, textView21, textView22, textView23, textView24, textView25,textView26;
    Dialog myDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);

        myDialog = new Dialog(this);

    }

    public void Apple(View view) {
        TextView txtclose;
        myDialog.setContentView(R.layout.apple);

        textview1 = (TextView) findViewById(R.id.textView1);
        final MediaPlayer a = MediaPlayer.create(this,R.raw.a);
         a.start();


        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setText("x");
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

        public void Ball(View view){
            TextView txtclose;
            myDialog.setContentView(R.layout.ball);

            textView2 = (TextView) findViewById(R.id.textView2);
            final MediaPlayer b = MediaPlayer.create(this,R.raw.b);
            b.start();



            txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
            txtclose.setText("x");
            txtclose.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    myDialog.dismiss();
                }
            });
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            myDialog.show();

        }

    public void Car(View view){
        TextView txtclose;
        myDialog.setContentView(R.layout.car);

        textView3 = (TextView) findViewById(R.id.textView3);
        final MediaPlayer c = MediaPlayer.create(this,R.raw.c);
        c.start();


        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setText("x");
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    public void Dog(View view){
        TextView txtclose;
        myDialog.setContentView(R.layout.dog);

        textView4 = (TextView) findViewById(R.id.textView4);
        final MediaPlayer d = MediaPlayer.create(this,R.raw.d);
        d.start();


        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setText("x");
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    public void Elephant(View view){
        TextView txtclose;
        myDialog.setContentView(R.layout.elephant);

        textView5 = (TextView) findViewById(R.id.textView5);
        final MediaPlayer e = MediaPlayer.create(this,R.raw.e);
        e.start();


        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setText("x");
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    public void Fox(View view){
        TextView txtclose;
        myDialog.setContentView(R.layout.fox);

        textView6 = (TextView) findViewById(R.id.textView6);
        final MediaPlayer f = MediaPlayer.create(this,R.raw.f);
        f.start();



        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setText("x");
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    public void Goat(View view){
        TextView txtclose;
        myDialog.setContentView(R.layout.goat);

        textView7 = (TextView) findViewById(R.id.textView7);
        final MediaPlayer g = MediaPlayer.create(this,R.raw.g);
        g.start();



        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setText("x");
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }
    public void Hat(View view){
        TextView txtclose;
        myDialog.setContentView(R.layout.hat);

        textView8 = (TextView) findViewById(R.id.textView8);
        final MediaPlayer h = MediaPlayer.create(this,R.raw.h);
        h.start();


        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setText("x");
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }
    public void Igloo(View view){
        TextView txtclose;
        myDialog.setContentView(R.layout.igloo);

        textView9 = (TextView) findViewById(R.id.textView9);
        final MediaPlayer i = MediaPlayer.create(this,R.raw.i);
        i.start();


        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setText("x");
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }
    public void Joker(View view){
        TextView txtclose;
        myDialog.setContentView(R.layout.joker);

        textView10 = (TextView) findViewById(R.id.textView10);
        final MediaPlayer j = MediaPlayer.create(this,R.raw.j);
        j.start();


        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setText("x");
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }
    public void Kangaroo(View view){
        TextView txtclose;
        myDialog.setContentView(R.layout.kangaroo);

        textView11 = (TextView) findViewById(R.id.textView11);
        final MediaPlayer k = MediaPlayer.create(this,R.raw.k);
        k.start();



        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setText("x");
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    public void Lion(View view){
        TextView txtclose;
        myDialog.setContentView(R.layout.lion);

        textView12 = (TextView) findViewById(R.id.textView12);
        final MediaPlayer l = MediaPlayer.create(this,R.raw.l);
        l.start();


        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setText("x");
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    public void Mouse(View view){
        TextView txtclose;
        myDialog.setContentView(R.layout.mouse);

        textView13 = (TextView) findViewById(R.id.textView13);
        final MediaPlayer m = MediaPlayer.create(this,R.raw.m);
        m.start();



        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setText("x");
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    public void Nest(View view){
        TextView txtclose;
        myDialog.setContentView(R.layout.nest);


        textView14 = (TextView) findViewById(R.id.textView14);
        final MediaPlayer n = MediaPlayer.create(this,R.raw.n);
        n.start();


        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setText("x");
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    public void Owl(View view){
        TextView txtclose;
        myDialog.setContentView(R.layout.owl);

        textView15 = (TextView) findViewById(R.id.textView15);
        final MediaPlayer o = MediaPlayer.create(this,R.raw.o);
        o.start();


        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setText("x");
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    public void Pig(View view){
        TextView txtclose;
        myDialog.setContentView(R.layout.pig);

        textView16 = (TextView) findViewById(R.id.textView16);
        final MediaPlayer p = MediaPlayer.create(this,R.raw.p);
        p.start();


        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setText("x");
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    public void Queen(View view){
        TextView txtclose;
        myDialog.setContentView(R.layout.queen);

        textView17 = (TextView) findViewById(R.id.textView17);
        final MediaPlayer q = MediaPlayer.create(this,R.raw.q);
        q.start();


        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setText("x");
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    public void Rabbit(View view){
        TextView txtclose;
        myDialog.setContentView(R.layout.rabbit);

        textView18 = (TextView) findViewById(R.id.textView18);
        final MediaPlayer r = MediaPlayer.create(this,R.raw.r);
        r.start();


        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setText("x");
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }
    public void Sun(View view){
        TextView txtclose;
        myDialog.setContentView(R.layout.sun);

        textView19 = (TextView) findViewById(R.id.textView19);
        final MediaPlayer s = MediaPlayer.create(this,R.raw.s);
        s.start();


        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setText("x");
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    public void Train(View view){
        TextView txtclose;
        myDialog.setContentView(R.layout.train);

        textView20 = (TextView) findViewById(R.id.textView20);
        final MediaPlayer t = MediaPlayer.create(this,R.raw.t);
        t.start();


        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setText("x");
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    public void Umbrella(View view){
        TextView txtclose;
        myDialog.setContentView(R.layout.umbrella);

        textView21 = (TextView) findViewById(R.id.textView21);
        final MediaPlayer u = MediaPlayer.create(this,R.raw.u);
        u.start();



        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setText("x");
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    public void Violin(View view){
        TextView txtclose;
        myDialog.setContentView(R.layout.violin);

        textView22 = (TextView) findViewById(R.id.textView22);
        final MediaPlayer v = MediaPlayer.create(this,R.raw.v);
        v.start();


        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setText("x");
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    public void Whale(View view){
        TextView txtclose;
        myDialog.setContentView(R.layout.whale);

        textView23 = (TextView) findViewById(R.id.textView23);
        final MediaPlayer w = MediaPlayer.create(this,R.raw.w);
        w.start();


        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setText("x");
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    public void Xylophone(View view){
        TextView txtclose;
        myDialog.setContentView(R.layout.xylophone);

        textView24 = (TextView) findViewById(R.id.textView24);
        final MediaPlayer x = MediaPlayer.create(this,R.raw.x);
        x.start();


        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setText("x");
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }

    public void Yak(View view){
        TextView txtclose;
        myDialog.setContentView(R.layout.yak);

        textView25 = (TextView) findViewById(R.id.textView25);
        final MediaPlayer y = MediaPlayer.create(this,R.raw.y);
        y.start();



        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setText("x");
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }
    public void Zebra(View view){
        TextView txtclose;
        myDialog.setContentView(R.layout.zebra);

        textView26 = (TextView) findViewById(R.id.textView26);
        final MediaPlayer z = MediaPlayer.create(this,R.raw.z);
        z.start();



        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setText("x");
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

    }



}
