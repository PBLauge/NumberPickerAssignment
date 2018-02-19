package com.example.peder.calculatorapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv = (TextView) findViewById(R.id.tv);
        final TextView tv2 = (TextView) findViewById(R.id.tv2);
        final TextView tv3 = (TextView) findViewById(R.id.tv3);
        final NumberPicker np1 = (NumberPicker) findViewById(R.id.np1);
        final NumberPicker np2 = (NumberPicker) findViewById(R.id.np2);
        final NumberPicker np3 = (NumberPicker) findViewById(R.id.np3);

        tv.setTextColor(Color.parseColor("#ffd32b3b"));
        tv2.setTextColor(Color.parseColor("#ffd32b3b"));
        tv3.setTextColor(Color.parseColor("#ffd32b3b"));

        np1.setMinValue(0);
        np2.setMinValue(0);
        np3.setMinValue(0);

        np1.setMaxValue(24); //Hours
        np2.setMaxValue(60); //Minutes
        np3.setMaxValue(60); //Seconds

        np1.setWrapSelectorWheel(true);
        np2.setWrapSelectorWheel(true);
        np3.setWrapSelectorWheel(true);


        //Set a value change listener for NumberPicker
        np1.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal){
                //Display the newly selected number from picker
                tv.setText(" " + newVal + " : ");
            }
        });

        //Set a value change listener for NumberPicker
        np2.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal){
                //Display the newly selected number from picker
                tv2.setText(" " + newVal + " : ");
            }
        });

        //Set a value change listener for NumberPicker
        np3.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal){
                //Display the newly selected number from picker
                tv3.setText(" " + newVal);
            }
        });

}
}