package com.gelaraulia.geeksfarmtraining;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class NestedLayActivity extends AppCompatActivity implements View.OnClickListener{

    EditText et_table;

    RadioGroup rg_grid;
    RadioButton rb_grid;

    CheckBox cb_grid, cb_grid_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nested_lay);
        Button btn_a = (Button)findViewById(R.id.btn_nested_A);
        Button btn_b = (Button)findViewById(R.id.btn_nested_B);
        Button btn_c = (Button)findViewById(R.id.btn_nested_C);
        Button btn_d = (Button)findViewById(R.id.btn_nested_D);
        Button btn_e = (Button)findViewById(R.id.btn_nested_E);
        btn_a.setOnClickListener(this);
        btn_b.setOnClickListener(this);
        btn_c.setOnClickListener(this);
        btn_d.setOnClickListener(this);
        btn_e.setOnClickListener(this);

        et_table = (EditText)findViewById(R.id.ET_nested_table);
        Button btn_table = (Button)findViewById(R.id.btn_nested_table);

        btn_table.setOnClickListener(this);

        rg_grid = (RadioGroup)findViewById(R.id.RG_nested_grid);

        Button btn_grid = (Button)findViewById(R.id.btn_nested_grid);
        btn_grid.setOnClickListener(this);

        cb_grid = (CheckBox)findViewById(R.id.CB_nested_grid);
        cb_grid_2 = (CheckBox)findViewById(R.id.CB_nested_grid_2);

        Button btn_grid_2 = (Button)findViewById(R.id.btn_nested_grid_2);
        btn_grid_2.setOnClickListener(this);

        Button btn_relative = (Button)findViewById(R.id.btn_nested_relative);
        Button btn_relative_2 = (Button)findViewById(R.id.btn_nested_relative_2);
        btn_relative.setOnClickListener(this);
        btn_relative_2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_nested_A:
                Toast.makeText(NestedLayActivity.this, "Button A Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_nested_B:
                Toast.makeText(NestedLayActivity.this, "Button B Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_nested_C:
                Toast.makeText(NestedLayActivity.this, "Button C Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_nested_D:
                Toast.makeText(NestedLayActivity.this, "Button D Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_nested_E:
                Toast.makeText(NestedLayActivity.this, "Button E Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_nested_table:
                Toast.makeText(NestedLayActivity.this, et_table.getText(), Toast.LENGTH_SHORT).show();
                break;



            case R.id.btn_nested_grid:
                int selected_rb = rg_grid.getCheckedRadioButtonId();
                rb_grid = (RadioButton)findViewById(selected_rb);
                Toast.makeText(NestedLayActivity.this, rb_grid.getText().toString(),Toast.LENGTH_SHORT).show();
                break;



            case R.id.btn_nested_grid_2:
                StringBuffer list_cb = new StringBuffer();
                list_cb.append("C: ").append(cb_grid.isChecked()).append("\n");
                list_cb.append("D: ").append(cb_grid_2.isChecked());
                Toast.makeText(NestedLayActivity.this, list_cb.toString(),Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_nested_relative:
                AlertDialog.Builder alert = new AlertDialog.Builder(this);
                alert.setCancelable(false)
                        .setTitle("Alert A")
                        .setMessage("Do you want to show Alert A?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(NestedLayActivity.this, "Alert A Yes Clicked", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                alert.show();
                break;

            case R.id.btn_nested_relative_2:
                AlertDialog.Builder alert_2 = new AlertDialog.Builder(this);
                alert_2.setCancelable(true)
                        .setTitle("Alert B (Cancelable)")
                        .setMessage("Do you want to show Alert B?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(NestedLayActivity.this, "Alert B Yes Clicked", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                alert_2.show();
                break;
        }
    }
}
