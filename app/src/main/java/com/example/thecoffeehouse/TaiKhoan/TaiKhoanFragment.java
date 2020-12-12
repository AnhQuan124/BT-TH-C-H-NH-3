package com.example.thecoffeehouse.TaiKhoan;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thecoffeehouse.LoginActivity;
import com.example.thecoffeehouse.R;

public class TaiKhoanFragment extends Fragment {

    ImageView imgavat_140;
    TextView thecoffeerewards_140,thongtintk_140,nhacdangphat_140,lichsu_140,giupdo_140,caidat_140,dangxuat_140;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root_140 =inflater.inflate(R.layout.fragment_tai_khoan, container, false);

        // The Coffee Rewards
        thecoffeerewards_140 = root_140.findViewById(R.id.thecoffeehouserewards);
        thecoffeerewards_140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTheCoffeeRewards();
            }
        });

        // Thong tin ca nhan qua Image
        imgavat_140 = root_140.findViewById(R.id.imgavat);
        imgavat_140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openThongTinCaNhan();
            }
        });

        // Thong tin ca nhan
        thongtintk_140 = root_140.findViewById(R.id.thongtintaikhoan);
        thongtintk_140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openThongTinCaNhan();
            }
        });
        //Nhac dang phat
        nhacdangphat_140 = root_140.findViewById(R.id.nhacdangphat);
        nhacdangphat_140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNhacDangPhat();
            }
        });
        //Lich su

        //Giup do

        //Cai dat

        //Dang xuat
        dangxuat_140 = root_140.findViewById(R.id.dangxuat);
        dangxuat_140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDangXuat();
            }
        });

        return root_140;
    }
    public void openTheCoffeeRewards(){
        Intent intent_140=new Intent(TaiKhoanFragment.this.getActivity(), TheCoffeeHouseRewardsActivity.class);
        startActivity(intent_140);
    }
    public void openThongTinCaNhan(){
        Intent intent_140=new Intent(TaiKhoanFragment.this.getActivity(), ThongTinTaiKhoanActivity.class);
        startActivity(intent_140);
    }
    public void openNhacDangPhat(){
        Intent intent_140=new Intent(TaiKhoanFragment.this.getActivity(), NhacDangPhatActivity.class);
        startActivity(intent_140);
    }
//    public void openLichSu(){
//        Intent intent=new Intent(TaiKhoanFragment.this.getActivity(), TheCoffeeHouseRewardsActivity.class);
//        startActivity(intent);
//    }
//    public void openTheCoffeeRewards(){
//        Intent intent=new Intent(TaiKhoanFragment.this.getActivity(), TheCoffeeHouseRewardsActivity.class);
//        startActivity(intent);
//    }
//    public void openTheCoffeeRewards(){
//        Intent intent=new Intent(TaiKhoanFragment.this.getActivity(), TheCoffeeHouseRewardsActivity.class);
//        startActivity(intent);
//    }
    public void openDangXuat(){
        Intent intent_140=new Intent(TaiKhoanFragment.this.getActivity(), LoginActivity.class);
        startActivity(intent_140);
    }

}