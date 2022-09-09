package com.drv.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView alt;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alt= findViewById(R.id.textView);
        btn.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       Random random= new Random();
                                       int val = random.nextInt(199-1)+1;
                                       alt.setText(Integer.toString(val));


                                   }
                               }
        );
    }

}