package org.thiru.decorator;

public abstract class PhonePeDecorator implements Payment {
    Payment payment;
    public PhonePeDecorator(Payment payment) {
        this.payment = payment;
    }
}
