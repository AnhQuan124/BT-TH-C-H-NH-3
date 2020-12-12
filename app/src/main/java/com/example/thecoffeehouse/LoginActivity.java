package com.example.thecoffeehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText nhapsodienthoai2_140;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nhapsodienthoai2_140 = (EditText) findViewById(R.id.nhapsodienthoai2_140);
        nhapsodienthoai2_140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNhapSoDienThoai();
            }
        });
    }
    public void openNhapSoDienThoai() {
        Intent intent = new Intent(this, NhapSoDienThoai.class);
        startActivity(intent);
        finish();
    }
}