package com.francescodisalesgithub.JBrute.controller;

import com.francescodisalesgithub.JBrute.model.Platform;
import com.francescodisalesgithub.JBrute.service.PlatformService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlatformController
{

    Logger logger = LoggerFactory.getLogger(PlatformController.class);
    @Autowired
    PlatformService platformService;

    @PostMapping("/platform/insert")
    public void insertPlatform(@RequestBody Platform platform)
    {
        try
        {
            platformService.insertPlatform(platform);
        }
        catch(Exception e)
        {
            logger.error(e.getMessage());
        }

    }

    @PostMapping("/platform/select")
    public void selectPlatform(@RequestBody Platform platform)
    {
        try
        {
            platformService.searchPlatform(platform);
        }
        catch(Exception e)
        {
            logger.error(e.getMessage());
        }

    }

    @PostMapping("/platform/update")
    public void updatePlatform(@RequestBody Platform platform)
    {
        try
        {
            platformService.updatePlatform(platform);
        }
        catch(Exception e)
        {
            logger.error(e.getMessage());
        }

    }

    @PostMapping("/platform/delete")
    public void deletePlatform(@RequestBody Platform platform)
    {
        try
        {
            platformService.deletePlatform(platform);
        }
        catch (Exception e)
        {
            logger.error(e.getMessage());
        }

    }


}
