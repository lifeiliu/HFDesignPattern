package DuckSimulator;

public class FlyWithNoway implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("can not fly, crying");
    }
}
