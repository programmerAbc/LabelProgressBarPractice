package com.practice.labelprogressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.practice.labelprogressbarlibrary.LabelProgressBar;

public class MainActivity extends AppCompatActivity {
    LabelProgressBar labelPb;
    Button actionBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        labelPb = (LabelProgressBar) findViewById(R.id.labelPb);
        actionBtn = (Button) findViewById(R.id.actionBtn);
        actionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                labelPb.setProgress(19.01f);
                labelPb.setVisibility(View.VISIBLE);
            }
        });
    }
}
