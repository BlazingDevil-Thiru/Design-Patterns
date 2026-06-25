package org.thiru.strategy;


public class PhonePe implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("paid by phonepe"+amount);
    }
}
