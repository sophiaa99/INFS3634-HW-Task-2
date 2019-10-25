package com.example.finalmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.finalmenu.Order.orderArray;

public class FoodDetails extends AppCompatActivity {

    private TextView nameTextView;
    private TextView priceTextView;
    private TextView summaryTextView;
    private ImageView imageView;
    private Button addButton;
    private EditText value;


    public static int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_details);


        Intent intent = getIntent();

        int foodID = intent.getIntExtra("FoodID", 0);
        final Food selectedFood = Database.getFoodById(foodID);

        nameTextView = findViewById(R.id.name);
        priceTextView = findViewById(R.id.price);
        summaryTextView = findViewById(R.id.summary);
        imageView = findViewById(R.id.imageView);
        addButton = findViewById(R.id.order);
        value = findViewById(R.id.orderInput);

        nameTextView.setText(selectedFood.getName());
        priceTextView.setText((String.format("$" + " %.2f", selectedFood.getPrice())));
        summaryTextView.setText(selectedFood.getSummary());
        imageView.setImageResource(selectedFood.getImageDrawableID());

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String foodName = selectedFood.getName();
                Integer quantity = Integer.parseInt(value.getText().toString());
                Double price = selectedFood.getPrice();

                Toast.makeText(FoodDetails.this, foodName + " has been added! ", Toast.LENGTH_SHORT).show();

                orderArray.add(new OrderClass(count, foodName, quantity, price));
                count++;

                Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(myIntent);

            }
        });


    }
}
