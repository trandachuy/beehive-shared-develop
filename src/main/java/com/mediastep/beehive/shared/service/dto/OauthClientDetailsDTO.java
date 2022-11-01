/**
 * Copyright 2017 (C) Mediastep Software Inc.
 * 
 * Created on : Mar 8, 2019
 * Author     : logan
 * -----------------------------------------------------------------------------
 * Revision History (Release 1.0.0.0)
 * -----------------------------------------------------------------------------
 * VERSION     AUTHOR/      DESCRIPTION OF CHANGE
 * OLD/NEW     DATE             RFC NO
 * -----------------------------------------------------------------------------
 *  --/1.0  | logan           | Initial Create.
 *          | Mar 8, 2019     |
 * ---------|-----------------|-------------------------------------------------
 *  --/1.1  | Anh Le          | Add 2 columns bcStoreId and lastFetchOrderDate
 *          | Mar 25, 2019    | to manage seller account and fetch order
 * ---------|-----------------|-------------------------------------------------
 */
package com.mediastep.beehive.shared.service.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mediastep.beecow.common.dto.AbstractAuditingDTO;
import com.mediastep.beehive.shared.service.deserialize.ArrayToStringConvert;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * A DTO for the OauthClientDetails entity.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OauthClientDetailsDTO extends AbstractAuditingDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	@JsonAlias({ "bc_store_id" })
	private Long bcStoreId;

	@JsonAlias({ "seller_id" })
	private Long sellerId;

	@JsonAlias({ "last_fetch_order_date" })
	private ZonedDateTime lastFetchOrderDate;

	@JsonAlias({ "is_fetching" })
	private Boolean isFetching = Boolean.FALSE;

	private String account;

	@JsonAlias({ "account_platform" })
	private String accountPlatform;

	private String country;

	@JsonAlias({ "access_token" })
	private String accessToken;

	@JsonAlias({ "refresh_token" })
	private String refreshToken;

	@JsonAlias({ "expires_in" })
	private Long expiresIn;

	@JsonAlias({ "refresh_expires_in" })
	private Long refreshExpiresIn;

	@JsonAlias({ "country_user_info" })
	@JsonDeserialize(using = ArrayToStringConvert.class)
	private String countryUserInfo;

	private Long branchId;

	public Long getBranchId() {
		return branchId;
	}

	public void setBranchId(Long branchId) {
		this.branchId = branchId;
	}

	public String getCountryUserInfo() {
		return countryUserInfo;
	}

	public void setCountryUserInfo(String countryUserInfo) {
		this.countryUserInfo = countryUserInfo;
	}

	private String code;

	@JsonAlias({ "request_id" })
	private String requestId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBcStoreId() {
		return bcStoreId;
	}

	public void setBcStoreId(Long bcStoreId) {
		this.bcStoreId = bcStoreId;
	}

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public ZonedDateTime getLastFetchOrderDate() {
		return lastFetchOrderDate;
	}

	public void setLastFetchOrderDate(ZonedDateTime lastFetchOrderDate) {
		this.lastFetchOrderDate = lastFetchOrderDate;
	}

	public Boolean getFetching() {
		return isFetching;
	}

	public void setFetching(Boolean fetching) {
		isFetching = fetching;
	}

	public OauthClientDetailsDTO isFetching(Boolean fetching) {
		isFetching = fetching;
		return this;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getAccountPlatform() {
		return accountPlatform;
	}

	public void setAccountPlatform(String accountPlatform) {
		this.accountPlatform = accountPlatform;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public Long getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(Long expiresIn) {
		this.expiresIn = expiresIn;
	}

	public Long getRefreshExpiresIn() {
		return refreshExpiresIn;
	}

	public void setRefreshExpiresIn(Long refreshExpiresIn) {
		this.refreshExpiresIn = refreshExpiresIn;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		OauthClientDetailsDTO oauthClientDetailsDTO = (OauthClientDetailsDTO) o;
		if (oauthClientDetailsDTO.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), oauthClientDetailsDTO.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "OauthClientDetailsDTO{" + "id=" + id + ", bcStoreId=" + bcStoreId + ", sellerId=" + sellerId
				+ ", lastFetchOrderDate=" + lastFetchOrderDate + ", isFetching=" + isFetching + ", account='" + account
				+ '\'' + ", accountPlatform='" + accountPlatform + '\'' + ", country='" + country + '\''
				+ ", accessToken='" + accessToken + '\'' + ", refreshToken='" + refreshToken + '\'' + ", expiresIn="
				+ expiresIn + ", refreshExpiresIn=" + refreshExpiresIn + ", countryUserInfo='" + countryUserInfo + '\''
				+ ", code='" + code + '\'' + ", requestId='" + requestId + '\'' + '}';
	}
}
