package main.java.com.starbuzz;

public class Mocha extends Condiment {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.50;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

}
