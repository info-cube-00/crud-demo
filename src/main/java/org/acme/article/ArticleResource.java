package org.acme.article;

import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import lombok.extern.slf4j.Slf4j;


@Path("api")
@ApplicationScoped
@Slf4j
public class ArticleResource {

    @Inject
    ArticleService articleService;

    @GET
    @Path("articles")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ArticleVO> getArticles() {
        log.info("Fetching all articles");
        return articleService.listAll();
    }

    @POST
    @Path("articles")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ArticleVO post(ArticleVO articleVO) {
        log.info("Creating article: {}", articleVO);
        return articleService.create(articleVO);
    }

    @PUT
    @Path("articles")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ArticleVO put(ArticleVO articleVO) {
        log.info("Updating article: {}", articleVO);
        return articleService.update(articleVO);
    }

    @GET
    @Path("articles/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response get(@PathParam("id") Long id) {
        log.info("Fetching article with id: {}", id);
        return articleService.load(id).map(articleVO -> Response.ok(articleVO).build())
                .orElse(Response.status(Response.Status.NOT_FOUND).build());
    }

    @DELETE
    @Path("articles")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response delete(ArticleVO articleVO) {
        log.info("Deleting article: {}", articleVO);
        articleService.delete(articleVO);
        return Response.noContent().build();
    }
}