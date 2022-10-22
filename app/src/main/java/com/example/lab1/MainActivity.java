package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtVal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtVal = findViewById(R.id.textView1);

    }

    public void changeText(View view) {
        if(txtVal.getText() == "Hello"){
            txtVal.setText("YES! The text has changed!");
        }else{
            txtVal.setText("Hello");
        }

    }
}