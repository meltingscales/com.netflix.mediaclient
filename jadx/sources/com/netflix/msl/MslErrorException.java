package com.netflix.msl;

import o.C8416dku;

/* loaded from: classes5.dex */
public class MslErrorException extends Exception {
    private C8416dku d;

    public C8416dku c() {
        return this.d;
    }

    public MslErrorException(C8416dku c8416dku) {
        super(d(c8416dku));
        this.d = c8416dku;
    }

    private static String d(C8416dku c8416dku) {
        if (c8416dku == null) {
            return "";
        }
        return c8416dku.c() + ": " + c8416dku.e() + " (" + c8416dku.a() + ")";
    }
}
