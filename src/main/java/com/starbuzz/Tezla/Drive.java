package main.java.com.starbuzz.Tezla;

public class Drive implements State {
    @Override
    public void accelerate() {
        System.out.println("Go goes");
    }

    @Override
    public void openDoor() {
        System.out.println("Door doesn't open. Alert! Car is moving");
    }
}
