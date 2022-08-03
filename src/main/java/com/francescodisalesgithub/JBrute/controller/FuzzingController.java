package com.francescodisalesgithub.JBrute.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/fuzz")
public class FuzzingController 
{
	
	@PostMapping("/directory")
	private void directoryFuzzing()
	{
		
	}
	
	@PostMapping("/value")
	private void valueFuzzing()
	{
		
	}
	
	@PostMapping("/subdomain")
	private void subDomainFuzzing()
	{
		
	}
	
	@PostMapping("/headerFuzzing")
	private void headerFuzzing()
	{
		
	}
	
	
	

}
