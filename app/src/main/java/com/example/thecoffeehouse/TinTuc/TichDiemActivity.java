package com.example.thecoffeehouse.TinTuc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.thecoffeehouse.MainActivity;
import com.example.thecoffeehouse.R;
import com.example.thecoffeehouse.TaiKhoan.ThongTinTaiKhoanActivity;

public class TichDiemActivity extends AppCompatActivity {

    ImageView back_140;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tich_diem);
        //1. Nút thoát nhảy về trang XemThongTinCaNhan
        back_140=findViewById(R.id.backndp);
        back_140.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openTrangChu();
            }
        });
    }
    //1
    public void openTrangChu(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}