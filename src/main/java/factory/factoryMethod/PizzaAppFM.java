package factory.factoryMethod;

public class PizzaAppFM {
    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza order1 = nyPizzaStore.orderPizza("veggie");
        System.out.println("ordered veggie pizza from NYStore: \n" + order1);

        ChicagoStylePizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();
        Pizza order2 = chicagoStylePizzaStore.orderPizza("cheese");
        System.out.println("ordered cheese pizza from Chicago: \n" + order2);
    }
}
