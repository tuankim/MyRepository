package com.tuannh.cassandra.model;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table
public class Student {
	@PrimaryKey
	private int idstudent;
	private String namestudent;
	private int agestudent;

	public Student() {
		super();
	}

	// public Student(int idstudent, String namestudent, int agestudent) {
	// super();
	// this.idstudent = idstudent;
	// this.namestudent = namestudent;
	// this.agestudent = agestudent;
	// }

	public int getIdstudent() {
		return idstudent;
	}

	public Student(int idstudent, String namestudent) {
		super();
		this.idstudent = idstudent;
		this.namestudent = namestudent;
	}

	
	public Student(int idstudent, String namestudent, int agestudent) {
		super();
		this.idstudent = idstudent;
		this.namestudent = namestudent;
		this.agestudent = agestudent;
	}

	public void setIdstudent(int idstudent) {
		this.idstudent = idstudent;
	}

	public String getNamestudent() {
		return namestudent;
	}

	public void setNamestudent(String namestudent) {
		this.namestudent = namestudent;
	}

	public int getAgestudent() {
		return agestudent;
	}

	public void setAgestudent(int agestudent) {
		this.agestudent = agestudent;
	}

	@Override
	public String toString() {
		return String.format("Student[idstudent=%d, namestudent='%s', agestudent='%d']", this.idstudent,
				this.namestudent);
	}

}
