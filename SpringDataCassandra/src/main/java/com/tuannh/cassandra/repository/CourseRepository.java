package com.tuannh.cassandra.repository;

import org.springframework.data.repository.Repository;

import com.tuannh.cassandra.model.Course;
import com.tuannh.cassandra.model.Student;

public interface CourseRepository extends Repository<Course, String>{
	Iterable<Course> findAll();

	Course save(Course course);
	
	void delete(Course course); 
	
}
