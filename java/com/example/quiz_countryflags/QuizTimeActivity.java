package com.example.quiz_countryflags;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;

public class QuizTimeActivity extends AppCompatActivity {

   static int slides;
    int choosingButton;
    // od 1-4
    ImageView image;
    TextView text;
    Button b1,b2,b3,b4;
    public  static int countAnswers=0;

   static Boolean[] ifGoodAnswers = new Boolean[10];



    //dodac pasek postępu na 10 pytań

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_time);
        slides=1;

        image= (ImageView) findViewById(R.id.imageView);
        text= (TextView) findViewById(R.id.textView);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);

        switch (slides){
            case 1: slideOne(); break;
            case 2: slideTwo(); break;
            case 3: slideThree(); break;
            case 4: slideFour(); break;
            case 5: slideFive(); break;
            case 6: slideSix(); break;
            case 7: slideSeven(); break;
            case 8: slideEight(); break;
            case 9: slideNine(); break;
            case 10: slideTen(); break;
            case 11: results(); break;
        }
}

    public void slideOne(){

        image.setImageResource(R.drawable.argentina);

        b1.setText("Argentina");
        b2.setText("Israel");
        b3.setText("Chile");
        b4.setText("Brasil");

    }

    public void slideTwo(){
        image.setImageResource(R.drawable.hongkong);

        b1.setText("China");
        b2.setText("Hong Kong");
        b3.setText("Taiwan");
        b4.setText("Philipenes");
    }
    public void slideThree(){
        image.setImageResource(R.drawable.india);

        b1.setText("Bangladesh");
        b2.setText("Nepal");
        b3.setText("Pakistan");
        b4.setText("India");
    }
    public void slideFour(){
        image.setImageResource(R.drawable.kenya);

        b1.setText("Nigeria");
        b2.setText("Kenya");
        b3.setText("Uganda");
        b4.setText("Wakanda");
    }
    public void slideFive(){
        image.setImageResource(R.drawable.poland);

        b1.setText("Poland");
        b2.setText("Ukraine");
        b3.setText("Philipenes");
        b4.setText("Belarus");
    }
    public void slideSix(){
        image.setImageResource(R.drawable.qatar);

        b1.setText("Iraq");
        b2.setText("Yemen");
        b3.setText("Poland");
        b4.setText("Qatar");
    }
    public void slideSeven(){
        image.setImageResource(R.drawable.taiwan);

        b1.setText("China");
        b2.setText("Taiwan");
        b3.setText("Philippines");
        b4.setText("Venezuela");
    }
    public void slideEight(){
        image.setImageResource(R.drawable.venezuela);

        b1.setText("Columbia");
        b2.setText("Brazil");
        b3.setText("Peru");
        b4.setText("Venezuela");
    }
    public void slideNine(){
        image.setImageResource(R.drawable.tibet);

        b1.setText("Mongolia");
        b2.setText("Thailand");
        b3.setText("Tibet");
        b4.setText("Vietnam");
    }
    public void slideTen(){
        image.setImageResource(R.drawable.samoa);

        b1.setText("Malaysia");
        b2.setText("Thailand");
        b3.setText("Samoa");
        b4.setText("Australia");
    }


    public void checkSlides(){

        switch (slides){

            case 2: slideTwo(); break;
            case 3: slideThree(); break;
            case 4: slideFour(); break;
            case 5: slideFive(); break;
            case 6: slideSix(); break;
            case 7:slideSeven();break;
            case 8:slideEight(); break;
            case 9:slideNine();break;
            case 10: slideTen();break;
            default: break;
        }

        if(slides==11){
            results();
        }


    }

    public void clickedButton1(View view){

            choosingButton=1;

            switch (slides){
                case 1: ifGoodAnswers[0]=true; break;
                case 2: ifGoodAnswers[1]=false; break;
                case 3:ifGoodAnswers[2]=false; break;
                case 4: ifGoodAnswers[3]=false; break;
                case 5: ifGoodAnswers[4]=true; break;
                case 6:ifGoodAnswers[5]=false; break;
                case 7:ifGoodAnswers[6]=false; break;
                case 8:ifGoodAnswers[7]=false; break;
                case 9:ifGoodAnswers[8]=false; break;
                case 10: ifGoodAnswers[9]=false; break;
                default: break;
            }
            slides++;
            checkSlides();

    }

    public void clickedButton2(View view){
        choosingButton=2;

        switch (slides){
            case 1: ifGoodAnswers[0]=false; break;
            case 2:ifGoodAnswers[1]=true; break;
            case 3:ifGoodAnswers[2]=false; break;
            case 4:ifGoodAnswers[3]=true; break;
            case 5: ifGoodAnswers[4]=false; break;
            case 6:ifGoodAnswers[5]=false; break;
            case 7:ifGoodAnswers[6]=true; break;
            case 8:ifGoodAnswers[7]=false; break;
            case 9:ifGoodAnswers[8]=false; break;
            case 10: ifGoodAnswers[9]=false; break;
            default: break;
        }
        slides++;
        checkSlides();
    }

    public void clickedButton3(View view){
        choosingButton=3;
        switch (slides){
            case 1: ifGoodAnswers[0]=false; break;
            case 2:ifGoodAnswers[1]=false; break;
            case 3:ifGoodAnswers[2]=false; break;
            case 4:ifGoodAnswers[3]=false; break;
            case 5: ifGoodAnswers[4]=false; break;
            case 6:ifGoodAnswers[5]=false; break;
            case 7:ifGoodAnswers[6]=false; break;
            case 8:ifGoodAnswers[7]=false; break;
            case 9:ifGoodAnswers[8]=true; break;
            case 10: ifGoodAnswers[9]=true; break;
            default: break;
        }
        slides++;
        checkSlides();
    }

    public void clickedButton4(View view){
        choosingButton=4;
        switch (slides){
            case 1: ifGoodAnswers[0]=false; break;
            case 2:ifGoodAnswers[1]=false; break;
            case 3:ifGoodAnswers[2]=true; break;
            case 4:ifGoodAnswers[3]=false; break;
            case 5: ifGoodAnswers[4]=false; break;
            case 6:ifGoodAnswers[5]=true; break;
            case 7:ifGoodAnswers[6]=false; break;
            case 8:ifGoodAnswers[7]=true; break;
            case 9:ifGoodAnswers[8]=false; break;
            case 10: ifGoodAnswers[9]=false; break;
            default: break;
        }
        slides++;
        checkSlides();
    }


    public void results(){
        for (int i = 0; i < 10; i++) {
            if(ifGoodAnswers[i]==true){
                countAnswers++;
            }
        }
      Intent wining = new Intent(this,ResultsActivity.class );
       startActivity(wining);
        System.out.println(countAnswers);
    }
}