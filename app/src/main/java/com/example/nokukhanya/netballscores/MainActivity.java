package com.example.nokukhanya.netballscores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private TextView txtTeam1;
    private TextView txtTeam2;

    private Button btnTeam1;
    private Button btnTeam2;

    private Button btnClearing;

    private Button btnminus1;
    private Button btnminus2;

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtTeam1 = (TextView) findViewById(R.id.txtTeamA);
        txtTeam2 = (TextView) findViewById(R.id.txtTeamB);
        btnTeam1 = (Button) findViewById(R.id.btnteamA);
        btnTeam2 = (Button) findViewById(R.id.btnTeamB);
        btnClearing = (Button) findViewById(R.id.btnclear);
        btnminus1 = (Button) findViewById(R.id.btnminusA);
        btnminus2 = (Button) findViewById(R.id.btnminusB);


        btnTeam1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scoreTeamA = scoreTeamA + 1;
                txtTeam1.setText(String.valueOf(scoreTeamA));

            }
        });


        btnTeam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scoreTeamB = scoreTeamB + 1;
                txtTeam2.setText(String.valueOf(scoreTeamB));

            }
        });
        btnClearing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scoreTeamB = 0;
                txtTeam2.setText(String.valueOf(scoreTeamB));

                scoreTeamA = 0;
                txtTeam1.setText(String.valueOf(scoreTeamA));
            }


        });

        btnminus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (scoreTeamA > 0) {

                    scoreTeamA = scoreTeamA - 1;
                    txtTeam1.setText(String.valueOf(scoreTeamA));

                } else {
                    Toast.makeText(MainActivity.this, "The score cannot be less than zero", Toast.LENGTH_LONG).show();
                }
            }

        });
        {
            btnminus2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (scoreTeamB > 0) {
                        scoreTeamB = scoreTeamB - 1;
                        txtTeam2.setText(String.valueOf(scoreTeamB));

                    } else {
                        Toast.makeText(MainActivity.this, "The score cannot be less than zero", Toast.LENGTH_LONG).show();
                    }

                }

            });

        }

    }
}