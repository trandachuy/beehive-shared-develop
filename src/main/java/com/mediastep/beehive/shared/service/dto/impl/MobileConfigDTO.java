package com.mediastep.beehive.shared.service.dto.impl;/*
 * Copyright 2017 (C) Mediastep Software Inc.
 *
 * Created on : 28/09/2020
 * Author: Quy Luong <email:quy.luong@mediastep.com>
 *
 */

import com.mediastep.beecow.common.dto.ImageDTO;
import com.mediastep.beecow.shared.permission.domain.StoreOwner;
import com.mediastep.beecow.store.service.dto.StoreLanguageDTO;
import com.mediastep.beehive.shared.domain.enumeration.StorefrontBuildEnum;
import com.mediastep.beehive.shared.service.dto.IMobileConfigDTO;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MobileConfigDTO implements  Serializable, IMobileConfigDTO, StoreOwner {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String shopName;

    @NotNull
    private Long shopId;

    @NotNull
    private String colorPrimary;

    @NotNull
    private String colorSecondary;

    private ImageDTO shopLogo;

    private String bundleId;

    private String appstoreUrl;

    private StorefrontBuildEnum sfWebsite = StorefrontBuildEnum.NOT_BUILD;

    private StorefrontBuildEnum sfAndroid = StorefrontBuildEnum.NOT_BUILD;

    private StorefrontBuildEnum sfIos = StorefrontBuildEnum.NOT_BUILD;

    private String otaUrl;

    private boolean sellerAppstore = false;

    private boolean sellerPlaystore = false;

    private String fontFamily;

    private String newThemeEngineUrl;

    private List<StoreLanguageDTO> languages = new ArrayList<>();
    
    private String phoneNumber;
    
    private Boolean enableCallIcon = Boolean.FALSE;

    private boolean stickyHeaderWebsite = false;

    private boolean stickyHeaderApplication = false;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getColorPrimary() {
        return colorPrimary;
    }

    public void setColorPrimary(String colorPrimary) {
        this.colorPrimary = colorPrimary;
    }

    public String getColorSecondary() {
        return colorSecondary;
    }

    public void setColorSecondary(String colorSecondary) {
        this.colorSecondary = colorSecondary;
    }

    public ImageDTO getShopLogo() {
        return shopLogo;
    }

    public void setShopLogo(ImageDTO shopLogo) {
        this.shopLogo = shopLogo;
    }

    public String getBundleId() {
        return bundleId;
    }

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    public String getAppstoreUrl() {
        return appstoreUrl;
    }

    public void setAppstoreUrl(String appstoreUrl) {
        this.appstoreUrl = appstoreUrl;
    }

    public StorefrontBuildEnum getSfWebsite() {
        return sfWebsite;
    }

    public void setSfWebsite(StorefrontBuildEnum sfWebsite) {
        this.sfWebsite = sfWebsite;
    }

    public StorefrontBuildEnum getSfAndroid() {
        return sfAndroid;
    }

    public void setSfAndroid(StorefrontBuildEnum sfAndroid) {
        this.sfAndroid = sfAndroid;
    }

    public StorefrontBuildEnum getSfIos() {
        return sfIos;
    }

    public void setSfIos(StorefrontBuildEnum sfIos) {
        this.sfIos = sfIos;
    }

    public String getOtaUrl() {
        return otaUrl;
    }

    public void setOtaUrl(String otaUrl) {
        this.otaUrl = otaUrl;
    }

    public boolean isSellerAppstore() {
        return sellerAppstore;
    }

    public void setSellerAppstore(boolean sellerAppstore) {
        this.sellerAppstore = sellerAppstore;
    }

    public boolean isSellerPlaystore() {
        return sellerPlaystore;
    }

    public void setSellerPlaystore(boolean sellerPlaystore) {
        this.sellerPlaystore = sellerPlaystore;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public String getNewThemeEngineUrl() {
        return newThemeEngineUrl;
    }

    public void setNewThemeEngineUrl(String newThemeEngineUrl) {
        this.newThemeEngineUrl = newThemeEngineUrl;
    }

    public List<StoreLanguageDTO> getLanguages() {
        return languages;
    }

    public void setLanguages(List<StoreLanguageDTO> languages) {
        this.languages = languages;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public Boolean getEnableCallIcon() {
        return enableCallIcon;
    }
    
    public void setEnableCallIcon(Boolean enableCallIcon) {
        this.enableCallIcon = enableCallIcon;
    }

    public Boolean getStickyHeaderWebsite() {
        return stickyHeaderWebsite;
    }

    public void setStickyHeaderWebsite(Boolean stickyHeaderWebsite) {
        this.stickyHeaderWebsite = stickyHeaderWebsite;
    }

    public Boolean getStickyHeaderApplication() {
        return stickyHeaderApplication;
    }

    public void setStickyHeaderApplication(Boolean stickyHeaderApplication) {
        this.stickyHeaderApplication = stickyHeaderApplication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        MobileConfigDTO mobileConfigDTO = (MobileConfigDTO) o;
        if (mobileConfigDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), mobileConfigDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public Long getStoreId() {
        return this.shopId;
    }
}
