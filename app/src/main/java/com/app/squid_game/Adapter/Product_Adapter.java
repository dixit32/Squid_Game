package com.app.squid_game.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.app.squid_game.Model.product_Model;
import com.app.squid_game.R;

import java.util.List;

public class Product_Adapter extends RecyclerView.Adapter<Product_Adapter.ViewHolder> {

    List<product_Model> itemList;
    Context context;

    public Product_Adapter(List<product_Model> itemList, Context context) {
        this.itemList = itemList;
        this.context = context;

    }

    @NonNull
    @Override
    public Product_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_holder, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Product_Adapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        Animation animation;
        animation = AnimationUtils.loadAnimation(context,
                R.anim.anim1);
        holder.product_img.setImageResource(itemList.get(position).getDrawable());
        holder.product_txt.setText(itemList.get(position).getName());
        Shader textShader=new LinearGradient(0,0, 500, 20,
                new int[]{Color.parseColor("#BC0229"),Color.parseColor("#63182F")},
                new float[]{0, 1}, Shader.TileMode.CLAMP);
        holder.text.getPaint().setShader(textShader);
        holder.cc.setAnimation(animation);
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView text,product_txt;
        ImageView product_img;
        ConstraintLayout cc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            cc = itemView.findViewById(R.id.cc);
            text = itemView.findViewById(R.id.text);
            product_txt = itemView.findViewById(R.id.product_txt);
            product_img = itemView.findViewById(R.id.product_img);
        }
    }
}
