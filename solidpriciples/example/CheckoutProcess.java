package com.solidpriciples.example;
public class CheckoutProcess implements CheckoutProcessInterface {
    @Override
    public void checkout(CartManagerInterface cartManager, PaymentProcessorInterface paymentProcessor) {
        cartManager.displayCart();
        paymentProcessor.processPayment();
        System.out.println("Thank you for shopping with us!");
    }
}
