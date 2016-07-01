package com.humano.care.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;

import com.humano.care.model.User;
import com.humano.care.service.UserService;

@Path("/user")
public class UserRestService {
	 @Autowired
	 UserService userService;
	 
	@POST
	@Path("/insert")
	@Consumes(MediaType.APPLICATION_JSON)
	@PreAuthorize("hasRole('ROLE_DUMMY')")
	//@PreAuthorize("permitAll")
	public String insertUser(User user) throws Exception{
	try{
		if(user!= null)
		{
		//userService.insert(user);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	 return "Ok";
		
	}
	
	@POST
	@Path("/getUserList")
	@Consumes(MediaType.APPLICATION_JSON)
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	//@PreAuthorize("permitAll")
	public List<User> getUserList() throws Exception{
	try{
		return userService.getUserList();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	 return null;
		
	}
}
