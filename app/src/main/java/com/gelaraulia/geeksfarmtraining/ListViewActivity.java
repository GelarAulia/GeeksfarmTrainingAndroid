package com.gelaraulia.geeksfarmtraining;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        final ListView lv_products_obj = (ListView)findViewById(R.id.lv_products);
        String[] products = new String[] {"Windows", "OSX", "Ubuntu"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.products_view, products);
        lv_products_obj.setAdapter(adapter);
        lv_products_obj.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = (String)lv_products_obj.getItemAtPosition(position);
                Toast.makeText(ListViewActivity.this, "No. Product: " + position + ", Name Product: " +
                value, Toast.LENGTH_LONG).show();
            }
        });
    }
}
