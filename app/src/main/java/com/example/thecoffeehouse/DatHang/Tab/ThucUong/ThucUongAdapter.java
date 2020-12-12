package com.example.thecoffeehouse.DatHang.Tab.ThucUong;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thecoffeehouse.R;
import com.example.thecoffeehouse.TinTuc.UuDaiDacBIet.ListUuDaiDacBiet;

import java.util.List;

public class ThucUongAdapter extends RecyclerView.Adapter<ThucUongAdapter.MyViewHolder>{

    private Context context_140;
    private List<ListThucUong> apps_140;

    public ThucUongAdapter(Context context_140, List<ListThucUong> apps_140) {
        this.context_140 = context_140;
        this.apps_140 = apps_140;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mName_140;
        TextView mGia_140;
        ImageView mImage_140;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mGia_140=itemView.findViewById(R.id.giagrid);
            mName_140 = itemView.findViewById(R.id.namegrid);
            mImage_140 = itemView.findViewById(R.id.imggrid);
        }
    }

    @NonNull
    @Override
    public ThucUongAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v_140 = LayoutInflater.from(context_140).inflate(R.layout.row_data_grid_phobien,parent,false);

        return new ThucUongAdapter.MyViewHolder(v_140);
    }

    @Override
    public void onBindViewHolder(@NonNull ThucUongAdapter.MyViewHolder holder, int position) {

        ListThucUong app_140 = apps_140.get(position);

        holder.mName_140.setText(app_140.getNametu_140());
        holder.mImage_140.setImageResource(app_140.getImgtu_140());
        holder.mGia_140.setText(app_140.getGiatu_140());

    }

    @Override
    public int getItemCount() {
        return apps_140.size();
    }

}