package decorator.starbuzzwithsize;

import lombok.Data;

@Data
public abstract class CondimentDecorator extends Beverage {
    private Beverage beverage;
    public abstract String getDescription();
    public void setSize(Size size) {
        beverage.setSize(size);
    }
}
