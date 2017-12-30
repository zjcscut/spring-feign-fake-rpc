package org.throwable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.throwable.service.HelloClient;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2017/12/29 12:22
 */
@EnableFeignClients
@RestController
@EnableDiscoveryClient
@EnableCircuitBreaker
@SpringBootApplication
public class EurekaFeignApiClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaFeignApiClientApplication.class, args);
    }

    @Autowired
    private HelloClient helloClient;

    @GetMapping(value = "/test")
    public String test(@RequestParam(value = "name") String name) {
        return helloClient.sayHello(name);
    }
}
