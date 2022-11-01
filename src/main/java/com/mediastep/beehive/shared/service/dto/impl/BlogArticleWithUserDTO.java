package com.mediastep.beehive.shared.service.dto.impl;/*
 * Copyright 2017 (C) Mediastep Software Inc.
 *
 * Created on : 21/09/2020
 * Author: Quy Luong <email:quy.luong@mediastep.com>
 *
 */

import com.mediastep.beecow.common.dto.UserDTO;
import com.mediastep.beehive.shared.domain.enumeration.AbstractAuditingEntity;
import com.mediastep.beehive.shared.domain.enumeration.BlogArticleStatusEnum;
import com.mediastep.beehive.shared.service.dto.IBlogArticleDTO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

public class BlogArticleWithUserDTO extends BlogArticleDTO {

    private UserDTO user;

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

}