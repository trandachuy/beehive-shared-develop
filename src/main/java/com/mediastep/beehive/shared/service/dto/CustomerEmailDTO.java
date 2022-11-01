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
public class CustomerEmailDTO implements Serializable {

    @ApiModelProperty(hidden = true)
    @ReadOnlyProperty
    private Long id;

    @ApiModelProperty(hidden = true)
    @ReadOnlyProperty
    private Long customerId;

    @Size(max = 100)
    @Pattern(regexp = Constants.EMAIL_REGEX)
    @NotBlank
    @ApiModelProperty(required = true)
    private String email;

    @ApiModelProperty
    private String emailName;

    @ApiModelProperty
    private CustomerType emailType = CustomerType.SUB;

}
