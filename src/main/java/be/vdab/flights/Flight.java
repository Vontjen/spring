package be.vdab.flights;

public class Flight {

    private Integer id;
    private String number;

    public Flight(String number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
