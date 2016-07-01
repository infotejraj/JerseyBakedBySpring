package com.humano.care.dao;

import java.util.List;

import com.humano.care.model.User;

public interface UserDAO {
	public void insert(User user);
	public User getUser(long userId);
	public List<User> getUserList();
}
