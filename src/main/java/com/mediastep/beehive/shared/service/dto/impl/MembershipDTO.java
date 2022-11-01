package com.mediastep.beehive.shared.service.dto.impl;/*
 * Copyright 2017 (C) Mediastep Software Inc.
 *
 * Created on : 05/10/2020
 * Author: Quy Luong <email:quy.luong@mediastep.com>
 *
 */

import com.mediastep.beecow.common.dto.ImageDTO;
import com.mediastep.beecow.shared.permission.domain.StoreOwner;
import com.mediastep.beehive.shared.service.dto.IMembershipDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Data
@EqualsAndHashCode(of = {"id"})
@ToString
public class MembershipDTO implements Serializable, StoreOwner, IMembershipDTO {
    private static final long serialVersionUID = 1L;

    private Long id;

    @Size(max = 150)
    private String name;

    private Long sellerId;

    private ImageDTO image;

    @Size(max = 10000000)
    private String description;

    private Integer priority;

    private Long segmentId;

    private Boolean enabledBenefit;

    private BigDecimal discountPercent;

    private BigDecimal discountMaxAmount;

    /**
     * Gets store id.
     *
     * @return the store id
     */
    @Override
    public Long getStoreId() {
        return this.getSellerId();
    }

}
