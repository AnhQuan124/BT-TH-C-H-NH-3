package com.example.thecoffeehouse.TaiKhoan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.thecoffeehouse.R;

public class NhacDangPhatActivity extends AppCompatActivity {

    ImageView back_140;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhac_dang_phat);

        back_140 = (ImageView) findViewById(R.id.backndp);
        back_140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTroLaiTaiKhoan();
            }
        });
    }
    private void openTroLaiTaiKhoan(){
        Intent intent=new Intent(NhacDangPhatActivity.this, TaiKhoanFragment.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        finish();
    }
}