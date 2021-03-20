package decorator.starbuzz;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StarBuzzApp {
    public static void main(String[] args) {
        System.out.println("welcome to StarBuzz coffee");
        Beverage order1 = new SteamedMilk(new Espresso());
        System.out.println(order1.getDescription());
        System.out.println("cost: " + order1.getCost());
        Beverage order2 = new Mocha(order1);
        System.out.println(order2.getDescription());
        System.out.println("cost: " + order2.getCost());

    }

}
