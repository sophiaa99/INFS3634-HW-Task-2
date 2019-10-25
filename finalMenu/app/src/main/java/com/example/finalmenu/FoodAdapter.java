package com.example.finalmenu;

import android.content.Context;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {


    private ArrayList<Food> foodToAdapt;

    public void setData(ArrayList<Food> foodToAdapt) {

        this.foodToAdapt = foodToAdapt;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_item_layout, parent, false);

        FoodViewHolder foodViewHolder = new FoodViewHolder(view);
        return foodViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {

        final Food foodAtPosition = foodToAdapt.get(position);
        holder.nameTextView.setText(foodAtPosition.getName());

        String stringPrice = Double.toString(foodAtPosition.getPrice());
        holder.priceTextView.setText("$" + stringPrice);


        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Context context = view.getContext();


                Intent intent = new Intent(context, FoodDetails.class);
                intent.putExtra("FoodID", foodAtPosition.getFoodID());
                context.startActivity(intent);
            }
        });

        holder.itemImageView.setImageResource(foodAtPosition.getImageDrawableID());

    }

    @Override
    public int getItemCount() {
        return foodToAdapt.size();
    }

    public static class FoodViewHolder extends RecyclerView.ViewHolder {

        public View view;
        public TextView nameTextView;
        public TextView priceTextView;
        //public ImageView shareImageView;
        public ImageView itemImageView;


        public FoodViewHolder(View itemView) {
            super(itemView);
            view = itemView;
            nameTextView = itemView.findViewById(R.id.foodItem);
            priceTextView = itemView.findViewById(R.id.price);
            itemImageView = itemView.findViewById(R.id.photo);

        }
    }

}
