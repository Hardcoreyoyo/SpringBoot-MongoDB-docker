package ServiceMongoCRUD.controller;

import ServiceMongoCRUD.mapper.ArticleMapper;
import ServiceMongoCRUD.model.Article;
import ServiceMongoCRUD.service.ServiceCRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CRUD {

    @Autowired
    ServiceCRUD serviceCRUD;

    @GetMapping("/readall")
    public List<Article> readAll(){
        return serviceCRUD.findAll();
    }

    @GetMapping("/read/{id}")
    public List<Article> read(@PathVariable String id){
        return serviceCRUD.findArticleById(id);
    }

    @PostMapping("/create")
    public String create(@RequestBody ArticleMapper articleMapper){
        String id = articleMapper.getId();
        String title = articleMapper.getTitle();
        String content = articleMapper.getContent();
        Integer view = articleMapper.getView();

        serviceCRUD.create(id, title, content, view);
        return "create OK !";
    }

    @PutMapping("/update")
    public String update(@RequestBody ArticleMapper articleMapper){
        String id = articleMapper.getId();
        String title = articleMapper.getTitle();
        String content = articleMapper.getContent();
        Integer view = articleMapper.getView();

        serviceCRUD.update(id, title, content, view);
        return "update OK !";
    }

    @DeleteMapping("/delete/{id}")
    public String update(@PathVariable String id){
        serviceCRUD.delete(id);
        return "delete OK !";
    }


}
