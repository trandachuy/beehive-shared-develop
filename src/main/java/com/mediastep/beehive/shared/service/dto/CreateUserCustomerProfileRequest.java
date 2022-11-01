package com.mediastep.beehive.shared.service.dto;

import lombok.*;
import com.mediastep.beehive.shared.domain.enumeration.Gender;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserCustomerProfileRequest extends PhoneEmailDTO implements Serializable {

    @NotNull
    private String storeName;

	@Size(max = 100)
    @NotNull
	private String name;

	@Deprecated
	@Size(max = 100)
	@Pattern(regexp = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$|^$")
	private String email;

    @Deprecated
	@Pattern(regexp = "(\\+)?\\d{8,15}|^$")
    @NotNull
	private String phone;

	@Valid
	private List<@Pattern(regexp = "^[a-zA-Z0-9]*$") String> tags;

	@Size(max = 1000)
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
    
    private Gender gender;

    private ZonedDateTime birthday;

    @Size(max = 255)
    private String companyName;

    @Size(max = 150)
    private String taxCode;
}
