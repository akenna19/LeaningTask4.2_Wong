package com.example.learningtask42_wong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Satisfactory extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        String Result2 = extras.getString("result2");
        String Result3 = extras.getString("result3");
        setContentView(R.layout.activity_satisfactory);

        Button btnReturn;
        btnReturn = (Button) findViewById(R.id.btn_Return1);
        TextView tvResult2 = (TextView) findViewById(R.id.txt_result2);
        TextView tvResult3 = (TextView) findViewById(R.id.txt_result3);
        tvResult2.setText(Result2);
        tvResult3.setText(Result3);
        btnReturn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Satisfactory.this, MainActivity.class);
        startActivity(intent);
    }
}