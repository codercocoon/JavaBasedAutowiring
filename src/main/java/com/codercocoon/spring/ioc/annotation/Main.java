package com.codercocoon.spring.ioc.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 * @author contact@codercocoon.com
 *
 */
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfiguration.class);
		UserService userService = applicationContext.getBean("userService", UserService.class);

		System.out.println("User1 Informations: " + userService.getUserinformation(1));
		System.out.println("User2 Informations: " + userService.getUserinformation(2));

		System.out.println("Locking User1 account");
		userService.lockAccountUser(1);
		System.out.println("User1 Informations: " + userService.getUserinformation(1));
	}

}
