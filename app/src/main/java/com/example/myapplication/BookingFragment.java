package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.adapter.HotelAdapter;
import com.example.myapplication.databinding.FragmentBookingBinding;

import java.util.ArrayList;

public class BookingFragment extends Fragment {

    private FragmentBookingBinding viewBinding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        viewBinding = FragmentBookingBinding.inflate(inflater, container, false);
        return viewBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ArrayList<ItemHotel> hotels = new ArrayList<>();

        hotels.add(new ItemHotel("Sheraton", "Находится в: Бишкек Парк\nАдрес: 148B Kievskaya Str, 720001", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRG_eIslanxARPIdbqAzCHlwVAGWUSMLi23fA&s"));
        hotels.add(new ItemHotel("Jannat Regency", "Адрес: 21/2 Аалы Токомбаева ул., Бишкек 720060", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR0dpnkG5qqK6-FjSKllaFdma9aX7eK6rPpxg&s"));
        hotels.add(new ItemHotel("Novotel", "Адрес: 16 просп. Манаса, Бишкек 720010", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQn9o8MRx3JOU7EyrpSqCLMtHH7_CBHmqPrGA&s"));
        hotels.add(new ItemHotel("Dostuk Hotel", "Адрес: 429 B улица Фрунзе, Бишкек 720011", "https://ak-sai.com/wp-content/uploads/18597eff7a03d71307480102425c8e1f.jpg"));
        hotels.add(new ItemHotel("Plaza Hotel", "Адрес: 52 ул. Тоголок Молдо, Бишкек 720044", "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/06/db/45/bd/plaza-hotel.jpg?w=700&h=-1&s=1"));

        HotelAdapter hotelAdapter = new HotelAdapter(hotels);
        viewBinding.rvHotels.setAdapter(hotelAdapter);
    }
}
