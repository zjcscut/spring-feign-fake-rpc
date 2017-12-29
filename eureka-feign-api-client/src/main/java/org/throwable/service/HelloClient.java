package org.throwable.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.throwable.api.HelloService;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2017/12/29 12:24
 */
@FeignClient(value = "eureka-feign-api-server")
public interface HelloClient extends HelloService {
}
