package com.mediastep.beehive.shared.service.dto.impl;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@ToString
public class LoyaltyPointSettingDTO extends AbstractAuditingDTO implements Serializable {

    private Long id;

    @NotNull
    private Long storeId;

    @NotNull
    private Boolean enabled;

    @Min(value = 1)
    @NotNull
    private Integer expirySince;

    @NotNull
    private Boolean showPoint;

    @NotNull
    private Boolean purchased;

    @NotNull
    @Min(value = 1)
    @Max(value = 1000000)
    private Integer ratePoint;

    @NotNull
    @Min(value = 0)
    @Max(value = 99999999999L)
    private BigDecimal rateAmount;

    private Boolean refered;

    private Boolean introduced;

    private Boolean checkouted;

    @NotNull
    @Min(value = 1)
    @Max(value = 1000000)
    private Integer exchangePoint;

    @NotNull
    @Min(value = 0)
    @Max(value = 99999999999L)
    private BigDecimal exchangeAmount;

    @NotNull
    private Boolean enableExpiryDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getExpirySince() {
        return expirySince;
    }

    public void setExpirySince(Integer expirySince) {
        this.expirySince = expirySince;
    }

    public Boolean isShowPoint() {
        return showPoint;
    }

    public void setShowPoint(Boolean showPoint) {
        this.showPoint = showPoint;
    }

    public Boolean isPurchased() {
        return purchased;
    }

    public void setPurchased(Boolean purchased) {
        this.purchased = purchased;
    }

    public Integer getRatePoint() {
        return ratePoint;
    }

    public void setRatePoint(Integer ratePoint) {
        this.ratePoint = ratePoint;
    }

    public BigDecimal getRateAmount() {
        return rateAmount;
    }

    public void setRateAmount(BigDecimal rateAmount) {
        this.rateAmount = rateAmount;
    }

    public Boolean isRefered() {
        return refered;
    }

    public void setRefered(Boolean refered) {
        this.refered = refered;
    }

    public Boolean isIntroduced() {
        return introduced;
    }

    public void setIntroduced(Boolean introduced) {
        this.introduced = introduced;
    }

    public Boolean isCheckouted() {
        return checkouted;
    }

    public void setCheckouted(Boolean checkouted) {
        this.checkouted = checkouted;
    }

    public Integer getExchangePoint() {
        return exchangePoint;
    }

    public void setExchangePoint(Integer exchangePoint) {
        this.exchangePoint = exchangePoint;
    }

    public BigDecimal getExchangeAmount() {
        return exchangeAmount;
    }

    public void setExchangeAmount(BigDecimal exchangeAmount) {
        this.exchangeAmount = exchangeAmount;
    }

    public Boolean isEnableExpiryDate() {
        return enableExpiryDate;
    }

    public void setEnableExpiryDate(Boolean enableExpiryDate) {
        this.enableExpiryDate = enableExpiryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LoyaltyPointSettingDTO)) {
            return false;
        }

        return id != null && id.equals(((LoyaltyPointSettingDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
}
