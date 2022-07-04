package com.francescodisalesgithub.JBrute.controller;

import com.francescodisalesgithub.JBrute.model.Dictionary;
import com.francescodisalesgithub.JBrute.model.DictionaryInsert;
import com.francescodisalesgithub.JBrute.model.DictionaryUpdate;

import com.francescodisalesgithub.JBrute.service.DictionaryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DictionaryController
{

    Logger logger = LoggerFactory.getLogger(DictionaryController.class);
    @Autowired
    DictionaryService dictionaryService;

    @PostMapping("/insert-dictionary")
    public void insertDictionary(@RequestBody DictionaryInsert dictionary)
    {
        try
        {
            dictionaryService.insertDictionary(dictionary);
        }
        catch(Exception e)
        {
             logger.error(e.getMessage());
        }

    }

    @PostMapping("/select-dictionary")
    public void selectDictionary(@RequestBody Dictionary dictionary)
    {
        try
        {
            dictionaryService.selectDictionary(dictionary);
        }
        catch(Exception e)
        {
            logger.error(e.getMessage());
        }
    }

    @PostMapping("/update-dictionary")
    public void updateDictionary(@RequestBody DictionaryUpdate dictionary)
    {
        try
        {
            dictionaryService.updateDictionary(dictionary);
        }
        catch(Exception e)
        {
            logger.error(e.getMessage());
        }
    }

    @PostMapping("/delete-dictionary")
    public void deleteDictionary(@RequestBody Dictionary dictionary)
    {
        try
        {
            dictionaryService.deleteDictionary(dictionary);
        }
        catch(Exception e)
        {
            logger.error(e.getMessage());
        }
    }


}
