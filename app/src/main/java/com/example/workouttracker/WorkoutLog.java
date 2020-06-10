package com.example.workouttracker;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;

public class WorkoutLog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_log);
        final EditText newWeight = (EditText) findViewById(R.id.weight);
        final CheckBox weight = (CheckBox) findViewById(R.id.checkWeight);
        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(weight.isChecked()) {
                    newWeight.setFocusableInTouchMode(true);
                }
                else {
                    newWeight.setFocusableInTouchMode(false);
                }
                }
        });
    }
}
