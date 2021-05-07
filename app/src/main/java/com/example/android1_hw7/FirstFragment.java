package com.example.android1_hw7;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;


public class FirstFragment extends Fragment {

    ImageView firstImage;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        firstImage = view.findViewById(R.id.first_image);
        Glide.with(getContext()).load("https://www.advantour.com/img/kyrgyzstan/nature/kyrgyzstan-nature3.jpg")
                .circleCrop().centerCrop().into(firstImage);
    }

}