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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
 

@Entity
@Table(name = "student")
public class Student {
 
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idStudent;
    private String nameStudent;
    private int ageStudent;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "course_student", joinColumns = {
			@JoinColumn(name = "idStudent", nullable = false, updatable = false) },
			inverseJoinColumns = { @JoinColumn(name = "idCourse",
					nullable = false, updatable = false) })
    private Set<Course> listCourse = new HashSet<Course>(0);
 
    public Student() {
		super();
    }
    
	public Student(String nameStudent, int ageStudent) {
		super();
		this.nameStudent = nameStudent;
		this.ageStudent = ageStudent;
	}

	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}


	public String getNameStudent() {
		return nameStudent;
	}


	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}

	
	public int getAgeStudent() {
		return ageStudent;
	}

	public void setAgeStudent(int ageStudent) {
		this.ageStudent = ageStudent;
	}

	public Set<Course> getListCourse() {
        return listCourse;
    }
 
    public void setListCourse(Set<Course> listCourse) {
        this.listCourse = listCourse;
    }


	@Override
    public String toString() {
        return "Student{" + "id=" + idStudent + ", name=" + nameStudent + ", age=" + ageStudent + ",course=" + listCourse + '}';
    }
    
}