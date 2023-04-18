package com.solidviolation.example;

public class ClothingProducts {
    private String name;
    private double price;
    private String description;
    private String size;

    public ClothingProducts(String name, double price, String description, String size){
        this.name=name;
        this.price=price;
        this.description=description;
        this.size=size;

    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getSize(){
        return size;
    }
    public void select() {
        System.out.println(getName() + " selected.");
    }
    public void purchase() {
        System.out.println(getName() + " purchased for $" + getPrice());
    }
}
