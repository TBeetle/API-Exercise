package com.gpc.apiexercise.item;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ItemConfig {

    @Bean
    CommandLineRunner commandLineRunner(ItemRepository repo) {
        return args -> {
            Item goldOilFilter = new Item (
                    "FIL1515",
                    "A Gold Oil Filter",
                    34.55,
                    "NAPA");
            Item carBattery  = new Item (
                    "BAT7575",
                    "A Car Battery",
                    179.99,
                    "NAPA");
            Item tireRim = new Item (
                    "TIR3434",
                    "A Tire Rim",
                    89.76,
                    "NAPA");
            Item silverOilFilter = new Item (
                    "FIL1414",
                    "A Silver Oil Filter",
                    89.76,
                    "NAPA");
            Item tireRim = new Item (
                    "TIR3434",
                    "A Tire Rim",
                    89.76,
                    "NAPA");
            Item tireRim = new Item (
                    "TIR3434",
                    "A Tire Rim",
                    89.76,
                    "NAPA");
            Item tireRim = new Item (
                    "TIR3434",
                    "A Tire Rim",
                    89.76,
                    "NAPA");
            Item tireRim = new Item (
                    "TIR3434",
                    "A Tire Rim",
                    89.76,
                    "NAPA");
            Item tireRim = new Item (
                    "TIR3434",
                    "A Tire Rim",
                    89.76,
                    "NAPA");
            repo.saveAll(List.of(oilFilter, carBattery, tireRim)) ;
        };
    }
}
