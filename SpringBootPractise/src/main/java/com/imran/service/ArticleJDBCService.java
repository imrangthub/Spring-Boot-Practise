package com.imran.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.imran.intf.IArticleDao;
import com.imran.model.Article;

@Service
public class ArticleJDBCService {
	
	@Autowired
	@Qualifier("mysql")
	private IArticleDao iArticleDao;
	
	public List<Article> articleList(){
		return iArticleDao.list();
		
	}
	
}
