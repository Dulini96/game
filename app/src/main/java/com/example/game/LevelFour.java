package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

public class LevelFour extends AppCompatActivity {

    Dialog mydialog;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_four);
        mydialog = new Dialog(this);
       next = findViewById(R.id.next);


        }

    public void showPauseMenu(View v) {


        Button resume;
        Button quit;
        mydialog.setContentView(R.layout.activity_pause_menu);

        resume = mydialog.findViewById(R.id.resumeButton);
        resume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mydialog.dismiss();
            }
        });

        quit = mydialog.findViewById(R.id.quitButton);
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mydialog.setContentView(R.layout.activity_game_over);
                mydialog.show();
            }
        });
mydialog.show();
    }

    public void showGameOver(View view){

        Intent intent;
        intent = new Intent(LevelFour.this,gameOver.class);
        startActivity(intent);



    }


    }

