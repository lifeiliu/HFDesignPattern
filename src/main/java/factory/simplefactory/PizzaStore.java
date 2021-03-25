package factory.simplefactory;

public class PizzaStore {
    private PizzaFactory pizzaFactory;
    public PizzaStore(PizzaFactory simpleFactory) {
        this.pizzaFactory = simpleFactory;
    }

    public Pizza createPizza(String type) {
        return pizzaFactory.createPizza(type);
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }


}
