package factory.factoryMethod;

public class ChicagoStylePizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {

        switch (type) {
            case "cheese" :
                return new  ChicagoStyleCheesePizza();
            case "peperoni" :
                return new ChicagoStylePeperoniPizza();
            case "veggie":
                return new ChicagoStyleVeggiePizza();
            default:
                throw new RuntimeException("Pizza type not defined");
        }
    }
}
