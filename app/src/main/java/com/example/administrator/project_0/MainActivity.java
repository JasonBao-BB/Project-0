package com.example.administrator.project_0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button spotify;
    Button scores;
    Button library;
    Button bigger;
    Button reader;
    Button capstone;
    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotify = (Button) findViewById(R.id.streamer);
        scores = (Button) findViewById(R.id.scores);
        library = (Button) findViewById(R.id.library);
        bigger = (Button) findViewById(R.id.bigger);
        reader = (Button) findViewById(R.id.reader);
        capstone = (Button) findViewById(R.id.capstone);

        spotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast = Toast.makeText(MainActivity.this,"This button will lunch my STREAMER app",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        scores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast = Toast.makeText(MainActivity.this,"This button will lunch my SCORE app",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast = Toast.makeText(MainActivity.this,"This button will lunch my LIBRARY app",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        bigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast = Toast.makeText(MainActivity.this,"This button will lunch my BIGGER app",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        reader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast = Toast.makeText(MainActivity.this,"This button will lunch my READER app",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast = Toast.makeText(MainActivity.this,"This button will lunch my CAPSTONE app",Toast.LENGTH_SHORT);
                toast.show();
            }
        });



    }
}
