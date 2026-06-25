package org.thiru.decorator;

public class UPILite extends PhonePeDecorator {
    public static int bal = 10;
    public UPILite(Payment payment) {
        super(payment);
    }

    @Override
    public int pay(int amount) {
        int rem = payment.pay(amount);
        System.out.println("paid from upilite : "+10);
        bal=0;
        return rem-10;
    }
}
