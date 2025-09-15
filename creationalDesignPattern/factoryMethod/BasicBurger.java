package creationalDesignPattern.factoryMethod;

public class BasicBurger implements Burger{
    @Override
    public void prepareBurger() {
        System.out.println("Basic Burger is preparing...");
    }
}
