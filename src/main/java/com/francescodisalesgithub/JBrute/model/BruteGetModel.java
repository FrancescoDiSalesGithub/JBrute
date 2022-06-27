package com.francescodisalesgithub.JBrute.model;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class BruteGetModel 
{
	
	private String user;
	private String url;
	private LinkedHashMap<String,String> queryParameters;
	private String cookies;
	private String dictionaryPath;
	private String wrongMessageLogin;
	
	
	
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public LinkedHashMap<String, String> getQueryParameters() {
		return queryParameters;
	}
	public void setQueryParameters(LinkedHashMap<String, String> queryParameters) {
		this.queryParameters = queryParameters;
	}
	public String getDictionaryPath() {
		return dictionaryPath;
	}
	public void setDictionaryPath(String dictionaryPath) {
		this.dictionaryPath = dictionaryPath;
	}
	public String getWrongMessageLogin() {
		return wrongMessageLogin;
	}
	public void setWrongMessageLogin(String wrongMessageLogin) {
		this.wrongMessageLogin = wrongMessageLogin;
	}
	public String getCookies() {
		return cookies;
	}
	public void setCookies(String cookies) {
		this.cookies = cookies;
	}


}
