package com.mediastep.beehive.shared.service.dto;

import com.mediastep.beecow.common.util.ZonedDateTimeUtil;
import com.mediastep.beehive.shared.domain.enumeration.Gender;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.i18n.LocaleContextHolder;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class EditStorefrontCustomerProfileRequest extends PhoneEmailDTO{

	@NotNull
	@ApiModelProperty(
		value = "Customer ID",
		readOnly = true
	)
	private Long id;

	@ApiModelProperty(
		value = "Gender"
	)
	private Gender gender;

	@Deprecated
	@ApiModelProperty(
		value = "Birthday of customer (Format: yyyy-MM-dd'T'HH:mm:ss'Z').\n" +
				"Note: Will be deprecated, use field <code>dateOfBirth</code> instead"
	)
	private ZonedDateTime birthday;

	@ApiModelProperty(
		value = "Birthday of customer (Format: yyyy-MM-dd).\n" +
				"Note: If <code>dateOfBirth</code> exist, will ignore <code>birthday</code> property"
	)
	private LocalDate dateOfBirth;

	private String fullName;

	@Deprecated
	private String phone;

	@Deprecated
	private String phoneBackup;

	private String companyName;

	private String taxCode;

	public ZonedDateTime getBirthday() {
		return this.dateOfBirth == null ? birthday : this.getDateOfBirth();
	}

	public ZonedDateTime getDateOfBirth() {
		ZoneId zoneId = ZoneId.of(LocaleContextHolder.getTimeZone().getID());
		return ZonedDateTimeUtil.toZonedDateTime(this.dateOfBirth, zoneId);
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		this.setBirthday(this.getDateOfBirth());
	}
}
