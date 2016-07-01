package com.humano.care.test;

import java.io.File;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.humano.care.model.User;
import com.humano.care.model.UserList;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;


public class UserRestServiceTest {
	 @Test	
	  public void insertUser() throws Exception {	
		ObjectMapper objectMapper=new ObjectMapper();
		User user=objectMapper.readValue(new File("//HumanoCareSys//src///testdata//userJson.json"), User.class);
		//we can assert our test cases on request
		assert user.getMobileNo().isEmpty():"User Mobile Number should not be empty";
		
		Client client=new Client();
		WebResource resource=client.resource("http://localhost:8080/HumanoCareSys/restapi/user/insert/");
		//we can assert our test case on response
		
	  }
	 
	 @Test
	 public void getUser(){
		 Client client=new Client();
		 WebResource resource=client.resource("http://localhost:8080/HumanoCareSys/restapi/user/getUserList/");
		 UserList listUser =  resource.get(UserList.class);
		 
		//we can assert our test case on response
	 }
}
