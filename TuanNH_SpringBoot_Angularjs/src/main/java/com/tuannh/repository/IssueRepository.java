package com.tuannh.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.tuannh.model.IssueBean;

public interface IssueRepository extends ElasticsearchRepository<IssueBean, Integer>{
	
}
