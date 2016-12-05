package com.example.julia.lw_5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView test;
    Button xbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test = (TextView) findViewById(R.id.tV);
        xbutton = (Button) findViewById(R.id.button1);
        xbutton.setOnClickListener(obrabotka);
    }

    View.OnClickListener obrabotka = new View.OnClickListener() {
        public void onClick(View v) {
            test.setText("Кнопка была нажата!");
        }
    };
}