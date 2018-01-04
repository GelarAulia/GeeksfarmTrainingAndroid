package com.gelaraulia.geeksfarmtraining;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class FrameLayActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView img_one, img_two;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_framelay);
        img_one = (ImageView)findViewById(R.id.imageView);
        img_two = (ImageView)findViewById(R.id.imageView2);
        img_one.setOnClickListener(this);
        img_two.setOnClickListener(this);
    }
    @Override

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageView:
                img_one.setVisibility(View.GONE);
                img_two.setVisibility(View.VISIBLE);
                break;

            case R.id.imageView2:
                img_one.setVisibility(View.VISIBLE);
                img_two.setVisibility(View.GONE);
                break;
            default:
                break;
        }
    }
}
