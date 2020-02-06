package com.example.w2020andriodlecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculate = findViewById(R.id.btnCalculate);
    }

    public void numberButtonOnClick(View v) {
        String btnName = ((Button)v).getText().toString();
        Log.i("stuff", "you hit my stuff" + btnName + " button" );
    }

}
