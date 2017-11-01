package com.imran.repository;


import org.springframework.data.repository.CrudRepository;

import com.imran.model.Article;

public interface ArticleRepositoryIntf extends CrudRepository<Article, Integer>{}
