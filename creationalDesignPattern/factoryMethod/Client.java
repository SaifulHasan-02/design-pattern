package creationalDesignPattern.factoryMethod;

public class Client {
    public static void main(String[] args) {
        BurgerFactory factory = new BurgerFactory();

        Burger basicBurger = factory.createBurger(1);
        basicBurger.prepareBurger();
        Burger nonVegBurger = factory.createBurger(2);
        nonVegBurger.prepareBurger();
    }
}
