package com.example.android.hockeyscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;
    int sogA = 0;
    int sogB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.teamAScore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.teamBScore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given shots on goal for Team A.
     */
    public void displaySogForTeamA(int sog) {
        TextView sogView = findViewById(R.id.numSOGA);
        sogView.setText(String.valueOf(sog));
    }

    /**
     * Displays the given shots on goal for Team B.
     */
    public void displaySogForTeamB(int sog) {
        TextView sogView = findViewById(R.id.numSOGB);
        sogView.setText(String.valueOf(sog));
    }

    /**
     * Adds three points to the score
     *
     * @param view
     */
    public void addGoalA(View view) {
        scoreA += 1;
        displayForTeamA(scoreA);
    }

    /**
     * Adds three points to the score
     *
     * @param view
     */
    public void addGoalB(View view) {
        scoreB += 1;
        displayForTeamB(scoreB);
    }

    /**
     * Resets the score and shots on goal for both teams
     *
     * @param view
     */
    public void resetScore(View view) {
        scoreA = 0;
        scoreB = 0;
        sogA=0;
        sogB=0;
        displayForTeamA(scoreA);
        displaySogForTeamA(sogA);
        displayForTeamB(scoreB);
        displaySogForTeamB(sogB);
    }

    /**
     * Increase shots on goal for team A
     * @param view
     */
    public void addSOGA(View view) {
        sogA +=1;
        displaySogForTeamA(sogA);
    }

    /**
     * Increase shots on goal for team B
     * @param view
     */
    public void addSOGB(View view) {
        sogB +=1;
        displaySogForTeamB(sogB);
    }
}
