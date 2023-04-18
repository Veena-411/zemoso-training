package com.solidpriciples.example;

public class PaymentProcessor implements PaymentProcessorInterface {
    @Override
    public void processPayment() {
        System.out.println("Processing payment...");
    }
}
