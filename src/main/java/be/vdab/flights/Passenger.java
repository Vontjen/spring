package be.vdab.flights;

public class Passenger {

    int id;
    String firstName;
    String lastName;
    int frequentFlyerMiles;

    public Passenger(int id, String firstName, String lastName, int frequentFlyerMiles) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.frequentFlyerMiles = frequentFlyerMiles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getFrequentFlyerMiles() {
        return frequentFlyerMiles;
    }

    public void setFrequentFlyerMiles(int frequentFlyerMiles) {
        this.frequentFlyerMiles = frequentFlyerMiles;
    }
}
