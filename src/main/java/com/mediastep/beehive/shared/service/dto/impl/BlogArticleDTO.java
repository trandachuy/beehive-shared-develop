package com.mediastep.beehive.shared.service.dto.impl;/*
 * Copyright 2017 (C) Mediastep Software Inc.
 *
 * Created on : 21/09/2020
 * Author: Quy Luong <email:quy.luong@mediastep.com>
 *
 */

import java.util.List;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.mediastep.beehive.shared.domain.enumeration.AbstractAuditingEntity;
import com.mediastep.beehive.shared.domain.enumeration.BlogArticleStatusEnum;
import com.mediastep.beehive.shared.service.dto.IBlogArticleDTO;

public class BlogArticleDTO extends AbstractAuditingEntity implements IBlogArticleDTO {

    private static final long serialVersionUID = -5914296184168791196L;

    private Long id;

    @NotNull
    @Size(max = 500)
    private String title;

    private String content;

    @Size(max = 500)
    private String featuredText;

    private String imageUrl;

    private Long authorId;

    private BlogArticleStatusEnum status;

    private String seoTitle;

    @Size(max = 500)
    private String seoDescription;

    @Size(max = 500)
    private String seoKeywords;

    private String seoUrl;

    @NotNull
    private Long storeId;

    private Boolean deleted;

    private List<BlogCategoryDTO> categories;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFeaturedText() {
        return featuredText;
    }

    public void setFeaturedText(String featuredText) {
        this.featuredText = featuredText;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public BlogArticleStatusEnum getStatus() {
        return status;
    }

    public void setStatus(BlogArticleStatusEnum status) {
        this.status = status;
    }

    public String getSeoTitle() {
        return seoTitle;
    }

    public void setSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle;
    }

    public String getSeoDescription() {
        return seoDescription;
    }

    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription;
    }

    public String getSeoKeywords() {
        return seoKeywords;
    }

    public void setSeoKeywords(String seoKeywords) {
        this.seoKeywords = seoKeywords;
    }

    public String getSeoUrl() {
        return seoUrl;
    }

    public void setSeoUrl(String seoUrl) {
        this.seoUrl = seoUrl;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public List<BlogCategoryDTO> getCategories() {
        return this.categories;
    }

    @Override
    public void setCategories(List<BlogCategoryDTO> categories) {
        this.categories = categories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        IBlogArticleDTO blogArticleDTO = (IBlogArticleDTO) o;
        if (blogArticleDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), blogArticleDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "BlogArticleDTO{" +
            "id=" + getId() +
            ", title='" + getTitle() + "'" +
            ", content='" + getContent() + "'" +
            ", featuredText='" + getFeaturedText() + "'" +
            ", imageUrl='" + getImageUrl() + "'" +
            ", author='" + getAuthorId() + "'" +
            ", status='" + getStatus() + "'" +
            ", seoTitle='" + getSeoTitle() + "'" +
            ", seoDescription='" + getSeoDescription() + "'" +
            ", seoKeywords='" + getSeoKeywords() + "'" +
            ", seoUrl='" + getSeoUrl() + "'" +
            ", storeId=" + getStoreId() +
            ", deleted='" + isDeleted() + "'" +
            ", categories='" + getCategories() + "'" +
            "}";
    }
}
