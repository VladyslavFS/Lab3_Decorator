package decorators;

import pizza.Pizza;

// Tomato Sauce Decorator
public class TomatoSauceDecorator extends PizzaDecorator {
    public TomatoSauceDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Tomato Sauce";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.00; // Additional cost for Tomato Sauce
    }
}
