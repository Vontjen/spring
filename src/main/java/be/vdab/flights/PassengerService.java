package be.vdab.flights;

import java.util.List;

public class PassengerService {
    PassengerRepository passengerRepository;

    public PassengerService(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    public List<Passenger> getAll(){
        return passengerRepository.findAll();
    }
}
