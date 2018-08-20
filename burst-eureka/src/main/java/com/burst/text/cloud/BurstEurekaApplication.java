package com.burst.text.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *  服务发现者
 */
@SpringBootApplication
@EnableEurekaServer
public class BurstEurekaApplication {
    public static void main( String[] args ){
        SpringApplication.run(BurstEurekaApplication.class, args);
    }
}
