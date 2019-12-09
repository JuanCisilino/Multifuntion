package com.frost.multifuntion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityCurrency extends AppCompatActivity {

    float a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
    }

    void convertUsdToPeso()
    {  EditText usd= (EditText) findViewById(R.id.usd);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText  peso=(EditText) findViewById(R.id.peso);
        peso.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(usd.getText().toString());
        double result=a*70.0;
        peso.setText(String.valueOf(result));

    }

    void convertPesoToUsd()
    {  EditText usd= (EditText) findViewById(R.id.usd);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  peso=(EditText) findViewById(R.id.peso);
        peso.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(peso.getText().toString());
        double result=a/70.0;
        usd.setText(String.valueOf(result));
    }

    public void click(View view)
    {
        convertUsdToPeso();
        Button b2=(Button) findViewById(R.id.submit2);
        b2.setEnabled(false);
    }

    public void reset(View view)
    {
        Button b1=(Button) findViewById(R.id.submit);
        b1.setEnabled(true);
        Button b2=(Button) findViewById(R.id.submit2);
        b2.setEnabled(true);
        EditText usd= (EditText) findViewById(R.id.usd);
        EditText  peso=(EditText) findViewById(R.id.peso);
        usd.setText("");
        peso.setText("");

    }

    public void click2(View view)
    {
        Button b1=(Button) findViewById(R.id.submit);
        b1.setEnabled(false);
        convertPesoToUsd();
    }



}
