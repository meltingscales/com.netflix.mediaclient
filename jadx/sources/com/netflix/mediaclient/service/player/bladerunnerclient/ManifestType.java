package com.netflix.mediaclient.service.player.bladerunnerclient;

/* loaded from: classes3.dex */
public enum ManifestType {
    STANDARD("standard"),
    OFFLINE("offline"),
    UNKNOWN("");
    
    private String b;

    public String c() {
        return this.b;
    }

    ManifestType(String str) {
        this.b = str;
    }
}
