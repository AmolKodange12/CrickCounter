package com.example.android.crickcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int runTeamA = 0;
    int wickTeamA = 0;
    int runTeamB = 0;
    int wickTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void TeamA_Run(int score) {
        TextView scoreView = (TextView) findViewById(R.id.runForTeamA);
        scoreView.setText(String.valueOf(score));
    }

    public void TeamA_Wick(int score) {
        TextView scoreView = (TextView) findViewById(R.id.wickForTeamA);
        scoreView.setText(String.valueOf(score));
    }

    public void TeamB_Run(int score) {
        TextView scoreView = (TextView) findViewById(R.id.runForTeamB);
        scoreView.setText(String.valueOf(score));
    }

    public void TeamB_Wick(int score) {
        TextView scoreView = (TextView) findViewById(R.id.wickForTeamB);
        scoreView.setText(String.valueOf(score));
    }

    public void runforA(View v) {
        runTeamA = runTeamA + 1;
        TeamA_Run(runTeamA);
    }

    public void oneforA(View v) {
        runTeamA = runTeamA + 1;
        TeamA_Run(runTeamA);
    }

    public void fourforA(View v) {
        runTeamA = runTeamA + 4;
        TeamA_Run(runTeamA);
    }

    public void sixforA(View v) {
        runTeamA = runTeamA + 6;
        TeamA_Run(runTeamA);
    }


    public void BowledA(View v) {
        wickTeamA = wickTeamA + 1;
        TeamA_Wick(wickTeamA);
    }

    public void CaughtA(View v) {
        wickTeamA = wickTeamA + 1;
        TeamA_Wick(wickTeamA);
    }

    public void LBWA(View v) {
        wickTeamA = wickTeamA + 1;
        TeamA_Wick(wickTeamA);
    }

    public void runoutA(View v) {
        wickTeamA = wickTeamA + 1;
        TeamA_Wick(wickTeamA);
    }


    public void runforB(View v) {
        runTeamB = runTeamB + 1;
        TeamB_Run(runTeamB);
    }

    public void oneforB(View v) {
        runTeamB = runTeamB + 1;
        TeamB_Run(runTeamB);
    }

    public void fourforB(View v) {
        runTeamB = runTeamB + 4;
        TeamB_Run(runTeamB);
    }

    public void sixforB(View v) {
        runTeamB = runTeamB + 6;
        TeamB_Run(runTeamB);
    }


    public void BowledB(View v) {
        wickTeamB = wickTeamB + 1;
        TeamB_Wick(wickTeamB);
    }

    public void CaughtB(View v) {
        wickTeamB = wickTeamB + 1;
        TeamB_Wick(wickTeamB);
    }

    public void LBWB(View v) {
        wickTeamB = wickTeamB + 1;
        TeamB_Wick(wickTeamB);
    }

    public void runoutB(View v) {
        wickTeamB = wickTeamB + 1;
        TeamB_Wick(wickTeamB);
    }


    public void ResetCounter(View v) {
        runTeamA = 0;
        wickTeamA = 0;
        runTeamB = 0;
        wickTeamB = 0;
        TeamA_Run(runTeamA);
        TeamA_Wick(wickTeamA);
        TeamB_Run(runTeamB);
        TeamB_Wick(wickTeamB);
    }


}
