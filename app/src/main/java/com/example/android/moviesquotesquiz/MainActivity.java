package com.example.android.moviesquotesquiz;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

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
        CheckBox check2a = (CheckBox) findViewById(R.id.check2a);
        boolean is2a = check2a.isChecked();
        CheckBox check2b = (CheckBox) findViewById(R.id.check2b);
        boolean is2b = check2b.isChecked();
        CheckBox check2c = (CheckBox) findViewById(R.id.check2c);
        boolean is2c = check2c.isChecked();
        CheckBox check2d = (CheckBox) findViewById(R.id.check2d);
        boolean is2d = check2d.isChecked();

        if (is2a && is2c && !is2b && !is2d) {

            score = score + 1;

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

    public void showResults(View view) {

        //This adds 1 point to the score if Question 9 is answered correctly

        EditText result9 = (EditText) findViewById(R.id.question_9_edittext);
        String question9 = result9.getText().toString();

        if (question9.contains("Terminator")) {

            score = score + 1;
        }

        String toastText;
        drawCorrectGreen();
        EditText nameText = (EditText) findViewById(R.id.player_name);
        String name = nameText.getText().toString();


        if (score < 10) {
            toastText = "Congratulations " + name + "! You scored " + score + " out of 10";
        } else {
            toastText = "Congratulations" + name + "! All of your answers are correct";
        }

        Toast.makeText(this, toastText, Toast.LENGTH_LONG).show();

    }

    //This method is called when the reset button is pressed

    public void resetQuiz(View view) {

        score = 0;
        drawCorrectBlack();
        EditText playerName = (EditText) findViewById(R.id.player_name);
        RadioGroup question1 = (RadioGroup) findViewById(R.id.group1);
        CheckBox question2a = (CheckBox) findViewById(R.id.check2a);
        CheckBox question2b = (CheckBox) findViewById(R.id.check2b);
        CheckBox question2c = (CheckBox) findViewById(R.id.check2c);
        CheckBox question2d = (CheckBox) findViewById(R.id.check2d);
        RadioGroup question3 = (RadioGroup) findViewById(R.id.group3);
        RadioGroup question4 = (RadioGroup) findViewById(R.id.group4);
        RadioGroup question5 = (RadioGroup) findViewById(R.id.group5);
        RadioGroup question6 = (RadioGroup) findViewById(R.id.group6);
        RadioGroup question7 = (RadioGroup) findViewById(R.id.group7);
        RadioGroup question8 = (RadioGroup) findViewById(R.id.group8);
        EditText question9 = (EditText) findViewById(R.id.question_9_edittext);
        RadioGroup question10 = (RadioGroup) findViewById(R.id.group10);

        playerName.setText("");
        question1.clearCheck();
        question2a.setChecked(false);
        question2b.setChecked(false);
        question2c.setChecked(false);
        question2d.setChecked(false);
        question3.clearCheck();
        question4.clearCheck();
        question5.clearCheck();
        question6.clearCheck();
        question7.clearCheck();
        question8.clearCheck();
        question9.setText("");
        question10.clearCheck();

    }

    //This colors the correct answers green

    public void drawCorrectGreen() {

        RadioButton correct1 = (RadioButton) findViewById(R.id.radio1b);
        CheckBox correct2a = (CheckBox) findViewById(R.id.check2a);
        CheckBox correct2c = (CheckBox) findViewById(R.id.check2c);
        RadioButton correct3 = (RadioButton) findViewById(R.id.radio3a);
        RadioButton correct4 = (RadioButton) findViewById(R.id.radio4d);
        RadioButton correct5 = (RadioButton) findViewById(R.id.radio5b);
        RadioButton correct6 = (RadioButton) findViewById(R.id.radio6b);
        RadioButton correct7 = (RadioButton) findViewById(R.id.radio7a);
        RadioButton correct8 = (RadioButton) findViewById(R.id.radio8d);
        EditText correct9 = (EditText) findViewById(R.id.question_9_edittext);
        RadioButton correct10 = (RadioButton) findViewById(R.id.radio10c);

        correct1.setTextColor(Color.parseColor("#212121"));
        correct2a.setTextColor(Color.parseColor("#212121"));
        correct2c.setTextColor(Color.parseColor("#212121"));
        correct3.setTextColor(Color.parseColor("#212121"));
        correct4.setTextColor(Color.parseColor("#212121"));
        correct5.setTextColor(Color.parseColor("#212121"));
        correct6.setTextColor(Color.parseColor("#212121"));
        correct7.setTextColor(Color.parseColor("#212121"));
        correct8.setTextColor(Color.parseColor("#212121"));
        correct9.setText("Terminator");
        correct9.setTextColor(Color.parseColor("#212121"));
        correct10.setTextColor(Color.parseColor("#212121"));

    }

    //This resets the colors

    public void drawCorrectBlack() {

        RadioButton correct1 = (RadioButton) findViewById(R.id.radio1b);
        CheckBox correct2a = (CheckBox) findViewById(R.id.check2a);
        CheckBox correct2c = (CheckBox) findViewById(R.id.check2c);
        RadioButton correct3 = (RadioButton) findViewById(R.id.radio3a);
        RadioButton correct4 = (RadioButton) findViewById(R.id.radio4d);
        RadioButton correct5 = (RadioButton) findViewById(R.id.radio5b);
        RadioButton correct6 = (RadioButton) findViewById(R.id.radio6b);
        RadioButton correct7 = (RadioButton) findViewById(R.id.radio7a);
        RadioButton correct8 = (RadioButton) findViewById(R.id.radio8d);
        EditText correct9 = (EditText) findViewById(R.id.question_9_edittext);
        RadioButton correct10 = (RadioButton) findViewById(R.id.radio10c);

        correct1.setTextColor(Color.parseColor("#CFD8DC"));
        correct2a.setTextColor(Color.parseColor("#CFD8DC"));
        correct2c.setTextColor(Color.parseColor("#CFD8DC"));
        correct3.setTextColor(Color.parseColor("#CFD8DC"));
        correct4.setTextColor(Color.parseColor("#CFD8DC"));
        correct5.setTextColor(Color.parseColor("#CFD8DC"));
        correct6.setTextColor(Color.parseColor("#CFD8DC"));
        correct7.setTextColor(Color.parseColor("#CFD8DC"));
        correct8.setTextColor(Color.parseColor("#CFD8DC"));
        correct9.setTextColor(Color.parseColor("#CFD8DC"));
        correct10.setTextColor(Color.parseColor("#CFD8DC"));

    }
}
