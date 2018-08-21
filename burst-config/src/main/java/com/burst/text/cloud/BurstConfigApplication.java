package com.burst.text.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class BurstConfigApplication
{
    public static void main( String[] args )
    {

        SpringApplication.run(BurstConfigApplication.class, args);
    }
}
