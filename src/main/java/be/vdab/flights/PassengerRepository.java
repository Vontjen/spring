package be.vdab.flights;

import java.util.Collections;
import java.util.List;

public class PassengerRepository {
    private List<Passenger> passengers;

    public PassengerRepository(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

public List<Passenger> findAll(){
        return Collections.unmodifiableList(passengers);
}
}
