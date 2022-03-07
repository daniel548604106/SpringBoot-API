package com.example.studentsystem.config;

import com.example.studentsystem.model.User;
import com.example.studentsystem.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            UserRepository repository
    ){
        return args -> {
            User mariam = new User(
                     "mariam.a@gmail.com","Mariam Lin",
                    LocalDate.of(2000, Month.JANUARY, 5),40
            );

            User peter = new User(
                    "peter@gmail.com","Peter Co",
                    LocalDate.of(2000, Month.JANUARY, 5),21
            );

            // We extended the JPA Repository so we have access to some the built-in methods
            System.out.println(List.of(mariam,peter));
            System.out.println(repository.findAll());
            repository.saveAll(List.of(mariam,peter));
        };
    }
}
