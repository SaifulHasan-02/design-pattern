package creationalDesignPattern.factoryMethod;

public class BurgerFactory {

    public Burger createBurger(int i){
        if(i == 1){
            return new BasicBurger();
        } else if(i == 2){
            return new NonVegBurger();
        }
        return null;
    }
}
