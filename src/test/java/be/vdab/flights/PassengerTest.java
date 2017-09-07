package be.vdab.flights;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    @Test
    public void passengerHasCorrectFullName() throws Exception {
        Passenger p= new Passenger("Fred","Durst");
        assertEquals("Fred Durst", p.fullname());
    }

    @Test
    public void passengerHasFirstName(){
        Passenger p = new Passenger("Fred", "Durst");
        assertEquals("Fred", p.getFirstName());
    }
}
