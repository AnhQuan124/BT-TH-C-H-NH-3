package com.example.thecoffeehouse.DatHang.Tab.PhoBien;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thecoffeehouse.R;

import java.util.ArrayList;

public class ProductAdapter extends BaseAdapter {
    Context context_140;
    ArrayList<ProductModel> productsData_140;
    LayoutInflater layoutInflater_140;
    ProductModel productModel_140;

    public ProductAdapter(Context context_140, ArrayList<ProductModel> productData_140) {
        this.context_140 = context_140;
        this.productsData_140 = productData_140;
        layoutInflater_140 = (LayoutInflater) context_140.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return productsData_140.size();
    }

    @Override
    public Object getItem(int i) {
        return productsData_140.get(i);
    }

    @Override
    public long getItemId(int i) {
        return productsData_140.get(i).getId_140();
    }

    @Override
    public View getView(int position, View view_140, ViewGroup viewGroup) {
        View view1_140 = view_140;
        if (view1_140==null) {
            view1_140 = layoutInflater_140.inflate(R.layout.row_data_grid_phobien,null, true);
        }
        //getting view in row_data
        TextView name_140 = view1_140.findViewById(R.id.namegrid);
        ImageView image_140 = view1_140.findViewById(R.id.imggrid);
        TextView gia_140 = view1_140.findViewById(R.id.giagrid);

        productModel_140 = productsData_140.get(position);

        name_140.setText(productModel_140.getNamesp_140());
        image_140.setImageResource(productModel_140.getImagesp_140());
        gia_140.setText(productModel_140.getGiasp_140());
        return view1_140;
    }
}