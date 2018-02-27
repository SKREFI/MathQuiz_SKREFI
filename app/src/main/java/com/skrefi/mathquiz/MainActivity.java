package com.skrefi.mathquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup[] rg = new RadioGroup[6];
    RadioButton rb;
    Boolean[] rbAnswered = new Boolean[10];
    String name;
    public int score = 0; //keep track of the score

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg[0] = findViewById(R.id.radioGroup1);
        rg[1] = findViewById(R.id.radioGroup2);
        rg[2] = findViewById(R.id.radioGroup3);
        rg[3] = findViewById(R.id.radioGroup4);
        rg[4] = findViewById(R.id.radioGroup5);
        rg[5] = findViewById(R.id.radioGroup6);

        EditText nameET = findViewById(R.id.nameEdit);
        name = nameET.getText().toString();
    }

    public void cb72(View view){
        if(((CheckBox) view).isChecked() && !rbAnswered[6]) {
            score++;
            rbAnswered[6]=true;
        }
        if(!((CheckBox) view).isChecked() && rbAnswered[6]) {
            score--;
            rbAnswered[6]=false;
        }
    }

    public void cb73(View view){
        if(((CheckBox) view).isChecked() && !rbAnswered[7]){
            score++;
            rbAnswered[7]=true;
        }
        if(!((CheckBox) view).isChecked() && rbAnswered[7]) {
            score--;
            rbAnswered[7]=false;
        }
    }

    public void cb74(View view){
        if(((CheckBox) view).isChecked() && !rbAnswered[8]){
            score++;
            rbAnswered[8]=true;
        }
        if(!((CheckBox) view).isChecked() && rbAnswered[8]) {
            score--;
            rbAnswered[8]=false;
        }
    }

    public void rb1Click(View v) {
        int rbi = rg[0].getCheckedRadioButtonId();
        rb = findViewById(R.id.rb11);
        if (rbi == rb.getId() && !rbAnswered[0]) {
                score++;
                rbAnswered[0]=true;
        }
        if(rbi != rb.getId() && rbAnswered[0]){
            score--;
            rbAnswered[0]=false;
        }
    }

    public void rb2Click(View v) {
        int rbi = rg[1].getCheckedRadioButtonId();
        rb = findViewById(R.id.rb21);
        if (rbi == rb.getId() && !rbAnswered[1]) {
            score++;
            rbAnswered[1]=true;
        }
        if(rbi != rb.getId() && rbAnswered[1]){
            score--;
            rbAnswered[1]=false;
        }
    }

    public void rb3Click(View v) {
        if (rg[2].getCheckedRadioButtonId() == R.id.rb33 && !rbAnswered[2]) {
            score++;
            rbAnswered[2]=true;
        }
        if (rg[2].getCheckedRadioButtonId() != R.id.rb33 && rbAnswered[2]) {
            score--;
            rbAnswered[2]=false;
        }
    }

    public void rb4Click(View v) {
        if (rg[3].getCheckedRadioButtonId() == R.id.rb42 && !rbAnswered[3]) {
            score++;
            rbAnswered[3]=true;
        }
        if (rg[2].getCheckedRadioButtonId() != R.id.rb42 && rbAnswered[3]) {
            score--;
            rbAnswered[3]=false;
        }
    }

    public void rb5Click(View v) {
        if (rg[4].getCheckedRadioButtonId() == R.id.rb54 && !rbAnswered[4]) {
            score++;
            rbAnswered[4]=true;
        }
        if (rg[4].getCheckedRadioButtonId() != R.id.rb54 && rbAnswered[4]) {
            score--;
            rbAnswered[4]=false;
        }
    }

    public void rb6Click(View v) {
        if (rg[5].getCheckedRadioButtonId() == R.id.rb63 && !rbAnswered[5]) {
            score++;
            rbAnswered[5]=true;
        }
        if (rg[5].getCheckedRadioButtonId() != R.id.rb63 && rbAnswered[5]) {
            score--;
            rbAnswered[5]=false;
        }
    }

    public void submit(View v) {
        Toast.makeText(getBaseContext(), "Congrats" + name + ": " + score + " out of 10!", Toast.LENGTH_LONG).show();
    }

}
