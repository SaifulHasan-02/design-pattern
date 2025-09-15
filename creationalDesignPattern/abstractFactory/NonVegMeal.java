package creationalDesignPattern.abstractFactory;

public class NonVegMeal implements MealFactory{
    @Override
    public Burger createBurger() {
        return new NonVegBurger();
    }

    @Override
    public Pizza createPizza() {
        return new NonVegPizza();
    }
}
