package com.practice.labelprogressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.practice.labelprogressbarlibrary.LabelProgressBar;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    LabelProgressBar labelPb;
    Button actionBtn;
Random random=new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        labelPb = (LabelProgressBar) findViewById(R.id.labelPb);
        actionBtn = (Button) findViewById(R.id.actionBtn);
        actionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                labelPb.setProgress(random.nextFloat()*100);
                labelPb.setVisibility(View.VISIBLE);
            }
        });
    }
}
