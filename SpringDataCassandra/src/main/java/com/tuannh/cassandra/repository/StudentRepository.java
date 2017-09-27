package com.tuannh.cassandra.repository;

import org.springframework.data.repository.CrudRepository;

import com.tuannh.cassandra.model.Student;

public interface StudentRepository extends CrudRepository<Student, String> {
	
	
}
