package com.example.thecoffeehouse.TinTuc.LuaChonTinTuc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thecoffeehouse.R;

import java.util.List;

public class LuaChonTinTucAdapter extends RecyclerView.Adapter<LuaChonTinTucAdapter.MyViewHolder>{

    private Context context_140;
    private List<ListLuaChonTinTuc> apps_140;

    public LuaChonTinTucAdapter(Context context, List<ListLuaChonTinTuc> apps) {
        this.context_140 = context;
        this.apps_140 = apps;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mName_140;
        ImageView mImage_140;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mName_140 = itemView.findViewById(R.id.txtlc);
            mImage_140 = itemView.findViewById(R.id.imglc);
        }
    }

    @NonNull
    @Override
    public LuaChonTinTucAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v_140 = LayoutInflater.from(context_140).inflate(R.layout.recycle_tintuc_luachon,parent,false);

        return new LuaChonTinTucAdapter.MyViewHolder(v_140);
    }

    @Override
    public void onBindViewHolder(@NonNull LuaChonTinTucAdapter.MyViewHolder holder, int position) {

        ListLuaChonTinTuc app_140 = apps_140.get(position);

        holder.mName_140.setText(app_140.getNameicon_140());
        holder.mImage_140.setImageResource(app_140.getImageicon_140());


    }

    @Override
    public int getItemCount() {
        return apps_140.size();
    }

}