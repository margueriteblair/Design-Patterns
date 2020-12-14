package main.java.com.starbuzz.Tezla;

public class Reverse implements State{
    @Override
    public void accelerate() {
        System.out.println("Car goes backwards!");
    }

    @Override
    public void openDoor() {
        System.out.println("Door doesn't open. Alert! Car is in reverse");
    }
}
