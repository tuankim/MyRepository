package com.tuannh.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
 

@Entity
@Table(name = "course")
public class Course{
 
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idCourse;
    private String nameCourse;
  
    
    @ManyToMany(mappedBy = "listCourse",cascade = CascadeType.ALL)
    private Set<Student> listStudent = new HashSet<Student>(0);

	public Course() {
		super();
	}
	
	public Course(String nameCourse) {
		super();
		this.nameCourse = nameCourse;
	}

	public int getIdCourse() {
		return idCourse;
	}

	public void setIdCourse(int idCourse) {
		this.idCourse = idCourse;
	}

	public String getNameCourse() {
		return nameCourse;
	}

	public void setNameCourse(String nameCourse) {
		this.nameCourse = nameCourse;
	}

	public Set<Student> getListStudent() {
		return listStudent;
	}

	public void setListStudent(Set<Student> listStudent) {
		this.listStudent = listStudent;
	}

	@Override
    public String toString() {
        return "Course{" + "id=" + idCourse + ", name=" + nameCourse + ", student=" + listStudent + '}';
    }
    
}