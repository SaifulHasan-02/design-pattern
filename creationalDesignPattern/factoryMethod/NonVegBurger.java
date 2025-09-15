package creationalDesignPattern.factoryMethod;

public class NonVegBurger implements Burger{
    @Override
    public void prepareBurger() {
        System.out.println("Non Veg Burger is preparing..");
    }
}
