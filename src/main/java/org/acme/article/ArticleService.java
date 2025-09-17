package org.acme.article;

import java.util.List;
import java.util.Optional;

public interface ArticleService {
    
    ArticleVO create(ArticleVO articleVO);

    Optional<ArticleVO> load(Long id);

    ArticleVO update(ArticleVO articleVO);

    void delete(ArticleVO articleVO);

    List<ArticleVO> listAll();
}
