package com.mediastep.beehive.shared.service.dto.impl;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.mediastep.beehive.shared.domain.enumeration.AbstractAuditingEntity;
import com.mediastep.beehive.shared.service.dto.IBlogCategoryDTO;

public class BlogCategoryDTO extends AbstractAuditingEntity implements IBlogCategoryDTO {

    private static final long serialVersionUID = -7986539180476459580L;

    private Long id;

    private Boolean deleted;

    @Size(max = 200)
    private String description;

    private Long storeId;

    @NotNull
    @Size(max = 50)
    private String title;

    @Size(max = 500)
    private String seoDescription;

    @Size(max = 500)
    private String seoKeywords;

    private String seoTitle;

    private String seoUrl;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getSeoTitle() {
        return seoTitle;
    }

    public void setSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle;
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

    // prettier-ignore
    @Override
    public String toString() {
        return "BlogCategoryDTO{" +
            "id=" + getId() +
            ", deleted='" + getDeleted() + "'" +
            ", description='" + getDescription() + "'" +
            ", title='" + getTitle() + "'" +
            ", seoDescription='" + getSeoDescription() + "'" +
            ", seoKeywords='" + getSeoKeywords() + "'" +
            ", seoTitle='" + getSeoTitle() + "'" +
            ", seoUrl='" + getSeoUrl() + "'" +
            "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((deleted == null) ? 0 : deleted.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((seoDescription == null) ? 0 : seoDescription.hashCode());
        result = prime * result + ((seoKeywords == null) ? 0 : seoKeywords.hashCode());
        result = prime * result + ((seoTitle == null) ? 0 : seoTitle.hashCode());
        result = prime * result + ((seoUrl == null) ? 0 : seoUrl.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BlogCategoryDTO other = (BlogCategoryDTO) obj;
        if (deleted == null) {
            if (other.deleted != null)
                return false;
        }
        else if (!deleted.equals(other.deleted))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        }
        else if (!description.equals(other.description))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (seoDescription == null) {
            if (other.seoDescription != null)
                return false;
        }
        else if (!seoDescription.equals(other.seoDescription))
            return false;
        if (seoKeywords == null) {
            if (other.seoKeywords != null)
                return false;
        }
        else if (!seoKeywords.equals(other.seoKeywords))
            return false;
        if (seoTitle == null) {
            if (other.seoTitle != null)
                return false;
        }
        else if (!seoTitle.equals(other.seoTitle))
            return false;
        if (seoUrl == null) {
            if (other.seoUrl != null)
                return false;
        }
        else if (!seoUrl.equals(other.seoUrl))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        }
        else if (!title.equals(other.title))
            return false;
        return true;
    }
}
