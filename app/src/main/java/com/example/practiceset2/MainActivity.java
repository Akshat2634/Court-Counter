package com.example.practiceset2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }
    public void addThreeForTeamA (View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoForTeamA (View view){
        scoreTeamA = scoreTeamA + 2 ;
        displayForTeamA(scoreTeamA);
    }
    public void addOneForTeamA (View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    public void addThreeForTeamB (View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    public void addTwoForTeamB (View view){
        scoreTeamB = scoreTeamB + 2 ;
        displayForTeamB(scoreTeamB);
    }
    public void addOneForTeamB (View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    public void resetScore(View view) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamB(0);
        displayForTeamA(0);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}