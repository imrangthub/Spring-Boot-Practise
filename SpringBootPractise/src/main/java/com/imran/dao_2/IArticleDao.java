package com.imran.dao_2;

import java.util.List;

import com.imran.model.Article;

public interface IArticleDao {
	
	    public void addArticle(Article article);
		
		public void updateArticle(Article article);
		
		public List<Article> listArticle();
		
		public Article getArticleById(Integer articleId);
		
		public void removeArticle(Integer articleId);

}
