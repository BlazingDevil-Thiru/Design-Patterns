package org.thiru.decorator;

public class PhonePeAccount extends PhonePeDecorator{
    public static int bal = 10000;

    public PhonePeAccount(Payment payment) {
        super(payment);
    }

    public int pay(int amt) {
        int rem = payment.pay(amt);
        System.out.println("paid from account  : "+rem);
        bal-=rem;
        return 0;
    }
}
