package com.company.laba_3.entity;

import javax.persistence.*;

@Entity
@Table(name = "author_article", schema = "public")
public class AuthorArticle {
    private Integer id;
    private Integer idArticle;
    private Integer idAuthor;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "id_article")
    public Integer getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(Integer idArticle) {
        this.idArticle = idArticle;
    }

    @Basic
    @Column(name = "id_author")
    public Integer getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(Integer idAuthor) {
        this.idAuthor = idAuthor;
    }

    @Override
    public String toString() {
        return "Author {" +
                "id=" + id +
                ", id_article='" + idArticle + '\'' +
                ", id_author='" + idAuthor + '\'' +
                '}';
    }


}