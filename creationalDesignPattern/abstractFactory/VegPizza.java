package creationalDesignPattern.abstractFactory;

public class VegPizza implements Pizza{

    @Override
    public void preparePizza() {
        System.out.println("Veg Pizza is preparing..");
    }
}
