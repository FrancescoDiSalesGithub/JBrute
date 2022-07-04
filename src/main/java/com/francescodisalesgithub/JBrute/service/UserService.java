package com.francescodisalesgithub.JBrute.service;

import com.francescodisalesgithub.JBrute.model.User;
import com.francescodisalesgithub.JBrute.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{

    @Autowired
    private UserRepository userRepository;

    public void insertUser(User user)
    {
        com.francescodisalesgithub.JBrute.entity.User userEntity = new com.francescodisalesgithub.JBrute.entity.User(user.getEmail(), user.getUsername(), user.getPassword());
        userRepository.save(userEntity);
    }

    public void deleteUser(User user)
    {

    }

    public void updateUser(User user)
    {

    }

    public User searchUser(User user)
    {
        User specificUser = userRepository.findUser(user.getUsername());
        return specificUser;
    }

}
