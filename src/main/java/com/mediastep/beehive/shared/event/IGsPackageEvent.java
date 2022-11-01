package com.mediastep.beehive.shared.event;

public interface IGsPackageEvent {
    Long getId();

    Long getUserId();

    Long getExpiredId();

    Long getPackageId();

    Long getRegisterPackageDate();

    Long getExpiredPackageDate();

    Long getOrderId();

    Long getStoreId();
}
