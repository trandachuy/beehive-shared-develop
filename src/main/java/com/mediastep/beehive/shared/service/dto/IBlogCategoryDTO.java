package com.mediastep.beehive.shared.service.dto;

public interface IBlogCategoryDTO {

    public Long getId();

    public void setId(Long id);

    public String getTitle();

    public void setTitle(String title);

    public String getDescription();

    public void setDescription(String description);

    public Boolean getDeleted();

    public void setDeleted(Boolean deleted);

    public String getSeoTitle();

    public void setSeoTitle(String seoTitle);

    public String getSeoDescription();

    public void setSeoDescription(String seoDescription);

    public String getSeoKeywords();

    public void setSeoKeywords(String seoKeywords);

    public String getSeoUrl();

    public void setSeoUrl(String seoUrl);

    public Long getStoreId();

    public void setStoreId(Long storeId);

}
