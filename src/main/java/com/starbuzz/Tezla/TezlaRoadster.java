package main.java.com.starbuzz.Tezla;

import java.sql.Driver;

//State pattern
public class TezlaRoadster {

    State drive = new Drive();
    State parked = new Parked();
    State reverse = new Reverse();
    State currentState = parked;

    public void accelerate() {
        currentState.accelerate();
    }

    public void openDoor() {
        currentState.openDoor();
    }


}
