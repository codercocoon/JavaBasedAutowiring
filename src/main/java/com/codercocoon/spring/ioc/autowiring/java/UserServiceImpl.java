package com.codercocoon.spring.ioc.autowiring.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * 
 * @author contact@codercocoon.com
 *
 */
public class UserServiceImpl implements UserService {
	private UserDao userDao;

	@Autowired
	@Qualifier
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void lockAccountUser(int userId) {
		userDao.lockAccount(userId, true);
	}

	@Override
	public void unlockAccountUser(int userId) {
		userDao.lockAccount(userId, false);
	}

	@Override
	public String getUserinformation(int userId) {
		User user = userDao.find(userId);
		return user.getFisrtName() + " - " + user.getLastName() + " - " + user.isAccountlocked();
	}
}