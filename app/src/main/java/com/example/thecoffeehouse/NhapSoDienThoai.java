package com.example.thecoffeehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class NhapSoDienThoai extends AppCompatActivity {

    ImageView quaylai_nhapsodienthoai_140;
    EditText nhapsodienthoai3_140;
    Button btntieptuc_140;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhap_so_dien_thoai);

        quaylai_nhapsodienthoai_140 = (ImageView) findViewById(R.id.backlg_140);
        quaylai_nhapsodienthoai_140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogin();
            }
        });
        nhapsodienthoai3_140 = (EditText) findViewById(R.id.nhapsodienthoai3_140);
        btntieptuc_140 = (Button) findViewById(R.id.btntieptuc_140);
        btntieptuc_140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = nhapsodienthoai3_140.getText().toString();
                if(str1.length()==0){
                    Toast.makeText(NhapSoDienThoai.this, "Bạn chưa điền. Mời nhập lại",Toast.LENGTH_LONG).show();
                }else if(str1.length()>10){
                    Toast.makeText(NhapSoDienThoai.this, "Không được nhập trên 10 kí tự",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(NhapSoDienThoai.this, "Tiếp tục",Toast.LENGTH_LONG).show();
                    openNhapMaXacThuc();
                }
            }
        });
    }
    public void openLogin() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
    public void openNhapMaXacThuc(){
        Intent intent = new Intent(this, NhapMaXacThucActivity.class);
        startActivity(intent);
        finish();
    }
}