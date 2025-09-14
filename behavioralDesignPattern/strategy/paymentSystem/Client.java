package behavioralDesignPattern.strategy.paymentSystem;

public class Client {
    public static void main(String[] args) {
        PaymentSystem paymentSystem = new PaymentSystem(new UPI());
        paymentSystem.payNow();

        paymentSystem.setPayment(new CreditCard());
        paymentSystem.payNow();
    }
}
