package DuckSimulator;

public class NormalDuck extends Duck{
    public NormalDuck(String name, FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        super(name, flyBehavior, quackBehavior);
    }
    @Override
    public void display() {
        System.out.println(super.getName() + " looks like a normal duck");
    }
}
