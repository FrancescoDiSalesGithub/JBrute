package com.francescodisalesgithub.JBrute.entity;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity(name = "dictionary")
@Table(schema = "brute",name="dictionary")
@Data
public class Dictionary
{
    
    @Id
    @Column(name = "dictionary_name")
    private String name;

    @ManyToMany(targetEntity = Words.class,cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinTable(name = "dictionary_words",joinColumns = @JoinColumn(name = "dictionary_name"),inverseJoinColumns = @JoinColumn(name="words_id"))
    private Set<Words> words = new HashSet<Words>();

    
	public Dictionary() {
		super();
	}

	public Dictionary(String name, Set<Words> words) {
		super();
		this.name = name;
		this.words = words;
	}

    
    
}
