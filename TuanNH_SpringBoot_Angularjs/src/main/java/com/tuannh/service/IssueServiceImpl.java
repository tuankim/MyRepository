package com.tuannh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.tuannh.model.IssueBean;
import com.tuannh.repository.IssueRepository;

@Service
public class IssueServiceImpl implements IssueService{
	
	private IssueRepository issueRepository;

	@Autowired
    public void setIssueRepository(IssueRepository issueRepository) {
        this.issueRepository = issueRepository;
    }

	@Override
	public IssueBean save(IssueBean issueBean) {
		// TODO Auto-generated method stub
		return issueRepository.save(issueBean);
	}

	@Override
	public List<IssueBean> getAllIssue() {
		return  issueRepository.findAll(new PageRequest(0,10)).getContent();
	}
	
}
