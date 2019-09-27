package com.example.pertemuan5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int naik = 45;
    Button sigit, up, down;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sigit = (Button) findViewById(R.id.sigit);
        up = (Button) findViewById(R.id.up);
        down = (Button) findViewById(R.id.down);
        text = (TextView) findViewById(R.id.text);

        sigit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hello dimas igit prasetio", Toast.LENGTH_SHORT).show();
            }
        });

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naik++;
                text.setText(Integer.toString(naik));
            }
        });

        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naik--;
                text.setText(Integer.toString(naik));

            }
        });

    }
}