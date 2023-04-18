package com.solidpriciples.example;

public interface CheckoutProcessInterface {
    void checkout(CartManagerInterface cartManager, PaymentProcessorInterface paymentProcessor);
}
