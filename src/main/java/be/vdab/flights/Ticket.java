package be.vdab.flights;

public class Ticket {

    int id;
    double price;
    Flight flight;
    Passenger passenger;

    public Ticket(int id, double price, Flight flight, Passenger passenger) {
        this.id = id;
        this.price = price;
        this.flight = flight;
        this.passenger = passenger;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}
