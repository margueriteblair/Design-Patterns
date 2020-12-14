package main.java.com.starbuzz;

//wrapper pattern, p. 91 aka decorator pattern

public abstract class Beverage {
    public String description = "Unknown Description";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
