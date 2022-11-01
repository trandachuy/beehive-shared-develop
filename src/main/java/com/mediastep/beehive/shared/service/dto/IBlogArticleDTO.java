package com.mediastep.beehive.shared.service.dto;

import java.util.List;
import com.mediastep.beehive.shared.domain.enumeration.BlogArticleStatusEnum;
import com.mediastep.beehive.shared.service.dto.impl.BlogCategoryDTO;

public interface IBlogArticleDTO {

    Long getId();

    void setId(Long id);

    String getTitle();

    void setTitle(String title);

    String getContent();

    void setContent(String content);

    String getFeaturedText();

    void setFeaturedText(String featuredText);

    String getImageUrl();

    void setImageUrl(String imageUrl);

    Long getAuthorId();

    void setAuthorId(Long authorId);

    BlogArticleStatusEnum getStatus();

    void setStatus(BlogArticleStatusEnum status);

    String getSeoTitle();

    void setSeoTitle(String seoTitle);

    String getSeoDescription();

    void setSeoDescription(String seoDescription);

    String getSeoKeywords();

    void setSeoKeywords(String seoKeywords);

    String getSeoUrl();

    void setSeoUrl(String seoUrl);

    Long getStoreId();

    void setStoreId(Long storeId);

    Boolean isDeleted();

    void setDeleted(Boolean deleted);

    List<BlogCategoryDTO> getCategories();

    void setCategories(List<BlogCategoryDTO> categories);
}
