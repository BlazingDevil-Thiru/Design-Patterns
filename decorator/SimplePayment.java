package org.thiru.decorator;

public class SimplePayment implements Payment{
    public int pay(int amt) {
        System.out.println("payment started : "+amt);
        return amt;
    }
}
