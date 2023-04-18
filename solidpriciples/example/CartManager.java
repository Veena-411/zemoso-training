package com.solidpriciples.example;
import java.util.ArrayList;

public class CartManager implements CartManagerInterface {
    private ArrayList<Product> cart = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        cart.add(product);
        System.out.println(product.getName() + " added to cart.");
    }

    @Override
    public void removeProduct(Product product) {
        cart.remove(product);
        System.out.println(product.getName() + " removed from cart.");
    }

    @Override
    public void displayCart() {
        System.out.println("Your cart contains:");
        for (Product product : cart) {
            System.out.println("- " + product.getName() + " $" + product.getPrice());
        }
    }
}