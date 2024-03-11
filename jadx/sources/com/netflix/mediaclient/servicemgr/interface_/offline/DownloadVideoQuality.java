package com.netflix.mediaclient.servicemgr.interface_.offline;

/* loaded from: classes4.dex */
public enum DownloadVideoQuality {
    DEFAULT("DEFAULT"),
    BEST("BEST"),
    UNKNOWN("");
    
    private final String d;

    public String a() {
        return this.d;
    }

    DownloadVideoQuality(String str) {
        this.d = str;
    }

    public static DownloadVideoQuality c(String str) {
        DownloadVideoQuality[] values;
        for (DownloadVideoQuality downloadVideoQuality : values()) {
            if (downloadVideoQuality.d.equalsIgnoreCase(str)) {
                return downloadVideoQuality;
            }
        }
        return DEFAULT;
    }
}
