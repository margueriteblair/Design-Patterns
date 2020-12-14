package main.java.com.starbuzz.Tezla;

public class Main {
    public static void main(String[] args) {
        TezlaRoadster tezla = new TezlaRoadster();
        tezla.accelerate();
        tezla.openDoor();
        tezla.shiftToDrive();
        tezla.shiftToReverse();
        tezla.accelerate();
        tezla.openDoor();
        tezla.shiftToParked();
    }
}
