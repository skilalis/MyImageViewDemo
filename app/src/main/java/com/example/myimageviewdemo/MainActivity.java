package com.example.myimageviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView1, imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.imageView1Id);
        imageView2 = findViewById(R.id.imageView2Id);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this,"shakil",Toast.LENGTH_SHORT).show();
        if(v.getId()==R.id.imageView1Id){

        }else  if(v.getId()==R.id.imageView2Id) {
            Toast.makeText(MainActivity.this, "shakil", Toast.LENGTH_SHORT).show();
        }

    }
}