package com.example.myapplication.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.ItemHotel;
import com.example.myapplication.databinding.ItemHotelBinding;
import com.example.myapplication.viewholder.HotelViewHolder;

import java.util.ArrayList;

public class HotelAdapter extends RecyclerView.Adapter<HotelViewHolder> {

    private final ArrayList<ItemHotel> itemHotels;

    public HotelAdapter(ArrayList<ItemHotel> itemHotels) {
        this.itemHotels = itemHotels;
    }

    @NonNull
    @Override
    public HotelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HotelViewHolder(ItemHotelBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HotelViewHolder holder, int position) {
        holder.onBind(itemHotels.get(position));
    }

    @Override
    public int getItemCount() {
        return itemHotels.size();
    }
}
