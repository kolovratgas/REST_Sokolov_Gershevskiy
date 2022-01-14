package com.company.laba_3.repository;

import com.company.laba_3.entity.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorsRepository extends CrudRepository<Author, Integer> {

}
