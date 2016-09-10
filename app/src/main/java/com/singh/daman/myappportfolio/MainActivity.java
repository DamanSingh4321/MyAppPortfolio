package com.singh.daman.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnmovies, btnstock, btnbuild, btnmake, btngo, btncaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnmovies = (Button)findViewById(R.id.btnmovies);
        btnstock = (Button)findViewById(R.id.btnstock);
        btnbuild = (Button)findViewById(R.id.btnbuild);
        btnmake = (Button)findViewById(R.id.btnmake);
        btngo = (Button)findViewById(R.id.btngo);
        btncaps = (Button)findViewById(R.id.btncaps);

        btnmovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"This button will launch popular movies app!",Toast.LENGTH_LONG).show();
            }
        });

        btnstock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"This button will launch stock hawk app!",Toast.LENGTH_LONG).show();
            }
        });

        btnbuild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"This button will launch build it bigger app!",Toast.LENGTH_LONG).show();
            }
        });


        btnmake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"This button will launch make your app material app!",Toast.LENGTH_LONG).show();
            }
        });


        btngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"This button will launch go ubiquitous app!",Toast.LENGTH_LONG).show();
            }
        });


        btncaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"This button will launch capstone app!",Toast.LENGTH_LONG).show();
            }
        });
    }
}
