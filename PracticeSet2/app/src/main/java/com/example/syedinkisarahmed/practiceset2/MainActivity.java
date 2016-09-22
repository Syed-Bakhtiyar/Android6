package com.example.syedinkisarahmed.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score_A=0,score_B=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void Add3forTeam_A(View v){
        TextView txt = (TextView) findViewById(R.id.team_A_Score);
        score_A+=3;
        txt.setText(score_A+"");


    }



    public void Add2forTeam_A(View v){
        TextView txt = (TextView) findViewById(R.id.team_A_Score);
        score_A+=2;
        txt.setText(score_A+"");


    }


    public void Add1forTeam_A(View v){
        TextView txt = (TextView) findViewById(R.id.team_A_Score);
        score_A+=1;
        txt.setText(score_A+"");

    }


    public void Add3forTeam_B(View view){
        TextView tx = (TextView) findViewById(R.id.team_B_Score);
        score_B+=3;
        tx.setText(score_B+"");

    }


    public void Add2forTeam_B(View view){
        TextView tx = (TextView) findViewById(R.id.team_B_Score);
        score_B+=2;
        tx.setText(score_B+"");

    }


    public void Add1forTeam_B(View view){
        TextView tx = (TextView) findViewById(R.id.team_B_Score);
        score_B+=1;
        tx.setText(score_B+"");

    }


    public void ResetScores(View v){

        score_A=0;
        score_B=0;
        TextView tx = (TextView) findViewById(R.id.team_A_Score);
        tx.setText(score_A+"");
        tx= (TextView) findViewById(R.id.team_B_Score);
        tx.setText(score_B+"");

    }
}
