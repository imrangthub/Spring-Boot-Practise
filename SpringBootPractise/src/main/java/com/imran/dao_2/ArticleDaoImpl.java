//package com.imran.dao_2;
//
//
//
//import java.util.List;
//
//import org.hibernate.SessionFactory;
//import org.hibernate.ejb.HibernateEntityManagerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.imran.model.Article;;
//
//
//@Repository
//public class ArticleDaoImpl implements IArticleDao{
//
//	
//	
//	@Autowired
//	private SessionFactory sessionFactory;
//	
//	@Transactional
//    public void addArticle(Article article){
//    	sessionFactory.getCurrentSession().save(article);
//    }
//	
//	@Transactional
//	public void updateArticle(Article article){
//		sessionFactory.getCurrentSession().update(article);
//	}
//	
//	@Transactional
//	@SuppressWarnings("unchecked")
//	public List<Article> listArticle() {
//		return (List<Article>) sessionFactory.getCurrentSession().createCriteria(Article.class).list();
//	}
//	@Transactional
//	@SuppressWarnings("unchecked")
//	public Article getArticleById(Integer articleId){
//		return (Article) sessionFactory.getCurrentSession().get(Article.class, articleId);
//	}
//
//	@Transactional
//	public void removeArticle(Integer articleId){
//		Article article = (Article)sessionFactory.getCurrentSession().load(Article.class, articleId);
//		if(article != null){
//			sessionFactory.getCurrentSession().delete(article);
//		}
//	}
//	
//
//}
//
//
//
