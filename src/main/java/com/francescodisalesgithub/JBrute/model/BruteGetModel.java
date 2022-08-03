package com.francescodisalesgithub.JBrute.model;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import lombok.Data;

@Data
public class BruteGetModel 
{
	
	private String user;
	private String url;
	private LinkedHashMap<String,String> queryParameters;
	private String cookies;
	private String dictionaryPath;
	private String wrongMessageLogin;


}
