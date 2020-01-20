package com.spring.Webflux.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.Webflux.model.Todo;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

	
}
