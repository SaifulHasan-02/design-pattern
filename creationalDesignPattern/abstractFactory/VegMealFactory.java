package creationalDesignPattern.abstractFactory;

public class VegMealFactory implements MealFactory{
    @Override
    public Burger createBurger() {
        return new VegBurger();
    }

    @Override
    public Pizza createPizza() {
        return new VegPizza();
    }
}
