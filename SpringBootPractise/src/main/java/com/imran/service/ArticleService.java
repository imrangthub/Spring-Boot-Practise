package com.imran.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imran.model.Article;
import com.imran.repository.ArticleRepositoryIntf;


@Service
public class ArticleService {
	
	@Autowired
	private ArticleRepositoryIntf articleRepositoryIntf;
	
	
	public List<Article> list(){
		List<Article> list = new ArrayList<>();
		
		articleRepositoryIntf.findAll().forEach(list::add);
		return list;
	}
	
	public Article getArticleById(Integer id) {
		return articleRepositoryIntf.findOne(id);
	}
	
	public void add(Article article) {
		articleRepositoryIntf.save(article);
	}
	
	public void update(Integer id, Article arti) {
		articleRepositoryIntf.save(arti);
	}
	
	public void delete(Integer id) {
		articleRepositoryIntf.delete(id);
	}
	

}
