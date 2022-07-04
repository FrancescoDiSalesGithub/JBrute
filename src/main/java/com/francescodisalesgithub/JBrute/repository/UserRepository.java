package com.francescodisalesgithub.JBrute.repository;

import com.francescodisalesgithub.JBrute.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,String>
{

    @Query("Select u from users u where u.username= :user")
    com.francescodisalesgithub.JBrute.model.User findUser(String user);

}
