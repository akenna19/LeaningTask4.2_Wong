package com.example.learningtask42_wong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    double g1, g2, g3, g4, Fg1, Fg2, Fg3, Fg4, AG, GWA;
    EditText et1, et2, et3, et4;
    String Remarks, resultGWA;
    Button btnCompute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCompute = (Button)findViewById(R.id.button);
        btnCompute.setOnClickListener(this);
    }
    public void compute (){
        et1 = (EditText) findViewById(R.id.editTextNumber1);
        et2 = (EditText) findViewById(R.id.editTextNumber2);
        et3 = (EditText) findViewById(R.id.editTextNumber3);
        et4 = (EditText) findViewById(R.id.editTextNumber4);

        if (et1.getText().toString().isEmpty() || et2.getText().toString().isEmpty() || et3.getText().toString().isEmpty() || et4.getText().toString().isEmpty()) {
            g1 = 0;
            g2 = 0;
            g3 = 0;
            g4 = 0;

        } else {

            g1 = Double.parseDouble(et1.getText().toString());
            g2 = Double.parseDouble(et2.getText().toString());
            g3 = Double.parseDouble(et3.getText().toString());
            g4 = Double.parseDouble(et4.getText().toString());
        }
        Fg1 = g1*3;
        Fg2 = g2*3;
        Fg3 = g3*3;
        Fg4 = g4*3;

        AG = Fg1 + Fg2 + Fg3 + Fg4;

        GWA = AG/12;

        if(GWA <= 1.75){
            Remarks = "Excellent";
        }else if (GWA <= 2.75){
            Remarks = "Satisfactory";
        }else {
            Remarks = "Unsatisfactory";
        }

        switch (Remarks) {
            case "Excellent":
                resultGWA = String.valueOf(GWA);
                Bundle args = new Bundle();
                args.putString("result", Remarks);
                args.putString("result1", resultGWA);

                Intent intent = new Intent(MainActivity.this, Excellent.class);
                intent.putExtras(args);
                startActivity(intent);
                break;
            case "Satisfactory":
                resultGWA = String.valueOf(GWA);
                Bundle args2 = new Bundle();
                args2.putString("result2", Remarks);
                args2.putString("result3", resultGWA);

                Intent intent2 = new Intent(MainActivity.this, Satisfactory.class);
                intent2.putExtras(args2);
                startActivity(intent2);
                break;
            case "Unsatisfactory":
                resultGWA = String.valueOf(GWA);
                Bundle args3 = new Bundle();
                args3.putString("result4", Remarks);
                args3.putString("result5", resultGWA);

                Intent intent3 = new Intent(MainActivity.this, Unsatisfactory.class);
                intent3.putExtras(args3);
                startActivity(intent3);
                break;
        }
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this,"Computing...", Toast.LENGTH_SHORT).show();
        compute();
    }
}