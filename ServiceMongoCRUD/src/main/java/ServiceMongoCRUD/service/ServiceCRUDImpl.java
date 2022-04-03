package ServiceMongoCRUD.service;

import ServiceMongoCRUD.dao.ArticleDao;
import ServiceMongoCRUD.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceCRUDImpl implements ServiceCRUD{

    @Autowired
    private ArticleDao articleDao;

    @Override
    public List<Article> findArticleById(String id) {
        return articleDao.findArticleById(id);
    }

    @Override
    public List<Article> findAll() {
        Iterable<Article> iterable = articleDao.findAll();
        List<Article> list = new ArrayList<>();
        iterable.forEach(list::add);
        return list;
    }

    @Override
    public void create(String id, String title, String content, Integer view) {
        Article article = new Article();
        article.setId(id);
        article.setTitle(title);
        article.setContent(content);
        article.setView(view);
        articleDao.save(article);
    }

    @Override
    public void update(String id, String title, String content, Integer view) {
        Article article = new Article();
        article.setId(id);
        article.setTitle(title);
        article.setContent(content);
        article.setView(view);
        articleDao.save(article);
    }

    @Override
    public void delete(String id) {
        articleDao.deleteById(id);
    }

}
