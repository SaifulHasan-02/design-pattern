package creationalDesignPattern.abstractFactory;

public class NonVegPizza implements Pizza{
    @Override
    public void preparePizza() {
        System.out.println("Non Veg Pizza is preparing");
    }
}
