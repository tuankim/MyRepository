package com.mkyong.book.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.mkyong.book.model.IssueEntity;

public interface IssueRepository extends ElasticsearchRepository<IssueEntity, Integer>{

}
