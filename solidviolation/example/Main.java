package com.solidviolation.example;

public class Main {
    public static void main(String args[]) {
        ElectronicProducts iphone = new ElectronicProducts("iPhone", 60000, "The iPhone 8", "Apple");
        ClothingProducts tshirt = new ClothingProducts("T-Shirt", 799, "A comfortable cotton t-shirt", "M");
        Manager app = new Manager();
        app.addClothingProduct(tshirt);
        app.addElectronicsProduct(iphone);
        app.displayCart();
        app.checkout();
    }
}
