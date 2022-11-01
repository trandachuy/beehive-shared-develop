package com.mediastep.beehive.shared.service.dto;
/*
 * Copyright 2017 (C) Mediastep Software Inc.
 *
 * Created on : 28/09/2020
 * Author: Quy Luong <email:quy.luong@mediastep.com>
 *
 */


import com.mediastep.beecow.common.dto.ImageDTO;
import com.mediastep.beehive.shared.domain.enumeration.StorefrontBuildEnum;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

public interface IMobileConfigDTO {



    Long getId();

    void setId(Long id);

    String getShopName();

    void setShopName(String shopName);

    Long getShopId();

    void setShopId(Long shopId);

    String getColorPrimary();

    void setColorPrimary(String colorPrimary);

    String getColorSecondary();

    void setColorSecondary(String colorSecondary);

    ImageDTO getShopLogo();

    void setShopLogo(ImageDTO shopLogo);

    String getBundleId();

    void setBundleId(String bundleId);

    String getAppstoreUrl();

    void setAppstoreUrl(String appstoreUrl);

    StorefrontBuildEnum getSfWebsite();

    void setSfWebsite(StorefrontBuildEnum sfWebsite);

    StorefrontBuildEnum getSfAndroid();

    void setSfAndroid(StorefrontBuildEnum sfAndroid);

    StorefrontBuildEnum getSfIos();

    void setSfIos(StorefrontBuildEnum sfIos);

    String getOtaUrl();

    void setOtaUrl(String otaUrl);

    boolean isSellerAppstore();

    void setSellerAppstore(boolean sellerAppstore);

    boolean isSellerPlaystore();

    void setSellerPlaystore(boolean sellerPlaystore);

    String getFontFamily();

    void setFontFamily(String fontFamily);

    String getNewThemeEngineUrl();

    void setNewThemeEngineUrl(String newThemeEngineUrl);


}
