package com.imran.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.imran.intf.IArticleDao;
import com.imran.model.Article;

@Repository("mysql")
public class ArticleDaoImpl implements IArticleDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Article> list(){
		final String sql = "SELECT * FROM articles;";
	    List<Article> list =	jdbcTemplate.query(sql, new RowMapper<Article>() {
			public Article mapRow(ResultSet resultSet, int i) throws SQLException {
				Article article = new Article();
				article.setArticleId(resultSet.getInt("id"));
				article.setTitle(resultSet.getString("title"));
				article.setCategory(resultSet.getString("category"));
				return article;
			}
		});
		return list;
	}
	
	public Article articleById(Integer id) {
		return null;
	}
}
