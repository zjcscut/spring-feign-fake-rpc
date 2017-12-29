package org.throwable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2017/12/29 12:27
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaFeignApiServerApplication {

    public static void main(String[] args){
        SpringApplication.run(EurekaFeignApiServerApplication.class, args);
    }

}
