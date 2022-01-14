package com.company.laba_3.controller;

import com.company.laba_3.controller.wrapperxsl.AuthorXSL;
import com.company.laba_3.entity.Author;
import com.company.laba_3.repository.AuthorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

@RestController
@RequestMapping("author")
public class AuthorController {

    @Autowired
    private AuthorsRepository authorsRepository;

    @GetMapping(produces = { APPLICATION_JSON_VALUE,
            APPLICATION_XML_VALUE})
    public Object authors()  {
        List<Author> authors = new ArrayList<>();
        Iterable<Author> all = authorsRepository.findAll();
        all.forEach(authors::add);
        return new AuthorXSL(authors);
    }

    @GetMapping(value = "{id}", produces = { APPLICATION_JSON_VALUE,
            APPLICATION_XML_VALUE})
    public Object findById(@PathVariable int id) {
        return  authorsRepository.findById(id);
    }

    @DeleteMapping("{id}")
    public void removeAuthor(@PathVariable int id) {
        authorsRepository.deleteById(id);
    }

    @PostMapping
    public void createAuthor(@RequestBody Author author) {
        authorsRepository.save(author);
    }

    @PutMapping
    public void editAuthor(@RequestBody Author author) {
        authorsRepository.deleteById(author.getId());
        authorsRepository.save(author);
    }

}
