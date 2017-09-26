package com.tuannh;

import java.util.ArrayList;

public class Course {
	private int courseID;
	private String name;
	private ArrayList<Student> listStudent;
	
	public Course() {
		super();
	}

	
	public Course(int courseID, String name) {
		super();
		this.courseID = courseID;
		this.name = name;
	}


	public Course(int courseID, String name, ArrayList<Student> listStudent) {
		super();
		this.courseID = courseID;
		this.name = name;
		this.listStudent = listStudent;
	}

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Student> getListStudent() {
		return listStudent;
	}

	public void setListStudent(ArrayList<Student> listStudent) {
		this.listStudent = listStudent;
	}
	
	public String getAllInfomation(){
		return courseID+" "+name;
	}
}
