package com.gelaraulia.geeksfarmtraining;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.*;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2_1,btn2_2,btn3,btn4,btn5,btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn_frame);

        btn2_1 = (Button) findViewById(R.id.btn_linearHor);
        btn2_2 = (Button) findViewById(R.id.btn_linearVer);

        btn3 = (Button) findViewById(R.id.btn_table);

        btn4 = (Button) findViewById(R.id.btn_grid);

        btn5 = (Button) findViewById(R.id.btn_relative);
        
        btn1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myInt = new Intent(MainActivity.this,FrameLayActivity.class);
                startActivity(myInt);
            }
        });

        btn2_1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myInt = new Intent(MainActivity.this,LinearLayHorActivity.class);
                startActivity(myInt);
            }
        });
        btn2_2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myInt = new Intent(MainActivity.this,LinearLayVerActivity.class);
                startActivity(myInt);
            }
        });

        btn3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myInt = new Intent(MainActivity.this,TableLayActivity.class);
                startActivity(myInt);
            }
        });

        btn4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myInt = new Intent(MainActivity.this,GridLayActivity.class);
                startActivity(myInt);
            }
        });

        btn5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myInt = new Intent(MainActivity.this,RelativeLayActivity.class);
                startActivity(myInt);
            }
        });

        btn6 = (Button)findViewById(R.id.btn_nested);
        btn6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myInt = new Intent(MainActivity.this,NestedLayActivity.class);
                startActivity(myInt);
            }
        });

        Button btn7 = (Button)findViewById(R.id.btn_toListView);
        btn7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myInt = new Intent(MainActivity.this,ListViewActivity.class);
                startActivity(myInt);
            }
        });

        Button btn8 = (Button)findViewById(R.id.btn_toImageView);
        btn8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myInt = new Intent(MainActivity.this,ImageViewActivity.class);
                startActivity(myInt);
            }
        });
    }

}
