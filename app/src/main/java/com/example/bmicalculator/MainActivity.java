package com.example.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MainActivity main = new MainActivity();

        /*public int thinkForBMI () {

    }*/

        final TextView tv = (TextView) findViewById(R.id.digit_text_view1);
        TextView tv2 = (TextView) findViewById(R.id.digit_text_view2);
        Button bt = (Button) findViewById(R.id.calculator);

        bt.setOnClickListener(new View.OnClickListener() {

            public void onClick (View V){
                int id = V.getId();
 //               tv.setText(R.string.app_name);
                Intent intent = new Intent(MainActivity.this, Human.class);
                intent.putExtra("ResultHeight", id);
                intent.putExtra("ResultWeight", id);
//                intent.putExtra("Key", 1);
                startActivity(intent);
            }
        });

    }
}
