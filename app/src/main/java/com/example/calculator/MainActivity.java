package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1, number2;
    Button btn1, btn2, btn3, btn4, reset;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1= findViewById(R.id.number1);
        number2= findViewById(R.id.number2);
        btn1= findViewById(R.id.btn1);
        btn2= findViewById(R.id.btn2);
        btn3= findViewById(R.id.btn3);
        btn4= findViewById(R.id.btn4);
        result= findViewById(R.id.result);
        reset= findViewById(R.id.reset);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f, s, res;
                if(number1.getText().toString().matches("") && number2.getText().toString().matches(""))
                {
                    number1.setError("Please enter a number");
                    number2.setError("Please enter a number");
                }
                else{
                    f = Integer.parseInt(number1.getText().toString());
                    s = Integer.parseInt(number2.getText().toString());

                    res= f+s;
                    result.setText("Result: " + res);
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f, s, res;
                if(number1.getText().toString().matches("") || number2.getText().toString().matches(""))
                {
                    number1.setError("Please enter a number");
                    number2.setError("Please enter a number");
                }
                else {
                    f = Integer.parseInt(number1.getText().toString());
                    s = Integer.parseInt(number2.getText().toString());
                    res = f - s;
                    result.setText("Result: " + res);
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f, s, res;
                if(number1.getText().toString().matches("") || number2.getText().toString().matches(""))
                {
                    number1.setError("Please enter a number");
                    number2.setError("Please enter a number");
                }
                else {
                    f = Integer.parseInt(number1.getText().toString());
                    s = Integer.parseInt(number2.getText().toString());
                    res = f * s;
                    result.setText("Result: " + res);
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f, s;
                double res;
                if(number1.getText().toString().matches("") || number2.getText().toString().matches(""))
                {
                    number1.setError("Please enter a number");
                    number2.setError("Please enter a number");
                }
                else {
                    f = Integer.parseInt(number1.getText().toString());
                    s = Integer.parseInt(number2.getText().toString());
                    res = (double) f / (double) s;
                    result.setText("Result: " + res);
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1.setText("");
                number2.setText("");
                result.setText("Result:");
            }
        });


    }
}