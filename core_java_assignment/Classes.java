package com.java.core;

class Pen{
    String color;
    double price;
    Pen(){
        color = "Blue";
        price = 10;
    }
    Pen(String color1, double price1){
        color = color1;
        price = price1;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}
public class Classes {
    public static void main(String[] args) {
       Pen obj = new Pen();
        System.out.println("color = "+obj.getColor());
        System.out.println("price = "+obj.getPrice());
        Pen obj2 = new Pen("red", 35.8);
        System.out.println("color ="+ obj2.getColor());
        System.out.println("price = "+obj2.getPrice());
    }
}
