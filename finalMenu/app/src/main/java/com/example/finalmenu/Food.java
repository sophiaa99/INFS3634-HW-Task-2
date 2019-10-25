package com.example.finalmenu;

public class Food {

    private int foodID;

    private String name;

    private String summary;

    private double price;

    private int imageDrawableID;

    public Food(int foodID, String name, String summary, double price, int imageDrawableID){

        this.foodID=foodID;
        this.name=name;
        this.summary=summary;
        this.price=price;
        this.imageDrawableID=imageDrawableID;
    }

    public int getFoodID() {
        return foodID;
    }

    public void setFoodID(int foodID) {
        this.foodID = foodID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getImageDrawableID() {
        return imageDrawableID;
    }

    public void setImageDrawableID(int imageDrawableID) {
        this.imageDrawableID = imageDrawableID;
    }
}




