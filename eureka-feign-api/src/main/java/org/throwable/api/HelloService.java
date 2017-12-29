package org.throwable.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2017/12/29 12:16
 */
public interface HelloService {

    /**
     * say hello
     *
     * @param name name
     * @return String
     */
    @GetMapping(value = "/hello")
    String sayHello(@RequestParam(name = "name") String name);
}
