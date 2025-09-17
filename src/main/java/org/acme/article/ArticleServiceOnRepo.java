package org.acme.article;

import java.util.List;
import java.util.Optional;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class ArticleServiceOnRepo implements ArticleService {

    @Inject
    ArticleRepository articleRepository;
    @Inject
    ArticleMapper articleMapper;

    @Override
    @Transactional
    public ArticleVO create(ArticleVO articleVO) {
        throw new RuntimeException("Not yet implemented");        
    }

    @Override
    public Optional<ArticleVO> load(Long id) {
        throw new RuntimeException("Not yet implemented");
    }


    @Override
    @Transactional
    public ArticleVO update(ArticleVO articleVO) {
        throw new RuntimeException("Not yet implemented"); 
    }

    @Override
    public void delete(ArticleVO articleVO) {
        throw new RuntimeException("Not yet implemented"); 
    }

    @Override
    public List<ArticleVO> listAll() {
        throw new RuntimeException("Not yet implemented"); 
    }

}
