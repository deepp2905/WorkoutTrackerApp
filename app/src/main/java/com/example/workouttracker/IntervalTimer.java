package com.example.workouttracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class IntervalTimer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interval_timer);


        final TextView workoutTimer = (TextView) findViewById(R.id.workoutTimer);
        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                if(millisUntilFinished/1000 < 10) {
                    workoutTimer.setText("00:00:0" + millisUntilFinished / 1000);
                }
                else
                    workoutTimer.setText("00:00:" + millisUntilFinished / 1000);
            }

            public void onFinish() {
                //workoutTimer.setText("00:00:00");
            }
        }.start();
    }
}