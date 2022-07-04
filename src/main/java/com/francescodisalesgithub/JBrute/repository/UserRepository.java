package com.francescodisalesgithub.JBrute.repository;

import com.francescodisalesgithub.JBrute.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,String>
{


}
