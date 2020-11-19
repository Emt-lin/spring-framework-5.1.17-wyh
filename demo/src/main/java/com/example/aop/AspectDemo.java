package com.example.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author psl
 * @date 2020/9/9
 */
@Component
@Aspect
public class AspectDemo {
	@Pointcut("execution(* com.example.dao.UserService.query())")
	public void pointcut(){}

	@Before("AspectDemo.pointcut()")
	public void before(){
		System.out.println("before");
	}
}
