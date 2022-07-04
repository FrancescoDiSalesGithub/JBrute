package com.francescodisalesgithub.JBrute.controller;

import com.francescodisalesgithub.JBrute.enums.RestResponseMessagesEnum;
import com.francescodisalesgithub.JBrute.model.MessagerRestResponse;
import com.francescodisalesgithub.JBrute.model.User;
import com.francescodisalesgithub.JBrute.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;

@RestController
public class UserController
{

	Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService userService;

	@PostMapping("save-credential")
	public void insertCredential(@RequestBody User user)
	{
		try
		{
			userService.insertUser(user);
		}
		catch(Exception e)
		{
			logger.error(e.getMessage());
		}

	}


	@PostMapping("select-credential")
	public Object selectCredential(@RequestBody User user)
	{
		try
		{
			return userService.searchUser(user);
		}
		catch(Exception e)
		{
			logger.error(e.getMessage());
		}

		MessagerRestResponse responseMessager = new MessagerRestResponse();
		responseMessager.setMessage(RestResponseMessagesEnum.USER_NOT_INSERTED.toString());
		return responseMessager;
	}
	
	@PostMapping("update-credential")
	public void updateCredential(@RequestBody User user)
	{
		try
		{
			userService.updateUser(user);
		}
		catch(Exception e)
		{
			logger.error(e.getMessage());
		}
	}
	
	@PostMapping("delete-credential")
	public void deleteCredential(@RequestBody User user)
	{
		try
		{
			userService.deleteUser(user);
		}
		catch(Exception e)
		{
			logger.error(e.getMessage());
		}
	}

}
