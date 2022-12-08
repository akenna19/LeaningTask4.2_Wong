package com.example.learningtask42_wong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Unsatisfactory extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        String Result4 = extras.getString("result4");
        String Result5 = extras.getString("result5");
        setContentView(R.layout.activity_satisfactory);

        Button btnReturn;
        btnReturn = (Button) findViewById(R.id.btn_Return1);
        TextView tvResult4 = (TextView) findViewById(R.id.txt_result2);
        TextView tvResult5 = (TextView) findViewById(R.id.txt_result3);
        tvResult4.setText(Result4);
        tvResult5.setText(Result5);
        btnReturn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Unsatisfactory.this, MainActivity.class);
        startActivity(intent);
    }
}