package com.zbq.testeureke70;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;



@EnableEurekaServer
@SpringBootApplication
public class TestEureke70Application {

    public static void main(String[] args) {
        SpringApplication.run(TestEureke70Application.class, args);
    }

}
