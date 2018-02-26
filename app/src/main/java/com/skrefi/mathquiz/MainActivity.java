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
    //Wanted to check if the text is the same with the corect one from here but found a better method.
  /*
    String answers[][] = {
            {"sqrt {2}/2","1/2","sqrt {3}/4","1"},
            {"sin a * cos b + sin b * cos a","sin a + sin b","cos a * cos b + sin b * sin a","1/2"},
            {"sin(a+b)","ctg a / tg b","2 sin((a+b)/2) * cos ((a-b)/2)","sin a + cos b / cos b + sin a"},
            {"sqrt{3}/2","0","1","2/3"},
            {"cos a - cos b","cos^2 a - sin^2 b","sin b / sin a","cos a * cos b + sin a * sin b"},
            {"sin x + cos x","0","1","sin x * cos x * cos x * sin x"},
    };
    */
    RadioGroup[] rg = new RadioGroup[6];
    RadioButton rb;

    String name;
    //public int correctAnswers[]={1,1,3,2,4,3};  //Maybe I use it and anyways it's good for me to see the right answers
    public boolean s7 = false; // The boolean for the check box at the 7th question
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

    public void question7clicked(View view) {
        if (((CheckBox) view).isChecked()) {
            ((CheckBox) view).setText("So you say it's true");
            s7 = true;
            score++;
        } else {
            ((CheckBox) view).setText("So you say it's false");
            s7 = false;
            score--;
        }
    }

    public void rb1Click(View v) {
        int rbi = rg[0].getCheckedRadioButtonId();
        rb = findViewById(R.id.rb11);
        if (rbi == rb.getId()) {
            score++;  //the answer is right if the checked radio id is the same with the one I know it's correct
        } else {
            score--;
        }
    }

    public void rb2Click(View v) {
        int rbi = rg[1].getCheckedRadioButtonId();
        rb = findViewById(R.id.rb21);
        if (rbi == rb.getId()) {
            score++;
        } else {
            score--;
        }
    }

    public void rb3Click(View v) {
        if (rg[2].getCheckedRadioButtonId() == R.id.rb33) {
            score++;
        } else {
            score--;
        }
    }

    public void rb4Click(View v) {
        if (rg[3].getCheckedRadioButtonId() == R.id.rb42) {
            score++;
        } else {
            score--;
        }
    }

    public void rb5Click(View v) {
        if (rg[4].getCheckedRadioButtonId() == R.id.rb54) {
            score++;
        } else {
            score--;
        }
    }

    public void rb6Click(View v) {
        if (rg[5].getCheckedRadioButtonId() == R.id.rb63) {
            score++;
        } else {
            score--;
        }
    }

    public void submit(View v) {
        if (score < 0) {
            score = 0;
        }
        Toast.makeText(getBaseContext(), "Congrats" + name + ": " + score + " out of 7!", Toast.LENGTH_LONG).show();
    }

}
