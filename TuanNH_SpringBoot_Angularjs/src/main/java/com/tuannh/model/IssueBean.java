package com.tuannh.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "tuanissues", type = "issue")
public class IssueBean implements Serializable{
	@Id
	private Integer id_issue;

	private String subject;
//	private Integer parentId;
//	private Float estimatedHours;
//	private Float spentHours;
	private String assignee;
	private String priorityText;
//	private Integer priorityId;
//	private Integer doneRatio;
//	private Project project;
//	private User author;
//	private Date startDate;
//	private Date dueDate;
	private String trackerName;
//	private String description;
//	private Date createdOn;
	private Date updatedOn;
//	private Integer statusId;
	private String statusName;
//	private Version targetVersion;
//	private String categoryName;
	
	public IssueBean() {
		super();
	}

	public IssueBean(Integer id_issue, String subject, String assignee, String priorityText, String trackerName,
			Date updatedOn, String statusName) {
		super();
		this.id_issue = id_issue;
		this.subject = subject;
		this.assignee = assignee;
		this.priorityText = priorityText;
		this.trackerName = trackerName;
		this.updatedOn = updatedOn;
		this.statusName = statusName;
	}

	public Integer getId_issue() {
		return id_issue;
	}

	public void setId_issue(Integer id_issue) {
		this.id_issue = id_issue;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public String getPriorityText() {
		return priorityText;
	}

	public void setPriorityText(String priorityText) {
		this.priorityText = priorityText;
	}

	public String getTrackerName() {
		return trackerName;
	}

	public void setTrackerName(String trackerName) {
		this.trackerName = trackerName;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

//	public String getCategoryName() {
//		return categoryName;
//	}
//
//	public void setCategoryName(String categoryName) {
//		this.categoryName = categoryName;
//	}

	

}
