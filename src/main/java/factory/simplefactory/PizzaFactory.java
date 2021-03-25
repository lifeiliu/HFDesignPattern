package factory.simplefactory;

public class PizzaFactory {
    Pizza pizza = null;
    public Pizza createPizza(String type) {

        switch (type) {
            case "cheese" :
                return new CheesePizza();
            case "peperoni" :
                return new PeperoniPizza();
            case "veggie":
                return new VeggiePizza();
        }
        return pizza;
    }
}
