package com.netflix.mediaclient.ui.bandwidthsetting;

/* loaded from: classes4.dex */
public enum ManualBwChoice {
    OFF(0, "off"),
    LOW(1, "low"),
    MEDIUM(2, "medium"),
    HIGH(3, "high"),
    UNLIMITED(4, "unlimited"),
    AUTO(100, "auto"),
    UNDEFINED(-1, "");
    
    private final int g;
    private final String h;

    public String c() {
        return this.h;
    }

    public int d() {
        return this.g;
    }

    ManualBwChoice(int i, String str) {
        this.g = i;
        this.h = str;
    }

    public static ManualBwChoice d(int i) {
        ManualBwChoice[] values;
        for (ManualBwChoice manualBwChoice : values()) {
            if (manualBwChoice.g == i) {
                return manualBwChoice;
            }
        }
        return UNDEFINED;
    }
}
