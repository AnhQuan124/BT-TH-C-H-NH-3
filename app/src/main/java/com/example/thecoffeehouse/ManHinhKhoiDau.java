package com.example.thecoffeehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thecoffeehouse.TinTuc.TinTucFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ManHinhKhoiDau extends AppCompatActivity {

    private static int SPLASH_SCREEN = 5000;
    Animation topAnim_140, bottonAnim_140, midAnim_140;
    ImageView bk1_140, bk2_140;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_khoi_dau);
        BottomNavigationView navView = findViewById(R.id.bottom_navigation);
        //Animations
        topAnim_140 = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottonAnim_140 = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        midAnim_140 = AnimationUtils.loadAnimation(this, R.anim.mid_animation);
        // hooks
        bk1_140 = findViewById(R.id.bk1);
        bk1_140.setAnimation(topAnim_140);
        bk2_140 = findViewById(R.id.bk2);
        bk2_140.setAnimation(bottonAnim_140);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(ManHinhKhoiDau.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_SCREEN);
    }
}