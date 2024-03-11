package com.fasterxml.jackson.core;

/* loaded from: classes2.dex */
public enum JsonEncoding {
    UTF8("UTF-8", false, 8),
    UTF16_BE("UTF-16BE", true, 16),
    UTF16_LE("UTF-16LE", false, 16),
    UTF32_BE("UTF-32BE", true, 32),
    UTF32_LE("UTF-32LE", false, 32);
    
    private final boolean h;
    private final int i;
    private final String j;

    public boolean a() {
        return this.h;
    }

    public int b() {
        return this.i;
    }

    public String d() {
        return this.j;
    }

    JsonEncoding(String str, boolean z, int i) {
        this.j = str;
        this.h = z;
        this.i = i;
    }
}
