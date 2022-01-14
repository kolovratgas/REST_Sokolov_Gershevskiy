package com.company.laba_3.controller;

import com.company.laba_3.controller.wrapperxsl.AuthorArticleXSL;
import com.company.laba_3.entity.AuthorArticle;
import com.company.laba_3.repository.AuthorArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

@RestController
@RequestMapping("author-article")
public class AuthorArticleController {

    @Autowired
    private AuthorArticleRepository authorArticleRepository;

    @GetMapping(produces = { APPLICATION_JSON_VALUE,
            APPLICATION_XML_VALUE})
//    public Object authorArticle()  {
//        return new AuthorArticleXSL(authorArticleRepository.allAuthorArticle());
//    }
    public Object authorArticle()  {
        List<AuthorArticle> authorArticle = new ArrayList<>();
        Iterable<AuthorArticle> all = authorArticleRepository.findAll();
        all.forEach(authorArticle::add);
        return new AuthorArticleXSL(authorArticle);
    }

    @GetMapping(value = "{id}", produces = { APPLICATION_JSON_VALUE,
            APPLICATION_XML_VALUE})
    public Object findById(@PathVariable int id) {
        return authorArticleRepository.findById(id);
    }

    @DeleteMapping("{id}")
    public void removeAuthorArticle(@PathVariable int id) {
        authorArticleRepository.deleteById(id);
    }

    @PostMapping
    public void createAuthorArticle(@RequestBody AuthorArticle authorArticle) {
        authorArticleRepository.save(authorArticle);
    }

    @PutMapping
    public void editAuthorArticle(@RequestBody AuthorArticle authorArticle) {
        authorArticleRepository.deleteById(authorArticle.getId());
        authorArticleRepository.save(authorArticle);
    }

}
