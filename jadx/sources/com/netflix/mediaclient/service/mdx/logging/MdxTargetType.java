package com.netflix.mediaclient.service.mdx.logging;

/* loaded from: classes3.dex */
public enum MdxTargetType {
    Cast("cast"),
    Nrdp("nrdp");
    
    private String e;

    public String d() {
        return this.e;
    }

    MdxTargetType(String str) {
        this.e = str;
    }
}
