package behavioralDesignPattern.strategy.paymentSystem;

public class PaymentSystem {
    Payment payment;
    PaymentSystem(Payment payment){
        this.payment = payment;
    }

    public void setPayment(Payment payment){
        this.payment = payment;
    }

    public  void payNow(){
        this.payment.pay();
    }
}
