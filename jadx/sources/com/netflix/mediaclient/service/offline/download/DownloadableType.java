package com.netflix.mediaclient.service.offline.download;

/* loaded from: classes3.dex */
public enum DownloadableType {
    Audio("nfa"),
    Video("nfv"),
    Subtitle("nfs"),
    TrickPlay("nfi");
    
    private final String g;

    public String e() {
        return this.g;
    }

    DownloadableType(String str) {
        this.g = str;
    }
}
