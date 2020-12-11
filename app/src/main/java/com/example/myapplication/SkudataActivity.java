package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SkudataActivity extends AppCompatActivity {

    Button btn_Main,btn_Back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skudata);

        btn_Main = (Button)findViewById(R.id.btn_MainSKU);
        btn_Back = (Button)findViewById(R.id.btn_BackSKU);

        btn_Main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SkudataActivity.this,ScanbarcodeActivity.class));
            }
        });

        btn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SkudataActivity.this,ScanbarcodeActivity.class));
            }
        });

    }
}