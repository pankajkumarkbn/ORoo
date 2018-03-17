package com.example.dd.oroo;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by dd on 17/3/18.
 */

public class bmi extends MainActivity {
    private static final String TAG = "BMIActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmical);
        Toast.makeText(getApplicationContext(), "Welcome to BMI Calculator", Toast.LENGTH_SHORT).show();


        Button button2 = findViewById(R.id.Btn1);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //toast message
                Toast.makeText(getApplicationContext(), "BMI Calculator comming soon", Toast.LENGTH_SHORT).show();

                EditText mheight = findViewById(R.id.height);
                int height = Integer.parseInt(mheight.getText().toString());


                EditText mweight = findViewById(R.id.weight);
                int weight = Integer.parseInt(mweight.getText().toString());

                Log.v(TAG, "Height: " + height + " Weight: " + weight);

                //textview
                final TextView textView = findViewById(R.id.text1);
                //bmi calculator
                float calculate1 = weight / height;
                textView.setText("BMI: " + calculate1);

            }
        });

    }
}
