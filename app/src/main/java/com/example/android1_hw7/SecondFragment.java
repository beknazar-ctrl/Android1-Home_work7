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


public class SecondFragment extends Fragment {

    ImageView secondImage;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        secondImage = view.findViewById(R.id.first_image2);
        Glide.with(getContext()).load("https://st-1.akipress.org/st_runews/8/1438908.1.1522053958.jpg")
                .circleCrop().centerCrop().into(secondImage);
    }
}