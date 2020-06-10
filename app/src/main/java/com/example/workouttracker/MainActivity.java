package com.example.workouttracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {


    /*
    COLOR PALETTE
    50  - #fafafa
    700 - #616161
    900 - #212121
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ///setting onclick for each CardView
        CardView log = (CardView) findViewById(R.id.log);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent logWorkoutActivity = new Intent(MainActivity.this,WorkoutLog.class);
                startActivity(logWorkoutActivity);
            }
        });


        CardView timer = (CardView) findViewById(R.id.timer);
        timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent timerActivity = new Intent(MainActivity.this, IntervalTimer.class);
                startActivity(timerActivity);
            }
        });

        CardView history = (CardView) findViewById(R.id.history);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent historyActivity = new Intent(MainActivity.this,History.class);
                startActivity(historyActivity);
            }
        });

    }

}
