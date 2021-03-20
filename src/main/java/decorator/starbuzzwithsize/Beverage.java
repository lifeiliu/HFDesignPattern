package decorator.starbuzzwithsize;

import lombok.Data;

@Data
public abstract class Beverage {
    private String description;
    private Size size = Size.Grande;

    public abstract double getCost();
}
