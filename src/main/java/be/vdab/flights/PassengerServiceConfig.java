package be.vdab.flights;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PassengerServiceConfig {

    private PassengerRepositoryConfig passengerRepositoryConfig;

    @Bean
    public PassengerRepository passengerRepository(){
        return new PassengerRepository(passengerRepositoryConfig.list());
    }

    @Bean
    public PassengerService passengerService(){
        return new PassengerService(passengerRepository());
    }
}
