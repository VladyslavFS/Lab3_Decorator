import decorators.CheeseDecorator;
import decorators.MushroomDecorator;
import decorators.TomatoSauceDecorator;
import pizza.BasicPizza;
import pizza.Pizza;

public class PizzaClient {
    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        pizza = new TomatoSauceDecorator(pizza);
        pizza = new CheeseDecorator(pizza);
        pizza = new MushroomDecorator(pizza);

        System.out.println("Pizza Description: " + pizza.getDescription());
        System.out.println("Total Cost: " + pizza.getCost());
    }
}
