package com.example.finalmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList myArrayList = new ArrayList(Database.getAllFoods());

        RecyclerView rV = findViewById(R.id.homeRecyclerView);
        rV.setLayoutManager(new LinearLayoutManager(this));
        FoodAdapter myAdapter = new FoodAdapter();
        myAdapter.setData(Database.getAllFoods());
        rV.setAdapter(myAdapter);

        Button buttonOrder = findViewById(R.id.order);
        buttonOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Order.class);
                startActivity(intent);
            }
        });



    }
}
