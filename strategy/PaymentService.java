package org.thiru.strategy;

public class PaymentService {
    Payment payment;
    public PaymentService(Payment payment) {
        this.payment = payment;
    }
    public void pay(int amount){
        payment.pay(amount);
    }
}
