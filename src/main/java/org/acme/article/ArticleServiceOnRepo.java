package org.acme.article;

import java.util.List;
import java.util.Optional;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class ArticleServiceOnRepo implements ArticleService {

    @Inject
    ArticleRepository articleRepository;
    @Inject
    ArticleMapper articleMapper;

    @Override
    // TODO add needed annotations
    public ArticleVO create(ArticleVO articleVO) {
        //TODO create new article in database and return the created article as VO
        throw new WebApplicationException("Not implemented yet", Response.Status.NOT_IMPLEMENTED);
    }

    @Override
    public Optional<ArticleVO> load(Long id) {
        //TODO load article from database and return it as VO wrapped in an Optional
        throw new WebApplicationException("Not implemented yet", Response.Status.NOT_IMPLEMENTED);
    }


    @Override
    // TODO add needed annotations
    public ArticleVO update(ArticleVO articleVO) {
        //TODO update article in database and return the updated article as VO
        throw new WebApplicationException("Not implemented yet", Response.Status.NOT_IMPLEMENTED); 
    }

    @Override
    // TODO add needed annotations
    public void delete(ArticleVO articleVO) {
        //TODO ensure article is not present in database any longer
        throw new WebApplicationException("Not implemented yet", Response.Status.NOT_IMPLEMENTED); 
    }

    @Override
    public List<ArticleVO> listAll() {
        //TODO list all articles from database and return them as a list of VO
         throw new WebApplicationException("Not implemented yet", Response.Status.NOT_IMPLEMENTED); 
    }

}
