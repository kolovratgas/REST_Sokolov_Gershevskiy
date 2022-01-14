package com.company.laba_3.repository;

import com.company.laba_3.entity.AuthorArticle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorArticleRepository extends CrudRepository<AuthorArticle, Integer> {

}
