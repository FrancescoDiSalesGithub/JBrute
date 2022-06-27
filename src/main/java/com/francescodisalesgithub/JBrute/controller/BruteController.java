package com.francescodisalesgithub.JBrute.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.francescodisalesgithub.JBrute.model.BruteGetModel;
import com.francescodisalesgithub.JBrute.model.BruteModel;
import com.francescodisalesgithub.JBrute.service.BruteService;

@RestController
public class BruteController 
{
	
	@Autowired
	BruteService service;
	
	@PostMapping("brute-get")
	public HashMap<String, String> bruteHttp(@RequestBody BruteGetModel bruteGetModel)
	{
		return service.bruteGetRequest(bruteGetModel);
	}
	
	@PostMapping("brute")
	public void bruteHttpPost(@RequestBody BruteModel bruteModel)
	{
		
	}

}
