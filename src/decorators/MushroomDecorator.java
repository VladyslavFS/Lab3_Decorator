package decorators;

import pizza.Pizza;

// Mushroom Decorator
public class MushroomDecorator extends PizzaDecorator {
    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Mushrooms";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 2.00; // Additional cost for Mushrooms
    }
}
