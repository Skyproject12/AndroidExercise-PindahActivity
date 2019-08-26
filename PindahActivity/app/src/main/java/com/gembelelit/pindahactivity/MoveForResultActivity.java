package com.gembelelit.pindahactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MoveForResultActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnChoose;
    RadioGroup rgNumber;
    public static String EXTRA_SELECTED_VALUE= "extra_selected_value";
    int RESULT_CODE=110;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_for_result);
        btnChoose = findViewById(R.id.btn_choose);
        rgNumber = findViewById(R.id.rg_number);
        btnChoose.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // ketika id adalah id btn_close
        if(v.getId() == R.id.btn_choose){
            if(rgNumber.getCheckedRadioButtonId()!=0){
                int value=0;
                // mengecek cek status dari radio button berdasarkan id
                switch (rgNumber.getCheckedRadioButtonId()){
                    case R.id.rb_50:
                        value=50;
                        break;
                    case R.id.rb_100:
                        value=100;
                        break;
                    case R.id.rb_150:
                        value=150;
                        break;
                    case R.id.rb_200:
                        value=200;
                        break;
                }
                Intent resultIntent= new Intent();
                // put exrra when inten
                resultIntent.putExtra(EXTRA_SELECTED_VALUE, value);
                setResult(RESULT_CODE, resultIntent);
                finish();
            }
        }
    }
}
