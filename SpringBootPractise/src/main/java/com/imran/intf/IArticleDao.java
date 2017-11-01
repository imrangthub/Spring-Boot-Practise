package com.imran.intf;

import java.util.List;
import com.imran.model.Article;

public interface IArticleDao {
	
	public List<Article> list();
	
	public Article articleById(Integer id);

}
