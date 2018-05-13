package com.example.oscar.gato;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Intro extends AppCompatActivity {

    Button boton,salir,info;
    private ImageView imageView;
    private AnimationDrawable cat;
    MediaPlayer loop,mp;
    private android.app.AlertDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        startLoop();
        boton = (Button)findViewById(R.id.btnGato);
        salir = (Button)findViewById(R.id.btnSalir);
        info = (Button)findViewById(R.id.btnInfo);


        mp = MediaPlayer.create(Intro.this,R.raw.tono);
        imageView = (ImageView)findViewById(R.id.imgGato);

        imageView.setBackgroundResource(R.drawable.cat);

        cat = (AnimationDrawable) imageView.getBackground();
        cat.setOneShot(true);

        start();



        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Gato = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(Gato);
                mp.start();

            }
        });

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
                mp.start();
            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                AlertDialog.Builder builder = new AlertDialog.Builder(Intro.this);
                builder.setMessage("Integrantes: \n\nOscar Alberto Cordero Villa \nGuillermo Guadalupe Reyes Guerrero\n\n\nGato version: 2.0  ")
                        .setTitle("Acerca de...")
                        .setCancelable(true)
                        .setNeutralButton("Aceptar",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                        mp.start();
                                    }
                                });

                AlertDialog alert = builder.create();
                alert.show();


            }
        });


    }

    protected void start() {
        if (cat != null && !cat.isRunning()) {
        cat.start();
        }
        cat.start();
    }

    private void startLoop(){
        if(loop == null){
            loop = MediaPlayer.create(this, R.raw.loop);
        }
        if(!loop.isPlaying()){
            loop.setLooping(true);
            loop.start();
        }
    }


}
