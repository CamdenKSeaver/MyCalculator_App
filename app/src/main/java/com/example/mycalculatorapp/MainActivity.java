package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void makeToast(String str){
        Toast toast = Toast.makeText(getApplicationContext(),str, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.number);
        EditText number2ET = findViewById(R.id.number2);
        TextView numberSumTV = findViewById(R.id.result);
        if (number1ET.getText().toString().equals("") || number2ET.getText().toString().equals("")){
            makeToast("Enter Numbers Into Textbox");
        }
        else{
            double num1 = Integer.parseInt((number1ET.getText().toString()));
            double num2 = Integer.parseInt((number2ET.getText().toString()));
            double sum = num1 + num2;

            numberSumTV.setText("" + sum);
            setColor(view);
        }

    }

    public void findSub(View view) {
        EditText number1ET = findViewById(R.id.number);
        EditText number2ET = findViewById(R.id.number2);
        TextView numberSumTV = findViewById(R.id.result);
        if (number1ET.getText().toString().equals("") || number2ET.getText().toString().equals("")){
            makeToast("Enter Numbers Into Textbox");
        }
        else{
            double num1 = Integer.parseInt((number1ET.getText().toString()));
            double num2 = Integer.parseInt((number2ET.getText().toString()));
            double sum = num1 - num2;

            numberSumTV.setText("" + sum);
            setColor(view);
        }

    }

    public void findProduct(View view) {
        EditText number1ET = findViewById(R.id.number);
        EditText number2ET = findViewById(R.id.number2);
        TextView numberSumTV = findViewById(R.id.result);
        if (number1ET.getText().toString().equals("") || number2ET.getText().toString().equals("")){
            makeToast("Enter Numbers Into Textbox");
        }
        else{
            double num1 = Integer.parseInt((number1ET.getText().toString()));
            double num2 = Integer.parseInt((number2ET.getText().toString()));
            double sum = num1 * num2;

            numberSumTV.setText("" + sum);
            setColor(view);
        }

    }


    public void findDiv(View view) {
        EditText number1ET = findViewById(R.id.number);
        EditText number2ET = findViewById(R.id.number2);
        TextView numberSumTV = findViewById(R.id.result);
        if (number1ET.getText().toString().equals("") || number2ET.getText().toString().equals("")){
            makeToast("Enter Numbers Into Textbox");
        }
        else{
            double num1 = Integer.parseInt((number1ET.getText().toString()));
            double num2 = Integer.parseInt((number2ET.getText().toString()));
            double sum = num1 / num2;

            numberSumTV.setText("" + sum);
            setColor(view);
        }

    }

    public void findPower(View view) {
        EditText number1ET = findViewById(R.id.number);
        EditText number2ET = findViewById(R.id.number2);
        TextView numberSumTV = findViewById(R.id.result);
            if (number1ET.getText().toString().equals("") || number2ET.getText().toString().equals("")){
                makeToast("Enter Numbers Into Textbox");
}
            else{
            double num1 = Integer.parseInt((number1ET.getText().toString()));
            double num2 = Integer.parseInt((number2ET.getText().toString()));
            double sum = Math.pow(num1, num2);

            numberSumTV.setText("" + sum);
            setColor(view);
        }



    }

    public void setColor(View view){
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        view.setBackgroundColor(color);
    }






}