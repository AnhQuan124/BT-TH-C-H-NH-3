package com.example.thecoffeehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class NhapMaXacThucActivity extends AppCompatActivity {

    ImageView back_140;
    EditText nhapmaxacthuc_140;
    Button btnmaxacthuc_140;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhap_ma_xac_thuc);
        //1. Nút quay lại
        back_140=(ImageView) findViewById(R.id.backnmxt_140);
        back_140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNhapSoDienThoai();
            }
        });
        //2. Nút button
        nhapmaxacthuc_140=(EditText) findViewById(R.id.nhapmaxacthuc_140);
        btnmaxacthuc_140=(Button) findViewById(R.id.btnmaxacthuc_140);
        btnmaxacthuc_140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str2 = nhapmaxacthuc_140.getText().toString();
                if(str2.length()==0) {
                    Toast.makeText(NhapMaXacThucActivity.this, "Bạn chưa điền. Mời nhập lại", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(NhapMaXacThucActivity.this, "Tiếp tục",Toast.LENGTH_LONG).show();
                    openMainActivity();
                }
            }
        });
        
    }
    //1.
    public void openNhapSoDienThoai() {
        Intent intent = new Intent(this, NhapSoDienThoai.class);
        startActivity(intent);
        finish();
    }
    //2.
    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}