package com.francescodisalesgithub.JBrute.controller;

import com.francescodisalesgithub.JBrute.model.Dictionary;
import com.francescodisalesgithub.JBrute.model.DictionaryUpdate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DictionaryController
{

    @PostMapping("/insert-dictionary")
    public void insertDictionary(@RequestBody Dictionary dictionary)
    {

    }

    @PostMapping("/select-dictionary")
    public void selectDictionary(@RequestBody Dictionary dictionary)
    {

    }

    @PostMapping("/update-dictionary")
    public void updateDictionary(@RequestBody DictionaryUpdate dictionaryUpdate)
    {

    }

    @PostMapping("/delete-dictionary")
    public void deleteDictionary(@RequestBody Dictionary dictionary)
    {

    }


}
