package com.cydeo;

import net.bytebuddy.matcher.StringMatcher;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication   // includes @Configuration
public class TicketingProjectDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(TicketingProjectDataApplication.class, args);

    }

    // I am trying to add in the container through @Bean annotation

    // create a class annotated with @Configuration
    //write a method which returns the object that you are trying to add in the container


    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}
