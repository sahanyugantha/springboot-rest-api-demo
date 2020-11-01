package com.sahan.carapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class CarapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarapiApplication.class, args);

        System.out.println("CAR API is running...");
    }

}
