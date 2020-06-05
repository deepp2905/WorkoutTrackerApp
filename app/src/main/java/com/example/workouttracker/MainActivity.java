package com.example.workouttracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {


    /*COLOR PALLETE
    50
    #fafafa
    100
    #f5f5f5
    200
    #eeeeee
    300
    #e0e0e0
    400
    #bdbdbd
    500
    #9e9e9e
    600
    #757575
    700
    #616161
    800
    #424242
    900
    #212121*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ///setting onclick for each button
        Button log = (Button) findViewById(R.id.log);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logWorkoutActivity = new Intent(MainActivity.this,WorkoutLog.class);
                startActivity(logWorkoutActivity);
            }
        });


        Button timer = (Button) findViewById(R.id.timer);
        timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent timerActivity = new Intent(MainActivity.this, IntervalTimer.class);
                startActivity(timerActivity);
            }
        });

        Button history = (Button) findViewById(R.id.history);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent historyActivity = new Intent(MainActivity.this,History.class);
                startActivity(historyActivity);
            }
        });

    }

}
