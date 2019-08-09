package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertButtonClicked(View view) {

        EditText userEnteredCurrency = (EditText) findViewById(R.id.currencyEnterededitText);

        String amountInPounds = userEnteredCurrency.getText().toString();
        double amountInPoundsDouble = Double.parseDouble(amountInPounds);

        double amountInDollersDouble = amountInPoundsDouble * 1.3;

        String amountInDollersString = String.format("%.2f", amountInDollersDouble);

        Log.i("Entered Currency", userEnteredCurrency.getText().toString());
        Log.i("amount in Dollers", amountInDollersString);


        Toast.makeText(this, userEnteredCurrency + "Pounds is $" + amountInDollersString , Toast.LENGTH_LONG).show();
    }


}
