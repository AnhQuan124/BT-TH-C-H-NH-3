package com.example.thecoffeehouse.TinTuc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.thecoffeehouse.MainActivity;
import com.example.thecoffeehouse.R;

public class ThongBaoActivity extends AppCompatActivity {

    ImageView backtb_140;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_bao);
        //1. Nút thoát nhảy về trang XemThongTinCaNhan
        backtb_140=findViewById(R.id.backndp);
        backtb_140.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openTrangChutb();
            }
        });
    }
    //1
    public void openTrangChutb(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}