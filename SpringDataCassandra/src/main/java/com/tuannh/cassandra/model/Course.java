package com.tuannh.cassandra.model;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table
public class Course {
	@PrimaryKey
	private int idcourse;
	private String namecourse;
	
	public Course() {
		super();
	}

	public Course(int idcourse, String namecourse) {
		super();
		this.idcourse = idcourse;
		this.namecourse = namecourse;
	}

	public int getIdcourse() {
		return idcourse;
	}

	public void setIdcourse(int idcourse) {
		this.idcourse = idcourse;
	}

	public String getNamecourse() {
		return namecourse;
	}

	public void setNamecourse(String namecourse) {
		this.namecourse = namecourse;
	}
	
	@Override
	public String toString() {
		return String.format("Course[idcourse=%d, namecourse='%s']", this.idcourse,
				this.namecourse);
	}
}
