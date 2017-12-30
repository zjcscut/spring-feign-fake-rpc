package org.throwable.support;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2017/12/30 11:17
 */
@Component
public class CustomRequestInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("token", UUID.randomUUID().toString());
    }
}
