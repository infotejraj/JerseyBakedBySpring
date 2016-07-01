package com.tejinfo.service;

import java.util.List;

import com.humano.care.model.User;

public interface UserService {
	public void insert(User user);
	public User getUser(long userId);
	public List<User> getUserList();
}
