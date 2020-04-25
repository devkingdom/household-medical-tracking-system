package com.devkingdom.householdmedicaltrackingsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = { "com.devkingdom.householdmedicaltrackingsystem" })
@EnableAutoConfiguration
@EnableJpaRepositories("com.devkingdom.householdmedicaltrackingsystem.repositories")
public class HouseholdMedicalTrackingSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(HouseholdMedicalTrackingSystemApplication.class, args);
    }

}
