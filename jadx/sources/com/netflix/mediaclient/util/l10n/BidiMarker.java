package com.netflix.mediaclient.util.l10n;

/* loaded from: classes.dex */
public enum BidiMarker {
    FORCED_RTL(8207),
    FORCED_LTR(8206),
    EMBEDDING_RTL(8235),
    EMBEDDING_LTR(8234);
    
    char e;

    public char a() {
        return this.e;
    }

    BidiMarker(char c) {
        this.e = c;
    }
}
