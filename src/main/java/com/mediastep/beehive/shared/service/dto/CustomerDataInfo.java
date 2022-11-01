package com.mediastep.beehive.shared.service.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class CustomerDataInfo implements Serializable {
    private Long buyerId;
    private Long storeId;
    private BigDecimal debtAmount;
    private BigDecimal remainingPoint;
    private Long totalOrder = BigDecimal.ZERO.longValue();
    private BigDecimal totalPurchase = BigDecimal.ZERO;
    private BigDecimal avgOrderPurchase = BigDecimal.ZERO;
    private BigDecimal orderPurchase3Months = BigDecimal.ZERO;
}
