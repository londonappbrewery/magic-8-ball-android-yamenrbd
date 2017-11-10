package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button askButton = (Button) findViewById(R.id.askButton);
        final ImageView image_eightBall = (ImageView) findViewById(R.id.image_eightBall);
        final int[] magicBallImage= {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };


        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random generateRandomNumber = new Random();
                final int number = generateRandomNumber.nextInt(4);

                Log.d("magicBal","the image is number "+ number);
                image_eightBall.setImageResource(magicBallImage[number]);
            }
        });
    }
}
