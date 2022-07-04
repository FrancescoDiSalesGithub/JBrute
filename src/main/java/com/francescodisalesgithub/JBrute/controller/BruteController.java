package com.francescodisalesgithub.JBrute.controller;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.francescodisalesgithub.JBrute.model.BruteGetModel;
import com.francescodisalesgithub.JBrute.model.BruteModel;
import com.francescodisalesgithub.JBrute.service.BruteService;

@RestController(value = "bruteforce")
public class BruteController 
{
	
	@Autowired
	BruteService service;
	
	@PostMapping("brute-get")
	public LinkedHashMap<String, String> bruteHttp(@RequestBody BruteGetModel bruteGetModel)
	{
		return service.bruteGetRequest(bruteGetModel);
	}
	
	@PostMapping("brute-post")
	public LinkedHashMap<String,String> bruteHttpPost(@RequestBody BruteModel bruteModel)
	{
		return service.brutePostRequest(bruteModel);
	}

}
