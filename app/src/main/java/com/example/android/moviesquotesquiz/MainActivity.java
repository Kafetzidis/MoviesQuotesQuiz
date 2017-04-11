package com.example.android.moviesquotesquiz;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static android.graphics.Color.parseColor;

public class MainActivity extends AppCompatActivity {

    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //This method adds 1 point to the score if Question 1 is answered correctly

    public void resolveQuestion1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio1a:
                if (checked)
                    break;
            case R.id.radio1b:
                if (checked)
                    score = score + 1;
                    break;
            case R.id.radio1c:
                if (checked)
                    break;
            case R.id.radio1d:
                if (checked)
                    break;
        }
    }

    //This method adds 1 point to the score if Question 2 is answered correctly

    public void resolveQuestion2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio2a:
                if (checked)
                    break;
            case R.id.radio2b:
                if (checked)
                    break;
            case R.id.radio2c:
                if (checked)
                    score = score + 1;
                break;
            case R.id.radio2d:
                if (checked)
                    break;
        }
    }

    //This method adds 1 point to the score if Question 3 is answered correctly

    public void resolveQuestion3(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio3a:
                if (checked)
                    score = score + 1;
                break;
            case R.id.radio3b:
                if (checked)
                    break;
            case R.id.radio3c:
                if (checked)
                    break;
            case R.id.radio3d:
                if (checked)
                    break;
        }
    }

    //This method adds 1 point to the score if Question 4 is answered correctly

    public void resolveQuestion4(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio4a:
                if (checked)
                    break;
            case R.id.radio4b:
                if (checked)
                    break;
            case R.id.radio4c:
                if (checked)
                    break;
            case R.id.radio4d:
                if (checked)
                    score = score + 1;
                break;
        }
    }

    //This method adds 1 point to the score if Question 5 is answered correctly

    public void resolveQuestion5(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio5a:
                if (checked)
                    break;
            case R.id.radio5b:
                if (checked)
                    score = score + 1;
                break;
            case R.id.radio5c:
                if (checked)
                    break;
            case R.id.radio5d:
                if (checked)
                    break;
        }
    }

    //This method adds 1 point to the score if Question 6 is answered correctly

    public void resolveQuestion6(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio6a:
                if (checked)
                    break;
            case R.id.radio6b:
                if (checked)
                    score = score + 1;
                    break;
            case R.id.radio6c:
                if (checked)
                    break;
            case R.id.radio6d:
                if (checked)
                    break;
        }
    }

    //This method adds 1 point to the score if Question 7 is answered correctly

    public void resolveQuestion7(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio7a:
                if (checked)
                    score = score + 1;
                    break;
            case R.id.radio7b:
                if (checked)
                    break;
            case R.id.radio7c:
                if (checked)
                    break;
            case R.id.radio7d:
                if (checked)
                    break;
        }
    }

    //This method adds 1 point to the score if Question 8 is answered correctly

    public void resolveQuestion8(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio8a:
                if (checked)
                break;
            case R.id.radio8b:
                if (checked)
                    break;
            case R.id.radio8c:
                if (checked)
                    break;
            case R.id.radio8d:
                if (checked)
                    score = score + 1;
                    break;
        }
    }

    //This method adds 1 point to the score if Question 9 is answered correctly

    public void resolveQuestion9(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio9a:
                if (checked)
                    score = score + 1;
                    break;
            case R.id.radio9b:
                if (checked)
                    break;
            case R.id.radio9c:
                if (checked)
                    break;
            case R.id.radio9d:
                if (checked)
                    break;
        }
    }

    //This method adds 1 point to the score if Question 10 is answered correctly

    public void resolveQuestion10(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio10a:
                if (checked)
                    break;
            case R.id.radio10b:
                if (checked)
                    break;
            case R.id.radio10c:
                if (checked)
                    score = score + 1;
                    break;
            case R.id.radio10d:
                if (checked)
                    break;
        }
    }

    //This method is called when the results button is pressed

    public void showResults (View view) {

        String toastText;
        drawCorrectGreen();

        if (score < 10) {
            toastText = "You scored " + score + " out of 10";
        } else {
            toastText = "Congratulations! All of your answers are correct";
        }

        Toast.makeText(this, toastText, Toast.LENGTH_LONG).show();

    }

    //This method is called when the reset button is pressed

    public void resetQuiz (View view) {

        score = 0;
        drawCorrectBlack();
        RadioGroup question1 = (RadioGroup) findViewById(R.id.group1);
        RadioGroup question2 = (RadioGroup) findViewById(R.id.group2);
        RadioGroup question3 = (RadioGroup) findViewById(R.id.group3);
        RadioGroup question4 = (RadioGroup) findViewById(R.id.group4);
        RadioGroup question5 = (RadioGroup) findViewById(R.id.group5);
        RadioGroup question6 = (RadioGroup) findViewById(R.id.group6);
        RadioGroup question7 = (RadioGroup) findViewById(R.id.group7);
        RadioGroup question8 = (RadioGroup) findViewById(R.id.group8);
        RadioGroup question9 = (RadioGroup) findViewById(R.id.group9);
        RadioGroup question10 = (RadioGroup) findViewById(R.id.group10);

        question1.clearCheck();
        question2.clearCheck();
        question3.clearCheck();
        question4.clearCheck();
        question5.clearCheck();
        question6.clearCheck();
        question7.clearCheck();
        question8.clearCheck();
        question9.clearCheck();
        question10.clearCheck();

    }

    //This colors the correct answers green

    public void drawCorrectGreen() {

        RadioButton correct1 = (RadioButton) findViewById(R.id.radio1b);
        RadioButton correct2 = (RadioButton) findViewById(R.id.radio2c);
        RadioButton correct3 = (RadioButton) findViewById(R.id.radio3a);
        RadioButton correct4 = (RadioButton) findViewById(R.id.radio4d);
        RadioButton correct5 = (RadioButton) findViewById(R.id.radio5b);
        RadioButton correct6 = (RadioButton) findViewById(R.id.radio6b);
        RadioButton correct7 = (RadioButton) findViewById(R.id.radio7a);
        RadioButton correct8 = (RadioButton) findViewById(R.id.radio8d);
        RadioButton correct9 = (RadioButton) findViewById(R.id.radio9a);
        RadioButton correct10 = (RadioButton) findViewById(R.id.radio10c);

        correct1.setTextColor(Color.parseColor("#212121"));
        correct2.setTextColor(Color.parseColor("#212121"));
        correct3.setTextColor(Color.parseColor("#212121"));
        correct4.setTextColor(Color.parseColor("#212121"));
        correct5.setTextColor(Color.parseColor("#212121"));
        correct6.setTextColor(Color.parseColor("#212121"));
        correct7.setTextColor(Color.parseColor("#212121"));
        correct8.setTextColor(Color.parseColor("#212121"));
        correct9.setTextColor(Color.parseColor("#212121"));
        correct10.setTextColor(Color.parseColor("#212121"));

    }

    //This resets the colors

    public void drawCorrectBlack() {

        RadioButton correct1 = (RadioButton) findViewById(R.id.radio1b);
        RadioButton correct2 = (RadioButton) findViewById(R.id.radio2c);
        RadioButton correct3 = (RadioButton) findViewById(R.id.radio3a);
        RadioButton correct4 = (RadioButton) findViewById(R.id.radio4d);
        RadioButton correct5 = (RadioButton) findViewById(R.id.radio5b);
        RadioButton correct6 = (RadioButton) findViewById(R.id.radio6b);
        RadioButton correct7 = (RadioButton) findViewById(R.id.radio7a);
        RadioButton correct8 = (RadioButton) findViewById(R.id.radio8d);
        RadioButton correct9 = (RadioButton) findViewById(R.id.radio9a);
        RadioButton correct10 = (RadioButton) findViewById(R.id.radio10c);

        correct1.setTextColor(Color.parseColor("#FFFFFF"));
        correct2.setTextColor(Color.parseColor("#FFFFFF"));
        correct3.setTextColor(Color.parseColor("#FFFFFF"));
        correct4.setTextColor(Color.parseColor("#FFFFFF"));
        correct5.setTextColor(Color.parseColor("#FFFFFF"));
        correct6.setTextColor(Color.parseColor("#FFFFFF"));
        correct7.setTextColor(Color.parseColor("#FFFFFF"));
        correct8.setTextColor(Color.parseColor("#FFFFFF"));
        correct9.setTextColor(Color.parseColor("#FFFFFF"));
        correct10.setTextColor(Color.parseColor("#FFFFFF"));

    }
}
