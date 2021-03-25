package factory.simplefactory;

public class PizzaApp {
    public static void main(String[] args) {
        System.out.println("welcome to simple factory pizza store");
        PizzaFactory simpleFactory = new PizzaFactory();
        PizzaStore store = new PizzaStore(simpleFactory);
        Pizza order1 = store.orderPizza("cheese");
        System.out.println("you have ordered a " + order1.getName());
        System.out.println(order1);

        Pizza order2 = store.orderPizza("veggie");
        System.out.println("you have ordered a " + order2.getName());
        System.out.println(order2);


    }
}
