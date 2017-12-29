package org.throwable.support;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2017/12/29 12:35
 */
public class FeignRequestMappingHandlerMapping extends RequestMappingHandlerMapping {

    @Override
    protected boolean isHandler(Class<?> beanType) {
        return super.isHandler(beanType) && !AnnotatedElementUtils.hasAnnotation(beanType, FeignClient.class);
    }
}
