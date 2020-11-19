package com.example.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author psl
 * @date 2020/8/20
 */
@Service
public class UserService {
	@Autowired
	IndexDao dao;

	public UserService(Demo demo) {
		System.out.println(demo);
	}
	public UserService(Integer i) {
		System.out.println(i);
	}

	public UserService() {
		System.out.println("userService default con");
	}

	public void query(){
		System.out.println("userService query");
	}
}
