package com.mediastep.beehive.shared.service.dto.impl;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the CustomerAddress entity.
 */
@Data
@NoArgsConstructor
@ToString
@ApiModel
public class CustomerAddressDTO extends AbstractAuditingDTO implements Serializable {

    @ApiModelProperty(value = "Customer address ID")
    private Long id;

    @ApiModelProperty(value = "The address")
    @Size (max = 255)
    private String address;

    @ApiModelProperty("Apt, suite, unit, building, floor, etc... (optional)")
    @Size (max = 255)
    private String address2;

    @ApiModelProperty(
        value = "Country ISO code, obtain from Catalog service"
    )
    private String countryCode;

    @ApiModelProperty("City / Province / State Abbreviation, obtain from Catalog service")
    private String locationCode;

    @ApiModelProperty("District code, specify when select Vietnam for <code>countryCode</code>, obtain from Catalog service")
    private String districtCode;

    @ApiModelProperty("Ward code, specify when select Vietnam for <code>countryCode</code>, obtain from Catalog service")
    private String wardCode;

    @ApiModelProperty("City name, specify when <strong>not</strong> choose <code>countryCode</code> as Vietnam")
    @Size(max = 65)
    private String city;

    @ApiModelProperty("Zip code, specify when <strong>not</strong> choose <code>countryCode</code> as Vietnam")
    @Size(max = 25)
    private String zipCode;

    @Builder
    public CustomerAddressDTO(Long id, String address, String address2, String wardCode, String districtCode,
                              String locationCode, String countryCode, String city, String zipCode) {
        this.id = id;
        this.address = address;
        this.address2 = address2;
        this.wardCode = wardCode;
        this.districtCode = districtCode;
        this.locationCode = locationCode;
        this.countryCode = countryCode;
        this.city = city;
        this.zipCode = zipCode;
    }
}
