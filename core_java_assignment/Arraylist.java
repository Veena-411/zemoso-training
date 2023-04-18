package com.java.core;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Cherry");
        System.out.println("second fruit = "+ fruits.get(1));
        System.out.println();
        for(int i=0;i<fruits.size();i++)
            System.out.println(fruits.get(i));
        System.out.println();
        fruits.set(2,"Blueberry");
        System.out.println(fruits);
        System.out.println();
        fruits.remove(3);
        System.out.println(fruits);


    }
}
