package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);

        final ArrayList<String> myFriends = new ArrayList<String>();

        myFriends.add("Mounika");
        myFriends.add("Amith Vijayan");
        myFriends.add("Ravneeth Kaur");
        myFriends.add("Prasanna Kamatham");
        myFriends.add("Nikhil");
        myFriends.add("Mounika");
        myFriends.add("Amith Vijayan");
        myFriends.add("Ravneeth Kaur");
        myFriends.add("Prasanna Kamatham");
        myFriends.add("Nikhil");
        myFriends.add("Mounika");
        myFriends.add("Amith Vijayan");
        myFriends.add("Ravneeth Kaur");
        myFriends.add("Prasanna Kamatham");
        myFriends.add("Nikhil");
        myFriends.add("Mounika");
        myFriends.add("Amith Vijayan");
        myFriends.add("Ravneeth Kaur");
        myFriends.add("Prasanna Kamatham");
        myFriends.add("Nikhil");myFriends.add("Mounika");
        myFriends.add("Amith Vijayan");
        myFriends.add("Ravneeth Kaur");
        myFriends.add("Prasanna Kamatham");
        myFriends.add("Nikhil");
        myFriends.add("Mounika");
        myFriends.add("Amith Vijayan");
        myFriends.add("Ravneeth Kaur");
        myFriends.add("Prasanna Kamatham");
        myFriends.add("Nikhil");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, myFriends);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Hello " + myFriends.get(i), Toast.LENGTH_SHORT).show();
            }   
        });

    }
}
