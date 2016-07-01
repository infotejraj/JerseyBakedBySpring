package com.humano.care.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.humano.care.dao.UserDAO;
import com.humano.care.model.User;
import com.humano.care.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDao;
	
	@Transactional
	@Override
	public void insert(User user) {
		userDao.insert(user);
	}

	@Transactional
	@Override
	public User getUser(long userId) {
		return userDao.getUser(userId);
	}
	
	@Transactional
	@Override
	public List<User> getUserList() {
		return userDao.getUserList();
	}

}
