package com.francescodisalesgithub.JBrute.repository;

import com.francescodisalesgithub.JBrute.entity.Dictionary;

import java.lang.annotation.Native;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface DictionaryRepository extends CrudRepository<Dictionary,String>
{

	@Query(value = "Update dictionary set name= ? and word = ? where name= ?")
	public void updateDictionary();
}
