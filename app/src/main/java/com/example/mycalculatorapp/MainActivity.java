package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.number);
        EditText number2ET = findViewById(R.id.number2);
        TextView numberSumTV = findViewById(R.id.result);

        double num1 = Integer.parseInt((number1ET.getText().toString()));
        double num2 = Integer.parseInt((number2ET.getText().toString()));
        double sum = num1 + num2;

        numberSumTV.setText("" + sum);
    }
    public void findSub(View view) {
        EditText number1ET = findViewById(R.id.number);
        EditText number2ET = findViewById(R.id.number2);
        TextView numberSumTV = findViewById(R.id.result);

        double num1 = Integer.parseInt((number1ET.getText().toString()));
        double num2 = Integer.parseInt((number2ET.getText().toString()));
        double sum = num1 - num2;

        numberSumTV.setText("" + sum);
    }
    public void findProduct(View view) {
        EditText number1ET = findViewById(R.id.number);
        EditText number2ET = findViewById(R.id.number2);
        TextView numberSumTV = findViewById(R.id.result);

        double num1 = Integer.parseInt((number1ET.getText().toString()));
        double num2 = Integer.parseInt((number2ET.getText().toString()));
        double sum = num1 * num2;

        numberSumTV.setText("" + sum);
    }

    public void findDiv(View view) {
        EditText number1ET = findViewById(R.id.number);
        EditText number2ET = findViewById(R.id.number2);
        TextView numberSumTV = findViewById(R.id.result);

        double num1 = Integer.parseInt((number1ET.getText().toString()));
        double num2 = Integer.parseInt((number2ET.getText().toString()));
        double sum = num1 / num2;

        numberSumTV.setText("" + sum);
    }


}