package com.netflix.mediaclient.service.player.bladerunnerclient;

/* loaded from: classes3.dex */
public enum ManifestRequestFlavor {
    STANDARD("STANDARD"),
    PREFETCH("PRE_FETCH"),
    OFFLINE("OFFLINE"),
    ADBREAK_HYDRATION("ADBREAK_HYDRATION"),
    UNKNOWN("");
    
    private String j;

    public String e() {
        return this.j;
    }

    ManifestRequestFlavor(String str) {
        this.j = str;
    }
}
