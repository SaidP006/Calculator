package com.example.mycalc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView result;
    private EditText num1, num2;
    private Button add,sub,mult,div,pow,mod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.EditText1);
        num2 = (EditText) findViewById(R.id.EditText2);
        add = (Button) findViewById((R.id.btn_add));
        sub = (Button) findViewById((R.id.btn_sub));
        mult = (Button) findViewById((R.id.btn_mult));
        div = (Button) findViewById((R.id.btn_div));
        pow = (Button) findViewById((R.id.btn_pow));
        mod = (Button) findViewById((R.id.btn_mod));
        result = (TextView) findViewById(R.id.Result);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int sum = n1 + n2;
                result.setText(Integer.toString(sum));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int sum = n1 - n2;
                result.setText(Integer.toString(sum));
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int sum = n2 * n1;
                result.setText(Integer.toString(sum));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int sum = n1 / n2;
                result.setText(Integer.toString(sum));
            }
        });
        pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                double sum = Math.pow(n1,n2);
                result.setText(String.valueOf(sum));
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int sum = n1 % n2;
                result.setText(Integer.toString(sum));
            }
        });


    }
}