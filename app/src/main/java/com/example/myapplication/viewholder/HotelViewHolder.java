package com.example.myapplication.viewholder;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication.ItemHotel;
import com.example.myapplication.databinding.ItemHotelBinding;

public class HotelViewHolder extends RecyclerView.ViewHolder {

    private final ItemHotelBinding viewBinding;

    public HotelViewHolder(ItemHotelBinding viewBinding) {
        super(viewBinding.getRoot());
        this.viewBinding = viewBinding;
    }

    public void onBind(ItemHotel itemHotel) {
        viewBinding.tvHotelName.setText(itemHotel.getName());
        viewBinding.tvHotelDesc.setText(itemHotel.getDescription());
        Glide.with(itemView.getContext()).load(itemHotel.getImage()).into(viewBinding.ivHotel);
    }
}
