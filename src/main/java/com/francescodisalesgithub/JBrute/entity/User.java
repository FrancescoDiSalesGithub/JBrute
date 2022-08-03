package com.francescodisalesgithub.JBrute.entity;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity(name = "users")
@Table(name="users",schema="brute")
public class User 
{
	@Id
	@Column(name = "email")
	private String email;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@ManyToMany(targetEntity = Machine.class)
	private Set<Machine> machine = new HashSet<Machine>();

	public User()
	{
		
	}
	
	public User(String  email,String username,String password,Set<Machine> machine)
	{
		this.email = email;
		this.username = username;
		this.password = password;
		this.machine = machine;
	}



	
	
}
