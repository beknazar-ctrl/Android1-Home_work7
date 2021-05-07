package com.example.android1_hw7;

import  android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ExchangeFragment extends Fragment {

    private ArrayList<Coin>list;
    private MainAdapter mainAdapter;
    private RecyclerView recyclerView;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecycler(view);
    }

    private void initRecycler(View view) {
        recyclerView=view.findViewById(R.id.recycler_view);
        mainAdapter=new MainAdapter();
        mainAdapter.addList(createList());
        recyclerView.setAdapter(mainAdapter);
    }

    private ArrayList<Coin> createList() {
        list=new ArrayList<>();
        list.add(new Coin(R.drawable.c,"C#",4));
        list.add(new Coin(R.drawable.images,"C++",5));
        list.add(new Coin(R.drawable.js,"Javascr",4));
        list.add(new Coin(R.drawable.java,"Java",5));
        list.add(new Coin(R.drawable.python,"Python",5));
        list.add(new Coin(R.drawable.rub,"Ruby",3));
        list.add(new Coin(R.drawable.swift,"Swift",4));
        list.add(new Coin(R.drawable.typescript,"Typescript",4));
        list.add(new Coin(R.drawable.vstudio,"Vstuio",4));
        list.add(new Coin(R.drawable.kotlin,"Kotlin",4));
        return list;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_exchange, container, false);
    }
}