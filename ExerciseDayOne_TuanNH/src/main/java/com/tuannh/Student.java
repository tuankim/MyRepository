package com.tuannh;

import java.util.ArrayList;

public class Student {
	private int studentID;
	private String name;
	private int age;
	private ArrayList<Course> listCourse;
	
	public Student() {
		super();
	}

	public Student(int studentID, String name, int age) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.age = age;
	}

	public Student(int studentID, String name, int age,
			ArrayList<Course> listCourse) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.age = age;
		this.listCourse = listCourse;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<Course> getListCourse() {
		return listCourse;
	}

	public void setListCourse(ArrayList<Course> listCourse) {
		this.listCourse = listCourse;
	}
	
	public String getAllInfomation(){
		return studentID+" "+name+" "+age;
	}
	
	
}
