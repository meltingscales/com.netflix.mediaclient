package com.netflix.mediaclient.service.offline.agent;

/* loaded from: classes.dex */
public enum OfflineUnavailableReason {
    NA_OFFLINE_STORAGE_NOT_AVAILABLE(1),
    NA_MSL_CLIENT_DISABLED(2),
    NA_DISABLED_FROM_END_POINT(3),
    NA_WIDE_VINE_UNRECOVERABLE(4),
    NA_NO_EXTERNAL_STORAGE(5),
    NA_DISABLED_BY_SYSTEM_ID_4266(6),
    NA_DISABLED_BY_SYSTEM_ID_4266_FROM_SERVER(7),
    NA_OFFLINE_SQL_DB_ERROR(8),
    NA_DISABLED_SMART_DISPLAY(9);
    
    private final int m;

    OfflineUnavailableReason(int i2) {
        this.m = i2;
    }

    public String d() {
        return "OF.NA." + this.m;
    }
}
