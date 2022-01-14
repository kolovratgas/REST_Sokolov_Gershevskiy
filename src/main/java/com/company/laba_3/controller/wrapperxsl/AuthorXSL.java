package com.company.laba_3.controller.wrapperxsl;

import com.company.laba_3.entity.Author;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "author")
public class AuthorXSL {
    private List<Author> authors;

    public AuthorXSL(List<Author> authors) {
        this.authors = authors;
    }
    @XmlElement(name = "doc")
    public List<Author> getAuthors() {
        return authors;
    }
}
