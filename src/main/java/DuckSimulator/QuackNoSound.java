package DuckSimulator;

public class QuackNoSound implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("silence");
    }
}
