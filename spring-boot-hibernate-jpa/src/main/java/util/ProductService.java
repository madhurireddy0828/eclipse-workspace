package util;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import util.Product;
import util.ProductDAO;

@Service
public class ProductService {
	private static final Logger logger = LoggerFactory.getLogger(ProductService.class);
	@Autowired
	private ProductDAO articleDAO;

	public Product getArticleById(int articleId) {
		Product obj = articleDAO.getArticleById(articleId);
		return obj;
	}

	public List<Product> getAllArticles() {
		logger.error(" service - getAllArticles started");
		return articleDAO.getAllArticles();
	}

	public boolean addArticle(Product article) {
		if (articleDAO.articleExists(article.getTitle(), article.getCategory())) {
			return false;
		} else {
			articleDAO.addArticle(article);
			return true;
		}
	}

	public void updateArticle(Product article) {
		articleDAO.updateArticle(article);
	}

	public void deleteArticle(int articleId) {
		articleDAO.deleteArticle(articleId);
	}
}
