package com.tuannh.service;

import java.util.List;

import com.tuannh.model.IssueBean;

public interface IssueService {
	IssueBean save(IssueBean issue);
	
	List<IssueBean> getAllIssue();
}
