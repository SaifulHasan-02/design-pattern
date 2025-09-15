package creationalDesignPattern.abstractFactory;

public class Client {
    public static void main(String[] args) {
        MealFactory vegMeal = new VegMealFactory();
        Burger vegBurger = vegMeal.createBurger();
        vegBurger.prepareBurger();

        Pizza vegPizza = vegMeal.createPizza();
        vegPizza.preparePizza();

        MealFactory nonVegMeal = new NonVegMeal();
        Burger nonVegBurger = nonVegMeal.createBurger();
        nonVegBurger.prepareBurger();

        Pizza nonVegPizza = nonVegMeal.createPizza();
        nonVegPizza.preparePizza();
    }
}
