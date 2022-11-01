package com.mediastep.beehive.shared.service.dto;

import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateSocialUserCustomerProfileRequest extends PhoneEmailDTO implements Serializable {
    private Long userId;

    private String storeName;

    private String name;

    @Deprecated
    private String email;

    @Deprecated
    private String phone;

    private List<String> tags;

    private String note;

    private String langKey;

    @Deprecated
    private String countryCode;

    @Size(max = 255)
    private String address;

    @Size(max = 255)
    private String address2;

    private String locationCode;

    private String districtCode;

    private String wardCode;

    @Size(max = 65)
    private String city;

    @Size(max = 25)
    private String zipCode;

    private Long branchId;

    private Boolean isCreateUser;
}
