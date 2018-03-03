package com.example.dd.oroo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final LinearLayout linearLayout = findViewById(R.id.mainll);
        final TextView textView = findViewById(R.id.mytext);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Tap Again", Toast.LENGTH_SHORT).show();

                if (count == 1) {
                    linearLayout.setBackgroundColor(getResources().getColor(R.color.whitu));
                    textView.setTextColor(getResources().getColor(R.color.blacku));
                    textView.setText("People inspire you or drain you; pick them wisely.");
                }
                if (count == 2) {
                    linearLayout.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    textView.setTextColor(getResources().getColor(R.color.whitu));
                    textView.setText("By appreciation, we make excellence in others our own property.");
                }
                if (count == 3) {
                    linearLayout.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                    textView.setTextColor(getResources().getColor(R.color.whitu));
                    textView.setText("One of the truest tests of integrity is that its blunt refusal to be compromised.");
                }
                if (count == 4) {
                    linearLayout.setBackgroundColor(getResources().getColor(R.color.blacku));
                    textView.setText("Hate no one; hate their vices, not themselves.");

                }
                if (count == 5) {
                    linearLayout.setBackgroundColor(getResources().getColor(R.color.whitu));
                    textView.setTextColor(getResources().getColor(R.color.blacku));
                    textView.setText("Stop wearing your wishbone where your backbone ought to be.");
                }
                if (count == 6) {
                    linearLayout.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    textView.setTextColor(getResources().getColor(R.color.whitu));
                    textView.setText("Truth can be stated in a thousand different ways, yet each one can be true.");
                }
                if (count == 7) {
                    linearLayout.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                    textView.setTextColor(getResources().getColor(R.color.whitu));
                    textView.setText("All who would win joy, must share it; happiness was born a twin.");
                }

                count++;
                if (count > 7) {
                    count = 1;
                }
            }
        });
    }
}

