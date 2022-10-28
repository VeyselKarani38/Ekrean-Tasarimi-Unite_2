package com.example.unite_2ekrantasarm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


        Button Btnuyg3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main );


        Btnuyg3 = findViewById(R.id.Btnuyg3);
        Btnuyg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent veysel = new Intent(MainActivity.this, UygActivity.class);
                startActivity(veysel);
            }
        });

    }
}