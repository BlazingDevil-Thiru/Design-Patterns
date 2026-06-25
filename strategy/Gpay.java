package org.thiru.strategy;

public class Gpay implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("paid by gpay"+amount);
    }
}