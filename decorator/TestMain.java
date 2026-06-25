package org.thiru.decorator;

public class TestMain {
    public static void main(String[] args) {
        Payment p1 = new PhonePeAccount(new Wallet(new SimplePayment()));
        p1.pay(100);
        System.out.println();
        Payment p2 = new PhonePeAccount(new UPILite(new Wallet(new SimplePayment())));
        p2.pay(100);
        System.out.println();
        Payment p3 = new PhonePeAccount(new CashBack(new UPILite(new Wallet(new SimplePayment()))));
        p3.pay(100);
    }

}

