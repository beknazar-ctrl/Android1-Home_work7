package com.example.android1_hw7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private ArrayList<Coin> list = new ArrayList<>();

    public void addList(ArrayList<Coin>list){
        this.list.addAll(list);
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView coinName,course;
        private ImageView icon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            coinName=itemView.findViewById(R.id.name_tv_rv);
            course=itemView.findViewById(R.id.course_tv_rv);
            icon=itemView.findViewById(R.id.icon_image_view);
        }

        public void onBind(Coin coin) {
            coinName.setText(coin.getName());
            course.setText("Рейтинг " + String.valueOf(coin.getCourse()));
            Glide.with(icon.getContext()).load(coin.getImage()).circleCrop().centerCrop().into(icon);
        }
    }
}
