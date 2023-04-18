package com.solidviolation.example;
import java.util.ArrayList;
public class Manager {
    ArrayList<ElectronicProducts> cart1 = new ArrayList<>();
    ArrayList<ClothingProducts> cart2 = new ArrayList<>();
    public void addElectronicsProduct(ElectronicProducts product) {
        cart1.add(product);
        System.out.println(product.getName() + " added to cart.");
    }
    public void removeElectronicsProduct(ElectronicProducts product) {
        cart1.remove(product);
        System.out.println(product.getName() + " removed from cart.");
    }
    public void addClothingProduct(ClothingProducts product){
        cart2.add(product);
        System.out.println(product.getName() + " added to cart.");
    }
    public void removeClothingProduct(ClothingProducts product) {
        cart2.remove(product);
        System.out.println(product.getName() + " removed from cart.");
    }
    public void displayCart() {
        System.out.println("Your cart contains:");
        for (ElectronicProducts product : cart1) {
            System.out.println("- " + product.getName() + " $" + product.getPrice());
        }
        for (ClothingProducts product : cart2) {
            System.out.println("- " + product.getName() + " $" + product.getPrice());
        }
    }
    public void processPayment() {
        System.out.println("Processing payment...");
    }
    public void checkout(){
        System.out.println("Thank you for shopping with us!");
    }



}
