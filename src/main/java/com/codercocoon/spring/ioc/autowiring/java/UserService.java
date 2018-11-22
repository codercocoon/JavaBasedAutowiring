package com.codercocoon.spring.ioc.autowiring.java;

/**
 * 
 * @author contact@codercocoon.com
 *
 */
public interface UserService {

	String getUserinformation(int userId);

	void lockAccountUser(int userId);

	void unlockAccountUser(int userId);
}
