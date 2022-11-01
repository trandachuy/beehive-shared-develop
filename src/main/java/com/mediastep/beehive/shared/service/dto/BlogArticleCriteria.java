package com.mediastep.beehive.shared.service.dto;/*
 * Copyright 2017 (C) Mediastep Software Inc.
 *
 * Created on : 21/09/2020
 * Author: Quy Luong <email:quy.luong@mediastep.com>
 *
 */

import com.mediastep.beehive.shared.domain.enumeration.BlogArticleStatusEnum;
import io.github.jhipster.service.filter.BooleanFilter;
import io.github.jhipster.service.filter.Filter;
import io.github.jhipster.service.filter.LongFilter;
import io.github.jhipster.service.filter.StringFilter;

import java.io.Serializable;






/**
 * Criteria class for the BlogArticle entity. This class is used in BlogArticleResource to
 * receive all the possible filtering options from the Http GET request parameters.
 * For example the following could be a valid requests:
 * <code> /blog-articles?id.greaterThan=5&amp;attr1.contains=something&amp;attr2.specified=false</code>
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
public class BlogArticleCriteria implements Serializable {
    /**
     * Class for filtering BlogArticleStatusEnum
     */
    public static class BlogArticleStatusEnumFilter extends Filter<BlogArticleStatusEnum> {
    }

    private static final long serialVersionUID = 1L;


    private LongFilter id;

    private StringFilter title;

    private StringFilter featuredText;

    private StringFilter imageUrl;

    private LongFilter authorId;

    private LongFilter catId;

    private BlogArticleStatusEnumFilter status;

    private StringFilter seoTitle;

    private StringFilter seoDescription;

    private StringFilter seoKeywords;

    private StringFilter seoUrl;

    private LongFilter storeId;

    private BooleanFilter deleted;

    public BlogArticleCriteria() {
    }

    public LongFilter getId() {
        return id;
    }

    public void setId(LongFilter id) {
        this.id = id;
    }

    public StringFilter getTitle() {
        return title;
    }

    public void setTitle(StringFilter title) {
        this.title = title;
    }

    public StringFilter getFeaturedText() {
        return featuredText;
    }

    public void setFeaturedText(StringFilter featuredText) {
        this.featuredText = featuredText;
    }

    public StringFilter getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(StringFilter imageUrl) {
        this.imageUrl = imageUrl;
    }

    public LongFilter getAuthorId() {
        return authorId;
    }

    public void setAuthorId(LongFilter authorId) {
        this.authorId = authorId;
    }

    public LongFilter getCatId() {
        return catId;
    }

    public void setCatId(LongFilter catId) {
        this.catId = catId;
    }

    public BlogArticleStatusEnumFilter getStatus() {
        return status;
    }

    public void setStatus(BlogArticleStatusEnumFilter status) {
        this.status = status;
    }

    public StringFilter getSeoTitle() {
        return seoTitle;
    }

    public void setSeoTitle(StringFilter seoTitle) {
        this.seoTitle = seoTitle;
    }

    public StringFilter getSeoDescription() {
        return seoDescription;
    }

    public void setSeoDescription(StringFilter seoDescription) {
        this.seoDescription = seoDescription;
    }

    public StringFilter getSeoKeywords() {
        return seoKeywords;
    }

    public void setSeoKeywords(StringFilter seoKeywords) {
        this.seoKeywords = seoKeywords;
    }

    public StringFilter getSeoUrl() {
        return seoUrl;
    }

    public void setSeoUrl(StringFilter seoUrl) {
        this.seoUrl = seoUrl;
    }

    public LongFilter getStoreId() {
        return storeId;
    }

    public void setStoreId(LongFilter storeId) {
        this.storeId = storeId;
    }

    public BooleanFilter getDeleted() {
        return deleted;
    }

    public void setDeleted(BooleanFilter deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "BlogArticleCriteria{" +
                (id != null ? "id=" + id + ", " : "") +
                (title != null ? "title=" + title + ", " : "") +
                (featuredText != null ? "featuredText=" + featuredText + ", " : "") +
                (imageUrl != null ? "imageUrl=" + imageUrl + ", " : "") +
                (authorId != null ? "author=" + authorId + ", " : "") +
                (catId != null ? "cat=" + catId + ", " : "") +
                (status != null ? "status=" + status + ", " : "") +
                (seoTitle != null ? "seoTitle=" + seoTitle + ", " : "") +
                (seoDescription != null ? "seoDescription=" + seoDescription + ", " : "") +
                (seoKeywords != null ? "seoKeywords=" + seoKeywords + ", " : "") +
                (seoUrl != null ? "seoUrl=" + seoUrl + ", " : "") +
                (storeId != null ? "storeId=" + storeId + ", " : "") +
                (deleted != null ? "deleted=" + deleted + ", " : "") +
                "}";
    }

}

