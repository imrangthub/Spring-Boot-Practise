package com.imran.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imran.model.Article;
import com.imran.service.ArticleJDBCService;
import com.imran.service.ArticleService;


@RestController
@RequestMapping("/articleJ")
public class ArticleJDBCController {
	
	@Autowired
	private ArticleJDBCService articleJDBCService;
	
	@RequestMapping("/")
	public List<Article> list(){
		return  articleJDBCService.articleList();
	}

}
