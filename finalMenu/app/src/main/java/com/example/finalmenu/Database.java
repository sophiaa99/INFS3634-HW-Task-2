package com.example.finalmenu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Database {

    public static Food getFoodById(int foodID) {
        return foods.get(foodID);
    }


    public static ArrayList<Food> getAllFoods() {
        return new ArrayList<Food>((List) Arrays.asList(foods.values().toArray()));
    }

    private static final HashMap<Integer, Food> foods = new HashMap<>();

    static {
        foods.put(1, new Food(
                1,
                "Double Stacker King Borger",
                "Our Double Stacker King features more than ¼ lb or savory flame grilled 100% beef," +
                        " topped with smoky bacon, melted American cheese and out secret sauce all on a toasted sesame bun",
                5.95,
                R.drawable.stacker_buger
        ));

        foods.put(2, new Food(
                2,
                "BBQ Bacon Borger ",
                " Our BBQ Bacon Borger features a ¼ lb of savory fire-grilled beef, topped with thick-cut smoked bacon, melted American cheese, freshly cut iceberg lettuce, " +
                        "creamy mayo, ripe tomatoes, ketchup, onions, crunchy pickles, and layers of a sweet and smoky bbq sauce," +
                        " all on a warm, toasted, sesame seed bun.\n ",
                5.95,
                R.drawable.bacon_whopper

        ));

        foods.put(3, new Food(
                3,
                "Impossible Borger",
                "Our Impossible Borger features a savory " +
                        "flame-grilled patty made from plants topped with juicy tomatoes, " +
                        "fresh lettuce, creamy mayonnaise, ketchup, crunchy pickles, and sliced white onions on a soft sesame seed bun. 100% Impoosble, 0% Beef ",
                5.50,
                R.drawable.impossibleburger


        ));

        foods.put(4, new Food(
                4,
                "Classic Cheese Borger  ",
                "You can’t go wrong with our cheeseburger, a signature flame-grilled. beef patty topped with a simple layer of" +
                        " melted American cheese, crinkle cut pickles, yellow mustard, and ketchup on a toasted sesame seed bun.\n",
                3.95,
                R.drawable.cheeseburger


        ));

        foods.put(5, new Food(
                5,
                "Crispy Chicken Caesar Borger  ",
                "Made with 100% white meat seasoned chicken filet, battered and breaded and " +
                        "carefully layered with fresh lettuce, tomato, creamy ceasar, sauce, bacon and shaved parmesan cheese all in a potato bun  ",
                4.95,
                R.drawable.chicken_burg
        ));

        foods.put(6, new Food(
                6,
                "Bopper Jnr ",
                "Meal is a signature flame-grilled beef patty topped with a simple layer of melted American cheese, crinkle cut pickles, yellow mustard, and ketchup on a toasted sesame" +
                        " seed bun.  Served with a small side of Mott's® natural apple sauce and milk or juice ",
                10.95,
                R.drawable.cheeseburger_meal
        ));

        foods.put(7, new Food(
                7,
                "HamBorger Jnr ",
                "1.\tMeal is a signature flame-grilled beef patty topped with a simple " +
                        "layer of crinkle cut pickles, yellow mustard, and ketchup on a toasted sesame seed bun.",
                10.95,
                R.drawable.hamburger_meal

        ));

        foods.put(8, new Food(
                8,
                "Mini Cini",
                "Warm, freshly baked, delicious bite-size cinnamon rolls with its own icing dipping sauce. ",
                3.95,
                R.drawable.cinimini


        ));


        foods.put(9, new Food(
                9,
                "Twix Pie",
                " Our Twix Pie features a creamy caramel whipped filling topped" +
                        " with crumbled pieces of TWIX Bars, all resting on a vanilla crumb crust. ",
                4.95,
                R.drawable.twix_pie


        ));
        foods.put(10, new Food(
                10,
                "Soft Serve",
                "Velvety Vanilla Soft Serve, your choice in Cone or Cup ",
                1.50,
                R.drawable.cone


        ));
        foods.put(11, new Food(
                11,
                "Fries",
                "More delicious than ever, our signature piping hot, thick cut Salted French Fries" +
                        " are golden on the outside and fluffy on the inside ",
                3.95,
                R.drawable.fries


        ));
        foods.put(12, new Food(
                12,
                "Nuggets",
                "Made with white meat, our bite-sized Chicken Nuggets are tender and juicy on the inside and crispy on the outside. " +
                        "Coated in a homestyle seasoned breading, they are perfect for dipping in any of our delicious dipping sauces ",
                7.95,
                R.drawable.nugg


        ));
        foods.put(13, new Food(
                13,
                "Cheese Sticks",
                "Mozzarella cheese coated in an Italian-style seasoned breading," +
                        " fried crispy until golden brown and served hot and melty with a marinara dipping sauce ",
                4.95,
                R.drawable.mozzarella_stick


        ));
        foods.put(14, new Food(
                14,
                "Sprite",
                "Let Sprite - refresh your day with the great taste of lemon-lime ",
                2.95,
                R.drawable.sprite


        ));
        foods.put(15, new Food(
                15,
                "Coke",
                "Let Coke - refresh your day with the the taste of coke",
                2.95,
                R.drawable.coke

        ));
        foods.put(16, new Food(
                16,
                " New Vanilla Shake ",
                "Cool down with a fresh vanilla shake with caramel whipped filling ",
                3.95,
                R.drawable.vanilla


        ));

        foods.put(16, new Food(
                16,
                " New Strawberry Shake ",
                "Cool down with a fresh strawberry shake with vanilla whipped filling ",
                3.95,
                R.drawable.strawberry_shake


        ));
        foods.put(17, new Food(
                17,
                "Water ",
                "Purified Water, the eclusive bottled water of Borger Kong - " +
                        "cool way to wash down your signature favourites," +
                        "it is also the healthiest item on our menu! ",
                3.95,
                R.drawable.water


        ));
    }
}
