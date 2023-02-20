package com.app.squid_game;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.squid_game.Adapter.Order_Adapter;
import com.app.squid_game.Adapter.Product_Adapter;
import com.app.squid_game.Model.product_Model;

import java.util.ArrayList;
import java.util.List;

public class Product_Activity extends AppCompatActivity {

    RecyclerView rec_1,rec_2;
    Product_Adapter product_adapter;
    Order_Adapter order_adapter;
    List<product_Model> itemList;
    List<product_Model> itemList_order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        rec_1 = findViewById(R.id.rec_1);
        rec_2 = findViewById(R.id.rec_2);

        itemList = new ArrayList<>();
        itemList_order = new ArrayList<>();

        itemList.add(new product_Model("Supervisor toy",R.drawable.toy_1));
        itemList.add(new product_Model("Front man toy",R.drawable.toy_2));
        itemList.add(new product_Model("Supervisor toy",R.drawable.toy_1));
        itemList.add(new product_Model("Front man toy",R.drawable.toy_2));
        itemList.add(new product_Model("Supervisor toy",R.drawable.toy_1));
        itemList.add(new product_Model("Front man toy",R.drawable.toy_2));
        itemList.add(new product_Model("Supervisor toy",R.drawable.toy_1));
        itemList.add(new product_Model("Front man toy", R.drawable.toy_2));
        itemList.add(new product_Model("Supervisor toy", R.drawable.toy_1));

        itemList_order.add(new product_Model("Collector outfit",R.drawable.toy_3));
        itemList_order.add(new product_Model("Doll",R.drawable.toy5));
        itemList_order.add(new product_Model("Collector outfit",R.drawable.toy_3));
        itemList_order.add(new product_Model("Doll",R.drawable.toy_4));
        itemList_order.add(new product_Model("Collector outfit", R.drawable.toy_3));
        itemList_order.add(new product_Model("Doll", R.drawable.toy_4));

        product_adapter = new Product_Adapter(itemList,this);
        rec_1.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        rec_1.setAdapter(product_adapter);

        order_adapter = new Order_Adapter(itemList_order,this);
        rec_2.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        rec_2.setAdapter(order_adapter);

    }
}