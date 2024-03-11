package com.netflix.mediaclient.service.player.bladerunnerclient;

/* loaded from: classes3.dex */
public enum PdsEventType {
    START("start"),
    STOP("stop"),
    SPLICE("splice"),
    PAUSE("pause"),
    RESUME("resume"),
    KEEP_ALIVE("keepAlive"),
    UNKNOWN("");
    
    private String j;

    public String d() {
        return this.j;
    }

    PdsEventType(String str) {
        this.j = str;
    }
}
