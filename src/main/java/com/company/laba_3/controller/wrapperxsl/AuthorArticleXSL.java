package com.company.laba_3.controller.wrapperxsl;

import com.company.laba_3.entity.AuthorArticle;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "author_article")
public class AuthorArticleXSL {
    private List<AuthorArticle> authorArticle;

    public AuthorArticleXSL(List<AuthorArticle> authorArticle) {
        this.authorArticle = authorArticle;
    }
    @XmlElement(name = "doc")
    public List<AuthorArticle> getAuthorArticle() {
        return authorArticle;
    }
}
