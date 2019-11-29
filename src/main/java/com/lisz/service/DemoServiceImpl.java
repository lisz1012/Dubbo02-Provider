package com.lisz.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service(version = "1.0.0", timeout = 10000, interfaceClass = DemoService.class) //version在client请求的时候会指定，对不上不行。timeout单位是毫秒
@Component
public class DemoServiceImpl implements DemoService {
	@Override
	public String say(String name) {
		System.out.println("Hi, " + name);
		return "Hi, " + name;
	}
}
