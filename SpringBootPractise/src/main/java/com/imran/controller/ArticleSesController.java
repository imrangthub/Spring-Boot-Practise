//package com.imran.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.imran.model.Article;
//import com.imran.service_2.IArticleService;
//
//
//
//
//@RestController
//@RequestMapping("/articleS")
//public class ArticleSesController {
//	
//	@Autowired
//	private IArticleService ArticleService;
//	
//	@RequestMapping("/")
//	public List<Article> list(){
//		return  iArticleService.listArticle();
//	}
//	
//	@RequestMapping("/{id}")
//	public Article getArticle(@PathVariable Integer id){
//		return  iArticleService.getArticleById(id);
//	}
//	
//
//}
