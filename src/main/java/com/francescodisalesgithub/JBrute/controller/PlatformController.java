package com.francescodisalesgithub.JBrute.controller;

import com.francescodisalesgithub.JBrute.model.Platform;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlatformController
{

    @PostMapping("/insert-platform")
    public void insertPlatform(@RequestBody Platform platform)
    {

    }

    @PostMapping("/select-platform")
    public void selectPlatform(@RequestBody Platform platform)
    {

    }

    @PostMapping("/update-platform")
    public void updatePlatform(@RequestBody Platform platform)
    {

    }

    @PostMapping("/delete-platform")
    public void deletePlatform(@RequestBody Platform platform)
    {

    }


}
