package com.example.trackmytime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SetupActivity extends AppCompatActivity {
    TextView label;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);

        label = findViewById(R.id.setupWelcomeName);
        Intent intent = getIntent();
        String user_name = intent.getStringExtra(MainActivity.EXTRA_NAME);

        label.setText("Hello " + user_name);
    }

    public void setupButtonClick(View v){
        Toast.makeText(this, "Let's track your time", Toast.LENGTH_SHORT).show();
    }
}