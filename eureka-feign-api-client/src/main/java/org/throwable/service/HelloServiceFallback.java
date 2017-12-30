package org.throwable.service;

import org.springframework.stereotype.Component;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2017/12/31 0:10
 */
@Component
public class HelloServiceFallback implements HelloClient{

	@Override
	public String sayHello(String name) {
		return "None,this is fallback!";
	}
}
