package org.throwable.api;

import org.springframework.web.bind.annotation.RestController;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2017/12/29 12:31
 */
@RestController
public class DefaultHelloService implements HelloService{

    @Override
    public String sayHello(String name) {
        return String.format("Hello,I am %s", name);
    }
}
