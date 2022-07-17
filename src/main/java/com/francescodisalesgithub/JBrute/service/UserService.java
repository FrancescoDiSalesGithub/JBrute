package com.francescodisalesgithub.JBrute.service;

import com.francescodisalesgithub.JBrute.enums.LoggerMessages;
import com.francescodisalesgithub.JBrute.exception.UserUsernameException;
import com.francescodisalesgithub.JBrute.model.User;
import com.francescodisalesgithub.JBrute.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{

    Logger logger = LoggerFactory.getLogger(UserService.class);
    
    @Autowired
    private UserRepository userRepository;

    public void insertUser(User user)
    {
        com.francescodisalesgithub.JBrute.entity.User userEntity = new com.francescodisalesgithub.JBrute.entity.User(user.getEmail(), user.getUsername(), user.getPassword(),null);
        userRepository.save(userEntity);
    }

    public void deleteUser(User user)
    {
    		userRepository.deleteById(user.getEmail());
    }

    public void updateUser(User user)
    {
    		
    }

    public com.francescodisalesgithub.JBrute.entity.User searchUser(User user) throws UserUsernameException,Exception
    {
        if(user.getUsername() == null)
        {
            logger.error(LoggerMessages.USERNAME_NULL.toString());
            throw new UserUsernameException(LoggerMessages.USERNAME_NULL.toString());
        }

        return userRepository.findUser(user.getUsername());

    }

}
