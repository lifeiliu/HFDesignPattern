package DuckSimulator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Duck {
    private String name;
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public abstract void display();
    public void swim() {
        System.out.println("all ducks can swim!");
    }
    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

}
