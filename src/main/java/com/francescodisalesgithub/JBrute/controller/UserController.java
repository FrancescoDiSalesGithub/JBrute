package com.francescodisalesgithub.JBrute.controller;

import com.francescodisalesgithub.JBrute.enums.RestResponseMessagesEnum;
import com.francescodisalesgithub.JBrute.exception.UserUsernameException;
import com.francescodisalesgithub.JBrute.model.MessagerRestResponse;
import com.francescodisalesgithub.JBrute.model.User;
import com.francescodisalesgithub.JBrute.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController
{

	Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService userService;

	@PostMapping("/user/insert")
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


	@PostMapping("/user/select")
	public Object selectCredential(@RequestBody User user)
	{
		Object userOutput = null;

		try
		{
			userOutput = userService.searchUser(user);
		}
		catch(UserUsernameException ue)
		{
			logger.error(ue.getMessage());
			MessagerRestResponse responseMessager = new MessagerRestResponse();
			//responseMessager.set(RestResponseMessagesEnum.ERROR_DATABASE.toString());

			return responseMessager;
		}
		catch (Exception e)
		{
			logger.error(e.getMessage());
			MessagerRestResponse responseMessager = new MessagerRestResponse();
			responseMessager.setMessage(RestResponseMessagesEnum.ERROR_DATABASE.toString());

			return responseMessager;
		}

		if(userOutput == null)
		{
			MessagerRestResponse responseMessager = new MessagerRestResponse();
			responseMessager.setMessage(RestResponseMessagesEnum.USER_NOT_FOUND.toString());
			return responseMessager;
		}

		return userOutput;

	}
	
	@PostMapping("/user/update")
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
	
	@PostMapping("/user/delete")
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

	@PostMapping("/user/import")
	public void importCredential()
	{
		
	}
	
	@PostMapping("/user/export")
	public void exportCredential()
	{
		
	}
	
}
