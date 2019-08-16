package com.example.timestables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
//    final ListView listView = (ListView) findViewById(R.id.listView);
    ArrayList<Integer> numbersList;

    public void generateTimesTables(int timesTablesNumber) {


        ArrayList<String> numberStringsList = new ArrayList<String>();

        for (Integer j : numbersList) {
            Log.i("Info", Integer.toString(j*timesTablesNumber));
            numberStringsList.add(Integer.toString(j*timesTablesNumber));
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, numberStringsList);
//        listView.setAdapter(adapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar.setMax(20);
        seekBar.setProgress(10);


        numbersList = new ArrayList<Integer>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(5);
        numbersList.add(6);
        numbersList.add(7);
        numbersList.add(8);
        numbersList.add(9);
        numbersList.add(10);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int min = 1;
            int timesTablesNumber;
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                if (i < 1) {
                    timesTablesNumber = min;
                    seekBar.setProgress(min);
                } else {
                    timesTablesNumber = i;
                }
                generateTimesTables(timesTablesNumber);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
