CREATE TABLE public.authors
(
    id integer NOT NULL,
    name character varying(255) NOT NULL,
    surname character varying(255) NOT NULL,
    patronymic character varying(255) NOT NULL,
    birthday date NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE public.authors
    OWNER to postgres;




CREATE TABLE public.articles
(
    id integer NOT NULL,
    title character varying(255) NOT NULL,
    description text NOT NULL,
    subjects character varying(255) NOT NULL,
    created date NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE public.articles
    OWNER to postgres;




CREATE TABLE public.author_article
(
    id integer NOT NULL,
    id_article integer NOT NULL,
    id_author integer NOT NULL,
    CONSTRAINT author_article_pkey PRIMARY KEY (id),
    CONSTRAINT id_article FOREIGN KEY (id_article)
        REFERENCES public.articles (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE CASCADE,
    CONSTRAINT id_author FOREIGN KEY (id_author)
        REFERENCES public.authors (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE CASCADE
)