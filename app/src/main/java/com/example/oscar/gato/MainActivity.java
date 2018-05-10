package com.example.oscar.gato;

import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements View.OnTouchListener{

    Drawable o,x;
    Button button,button2,button3,button4,button5,button6,button7,button8,button9,refresh,cerrar;
    TextView textView;
    int contador=2;
    MediaPlayer mp,g,e;
    private android.app.AlertDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        button = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        refresh = (Button)findViewById(R.id.nuevo);
        cerrar = (Button)findViewById(R.id.cerrar);
        textView=(TextView) findViewById(R.id.textView);
        refresh.setEnabled(false);

        //Tonos
        mp = MediaPlayer.create(MainActivity.this,R.raw.tono);
        g = MediaPlayer.create(MainActivity.this,R.raw.ganaste);
        e = MediaPlayer.create(MainActivity.this,R.raw.empate);

        //Imagenes de cruz y circulo
        ConstraintLayout constraintLayout = (ConstraintLayout)findViewById(R.id.constraint);
        constraintLayout.setOnTouchListener(this);

        o= getResources().getDrawable(R.drawable.o);
        x = getResources().getDrawable(R.drawable.x);


        //Funncion de botones

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                imprimir(button);
                quienGana(button,button2,button3,button4,button5,button6, button7,button8,button9);

                mp.start();

                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha);


                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });

                button.startAnimation(animation);

            }




        });

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                imprimir(button2);
                quienGana(button,button2,button3,button4,button5,button6, button7,button8,button9);

                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha);
                mp.start();

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });

                button2.startAnimation(animation);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                imprimir(button3);
                quienGana(button,button2,button3,button4,button5,button6, button7,button8,button9);

                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha);
                mp.start();

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });

                button3.startAnimation(animation);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                imprimir(button4);
                quienGana(button,button2,button3,button4,button5,button6, button7,button8,button9);

                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha);
                mp.start();

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });

                button4.startAnimation(animation);

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                imprimir(button5);
                quienGana(button,button2,button3,button4,button5,button6, button7,button8,button9);

                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha);
                mp.start();

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });

                button5.startAnimation(animation);

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                imprimir(button6);
                quienGana(button,button2,button3,button4,button5,button6, button7,button8,button9);

                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha);
                mp.start();

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });

                button6.startAnimation(animation);

            }

        });

        button7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                imprimir(button7);
                quienGana(button,button2,button3,button4,button5,button6, button7,button8,button9);

                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha);
                mp.start();

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });

                button7.startAnimation(animation);

            }
        });

        button8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                imprimir(button8);
                quienGana(button,button2,button3,button4,button5,button6, button7,button8,button9);
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha);
                mp.start();

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });

                button8.startAnimation(animation);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                imprimir(button9);
                quienGana(button,button2,button3,button4,button5,button6, button7,button8,button9);

                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha);
                mp.start();

                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });

                button9.startAnimation(animation);

            }
        });

        refresh.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                button.setText("");
                button2.setText("");
                button3.setText("");
                button4.setText("");
                button5.setText("");
                button6.setText("");
                button7.setText("");
                button8.setText("");
                button9.setText("");
                textView.setText("");
                button.setBackgroundColor(Color.TRANSPARENT);
                button2.setBackgroundColor(Color.TRANSPARENT);
                button3.setBackgroundColor(Color.TRANSPARENT);
                button4.setBackgroundColor(Color.TRANSPARENT);
                button5.setBackgroundColor(Color.TRANSPARENT);
                button6.setBackgroundColor(Color.TRANSPARENT);
                button7.setBackgroundColor(Color.TRANSPARENT);
                button8.setBackgroundColor(Color.TRANSPARENT);
                button9.setBackgroundColor(Color.TRANSPARENT);
                refresh.setEnabled(false);
                button.setEnabled(true);
                button2.setEnabled(true);
                button3.setEnabled(true);
                button4.setEnabled(true);
                button5.setEnabled(true);
                button6.setEnabled(true);
                button7.setEnabled(true);
                button8.setEnabled(true);
                button9.setEnabled(true);
                e.start();
            }
        });

        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
                mp.start();
            }
        });

    }


    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        return false;
    }



    public boolean esVacio(Button boton){
        if(boton.getText().equals("")){
            return true;
        }
        return false;
    }

    public void restart(){
        button.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        textView.setText("");
        button.setBackgroundColor(Color.TRANSPARENT);
        button2.setBackgroundColor(Color.TRANSPARENT);
        button3.setBackgroundColor(Color.TRANSPARENT);
        button4.setBackgroundColor(Color.TRANSPARENT);
        button5.setBackgroundColor(Color.TRANSPARENT);
        button6.setBackgroundColor(Color.TRANSPARENT);
        button7.setBackgroundColor(Color.TRANSPARENT);
        button8.setBackgroundColor(Color.TRANSPARENT);
        button9.setBackgroundColor(Color.TRANSPARENT);
        refresh.setEnabled(false);
        button.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        e.start();
    }

    public void imprimir(Button boton){
        if(esVacio(boton)){
            if(contador==2){
                boton.setText("X");
                textView.setText("Juega O");
                boton.setBackgroundDrawable(x);
                contador=1;
            }else{
                boton.setText("O");
                textView.setText("Juega X");
                boton.setBackgroundDrawable(o);
                contador=2;
            }

        }

    }

    public void quienGana(Button boton, Button boton2, Button boton3, Button boton4, Button boton5, Button boton6, Button boton7, Button boton8, Button boton9){
        if(boton.getText().toString()=="X" && boton2.getText().toString()=="X" && boton3.getText().toString()=="X" ||
        boton4.getText().toString()=="X" && boton5.getText().toString()=="X" && boton6.getText().toString()=="X" ||
        boton7.getText().toString()=="X" && boton8.getText().toString()=="X" && boton9.getText().toString()=="X" ||
        boton.getText().toString()=="X" && boton4.getText().toString()=="X" && boton7.getText().toString()=="X" ||
        boton2.getText().toString()=="X" && boton5.getText().toString()=="X" && boton8.getText().toString()=="X" ||
        boton3.getText().toString()=="X" && boton6.getText().toString()=="X" && boton9.getText().toString()=="X" ||
        boton.getText().toString()=="X" && boton5.getText().toString()=="X" && boton9.getText().toString()=="X" ||
        boton3.getText().toString()=="X" && boton5.getText().toString()=="X" && boton7.getText().toString()=="X" ){
            LayoutInflater inflater = getLayoutInflater();
            View mView1 = inflater.inflate(R.layout.mensaje, null);

            final ImageButton btnAceptar= (ImageButton) mView1.findViewById(R.id.btnAceptar);
            final ImageButton btnCerrar = (ImageButton) mView1.findViewById(R.id.btnCerrar);

            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(MainActivity.this);
            builder.setView(mView1).setMessage("Gano el Jugardor O").setTitle("Ganaste :D")
                    .setNegativeButton  ("", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialog.dismiss();
                        }
                    });

            btnAceptar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                    restart();
                }
            });

            btnCerrar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                }
            });

            g.start();
            dialog = builder.create();
            dialog.show();

            refresh.setEnabled(true);
            textView.setText("Jugar de Nuevo");
            button.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        }
        else if(boton.getText().toString()=="O" && boton2.getText().toString()=="O" && boton3.getText().toString()=="O" ||
                boton4.getText().toString()=="O" && boton5.getText().toString()=="O" && boton6.getText().toString()=="O" ||
                boton7.getText().toString()=="O" && boton8.getText().toString()=="O" && boton9.getText().toString()=="O" ||
                boton.getText().toString()=="O" && boton4.getText().toString()=="O" && boton7.getText().toString()=="O" ||
                boton2.getText().toString()=="O" && boton5.getText().toString()=="O" && boton8.getText().toString()=="O" ||
                boton3.getText().toString()=="O" && boton6.getText().toString()=="O" && boton9.getText().toString()=="O" ||
                boton.getText().toString()=="O" && boton5.getText().toString()=="O" && boton9.getText().toString()=="O" ||
                boton3.getText().toString()=="O" && boton5.getText().toString()=="O" && boton7.getText().toString()=="O" ){

            LayoutInflater inflater = getLayoutInflater();
            View mView1 = inflater.inflate(R.layout.mensaje, null);

            final ImageButton btnAceptar= (ImageButton) mView1.findViewById(R.id.btnAceptar);
            final ImageButton btnCerrar = (ImageButton) mView1.findViewById(R.id.btnCerrar);

            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(MainActivity.this);
            builder.setView(mView1).setMessage("Gano el Jugardor O").setTitle("Ganaste :D")
                    .setNegativeButton  ("", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialog.dismiss();
                        }
                    });

            btnAceptar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                    restart();
                }
            });

            btnCerrar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                }
            });

            g.start();
            dialog = builder.create();
            dialog.show();

            refresh.setEnabled(true);
            textView.setText("Jugar de Nuevo");
            button.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        }else if( !esVacio(button) && !esVacio(button2) && !esVacio(button3) && !esVacio(button4) && !esVacio(button5) &&  !esVacio(button6)  && !esVacio(button7) && !esVacio(button8) && !esVacio(button9) ) {

            LayoutInflater inflater = getLayoutInflater();
            View mView1 = inflater.inflate(R.layout.mensaje, null);

            final ImageButton btnAceptar= (ImageButton) mView1.findViewById(R.id.btnAceptar);
            final ImageButton btnCerrar = (ImageButton) mView1.findViewById(R.id.btnCerrar);

            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(MainActivity.this);
            builder.setView(mView1).setMessage("Es un empeate").setTitle("Nadie Gana :(")
                    .setNegativeButton  ("", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialog.dismiss();
                        }
                    });

            btnAceptar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                    restart();
                }
            });

            btnCerrar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                }
            });

            e.start();
            dialog = builder.create();
            dialog.show();

            refresh.setEnabled(true);
            textView.setText("Jugar de Nuevo");
            button.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        }
    }





}
