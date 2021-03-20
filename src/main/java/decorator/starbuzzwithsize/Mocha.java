package decorator.starbuzzwithsize;


public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        setBeverage(beverage);
    }
    @Override
    public double getCost() {
        return getBeverage().getCost() + 0.5;
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + ", Mocha";
    }

}
