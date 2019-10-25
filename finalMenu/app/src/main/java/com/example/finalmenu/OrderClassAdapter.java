package com.example.finalmenu;

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

public class OrderClassAdapter extends RecyclerView.Adapter<OrderClassAdapter.OrderClassViewHolder> {

    private ArrayList<OrderClass> ordersToAdapt;

    public void setData(ArrayList<OrderClass> ordersToAdapt) {
        this.ordersToAdapt = ordersToAdapt;
    }

    @NonNull
    @Override
    public OrderClassAdapter.OrderClassViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.order_layout, parent, false);
        OrderClassViewHolder orderViewHolder = new OrderClassViewHolder(view);
        return orderViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull OrderClassViewHolder holder, int position) {
        final OrderClass orderAtPosition = ordersToAdapt.get(position);
//NOTE TO SELF: for subtotal display the price and in the lyaout do the quanity x price design thing
        String priceDobule = Double.toString(orderAtPosition.getPrice());
        holder.subtotal.setText("$" + priceDobule);
        holder.foodOrdered.setText(orderAtPosition.getName());

        String stringdouble = Integer.toString(orderAtPosition.getQuantity());
        holder.quantity.setText("You have ordered " + stringdouble + " x ");




        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Context context = view.getContext();

                Toast.makeText(context, "ID clicked is " + orderAtPosition.getOrderId(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, Order.class);
                intent.putExtra("OrderID", orderAtPosition.getOrderId());
                context.startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return ordersToAdapt.size();
    }

    public static class OrderClassViewHolder extends RecyclerView.ViewHolder {
        public View view;

        public TextView subtotal;
        public TextView foodOrdered;
        public TextView quantity;
        public ImageView imageView2;


        public OrderClassViewHolder(View itemView) {
            super(itemView);
            view = itemView;
            subtotal = itemView.findViewById(R.id.subtotal);
            foodOrdered = itemView.findViewById(R.id.foodOrdered);
            quantity = itemView.findViewById(R.id.quanity);
            // imageView2 = itemView.findViewById(R.id.imageView2);


        }

    }
}
