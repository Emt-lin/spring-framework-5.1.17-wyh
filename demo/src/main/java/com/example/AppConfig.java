package com.example;

import com.example.beanPostProcessor.MyImport;
import com.example.dao.IndexService;
import com.example.dao.UserService;
import com.mysql.jdbc.Driver;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;


/**
 * @author psl
 * @date 2020/7/18
 */
@Configuration
@ComponentScan("com.example")
//@Lazy(value = true)
//@MapperScan("com.example.dao")
//@Import(MyImport.class)
@Import({MyImport.class})
@EnableAspectJAutoProxy
public class AppConfig {

}
