package com.francescodisalesgithub.JBrute.controller;

import com.francescodisalesgithub.JBrute.enums.RestResponseMessagesEnum;
import com.francescodisalesgithub.JBrute.model.Dictionary;
import com.francescodisalesgithub.JBrute.model.DictionaryInsert;
import com.francescodisalesgithub.JBrute.model.DictionarySelect;
import com.francescodisalesgithub.JBrute.model.DictionaryUpdate;

import com.francescodisalesgithub.JBrute.service.DictionaryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DictionaryController
{

    Logger logger = LoggerFactory.getLogger(DictionaryController.class);
    @Autowired
    DictionaryService dictionaryService;

    @PostMapping("/dictionary/insert")
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

    @PostMapping("/dictionary/select")
    public Object selectDictionary(@RequestBody Dictionary dictionary)
    {
        try
        {
            return dictionaryService.selectDictionary(dictionary);
        }
        catch(Exception e)
        {
            logger.error(e.getMessage());
            return new String(RestResponseMessagesEnum.ERROR_SELECT_DICTIONARY.toString());
        }
    }

    @PostMapping("/dictionary/update")
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

    @PostMapping("/dictionary/delete")
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
    
    @PostMapping("/dictionary/add-words")
    public void addWordsDictionary(@RequestBody Dictionary dictionary)
    {
        try
        {
            dictionaryService.addWordsDictionary(dictionary);
        }
        catch(Exception e)
        {
            logger.error(e.getMessage());
        }
    }


}
