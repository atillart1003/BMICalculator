package com.example.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Human extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human);

        Intent intent = getIntent();

        int Number = intent.getIntExtra("ResultHeight", -1);
        int typeNumber = intent.getIntExtra("ResultWeight", -1);
        String show1 = "" + Number;
        TextView typeTextView1 = (TextView) findViewById(R.id.textViewResult);
        typeTextView1.setText("K" + show1);

        String show2 = "" + typeNumber;
        TextView typeTextView2 = (TextView) findViewById(R.id.textView6);
        typeTextView2.setText("K" + show2);

    }
}
