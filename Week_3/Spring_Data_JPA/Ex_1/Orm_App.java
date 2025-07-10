package com.cognizant.ormlearn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
public class Orm_App {

    private static final Logger LOGGER = LoggerFactory.getLogger(Orm_App.class);

    private static CountryService countryService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Orm_App.class, args);
        LOGGER.info("Inside main");

        countryService = context.getBean(CountryService.class);
        countryService.addSampleCountries();
        testGetAllCountries();
    }

    private static void testGetAllCountries() {
        LOGGER.info("Start");
        List<Country> countries = countryService.getAllCountries();
        for (Country c : countries) {
            System.out.println(c);
        }
        LOGGER.info("End");
    }
}
