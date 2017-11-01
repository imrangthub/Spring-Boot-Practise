//package com.imran.service_2;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.imran.dao_2.IArticleDao;
//import com.imran.model.Article;
//
//@Service
//public class ArticleServiceImpl implements IArticleService{
//	
//	@Autowired
//	IArticleDao iArticleDao;
//	
//    public void addArticle(Article article) {
//    	iArticleDao.addArticle(article);
//    }
//	
//	public void updateArticle(Article article) {
//		iArticleDao.updateArticle(article);
//	}
//	
//	public List<Article> listArticle(){
//		return iArticleDao.listArticle();
//	}
//	
//	public Article getArticleById(Integer articleId) {
//		return iArticleDao.getArticleById(articleId);
//	}
//	
//	public void removeArticle(Integer articleId) {
//		iArticleDao.removeArticle(articleId);
//	}
//
//}
