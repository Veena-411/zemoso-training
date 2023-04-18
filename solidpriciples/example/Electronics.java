package com.solidpriciples.example;

public class Electronics extends Product implements Selectable, Purchasable{
    private String brand;
    public Electronics(String name, double price, String description, String brand) {
        super(name, price, description);
        this.brand = brand;
    }

    @Override
    public void select() {
        System.out.println(getName() + " selected.");
    }

    @Override
    public void purchase() {
        System.out.println(getName() + " purchased for $" + getPrice());
    }
}
