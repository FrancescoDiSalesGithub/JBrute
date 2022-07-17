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

@Entity(name = "words")
@Table(name = "words",schema="brute")
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
	
	public Integer getIdWord() {
		return idWord;
	}
	public void setIdWord(Integer idWord) {
		this.idWord = idWord;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public Set<Dictionary> getDictionary() {
		return dictionary;
	}
	public void setDictionary(Set<Dictionary> dictionary) {
		this.dictionary = dictionary;
	}
	
	
	

}
