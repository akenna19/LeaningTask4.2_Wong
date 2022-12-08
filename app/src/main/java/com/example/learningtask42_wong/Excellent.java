package com.example.learningtask42_wong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Excellent extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        String Result = extras.getString("result");
        String Result1 = extras.getString("result1");
        setContentView(R.layout.activity_excellent);

        Button btnReturn;
        btnReturn = (Button) findViewById(R.id.btn_Return1);
        TextView tvResult = (TextView) findViewById(R.id.txt_result2);
        TextView tvResult1 = (TextView) findViewById(R.id.txt_result1);
        tvResult.setText(Result);
        tvResult1.setText(Result1);
        btnReturn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Excellent.this, MainActivity.class);
        startActivity(intent);
    }
}