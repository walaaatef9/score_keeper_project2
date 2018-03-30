package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Track number of brain team
    int brainTeam = 0;

    //Track number of heart team
    int heartTeam = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Add three points brain team.
     */
    public void AddThreePointForBrain(View v) {
        brainTeam = brainTeam + 3;
        displayBrainTeamPoint(brainTeam);
    }
    /**
     * Add two Points for brain team.
     */
    public void AddTwoPointForBrain(View v) {
        brainTeam = brainTeam + 2;
        displayBrainTeamPoint(brainTeam);
    }
    /**
     * Add one Point for brain team.
     */
    public void AddOnePointForBrain(View v) {
        brainTeam = brainTeam + 1;
        displayBrainTeamPoint(brainTeam);
    }
    /**
     * Displays the given number of  points for brain team.
     */
    public void displayBrainTeamPoint(int point) {
        TextView scoreView = (TextView) findViewById(R.id.brain_team);
        scoreView.setText(String.valueOf(point));
    }

    /**
     * Add three Points for heart team.
     */
    public void  AddThreePointForHeart(View v) {
        heartTeam = heartTeam + 3;
        displayHeartTeamPoint(heartTeam);
    }

    /**
     * Add two Points for desire of heart team.
     */
    public void  AddTwoPointForHeart(View v) {
        heartTeam = heartTeam + 2;
        displayHeartTeamPoint(heartTeam);
    }

    /**
     * Add one Point for heart team.
     */
    public void  AddOnePointForHeart(View v) {
        heartTeam = heartTeam + 1;
        displayHeartTeamPoint(heartTeam);
    }

    /**
     * Display the given number of points for heart team.
     */
    public void displayHeartTeamPoint(int point) {
        TextView scoreView = (TextView) findViewById(R.id.heart_team);
        scoreView.setText(String.valueOf(point));
    }
    /**
     * Rest the score for both teams to be zero.
     */
    public void reset(View v) {
        displayBrainTeamPoint(0);
        displayHeartTeamPoint(0);
        heartTeam = 0;
        brainTeam = 0;
    }
}
