package com.mediastep.beehive.shared.service.dto;/*
 * Copyright 2017 (C) Mediastep Software Inc.
 *
 * Created on : 05/10/2020
 * Author: Quy Luong <email:quy.luong@mediastep.com>
 *
 */

import com.fasterxml.jackson.annotation.JsonGetter;
import com.mediastep.beecow.common.dto.ImageDTO;

import java.math.BigDecimal;

public interface IMembershipDTO {

    Long getId();

    void setId(Long id);

    String getName();

    void setName(String name);

    Long getSellerId();

    void setSellerId(Long sellerId);

    ImageDTO getImage();

    void setImage(ImageDTO image);

    String getDescription();

    void setDescription(String description);

    Integer getPriority();

    void setPriority(Integer priority);

    Long getSegmentId();

    void setSegmentId(Long segmentId);

    Boolean getEnabledBenefit();

    void setEnabledBenefit(Boolean enabledBenefit);

    BigDecimal getDiscountPercent();

    void setDiscountPercent(BigDecimal discountPercent);

    BigDecimal getDiscountMaxAmount();

    void setDiscountMaxAmount(BigDecimal discountMaxAmount);

    @JsonGetter("iconUrlPrefix")
    default String getIconUrlPrefix() {
        if (this.getImage() == null) {
            return null;
        }
        return this.getImage().getUrlPrefix();
    }

    @JsonGetter("iconId")
    default Long getIconId() {
        if (this.getImage() == null) {
            return null;
        }
        return this.getImage().getImageId();
    }

    @JsonGetter("imageUUID")
    default String getImageUUID() {
        ImageDTO imageDTO = this.getImage();
        if (imageDTO == null) {
            return null;
        }
        if (imageDTO.getImageUUID() != null) {
            return imageDTO.getImageUUID();
        }
        if (imageDTO.getImageId() != null) {
            return imageDTO.getImageId().toString();
        }
        return null;
    }

    @JsonGetter("iconExtension")
    default String getIconExtension() {
        if (this.getImage() == null) {
            return null;
        }
        return this.getImage().getExtension();
    }

}
