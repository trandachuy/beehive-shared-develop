package com.mediastep.beehive.shared.service.dto;

import com.mediastep.beehive.shared.event.IGsPackageEvent;
import lombok.Data;

@Data
public class SimpleGsPackageEvent implements IGsPackageEvent {

    private Long id;

    private Long userId;

    private Long expiredId;

    private Long packageId;

    private Long registerPackageDate;

    private Long expiredPackageDate;

    private Long orderId;

    private Long storeId;
}
