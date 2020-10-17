package com.example.quiz_countryflags;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {


    QuizTimeActivity qta = new QuizTimeActivity();

    TextView result;
    TextView playerHas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);


        result= (TextView) findViewById(R.id.textView9);
        result.setText(QuizTimeActivity.countAnswers+"/10");
        playerHas = (TextView) findViewById(R.id.textView10);
        playerHas.setText(StartingScreen.name);
    }

    public void goReset(View view){
        Intent reset = new Intent(this, StartingScreen.class);
        StartingScreen.name=null;
        QuizTimeActivity.slides=0;
        QuizTimeActivity.countAnswers=0;
        for (int i = 0; i < 10; i++) {
            QuizTimeActivity.ifGoodAnswers[i]=null;
        }
        startActivity(reset);
    }
}