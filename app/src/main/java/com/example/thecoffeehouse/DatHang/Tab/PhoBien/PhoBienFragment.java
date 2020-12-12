package com.example.thecoffeehouse.DatHang.Tab.PhoBien;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.thecoffeehouse.R;

import java.util.ArrayList;

public class PhoBienFragment extends Fragment {


    GridView gridView_140;
    Context context_140;
    RelativeLayout gridviewdata_140;
    ArrayList<ProductModel> productData_140;
    ProductAdapter productAdapter_140;
    ProductModel productModel_140;

    @SuppressLint("WrongViewCast")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreateView(inflater, container, savedInstanceState);
        context_140=getActivity();
        View root_140 = inflater.inflate(R.layout.fragment_pho_bien, container, false);
        gridView_140 = root_140.findViewById(R.id.gridview);
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
        productModel_140.setNamesp_140("Cà phê lúa mạch đá");
        productModel_140.setImagesp_140(R.drawable.capheluamachda);
        productModel_140.setGiasp_140("69.000 đ");
        productData_140.add(productModel_140);

        //product2
        productModel_140 = new ProductModel();
        productModel_140.setId_140(2);
        productModel_140.setNamesp_140("Cà phê lúa mạch nóng");
        productModel_140.setImagesp_140(R.drawable.capheluamachnong);
        productModel_140.setGiasp_140("69.000 đ");
        productData_140.add(productModel_140);

        //product3
        productModel_140 = new ProductModel();
        productModel_140.setId_140(3);
        productModel_140.setNamesp_140("Socola lúa mạch đá xay");
        productModel_140.setImagesp_140(R.drawable.socolaluamachda);
        productModel_140.setGiasp_140("69.000 đ");
        productData_140.add(productModel_140);

        //product4
        productModel_140 = new ProductModel();
        productModel_140.setId_140(4);
        productModel_140.setNamesp_140("Socola lúa mạch nóng");
        productModel_140.setImagesp_140(R.drawable.socolaluamachnong);
        productModel_140.setGiasp_140("69.000 đ");
        productData_140.add(productModel_140);

        //product5
        productModel_140 = new ProductModel();
        productModel_140.setId_140(5);
        productModel_140.setNamesp_140("Macca Phủ Socola");
        productModel_140.setImagesp_140(R.drawable.maccaphusocola);
        productModel_140.setGiasp_140("45.000 đ");
        productData_140.add(productModel_140);

        //product6
        productModel_140 = new ProductModel();
        productModel_140.setId_140(6);
        productModel_140.setNamesp_140("Cà phê sữa đá");
        productModel_140.setImagesp_140(R.drawable.caphesuada);
        productModel_140.setGiasp_140("32.000 đ");
        productData_140.add(productModel_140);

        //product7
        productModel_140 = new ProductModel();
        productModel_140.setId_140(7);
        productModel_140.setNamesp_140("Trà sữa Mắc Ca Trân Châu Trắng");
        productModel_140.setImagesp_140(R.drawable.trasuamaccatranchautrang);
        productModel_140.setGiasp_140("45.000 đ");
        productData_140.add(productModel_140);

        //product8
        productModel_140 = new ProductModel();
        productModel_140.setId_140(8);
        productModel_140.setNamesp_140("Trà Đào Cam Sả - Đá");
        productModel_140.setImagesp_140(R.drawable.tradaocamsada);
        productModel_140.setGiasp_140("45.000 đ");
        productData_140.add(productModel_140);

        //product9
        productModel_140 = new ProductModel();
        productModel_140.setId_140(9);
        productModel_140.setNamesp_140("Oolong Hạt Sen - Đá");
        productModel_140.setImagesp_140(R.drawable.olonghatsenda);
        productModel_140.setGiasp_140("45.000 đ");
        productData_140.add(productModel_140);
    }

    private void muahang() {
        gridView_140.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Dialog dialog_140 = new Dialog(PhoBienFragment.this.getActivity());
                dialog_140.setContentView(R.layout.dialog_dathang);
                dialog_140.show();
            }
        });
        gridView_140.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Dialog dialog_140 = new Dialog(PhoBienFragment.this.getActivity());
                dialog_140.setContentView(R.layout.dialog_dathang);
                dialog_140.show();

                return true;
            }
        });
    }

}