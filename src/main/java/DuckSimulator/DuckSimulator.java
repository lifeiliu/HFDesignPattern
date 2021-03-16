package DuckSimulator;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck normalDuck = new NormalDuck(
                "little duck", new FlyWithNoway() , new QuackSounds()
        );
        normalDuck.swim();
        normalDuck.display();
        normalDuck.performFly();
        normalDuck.performQuack();
        System.out.println("fix fly ---------");
        normalDuck.setFlyBehavior(new FlyWithWings());
        normalDuck.performFly();
    }
}
