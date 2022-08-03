package com.francescodisalesgithub.JBrute.service;

import com.francescodisalesgithub.JBrute.entity.Words;
import com.francescodisalesgithub.JBrute.model.Dictionary;
import com.francescodisalesgithub.JBrute.model.DictionaryInsert;
import com.francescodisalesgithub.JBrute.model.DictionarySelect;
import com.francescodisalesgithub.JBrute.model.DictionaryUpdate;
import com.francescodisalesgithub.JBrute.repository.DictionaryRepository;
import com.francescodisalesgithub.JBrute.repository.WordRepository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService
{

	
	@Autowired
	private DictionaryRepository dictionaryRepository;
	@Autowired
	private WordRepository wordRepository;
	
    public void insertDictionary(DictionaryInsert dictionaryInsert)
    {
    	try
    	{
    		com.francescodisalesgithub.JBrute.entity.Dictionary dictionaryEntity = new com.francescodisalesgithub.JBrute.entity.Dictionary();
        	dictionaryEntity.setName(dictionaryInsert.getNameDictionary());
        	
        	dictionaryRepository.save(dictionaryEntity);
        	
    	}
    	catch(Exception e)
    	{
    		
    	}
    	
    }

    public void updateDictionary(DictionaryUpdate dictionaryUpdate)
    {
    		try
    		{
    			dictionaryRepository.updateDictionary();
    		}
    		catch(Exception e)
    		{
    			
    		}
    }

    public void deleteDictionary(Dictionary dictionary)
    {
    	try
    	{
    		dictionaryRepository.deleteById(dictionary.getName());
    	}
    	catch(Exception e)
    	{
    		
    	}
    		
    }

    public DictionarySelect  selectDictionary(Dictionary dictionary)
    {
    	    	
    	Set<Words> contentDictionary = dictionaryRepository.findById(dictionary.getName()).get().getWords();
    	
    	DictionarySelect dictionarySelect = new DictionarySelect();
    	dictionarySelect.setName(dictionary.getName());
    	dictionarySelect.setContent(contentDictionary);
    	
    	return dictionarySelect;
    	
    }
    
    public void addWordsDictionary(Dictionary dictionary)
    {
    	try
    	{
    		Scanner scanner = new Scanner(new File(dictionary.getFilename()));
    		Set<Words> wordList = new HashSet<Words>();
    		
    		while(scanner.hasNextLine())
    		{
    			Words word = new Words();
    			
    			word.setWord(scanner.nextLine());
    			wordList.add(word);
    			
    		}
    		
    		scanner.close();
    		
    		com.francescodisalesgithub.JBrute.entity.Dictionary dic = new com.francescodisalesgithub.JBrute.entity.Dictionary(dictionary.getName(),wordList);
			
			dic.setName(dictionary.getName());
			dic.setWords(wordList);
    			
    			
   			dictionaryRepository.save(dic);	
    		
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }


}
