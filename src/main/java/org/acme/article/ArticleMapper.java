package org.acme.article;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface ArticleMapper {

    ArticleVO voFromEntity(Article article);

    @InheritInverseConfiguration
    Article entityFromVo(ArticleVO articleVO);
}
