package com.example.maxnav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button compassbtn;
    private Button stepcounterbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        compassbtn = (Button) findViewById(R.id.compassbtn);
        stepcounterbtn = (Button) findViewById(R.id.stepcounterbtn);

        compassbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });

        stepcounterbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

    }

    public void openActivity1() {
        Intent intent = new Intent(this, Compass.class);
        startActivity(intent);
    }

    public void openActivity2() {
        Intent intent = new Intent(this, StepCounter.class);
        startActivity(intent);
    }


}

