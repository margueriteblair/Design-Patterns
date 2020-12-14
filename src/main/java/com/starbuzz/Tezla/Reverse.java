package main.java.com.starbuzz.Tezla;

public class Reverse implements State{
    @Override
    public void accelerate() {

    }

    @Override
    public void openDoor() {
        System.out.println("Door doesn't open. Alert! Car is in reverse");
    }
}
