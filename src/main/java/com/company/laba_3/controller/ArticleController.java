package com.company.laba_3.controller;

import com.company.laba_3.controller.wrapperxsl.ArticleXSL;
import com.company.laba_3.entity.Article;
import com.company.laba_3.repository.ArticlesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

@RestController
@RequestMapping("article")
public class ArticleController {

    @Autowired
    private ArticlesRepository articlesRepository;

    @GetMapping(produces = { APPLICATION_JSON_VALUE,
            APPLICATION_XML_VALUE})
    public Object articles()  {
        List<Article> article = new ArrayList<>();
        Iterable<Article> all = articlesRepository.findAll();
        all.forEach(article::add);
        return new ArticleXSL(article);
    }

    @GetMapping(value = "{id}", produces = { APPLICATION_JSON_VALUE,
            APPLICATION_XML_VALUE})
    public Object findById(@PathVariable int id) {
        return articlesRepository.findById(id);
    }

    @DeleteMapping("{id}")
    public void removeArticle(@PathVariable int id) {
        articlesRepository.deleteById(id);
    }

    @PostMapping
    public void createArticle(@RequestBody Article articles) {
        articlesRepository.save(articles);
    }

    @PutMapping
    public void editArticle(@RequestBody Article articles) {
        articlesRepository.deleteById(articles.getId());
        articlesRepository.save(articles);
    }

}
