package com.solidpriciples.example;

public class Clothing extends Product implements Selectable, Purchasable {
    private String size;

    public Clothing(String name, double price, String description, String size) {
        super(name, price, description);
        this.size = size;
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
