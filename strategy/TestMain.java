package org.thiru.strategy;

public class TestMain {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService(new PhonePe());
        ps.pay(100);
    }
}
