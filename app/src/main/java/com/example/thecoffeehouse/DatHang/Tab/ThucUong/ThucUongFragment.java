package com.example.thecoffeehouse.DatHang.Tab.ThucUong;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.thecoffeehouse.DatHang.Tab.PhoBien.ProductAdapter;
import com.example.thecoffeehouse.DatHang.Tab.PhoBien.ProductModel;
import com.example.thecoffeehouse.R;
import com.example.thecoffeehouse.TinTuc.LuaChonTinTuc.ListLuaChonTinTuc;
import com.example.thecoffeehouse.TinTuc.LuaChonTinTuc.LuaChonTinTucAdapter;
import com.example.thecoffeehouse.TinTuc.TinTucFragment;
import com.example.thecoffeehouse.TinTuc.UuDaiDacBIet.ListUuDaiDacBiet;

import java.util.ArrayList;
import java.util.List;


public class ThucUongFragment extends Fragment {

    Context context_140;
    RecyclerView gridcaphe_140,gridthucuongdaxay_140,gridtratraicay_140,gridmacchiato_140,gridchoco_140;
    List<ListThucUong> listcaphe_140,listthucuongdaxay_140,listtratraicay_140,listmacchiato_140,listchoco_140;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreateView(inflater, container, savedInstanceState);
        context_140=getActivity();
        View root= inflater.inflate(R.layout.fragment_thuc_uong, container, false);

        //Cà phê
        gridcaphe_140 = root.findViewById(R.id.gridcaphe);
        listcaphe_140 = new ArrayList<>();

        listcaphe_140.add(new ListThucUong(R.drawable.caphesuada,"Cà phê sữa đá","32.000đ"));
        listcaphe_140.add(new ListThucUong(R.drawable.bacxiu,"Bạc xỉu","32.000đ"));
        listcaphe_140.add(new ListThucUong(R.drawable.caphedaxaylanh,"Cà phê đá xay-lạnh","59.000đ"));
        listcaphe_140.add(new ListThucUong(R.drawable.latteda,"Latte đá","50.000đ"));
        listcaphe_140.add(new ListThucUong(R.drawable.coldbrewtt,"Cold Brew truyền thống","45.000đ"));
        listcaphe_140.add(new ListThucUong(R.drawable.coldbrewst,"Cold Brew sữa tươi","45.000đ"));

        GridLayoutManager manager1 = new GridLayoutManager(ThucUongFragment.this.getActivity(),2);
        manager1.setOrientation(GridLayoutManager.VERTICAL);
        gridcaphe_140.setLayoutManager(manager1);

        ThucUongAdapter adaptor1 = new ThucUongAdapter(ThucUongFragment.this.getActivity(),listcaphe_140);
        gridcaphe_140.setAdapter(adaptor1);
        registerForContextMenu(gridcaphe_140);


        //Thức uống đá xay
        gridthucuongdaxay_140 = root.findViewById(R.id.gridthucuongdaxay);
        listthucuongdaxay_140 = new ArrayList<>();

        listthucuongdaxay_140.add(new ListThucUong(R.drawable.phucbontudx,"Phúc bồn tử cam đá xay","59.000đ"));
        listthucuongdaxay_140.add(new ListThucUong(R.drawable.caphedaxaylanh,"Cà phê đá xay - lạnh","59.000đ"));
        listthucuongdaxay_140.add(new ListThucUong(R.drawable.cookiedaxay,"Cookie đá xay","59.000đ"));
        listthucuongdaxay_140.add(new ListThucUong(R.drawable.daovietquatdx,"Đào việt quất đá xay","59.000đ"));
        listthucuongdaxay_140.add(new ListThucUong(R.drawable.chocolatedx,"Chocolate đá xay","59.000đ"));
        listthucuongdaxay_140.add(new ListThucUong(R.drawable.matchadx,"MatCha đá xay","59.000đ"));
        listthucuongdaxay_140.add(new ListThucUong(R.drawable.chanhxadx,"Chanh sả đá xay","49.000đ"));

        GridLayoutManager manager2_140 = new GridLayoutManager(ThucUongFragment.this.getActivity(),2);
        manager2_140.setOrientation(GridLayoutManager.VERTICAL);
        gridthucuongdaxay_140.setLayoutManager(manager2_140);

        ThucUongAdapter adaptor2 = new ThucUongAdapter(ThucUongFragment.this.getActivity(),listthucuongdaxay_140);
        gridthucuongdaxay_140.setAdapter(adaptor2);

        // Trà  trái cây
        gridtratraicay_140 = root.findViewById(R.id.gridtratraicay);
        listtratraicay_140 = new ArrayList<>();

        listtratraicay_140.add(new ListThucUong(R.drawable.phucbontudx,"Trà phúc bồn tử","50.000đ"));
        listtratraicay_140.add(new ListThucUong(R.drawable.tradaocamsada,"Trà đào cam sả - đá","45.000đ"));
        listtratraicay_140.add(new ListThucUong(R.drawable.trasuamaccatranchautrang,"Trà bưởi mật ong","50.000đ"));
        listtratraicay_140.add(new ListThucUong(R.drawable.olonghatsenda,"Olong hạt sen - nóng","52.000đ"));
        listtratraicay_140.add(new ListThucUong(R.drawable.tradaocamsada,"Trà đào cam sả - nóng","52.000đ"));
        listtratraicay_140.add(new ListThucUong(R.drawable.olonghatsenda,"Olong hạt sen - đá","45.000đ"));


        GridLayoutManager manager3_140 = new GridLayoutManager(ThucUongFragment.this.getActivity(),2);
        manager3_140.setOrientation(GridLayoutManager.VERTICAL);
        gridtratraicay_140.setLayoutManager(manager3_140);

        ThucUongAdapter adaptor3_140 = new ThucUongAdapter(ThucUongFragment.this.getActivity(),listtratraicay_140);
        gridtratraicay_140.setAdapter(adaptor3_140);

        //Macchiato
        gridmacchiato_140 = root.findViewById(R.id.gridmacchiato);
        listmacchiato_140 = new ArrayList<>();

        listmacchiato_140.add(new ListThucUong(R.drawable.trasuamaccatranchautrang,"Trà sữa mắc ca trân châu trắng","45.000đ"));
        listmacchiato_140.add(new ListThucUong(R.drawable.tradaocamsada,"Trà đen macchiato","42.000đ"));
        listmacchiato_140.add(new ListThucUong(R.drawable.matchadx,"Matcha Macchiato","45.000đ"));
        listmacchiato_140.add(new ListThucUong(R.drawable.tradaocamsada,"Trà xoài Macchiato đá","50.000đ"));
        listmacchiato_140.add(new ListThucUong(R.drawable.trasuamaccatranchautrang,"Trà lài Macchiato - lạnh","42.000đ"));
        listmacchiato_140.add(new ListThucUong(R.drawable.bacxiu,"Trà sữa khoai môn","42.000đ"));

        GridLayoutManager manager4_140 = new GridLayoutManager(ThucUongFragment.this.getActivity(),2);
        manager4_140.setOrientation(GridLayoutManager.VERTICAL);
        gridmacchiato_140.setLayoutManager(manager4_140);

        ThucUongAdapter adaptor4_140 = new ThucUongAdapter(ThucUongFragment.this.getActivity(),listmacchiato_140);
        gridmacchiato_140.setAdapter(adaptor4_140);

        //Choco - Matcha
        gridchoco_140 = root.findViewById(R.id.gridchocomactcha);
        listchoco_140 = new ArrayList<>();

        listchoco_140.add(new ListThucUong(R.drawable.socolaluamachda,"Socola lúa mạch đá xay","69.000đ"));
        listchoco_140.add(new ListThucUong(R.drawable.socolaluamachnong,"Socola lúa mạch nóng","69.000đ"));
        listchoco_140.add(new ListThucUong(R.drawable.chanhxadx,"Trà Matcha Latte nóng","59.000đ"));
        listchoco_140.add(new ListThucUong(R.drawable.matchadx,"Trà Matcha Latte đá","59.000đ"));
        listchoco_140.add(new ListThucUong(R.drawable.socolaluamachda,"Socola đá","59.000đ"));


        GridLayoutManager manager5_140 = new GridLayoutManager(ThucUongFragment.this.getActivity(),2);
        manager5_140.setOrientation(GridLayoutManager.VERTICAL);
        gridchoco_140.setLayoutManager(manager5_140);

        ThucUongAdapter adaptor5_140 = new ThucUongAdapter(ThucUongFragment.this.getActivity(),listchoco_140);
        gridchoco_140.setAdapter(adaptor5_140);

        return root;
    }


}