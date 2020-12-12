package com.example.thecoffeehouse.TinTuc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thecoffeehouse.CuaHang.CuaHangFragment;
import com.example.thecoffeehouse.DatHang.DatHangFragment;
import com.example.thecoffeehouse.DatHang.Tab.PhoBien.PhoBienFragment;
import com.example.thecoffeehouse.R;
import com.example.thecoffeehouse.TaiKhoan.NhacDangPhatActivity;
import com.example.thecoffeehouse.TaiKhoan.TaiKhoanFragment;
import com.example.thecoffeehouse.TaiKhoan.TheCoffeeHouseRewardsActivity;
import com.example.thecoffeehouse.TaiKhoan.ThongTinTaiKhoanActivity;
import com.example.thecoffeehouse.TinTuc.LuaChonTinTuc.ListLuaChonTinTuc;
import com.example.thecoffeehouse.TinTuc.LuaChonTinTuc.LuaChonTinTucAdapter;
import com.example.thecoffeehouse.TinTuc.UuDaiDacBIet.ListUuDaiDacBiet;
import com.example.thecoffeehouse.TinTuc.UuDaiDacBIet.UuDaiDacBietAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;


public class TinTucFragment extends Fragment {


    Context context_140;
    RecyclerView mList1,mListud_140,mListcntN_140,mListCL_140;
    List<ListLuaChonTinTuc> listlctt_140;
    List<ListUuDaiDacBiet> listud_140,listcntN_140,listCL_140;
    Button btnChiTiet_140;
    ImageView tichdiem_140,coupon_140,thongbao_140;

    public TinTucFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root_140= inflater.inflate(R.layout.fragment_tin_tuc, container, false);

        // Tích điểm

        tichdiem_140 = root_140.findViewById(R.id.imglctd);
        tichdiem_140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTichDiem();
            }
        });
        // Coupon
        coupon_140 = root_140.findViewById(R.id.imgcp);
        coupon_140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCoupon();
            }
        });

        // Thông báo
        thongbao_140 = root_140.findViewById(R.id.thongbao);
        thongbao_140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openThongBao();
            }
        });

        // Lựa chọn tin tuc
//        mList1 = root.findViewById(R.id.rcc_lctt);
//        listlctt = new ArrayList<>();
//
//        listlctt.add(new ListLuaChonTinTuc(R.drawable.tichdiem,"Tích điểm"));
//        listlctt.add(new ListLuaChonTinTuc(R.drawable.dathang,"Đặt hàng"));
//        listlctt.add(new ListLuaChonTinTuc(R.drawable.coupon,"Coupon"));
//        listlctt.add(new ListLuaChonTinTuc(R.drawable.rewards,"Rewards"));
//
//        GridLayoutManager manager1 = new GridLayoutManager(TinTucFragment.this.getActivity(),1);
//        manager1.setOrientation(GridLayoutManager.HORIZONTAL);
//        mList1.setLayoutManager(manager1);
//
//        LuaChonTinTucAdapter adaptor1 = new LuaChonTinTucAdapter(TinTucFragment.this.getActivity(),listlctt);
//        mList1.setAdapter(adaptor1);

        // Ưu đãi đặc biệt
        mListud_140 = root_140.findViewById(R.id.rcc_uudaidacbiet);
        listud_140 = new ArrayList<>();

        listud_140.add(new ListUuDaiDacBiet(R.drawable.uu20pt,"Hoàn đến 20%, thèm gì gọi Nhà mang tới liền","Hòa vào không khí siêu sale cuối năm, mời team mình nghỉ tay gọi món yêu thích"));
        listud_140.add(new ListUuDaiDacBiet(R.drawable.giamn20pt,"Thanh toán zalopay giảm ngày 20%","Tuần mới chỉ thật sự tươi tỉnh khi có một tách cà phê đậm đà kế bên. Nhanh tay"));
        listud_140.add(new ListUuDaiDacBiet(R.drawable.gn20vavoucher,"Trung thu thưởng trà - Quà bao la","Quà tặng bao la, thanh toán Zalopay giảm ngay 50%, tối đa 50k + Voucher 20k"));
        listud_140.add(new ListUuDaiDacBiet(R.drawable.voucher75k,"Nhận voucher 75k khi mở thẻ Timo","Tặng ngay voucher 100K khi mở thẻ Timo cùng bao la quà tặng hấp dẫn, giao dịch nhanh"));
        listud_140.add(new ListUuDaiDacBiet(R.drawable.laymagiamngay,"Golden Age - E-Voucher The Coffee House 45k","Chỉ cần nhập mã qua app, được nhận ngay Voucher 75k tha hồ đặt món, uống tha ga"));


        GridLayoutManager manager2_140 = new GridLayoutManager(TinTucFragment.this.getActivity(),1);
        manager2_140.setOrientation(GridLayoutManager.HORIZONTAL);
        mListud_140.setLayoutManager(manager2_140);

        UuDaiDacBietAdapter adaptor2_140 = new UuDaiDacBietAdapter(TinTucFragment.this.getActivity(),listud_140);
        mListud_140.setAdapter(adaptor2_140);

        //Cập nhật từ Nhà

        mListcntN_140 = root_140.findViewById(R.id.rcc_capnhattunha);
        listcntN_140 = new ArrayList<>();

        listcntN_140.add(new ListUuDaiDacBiet(R.drawable.cntn1,"Nhà Reverside Vũ Tông Phan - Hà Nội khai trương","Người ta dậy thì thành công, còn chúng mình dậy thì mang chiếc áo đủ ấm"));
        listcntN_140.add(new ListUuDaiDacBiet(R.drawable.cntn2,"Taste of Xmas - Chạm vị Giáng sinh","Năm nay tại Nhà, vị GIáng sinh mà bạn yêu thích, mong chờ từ trước đến nay"));
        listcntN_140.add(new ListUuDaiDacBiet(R.drawable.cntn3,"Trời se lạnh, thưởng thức ngay những món nóng","Chớm đầu Dông, những cươn mưa bất chợt làm trời se lạnh là thời điểm đến Nhà"));
        listcntN_140.add(new ListUuDaiDacBiet(R.drawable.cntn4,"Khám phá không gian Nhà Mới: Hiện đại, Sang trọng","Mô hình thiết kế mới tại Nhà mang đến không gian xinh đẹp vừa quen vừa lạ"));
        listcntN_140.add(new ListUuDaiDacBiet(R.drawable.cntn5,"Tất bật vì bạn - Là niềm vui của Shipper Nhà","Mỗi ngày shipper Nhà chọn niềm vui, chạy tới chạy lui mang món nước yêu thích"));


        GridLayoutManager manager3_140 = new GridLayoutManager(TinTucFragment.this.getActivity(),1);
        manager3_140.setOrientation(GridLayoutManager.HORIZONTAL);
        mListcntN_140.setLayoutManager(manager3_140);

        UuDaiDacBietAdapter adaptor3_140 = new UuDaiDacBietAdapter(TinTucFragment.this.getActivity(),listcntN_140);
        mListcntN_140.setAdapter(adaptor3_140);

        //CoffeeLover

        mListCL_140 = root_140.findViewById(R.id.rcc_coffeelover);
        listCL_140 = new ArrayList<>();

        listCL_140.add(new ListUuDaiDacBiet(R.drawable.cfl1,"Bản sắc nơi đất trồng, Một hành trình ","Cùng Nhà bắt đầu hành trình đầu tiên cùng Travel Blogger Nhị Đặng lên đường"));
        listCL_140.add(new ListUuDaiDacBiet(R.drawable.cfl2,"Hương vị Cà phê mới tại nhà Signature","Nhà Signature - nơi những hương vị nguyên bản tạo nên trải nghiệm khác biệt"));
        listCL_140.add(new ListUuDaiDacBiet(R.drawable.cfl3,"Costa Rica - Tách Hand Brew Mới ","Costa Rica - Tách Hand Brew đượm vị cho mùa hè của bạn thêm phần ngọt ngào"));
        listCL_140.add(new ListUuDaiDacBiet(R.drawable.cfl4,"Cold Brew nào phải Cà phê đá !","Cà phê pha lạnh và Cà phê đá lạnh nghe thì xêm xêm nhưng không có họ hàng gì"));
        listCL_140.add(new ListUuDaiDacBiet(R.drawable.cfl5,"Chuyện về chai tonic tại Nhà Signature","Với món Nitro Cold Brew Tonic, chai tonic sẽ được phục vụ riêng, để bạn thoái mái"));


        GridLayoutManager manager4_140 = new GridLayoutManager(TinTucFragment.this.getActivity(),1);
        manager4_140.setOrientation(GridLayoutManager.HORIZONTAL);
        mListCL_140.setLayoutManager(manager4_140);

        UuDaiDacBietAdapter adaptor4_140 = new UuDaiDacBietAdapter(TinTucFragment.this.getActivity(),listCL_140);
        mListCL_140.setAdapter(adaptor4_140);

        return root_140;
    }
    public void openTichDiem(){
        Intent intent_140=new Intent(TinTucFragment.this.getActivity(), TichDiemActivity.class);
        startActivity(intent_140);
    }
    public void openCoupon(){
        Intent intent_140=new Intent(TinTucFragment.this.getActivity(), CouponActivity.class);
        startActivity(intent_140);
    }
    public void openThongBao(){
        Intent intent_140=new Intent(TinTucFragment.this.getActivity(), ThongBaoActivity.class);
        startActivity(intent_140);
    }

}