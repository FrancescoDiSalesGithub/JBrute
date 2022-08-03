package com.francescodisalesgithub.JBrute.model;

import java.util.Set;

import com.francescodisalesgithub.JBrute.entity.Words;

import lombok.Data;

@Data
public class DictionarySelect 
{
	
	private String name;
	private Set<Words> content;

}
