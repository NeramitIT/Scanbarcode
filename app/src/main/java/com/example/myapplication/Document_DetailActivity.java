package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Document_DetailActivity extends AppCompatActivity {

    Button btn_camera, btn_back;
    TextView tv_Docno,tv_Area,tv_Warehouse,tv_Productcode,tv_NumberofPicks,tv_Realpicks;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_document__detail);

        btn_camera = (Button)findViewById(R.id.btn_doc_detail_camera);
        btn_back = (Button)findViewById(R.id.btn_doc_detail_back);
        tv_Docno = (TextView)findViewById(R.id.tv_doc_detail_Docno);
        tv_Area = (TextView)findViewById(R.id.tv_doc_detail_Area);
        tv_Warehouse = (TextView)findViewById(R.id.tv_doc_detail_warehouse);
        tv_Productcode = (TextView)findViewById(R.id.tv_doc_detail_product_code);
        tv_NumberofPicks = (TextView)findViewById(R.id.tv_doc_detail_Number_of_Picks);
        tv_Realpicks = (TextView)findViewById(R.id.tv_doc_detail_Real_Picks);

        btn_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Document_DetailActivity.this,ScanbarcodeActivity.class));
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Document_DetailActivity.this,ScanbarcodeActivity.class));
            }
        });

    }
}