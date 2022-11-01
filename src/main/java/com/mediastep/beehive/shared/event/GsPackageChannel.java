package com.mediastep.beehive.shared.event;

import org.springframework.messaging.MessageChannel;

public interface GsPackageChannel {
    String GS_PACKAGE_CHANNEL = "gsPackageChannel";

    MessageChannel gsPackageChannel();
}
