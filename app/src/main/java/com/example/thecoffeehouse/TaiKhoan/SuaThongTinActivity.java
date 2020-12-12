package com.example.thecoffeehouse.TaiKhoan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.thecoffeehouse.R;

public class SuaThongTinActivity extends AppCompatActivity {

    ImageView thoat2_140;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sua_thong_tin);
        //1. Nút thoát nhảy về trang XemThongTinCaNhan
        thoat2_140=findViewById(R.id.thoat2_140);
        thoat2_140.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openXemThongTinCaNhan();
            }
        });
    }
    //1
    public void openXemThongTinCaNhan(){
        Intent intent = new Intent(this, ThongTinTaiKhoanActivity.class);
        startActivity(intent);
        finish();
    }
}