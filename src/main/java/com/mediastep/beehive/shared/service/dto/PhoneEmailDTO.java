package com.mediastep.beehive.shared.service.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
public class PhoneEmailDTO {
    @ApiModelProperty(value = "List main emails of customer")
    private @Valid Set<CustomerEmailDTO> emails = new HashSet<>();
    @ApiModelProperty(value = "List backup emails of customer")
    private @Valid Set<CustomerEmailDTO> backupEmails = new HashSet<>();
    @ApiModelProperty(value = "List main phones of customer")
    private @Valid Set<CustomerPhoneDTO> phones = new HashSet<>();
    @ApiModelProperty(value = "List backup phones of customer")
    private @Valid Set<CustomerPhoneDTO> backupPhones = new HashSet<>();
}
