package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.titel);
        EditText Ed = findViewById(R.id.mid);
        EditText Ed1 = findViewById(R.id.Qz);
        EditText Ed2 = findViewById(R.id.Hw);
        EditText Ed3 = findViewById(R.id.fin);
        Button b = findViewById(R.id.button);
        TextView tx3 = findViewById(R.id.total);
        Button b2 =findViewById(R.id.button2);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(Ed.getText().toString());
                int num2 = Integer.parseInt(Ed1.getText().toString());
                int num3 = Integer.parseInt(Ed2.getText().toString());
                int num4 = Integer.parseInt(Ed3.getText().toString());
                int total = num1 + num2 + num3 + num4;

                tx3.setText(String.valueOf(total));
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Ed.setText(null);
                Ed.dispatchDisplayHint(View.VISIBLE);

                Ed1.setText(null);
                Ed1.dispatchDisplayHint(View.VISIBLE);

                Ed2.setText(null);
                Ed2.dispatchDisplayHint(View.VISIBLE);

                Ed3.setText(null);
                Ed3.dispatchDisplayHint(View.VISIBLE);



            }
        });
    }

    }
