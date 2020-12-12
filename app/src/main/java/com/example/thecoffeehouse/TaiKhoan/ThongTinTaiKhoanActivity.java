package com.example.thecoffeehouse.TaiKhoan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thecoffeehouse.R;

public class ThongTinTaiKhoanActivity extends AppCompatActivity {

    ImageView back_140;
    TextView suatt_140;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_tin_tai_khoan);

        back_140 = (ImageView) findViewById(R.id.backtttk);
        back_140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTroLaiTaiKhoan();
            }
        });

        suatt_140 = (TextView) findViewById(R.id.doitt);
        suatt_140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSuaThongTin();
            }
        });
    }
    private void openTroLaiTaiKhoan(){
        Intent intent_140=new Intent(ThongTinTaiKhoanActivity.this, TaiKhoanFragment.class);
        intent_140.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        finish();
    }

    private void openSuaThongTin(){
        Intent intent_140=new Intent(ThongTinTaiKhoanActivity.this,SuaThongTinActivity.class);
        startActivity(intent_140);
    }
}