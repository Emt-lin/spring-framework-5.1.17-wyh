package com.example.dao;

import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

/**
 * @author psl
 * @date 2020/8/12
 */
@Repository
//@Lazy(value = true)
public class IndexDao {

	public void query(){
		System.out.println("query");
	}
}
