package com.example.android.f1quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int totalScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateScore(View view) {
        EditText teamNameField = (EditText) findViewById(R.id.team_name_field);
        String name = teamNameField.getText().toString();
        if (name.toString().equals("Ferrari")) {
            totalScore += 1;
        }
        RadioButton radioButton1 = (RadioButton) findViewById(R.id.q1c);
        radioButton1.getText().toString();
        if (radioButton1.isChecked()) {
            totalScore += 1;
        }
        RadioButton radioButton3 = (RadioButton) findViewById(R.id.q3d);
        radioButton3.getText().toString();
        if (radioButton3.isChecked()) {
            totalScore += 1;
        }
        RadioButton radioButton4 = (RadioButton) findViewById(R.id.q4a);
        radioButton4.getText().toString();
        if (radioButton4.isChecked()) {
            totalScore += 1;
        }
        RadioButton radioButton5 = (RadioButton) findViewById(R.id.q5d);
        radioButton5.getText().toString();
        if (radioButton5.isChecked()) {
            totalScore += 1;
        }
        RadioButton radioButton6 = (RadioButton) findViewById(R.id.q6b);
        radioButton6.getText().toString();
        if (radioButton6.isChecked()) {
            totalScore += 1;
        }
        RadioButton radioButton7 = (RadioButton) findViewById(R.id.q7b);
        radioButton7.getText().toString();
        if (radioButton7.isChecked()) {
            totalScore += 1;
        }
        CheckBox checkBox8a = (CheckBox) findViewById(R.id.q8a);
        checkBox8a.setText("Britain");
        CheckBox checkBox8b = (CheckBox) findViewById(R.id.q8b);
        checkBox8b.setText("Germany");
        CheckBox checkBox8c = (CheckBox) findViewById(R.id.q8c);
        checkBox8c.setText("Spain");
        CheckBox checkBox8d = (CheckBox) findViewById(R.id.q8d);
        checkBox8d.setText("France");
        if (checkBox8a.isChecked() && checkBox8d.isChecked()) {
            totalScore += 1;
        }
        RadioButton radioButton9 = (RadioButton) findViewById(R.id.q9b);
        radioButton9.getText().toString();
        if (radioButton9.isChecked()) {
            totalScore += 1;
        }
        RadioButton radioButton10 = (RadioButton) findViewById(R.id.q10c);
        radioButton10.getText().toString();
        if (radioButton10.isChecked()) {
            totalScore += 1;

        }
        Toast toast = Toast.makeText(this, "Your score is: " + totalScore + "/10", Toast.LENGTH_SHORT);
        ViewGroup group = (ViewGroup) toast.getView();
        TextView messageTextView = (TextView) group.getChildAt(0);
        messageTextView.setTextSize(20);
        toast.show();
    }
}
