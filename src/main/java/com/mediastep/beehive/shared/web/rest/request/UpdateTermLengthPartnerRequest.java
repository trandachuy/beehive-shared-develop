package com.mediastep.beehive.shared.web.rest.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateTermLengthPartnerRequest implements Serializable {
	@NotNull
	private Set<Long> userIds;

	@NotNull
	@Max(5)
	private int yearDuration;
}
