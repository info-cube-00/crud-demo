package org.acme.article;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = MappingConstants.ComponentModel.JAKARTA_CDI)
public interface ArticleMapper {

    ArticleVO voFromEntity(Article article);

    @InheritInverseConfiguration
    Article entityFromVo(ArticleVO articleVO);

    @InheritConfiguration
    void updateEntityWithVo(@MappingTarget Article entity, ArticleVO vo);
}
