package com.netflix.mediaclient.service.player.drm;

/* loaded from: classes3.dex */
public enum LicenseRequestFlavor {
    STANDARD("standard"),
    LIMITED("limited"),
    OFFLINE("offline"),
    UNKNOWN("");
    
    private String j;

    LicenseRequestFlavor(String str) {
        this.j = str;
    }
}
