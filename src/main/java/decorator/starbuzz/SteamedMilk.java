package decorator.starbuzz;

public class SteamedMilk extends CondimentDecorator{
    public SteamedMilk(Beverage beverage) {
        setBeverage(beverage);
    }
    @Override
    public double getCost() {
        return getBeverage().getCost() + 0.3;
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + ", SteamedMilk";
    }
}
