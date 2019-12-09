package com.frost.multifuntion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button calculator,courrency, qrreader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculator = findViewById(R.id.MainActivity_Button_Calculator);
        courrency = findViewById(R.id.MainActivity_Button_CurrencyConverter);
        qrreader = findViewById(R.id.MainActivity_Button_QrReader);

        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ActivityCalculator.class));
            }
        });

        courrency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ActivityCurrency.class));
            }
        });

        qrreader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Entrando al lector de QR", Toast.LENGTH_LONG).show();
            }
        });
    }
}
