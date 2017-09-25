package com.mkyong.book.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName="issue",type="issues")
public class IssueEntity {
	@Id
	private int id;
	
	private String subject;
	
	
	public IssueEntity() {
		super();
	}


	public IssueEntity(int id, String subject) {
		super();
		this.id = id;
		this.subject = subject;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}

	
}
