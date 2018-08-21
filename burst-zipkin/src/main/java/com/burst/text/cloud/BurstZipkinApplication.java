package com.burst.text.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;

/**
 * @author Administrator
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableZipkinServer
public class BurstZipkinApplication
{
    public static void main( String[] args )
    {

        SpringApplication.run(BurstZipkinApplication.class, args);
    }
}
