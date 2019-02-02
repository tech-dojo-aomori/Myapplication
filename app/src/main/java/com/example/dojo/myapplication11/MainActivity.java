package com.example.dojo.myapplication11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        int num1, num2;
        int state;
        TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        state = 0;

        t1 = findViewById(R.id.text);

        Button button23 = findViewById(R.id.button23);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tmp = t1.getText().toString();
                tmp += "1";
                t1.setText(tmp);
            }
        });

        Button b4  = findViewById(R.id.button24);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tmp = t1.getText().toString();
                tmp += "2";
                t1.setText(tmp);
            }
        });


        Button b2 = findViewById(R.id.button26);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(t1.getText().toString());
                t1.setText("");
            }
        });

        Button b3 = findViewById(R.id.button30);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Integer.parseInt(t1.getText().toString());
                int result = num1 + num2;
                t1.setText(" " + result);
            }
        });





    }
}