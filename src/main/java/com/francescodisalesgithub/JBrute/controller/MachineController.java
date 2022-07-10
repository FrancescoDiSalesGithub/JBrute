package com.francescodisalesgithub.JBrute.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MachineController 
{
	
	@PostMapping("/machine/insert")
	public void insertMachine()
	{
		
	}
	
	@PostMapping("/machine/update")
	public void updateMachine()
	{
		
	}
	
	@GetMapping("/machine/search")
	public void searchMachine(@RequestParam String machine)
	{
		
	}
	
	@PostMapping("/machine/delete")
	public void deleteMachine()
	{
		
	}
	
	@PostMapping("/machine/assign")
	public void assignUserToMachine()
	{
		
	}
	
	@PostMapping("/machine/import")
	public void importMachines()
	{
		
	}
	
	@PostMapping("/machine/export")
	public void exportMachines()
	{
		
	}
	

}
