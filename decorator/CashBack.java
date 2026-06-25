package org.thiru.decorator;

public class CashBack extends PhonePeDecorator {
    public static int bal = 10;
    public CashBack(Payment payment) {
        super(payment);
    }

    @Override
    public int pay(int amount) {
        int rem = payment.pay(amount);
        System.out.println("paid from cashback : "+10);
        bal=0;
        return rem-10;
    }
}
