package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.application.example.EXTRA_TEXT";
    public static final String EXTRA_NUMBER = "com.example.application.example.EXTRA_NUMBER";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button =  findViewById(R.id.button);
        button.setOnClickListener(v -> openActivity2());
    }

    public void openActivity2() {
        EditText editText1 = findViewById(R.id.edittext1);
        String text = editText1.getText().toString();
        EditText number = findViewById(R.id.edittext2);
        String numInput = number.getText().toString();

        if(numInput.isEmpty()) numInput="0";
        int numOutput = Integer.parseInt(numInput);

        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra(EXTRA_TEXT, text);
        intent.putExtra(EXTRA_NUMBER, numOutput);
        startActivity(intent);
    }
}