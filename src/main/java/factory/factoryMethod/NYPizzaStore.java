package factory.factoryMethod;

import factory.simplefactory.CheesePizza;
import factory.simplefactory.PeperoniPizza;
import factory.simplefactory.VeggiePizza;

public class NYPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese" :
                return new  NYCheesePizza();
            case "peperoni" :
                return new NYPeperoniPizza();
            case "veggie":
                return new NYVeggiePizza();
        }
        return pizza;
    }
}
