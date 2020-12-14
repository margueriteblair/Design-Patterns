package main.java.com.starbuzz.Tezla;

public class Parked implements State{
    @Override
    public void accelerate() {
        System.out.println("Engine revs, but car doesn't move");
    }

    @Override
    public void openDoor() {
        System.out.println("Door is open. Car is parked");
    }
}
