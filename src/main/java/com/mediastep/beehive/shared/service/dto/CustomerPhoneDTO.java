package com.mediastep.beehive.shared.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.mediastep.beehive.shared.constant.Constants;
import com.mediastep.beehive.shared.domain.enumeration.CustomerType;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.ReadOnlyProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerPhoneDTO implements Serializable {

    @ApiModelProperty(hidden = true)
    @ReadOnlyProperty
    private Long id;

    @ApiModelProperty(hidden = true)
    @ReadOnlyProperty
    private Long customerId;

    @Size(min = 2, max = 10)
    @Pattern(regexp = Constants.PHONE_CODE_REGEX)
    @NotBlank
    @ApiModelProperty(required = true, example = "+84")
    private String phoneCode;

    @ApiModelProperty(example = "nhallc2101")
    private String phoneName;

    @Pattern(regexp = Constants.PHONE_NUMBER_REGEX)
    @NotBlank
    @ApiModelProperty(required = true, example = "113")
    private String phoneNumber;

    @ApiModelProperty(example = "SUB, MAIN")
    private CustomerType phoneType = CustomerType.MAIN;

}
