package org.throwable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2017/12/29 12:09
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRegistryApplication.class, args);
    }
}
