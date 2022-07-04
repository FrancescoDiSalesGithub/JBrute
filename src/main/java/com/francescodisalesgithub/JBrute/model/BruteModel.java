package com.francescodisalesgithub.JBrute.model;

public class BruteModel 
{
	private String cookies;
	private String bodyRequest;
	private String ContentType;
	private String wrongMessage;
	
	
	public String getCookies() {
		return cookies;
	}

	public void setCookies(String cookies) {
		this.cookies = cookies;
	}

	public String getBodyRequest() 
	{
		return bodyRequest;
	}
	
	public void setBodyRequest(String bodyRequest) 
	{
		this.bodyRequest = bodyRequest;
	}
	
	public String getContentType() {
		return ContentType;
	}

	public void setContentType(String contentType) {
		ContentType = contentType;
	}

	public String getWrongMessage() 
	{
		return wrongMessage;
	}
	
	public void setWrongMessage(String wrongMessage) 
	{
		this.wrongMessage = wrongMessage;
	}
	
	

}
