package be.vdab.flights;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class PassengerRepositoryConfig {

    @Bean
    public PassengerRepository repository(){
        return new PassengerRepository(list());
    }

    @Bean
    public List<Passenger> list(){

        ArrayList<Passenger> list = new ArrayList<>();
        list.add(new Passenger("Fred", "Durst"));
        list.add(new Passenger("Tom","Haverfortd"));
        return list;
    }
}
