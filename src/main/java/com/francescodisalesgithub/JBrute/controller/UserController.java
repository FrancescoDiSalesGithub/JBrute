package com.francescodisalesgithub.JBrute.controller;

import com.francescodisalesgithub.JBrute.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{

	@PostMapping("save-credential")
	public void insertCredential(@RequestBody User user)
	{

	}


	@PostMapping("select-credential")
	public void selectCredential(@RequestBody User user)
	{
		
	}
	
	@PostMapping("update-credential")
	public void updateCredential(@RequestBody User user)
	{
		
	}
	
	@PostMapping("delete-credential")
	public void deleteCredential(@RequestBody User user)
	{
	}

}
