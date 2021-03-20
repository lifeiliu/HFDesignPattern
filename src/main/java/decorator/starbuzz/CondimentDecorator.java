package decorator.starbuzz;

import lombok.Data;

@Data
public abstract class CondimentDecorator extends Beverage{
    private Beverage beverage;
    public abstract String getDescription();
}
