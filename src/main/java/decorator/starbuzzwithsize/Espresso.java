package decorator.starbuzzwithsize;

public class Espresso extends Beverage {
    public Espresso() {
        setDescription("Espresso");
    }

    @Override
    public double getCost() {
        if(getSize() == Size.Grande) {
            return 1.99;
        } else if (getSize() == Size.Tall) {
            return 1.49;
        } else {
            return 2.49;
        }

    }
}
