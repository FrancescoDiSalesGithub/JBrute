package com.francescodisalesgithub.JBrute.repository;

import org.springframework.data.repository.CrudRepository;

import com.francescodisalesgithub.JBrute.entity.Words;

public interface WordRepository extends CrudRepository<Words, Integer> {

}
