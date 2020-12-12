package com.example.thecoffeehouse.TinTuc.UuDaiDacBIet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thecoffeehouse.R;
import com.example.thecoffeehouse.TinTuc.LuaChonTinTuc.ListLuaChonTinTuc;

import java.util.List;

public class UuDaiDacBietAdapter extends RecyclerView.Adapter<UuDaiDacBietAdapter.MyViewHolder>{

    private Context context_140;
    private List<ListUuDaiDacBiet> apps_140;

    public UuDaiDacBietAdapter(Context context, List<ListUuDaiDacBiet> apps) {
        this.context_140 = context;
        this.apps_140 = apps;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mName_140;
        TextView mChitiet_140;
        ImageView mImage_140;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mChitiet_140=itemView.findViewById(R.id.chitietud);
            mName_140 = itemView.findViewById(R.id.nameud);
            mImage_140 = itemView.findViewById(R.id.imgud);
        }
    }

    @NonNull
    @Override
    public UuDaiDacBietAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context_140).inflate(R.layout.recycle_uudaidacbiet,parent,false);

        return new UuDaiDacBietAdapter.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull UuDaiDacBietAdapter.MyViewHolder holder, int position) {

        ListUuDaiDacBiet app_140 = apps_140.get(position);

        holder.mName_140.setText(app_140.getNameuudd_140());
        holder.mImage_140.setImageResource(app_140.getImguudd_140());
        holder.mChitiet_140.setText(app_140.getChitietuudd_140());

    }

    @Override
    public int getItemCount() {
        return apps_140.size();
    }

}