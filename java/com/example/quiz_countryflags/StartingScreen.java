package com.example.quiz_countryflags;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StartingScreen extends AppCompatActivity {
    TextView tytul;
  static   String name;
    EditText nameImput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_screen);

        tytul = (TextView) findViewById(R.id.textView2);
        tytul.setTransformationMethod(null);

        nameImput = (EditText) findViewById(R.id.editTextTextPersonName3);



    }

    private void showToast(String text) {
        Toast.makeText(StartingScreen.this , "Hello "+text, Toast.LENGTH_SHORT).show();
        //robi okienko z danymi które podamy
    }

    public void goStartButton(View view){
        name = nameImput.getText().toString();
           showToast(name);
        Intent startQuiz = new Intent(this , QuizTimeActivity.class);
        startActivity(startQuiz);

    }
}