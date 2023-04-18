package com.solidviolation.example;

class ElectronicProducts{
    private String name;
    private double price;
    private String description;
    private String brand;

    public ElectronicProducts(String name, double price, String description, String brand){
        this.name=name;
        this.price=price;
        this.description=description;
        this.brand=brand;

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

    public String getBrand(){
        return brand;
    }
    public void select() {
        System.out.println(getName() + " selected.");
    }
    public void purchase() {
        System.out.println(getName() + " purchased for $" + getPrice());
    }
}

