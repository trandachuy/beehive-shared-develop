package com.mediastep.beehive.shared.service.dto;

import com.mediastep.beehive.shared.domain.enumeration.Gender;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class SocialChatCustomerProfileRequest extends PhoneEmailDTO implements Serializable {
    private Long id;

    @Size(max = 100)
    @NotNull
    private String fullName;

    @Deprecated
    @Size(max = 100)
    @Pattern(regexp = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$|^$")
    private String email;

    @Deprecated
    @Pattern(regexp = "(\\+)?\\d{8,15}|^$")
    @NotNull
    private String phone;
    
    private Gender gender;

    private String birthday;

    @Deprecated
    private String countryCode;

    private Long addressId;

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

    private String socialUserId;

    private String fbPageId;

    @Builder
    public SocialChatCustomerProfileRequest(Long id, String fullName, String email, 
                                            String phone, Gender gender, String birthday, String countryCode,
                                            Long addressId, String address, String address2, String locationCode, String districtCode,
                                            String wardCode, String city, String zipCode, String socialUserId, String fbPageId) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.birthday = birthday;
        this.countryCode = countryCode;
        this.addressId = addressId;
        this.address = address;
        this.address2 = address2;
        this.locationCode = locationCode;
        this.districtCode = districtCode;
        this.wardCode = wardCode;
        this.city = city;
        this.zipCode = zipCode;
        this.socialUserId = socialUserId;
        this.fbPageId = fbPageId;
    }
}
