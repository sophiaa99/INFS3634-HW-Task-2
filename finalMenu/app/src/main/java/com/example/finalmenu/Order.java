package com.example.finalmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Order extends AppCompatActivity {

    public static ArrayList<OrderClass> orderArray = new ArrayList<OrderClass>();
    public static TextView total;
    public static RecyclerView orderRV;
    public Button clear;

    double totalCost = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        total = findViewById(R.id.total);
        clear = findViewById(R.id.clear);
        orderRV = findViewById(R.id.orderRV);
        orderRV.setLayoutManager(new LinearLayoutManager(this));
        OrderClassAdapter myAdapter = new OrderClassAdapter();
        myAdapter.setData(orderArray);
        orderRV.setAdapter(myAdapter);

        clear.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (orderArray.size() < 1) {
                    Toast.makeText(Order.this, "Order Already Empty!", Toast.LENGTH_SHORT).show();

                } else {
                    orderArray.clear();
                    total.setText("0");
                    startActivity(getIntent());
                    finish();
                    overridePendingTransition(0, 0);
                }
            }
        });


        int size = orderArray.size();


        for (int i = 0; i < size; i++) {

            totalCost += (orderArray.get(i).getPrice() * orderArray.get(i).getQuantity());

        }
        total.setText((String.format("$" + " %.2f", totalCost)));


    }
}
