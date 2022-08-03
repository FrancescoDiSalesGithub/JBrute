package com.francescodisalesgithub.JBrute.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity(name = "words")
@Table(name = "words",schema="brute")
@Data
public class Words 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="words_id")
	private Integer idWord;
	@Column(name = "words_value")
	private String word;
	
	@ManyToMany(targetEntity = Dictionary.class,cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	private Set<Dictionary> dictionary = new HashSet<Dictionary>();
	
	public Words()
	{
		
	}
	
	public Words(Integer idWord, String word, Set<Dictionary> dictionary) {
		super();
		this.idWord = idWord;
		this.word = word;
		this.dictionary = dictionary;
	}
	

}
