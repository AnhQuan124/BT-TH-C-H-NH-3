package com.example.thecoffeehouse.CuaHang;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thecoffeehouse.DatHang.Tab.ThucUong.ListThucUong;
import com.example.thecoffeehouse.R;

import java.util.List;

public class CuaHangAdapter extends RecyclerView.Adapter<CuaHangAdapter.MyViewHolder>{

    private Context context_140;
    private List<ListThucUong> apps_140;

    public CuaHangAdapter(Context context_140, List<ListThucUong> apps_140) {
        this.context_140 = context_140;
        this.apps_140 = apps_140;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mName_140;
        TextView mGia_140;
        ImageView mImage_140;

        public MyViewHolder(@NonNull View itemView_140) {
            super(itemView_140);

            mGia_140=itemView_140.findViewById(R.id.chitietst);
            mName_140 = itemView_140.findViewById(R.id.namest);
            mImage_140 = itemView_140.findViewById(R.id.imgst);
        }
    }

    @NonNull
    @Override
    public CuaHangAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent_140, int viewType_140) {
        View v_140 = LayoutInflater.from(context_140).inflate(R.layout.recycle_store,parent_140,false);

        return new CuaHangAdapter.MyViewHolder(v_140);
    }

    @Override
    public void onBindViewHolder(@NonNull CuaHangAdapter.MyViewHolder holder_140, int position_140) {

        ListThucUong app_140 = apps_140.get(position_140);

        holder_140.mName_140.setText(app_140.getNametu_140());
        holder_140.mImage_140.setImageResource(app_140.getImgtu_140());
        holder_140.mGia_140.setText(app_140.getGiatu_140());

    }

    @Override
    public int getItemCount() {
        return apps_140.size();
    }

}