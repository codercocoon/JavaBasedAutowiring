package com.codercocoon.spring.ioc.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author contact@codercocoon.com
 *
 */
@Configuration
public class JavaConfiguration {

	@Bean
	public UserService userService() {
		UserServiceImpl bean = new UserServiceImpl();
		bean.setUserDao(userDao());
		return bean;
	}

	@Bean
	@Qualifier
	public UserDao userDao() {
		UserDaoInMemoryImpl bean = new UserDaoInMemoryImpl();
		return bean;
	}
	
	@Bean
	public UserDao userJdbcDao() {
		UserDaoJdbcImpl bean = new UserDaoJdbcImpl();
		return bean;
	}
}
