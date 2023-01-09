package com.example.dedicasion33;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class BigEmpieresAdapter extends RecyclerView.Adapter <BigEmpieresAdapter.ViewHolder> {
private ArrayList<Country>list;
    public BigEmpieresAdapter(ArrayList<Country> list){
        this.list = list;
    }



    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_big_emperia,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageViewBigEmpire;
        TextView textViewBigEmpiere;
        TextView textViewBigEmpiere2;
        TextView textViewBigEmpiere3;


        public ViewHolder(View itemView) {
            super(itemView);
            imageViewBigEmpire = itemView.findViewById(R.id.imageView_empires);
            textViewBigEmpiere = itemView.findViewById(R.id.textView_empire);
            textViewBigEmpiere2 = itemView.findViewById(R.id.textView2_empire);
            textViewBigEmpiere3 = itemView.findViewById(R.id.textView3_empire);

        }

        public void bind(Country country) {
            imageViewBigEmpire.setImageResource(country.getImage());
            textViewBigEmpiere.setText(country.getName());
            textViewBigEmpiere.setTextColor(Color.BLACK);
            textViewBigEmpiere2.setText(country.getExistence());
            textViewBigEmpiere3.setText(country.getTerritory());
        }
    }

}
