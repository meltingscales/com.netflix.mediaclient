package com.netflix.mediaclient.service.mdx;

/* loaded from: classes3.dex */
public enum MdxErrorSuffix {
    Unknown(""),
    NRDP("N"),
    GoogleCast("G");
    
    private final String e;

    @Override // java.lang.Enum
    public String toString() {
        return this.e;
    }

    MdxErrorSuffix(String str) {
        this.e = str;
    }
}
