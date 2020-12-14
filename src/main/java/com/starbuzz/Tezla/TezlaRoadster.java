package main.java.com.starbuzz.Tezla;

//State pattern
public class TezlaRoadster {

    String[] state = {"Parked", "Drive", "Reverse"};

    public void accelerate() {
        System.out.println("Go.");
    }

    public void openDoor(String state) {
        if (state == "Parked") {
            System.out.println("Open door");
        } else if (state == "Drive") {
            System.out.println("Cannot open door");
        }


    }
}
