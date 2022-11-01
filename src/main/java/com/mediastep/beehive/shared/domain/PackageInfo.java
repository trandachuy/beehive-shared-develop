package com.mediastep.beehive.shared.domain;

public class PackageInfo {
    public static class Id {
        public static final Long BASIC = 1L;
        public static final Long ADVANCE = 2L;
        public static final Long WEB_ONLY = 4L;
        public static final Long FREE = 5L;
        public static final Long WEB = 6L;
        public static final Long APP = 7L;
        public static final Long INSTORE = 8L;

        public static boolean isNewPackage(Long checkPackage) {
            return FREE.compareTo(checkPackage) <= 0;
        }

        public static boolean isOldPackage(Long checkPackage) {
            return !isNewPackage(checkPackage);
        }
    }
}
