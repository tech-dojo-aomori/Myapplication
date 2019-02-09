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

        t1 = findViewById(R.id.t1);

        Button b1 = findViewById(R.id.button23);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tmp = t1.getText().toString();
                tmp += "1";
                t1.setText(tmp);
            }
        });

        Button b2  = findViewById(R.id.button24);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tmp = t1.getText().toString();
                tmp += "2";
                t1.setText(tmp);
            }
        });

        Button b3  = findViewById(R.id.button25);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tmp = t1.getText().toString();
                tmp += "3";
                t1.setText(tmp);
            }
        });

        Button b4  = findViewById(R.id.button19);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tmp = t1.getText().toString();
                tmp += "4";
                t1.setText(tmp);
            }
        });

        Button b5  = findViewById(R.id.button20);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tmp = t1.getText().toString();
                tmp += "5";
                t1.setText(tmp);
            }
        });

        Button b6  = findViewById(R.id.button21);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tmp = t1.getText().toString();
                tmp += "6";
                t1.setText(tmp);
            }
        });

        Button b7  = findViewById(R.id.button15);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tmp = t1.getText().toString();
                tmp += "7";
                t1.setText(tmp);
            }
        });

        Button b8  = findViewById(R.id.button16);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tmp = t1.getText().toString();
                tmp += "8";
                t1.setText(tmp);
            }
        });

        Button b9  = findViewById(R.id.button17);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tmp = t1.getText().toString();
                tmp += "9";
                t1.setText(tmp);
            }
        });

        Button bP = findViewById(R.id.button26);
        bP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(t1.getText().toString());
                t1.setText("");
            }
        });

        Button bE = findViewById(R.id.button30);
        bE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Integer.parseInt(t1.getText().toString());
                int result = num1 + num2;
                t1.setText(" " + result);
            }
        });





    }
}