package com.example.diceroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//roll button
    public void rollBtnClick(View view){
        TextView rollLabel = findViewById(R.id.roll_count);
        Random random = new Random();
        rollLabel.setText(Integer.toString(random.nextInt(6)+1));
    }
}