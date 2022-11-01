package com.mediastep.beehive.shared.service.dto;

import com.mediastep.beehive.shared.constant.PlanType;
import lombok.Data;

import java.io.Serializable;

@Data
public class PackageInfoDTO implements Serializable {
    private Long id;
    private PlanType type = PlanType.TRIAL;
    private String packageTypeCode;
    private String description;
    private Integer order;
}
