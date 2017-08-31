package com.example.android.calculator3;

import android.support.v7.app.AppCompatActivity;
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

    public void onClickAdd(View v){
        EditText e1 = (EditText)findViewById(R.id.txtNum1);
        EditText e2 = (EditText)findViewById(R.id.txtNum2);
        TextView t1 = (TextView)findViewById(R.id.tvResult);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int sum = num1 + num2;
        t1.setText("Sum " + sum);
    }

    public void onClickSubtract(View v){
        EditText e1 = (EditText)findViewById(R.id.txtNum1);
        EditText e2 = (EditText)findViewById(R.id.txtNum2);
        TextView t1 = (TextView)findViewById(R.id.tvResult);
        int subtract = Integer.parseInt(e1.getText().toString()) - Integer.parseInt(e2.getText().toString());
        t1.setText("Subtraction " + subtract);
    }

    public void onClickMultiply(View v){
        EditText e1 = (EditText)findViewById(R.id.txtNum1);
        EditText e2 = (EditText)findViewById(R.id.txtNum2);
        TextView t1 = (TextView)findViewById(R.id.tvResult);
        int product = Integer.parseInt(e1.getText().toString()) * Integer.parseInt(e2.getText().toString());
        t1.setText("Product " + product);
    }

    public void onClickDivide(View v){
        EditText e1 = (EditText)findViewById(R.id.txtNum1);
        EditText e2 = (EditText)findViewById(R.id.txtNum2);
        TextView t1 = (TextView)findViewById(R.id.tvResult);
        int quo = Integer.parseInt(e1.getText().toString()) / Integer.parseInt(e2.getText().toString());
        t1.setText("Quotient " + quo);
    }

}
