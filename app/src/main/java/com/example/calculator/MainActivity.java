package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean add,sub,mul,divi,rem,nega,deci;
    Button AC,one,two,three,four,five,six,seven,eight,nine,zero,plus,minus,multi,div,mod,neg,dot,equal;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AC = findViewById(R.id.btAC);
        one = findViewById(R.id.bt1);
        two = findViewById(R.id.bt2);
        three = findViewById(R.id.bt3);
        four = findViewById(R.id.bt4);
        five = findViewById(R.id.bt5);
        six = findViewById(R.id.bt6);
        seven = findViewById(R.id.bt7);
        eight = findViewById(R.id.bt8);
        nine = findViewById(R.id.bt9);
        zero = findViewById(R.id.bt0);
        plus = findViewById(R.id.btplus);
        minus = findViewById(R.id.btmin);
        multi = findViewById(R.id.btmul);
        div = findViewById(R.id.btdiv);
        mod = findViewById(R.id.btmod);
        neg = findViewById(R.id.btneg);
        dot = findViewById(R.id.btdot);
        equal = findViewById(R.id.bteql);
        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("0");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String plus = textView.getText().toString();
                float a = Float.parseFloat(plus);
                add = true;
                textView.setText("0");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String minus = textView.getText().toString();
                float a = Float.parseFloat(minus);
                sub = true;
                textView.setText("0");
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String multi = textView.getText().toString();
                float a = Float.parseFloat(multi);
                mul = true;
                textView.setText("0");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String div = textView.getText().toString();
                float a = Float.parseFloat(div);
                divi = true;
                textView.setText("0");
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mod = textView.getText().toString();
                float a = Float.parseFloat(mod);
                rem = true;
                textView.setText("0");
            }
        });
        neg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String neg = textView.getText().toString();
                float a = Float.parseFloat(neg);
                nega = true;
                textView.setText("0");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(deci){}
                else {
                    textView.setText(textView.getText().toString());
                    deci = true;
                }
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(add || sub || mul || divi || rem){
                    float b = Float.parseFloat(textView.getText().toString());
                }
                if(add){
                    textView.setText(a + b + "");
                    add = false;
                }

            }
        });


    }
}