package com.gelaraulia.geeksfarmtraining;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class ImageViewActivity extends AppCompatActivity {
    int curr_image = 0;
    int[] images = {R.drawable.android_one, R.drawable.android_two, R.drawable.android_three};
    ImageView iv_obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        Button btn_back = (Button)findViewById(R.id.btn_ivactBack);
        Button btn_next = (Button)findViewById(R.id.btn_ivactNext);
        iv_obj = (ImageView)findViewById(R.id.iv_ivact);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(curr_image == 0){
                    curr_image = images.length;
                    curr_image--;
                } else {
                    curr_image--;
                }
                curr_image = curr_image % images.length;
                iv_obj.setImageResource(images[curr_image]);
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr_image++;
                curr_image = curr_image % images.length;
                iv_obj.setImageResource(images[curr_image]);
            }
        });
    }
}
