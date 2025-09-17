package org.acme.article;


import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@RegisterForReflection
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class ArticleVO {
    private Long id;
    private long version;
    @NotBlank
    private String name;
    private String description;
}