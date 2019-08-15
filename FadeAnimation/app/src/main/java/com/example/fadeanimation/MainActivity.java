package com.example.fadeanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {


        ImageView roadImageView = (ImageView) findViewById(R.id.roadImageView);
        roadImageView.animate().alpha(0).setDuration(2000);

        ImageView sceneImageView = findViewById(R.id.sceneImageView);
        sceneImageView.animate().alpha(1).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
