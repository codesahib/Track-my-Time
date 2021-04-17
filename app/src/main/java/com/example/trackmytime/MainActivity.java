package com.example.trackmytime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username;
    public static final String EXTRA_NAME = "com.example.trackmytime.extra.NAME"; // Unique key for intent. This will be used to send data with intent

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void introButtonClick(View v){
        Toast.makeText(this, "Initializing...", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,SetupActivity.class);

        username = findViewById(R.id.introActivityUserName);
        String this_user = username.getText().toString();
        intent.putExtra(EXTRA_NAME,this_user);
        startActivity(intent);
    }
}