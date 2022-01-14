package com.company.laba_3.repository;

import com.company.laba_3.entity.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticlesRepository extends CrudRepository<Article, Integer> {

}
