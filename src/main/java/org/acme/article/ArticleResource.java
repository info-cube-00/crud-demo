package org.acme.article;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import lombok.extern.slf4j.Slf4j;


@Path("api")
@ApplicationScoped
@Slf4j
public class ArticleResource {

    @Inject
    ArticleMapper articleMapper;

    @GET
    @Path("articles")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ArticleVO> getArticles() {
        List<Article> articles = List.of(
                createArticle(1L, "Article 1", "Description 1", 1),
                createArticle(2L, "Article 2", "Description 2", 1));

        return articles.stream()
                .map(articleMapper::voFromEntity)
                .toList();
    }

    private Article createArticle(Long id, String name, String description, long version) {
        Article article = new Article();
        article.setId(id);
        article.setName(name);
        article.setDescription(description);
        article.setVersion(version);
        return article;
    }
}
