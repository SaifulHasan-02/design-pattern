package creationalDesignPattern.abstractFactory;

public class VegBurger implements Burger{
    @Override
    public void prepareBurger() {
        System.out.println("Veg Burger is preparing..");
    }
}
