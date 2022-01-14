package com.company.laba_3.controller.wrapperxsl;

import com.company.laba_3.entity.Article;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "article")
public class ArticleXSL {
    private List<Article> article;

    public ArticleXSL(List<Article> article) {
        this.article = article;
    }
    @XmlElement(name = "doc")
    public List<Article> getArticles() {
        return article;
    }
}
