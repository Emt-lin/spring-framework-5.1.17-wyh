package com.example;

import com.example.dao.UserService;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * @author psl
 * @date 2020/7/18
 */

public class Test {
	public static void main(String[] args) throws IOException {
		// 把spring所有的前提环境准备好(比如：bean容器、bean工厂等)
		AnnotationConfigApplicationContext context = new
				AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.scan("com.example");
		context.refresh();

		AppConfig bean = context.getBean(AppConfig.class);
		System.out.println(bean);

		context.getBean(UserService.class).query();

//		Enhancer enhancer = new Enhancer();
////		java classpath "C:\Program Files\Java\jdk1.8.0_151\lib\sa-jdi.exe" sum.jvm.hotspot.HSDB
//		enhancer.setCallback(new MethodInterceptor() {
//			@Override
//			public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//				return methodProxy.invoke(o, objects);
//			}
//		});
//		enhancer.create();
//		System.in.read();

	}
}
