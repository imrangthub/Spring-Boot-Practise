package com.imran.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.imran.model.Article;
import com.imran.model.Topic;
import com.imran.repository.ArticleRepositoryIntf;
import com.imran.service.ArticleService;
import com.imran.service.TopicService;

@RestController
@RequestMapping("/article")
public class ArticleController {
	
	
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("/")
	public List<Article> list(){
		return  articleService.list();
	}
	
	@RequestMapping("/{id}")
	public Article getArticle(@PathVariable Integer id){
		return  articleService.getArticleById(id);
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/add")
	public String addArticle(@RequestBody Article arti){
		 articleService.add(arti);
		 return "Sussessfully add article";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/update/{id}")
	public String updateArticle(@RequestBody Article arti, @PathVariable Integer id){
		 articleService.update(id, arti);
		 return "Sussessfully update article";
	}
	
	
	
	@RequestMapping("/delete/{id}")
	public String deleteArticle(@PathVariable Integer id){
		articleService.delete(id);
		return "Successfully Delete Article.";
	}
	
		
	
	
	
	
	
	
	

}
