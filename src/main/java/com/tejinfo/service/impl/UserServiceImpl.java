package com.tejinfo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tejinfo.dao.UserDAO;
import com.tejinfo.model.User;
import com.tejinfo.service.UserService;

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
