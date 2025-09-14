package behavioralDesignPattern.strategy.paymentSystem;

public class CreditCard implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment by credit card.");
    }
}
