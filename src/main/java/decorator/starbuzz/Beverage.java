package decorator.starbuzz;

import lombok.Data;

@Data
public abstract class Beverage {
    private String description;

    public abstract double getCost();
}
