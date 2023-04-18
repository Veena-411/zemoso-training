package com.solidpriciples.example;

public class Driver {
    public static void main(String[] args) {
        // Creating some products
        Product iphone = new Electronics("iPhone", 60000, "The iPhone 8", "Apple");
        Product tshirt = new Clothing("T-Shirt", 799, "A comfortable cotton t-shirt", "M");

        // Created a cart manager
        CartManagerInterface cartManager = new CartManager();

        // Added some products to the cart
        cartManager.addProduct(iphone);
        cartManager.addProduct(tshirt);

        // Displaying the contents of the cart
        cartManager.displayCart();

        // Creating a payment processor
        PaymentProcessorInterface paymentProcessor = new PaymentProcessor();

        // Creating a checkout process
        CheckoutProcessInterface checkoutProcess = new CheckoutProcess();

        // Checkout and process the payment
        checkoutProcess.checkout(cartManager, paymentProcessor);
    }
}






