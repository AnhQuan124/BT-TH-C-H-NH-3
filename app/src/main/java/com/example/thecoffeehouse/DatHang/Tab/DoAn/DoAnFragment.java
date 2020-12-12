package com.example.thecoffeehouse.DatHang.Tab.DoAn;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

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

import com.example.thecoffeehouse.DatHang.Tab.PhoBien.PhoBienFragment;
import com.example.thecoffeehouse.DatHang.Tab.PhoBien.ProductAdapter;
import com.example.thecoffeehouse.DatHang.Tab.PhoBien.ProductModel;
import com.example.thecoffeehouse.DatHang.Tab.ThucUong.ListThucUong;
import com.example.thecoffeehouse.DatHang.Tab.ThucUong.ThucUongAdapter;
import com.example.thecoffeehouse.DatHang.Tab.ThucUong.ThucUongFragment;
import com.example.thecoffeehouse.R;

import java.util.ArrayList;
import java.util.List;


public class DoAnFragment extends Fragment {


    GridView gridView_140;
    Context context_140;
    RelativeLayout gridviewdata_140;
    ArrayList<ProductModel> productData_140;
    ProductAdapter productAdapter_140;
    ProductModel productModel_140;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreateView(inflater, container, savedInstanceState);
        context_140=getActivity();
        View root_140= inflater.inflate(R.layout.fragment_do_an, container, false);

        gridView_140 = root_140.findViewById(R.id.gridthucannhe);
        gridviewdata_140 = root_140.findViewById(R.id.gridviewdata);
        productData_140 = new ArrayList<>();

        //add Countries Data
        muahang();
        populateProductData();
        productAdapter_140 = new ProductAdapter(context_140,productData_140);
        gridView_140.setAdapter(productAdapter_140);
        registerForContextMenu(gridView_140);
        gridView_140.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(context_140,productData_140.get(position).getNamesp_140(), Toast.LENGTH_SHORT).show();
            }
        });

        return root_140;
    }

    private void populateProductData() {
        //product1
        productModel_140 = new ProductModel();
        productModel_140.setId_140(1);
        productModel_140.setNamesp_140("Macca Phủ Socola");
        productModel_140.setImagesp_140(R.drawable.maccaphusocola);
        productModel_140.setGiasp_140("45.000đ");
        productData_140.add(productModel_140);

        //product2
        productModel_140 = new ProductModel();
        productModel_140.setId_140(2);
        productModel_140.setNamesp_140("Mít Sấy");
        productModel_140.setImagesp_140(R.drawable.mitsay);
        productModel_140.setGiasp_140("20.000 đ");
        productData_140.add(productModel_140);

        //product3
        productModel_140 = new ProductModel();
        productModel_140.setId_140(3);
        productModel_140.setNamesp_140("Cơm Cháy Chà Bông");
        productModel_140.setImagesp_140(R.drawable.comchaychabong);
        productModel_140.setGiasp_140("35.000 đ");
        productData_140.add(productModel_140);

    }

    private void muahang() {
        gridView_140.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Dialog dialog = new Dialog(DoAnFragment.this.getActivity());
                dialog.setContentView(R.layout.dialog_datmon_phobien);
                dialog.show();
            }
        });
        gridView_140.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Dialog dialog = new Dialog(DoAnFragment.this.getActivity());
                dialog.setContentView(R.layout.dialog_datmon_phobien);
                dialog.show();

                return true;
            }
        });
    }
}