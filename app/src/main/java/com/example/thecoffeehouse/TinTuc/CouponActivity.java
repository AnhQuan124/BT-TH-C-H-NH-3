package com.example.thecoffeehouse.TinTuc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.thecoffeehouse.MainActivity;
import com.example.thecoffeehouse.R;

public class CouponActivity extends AppCompatActivity {

    ImageView backcp_140;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupon);
        //1. Nút thoát nhảy về trang XemThongTinCaNhan
        backcp_140=findViewById(R.id.backndp);
        backcp_140.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openTrangChucp();
            }
        });
    }
    //1
    public void openTrangChucp(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}