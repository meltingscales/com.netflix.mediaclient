package com.netflix.mediaclient.service.configuration.crypto;

import o.C8168dfL;

/* loaded from: classes.dex */
public enum CryptoProvider {
    LEGACY("", 0),
    WIDEVINE_L1("", 1),
    WIDEVINE_L3("L3-", 3);
    
    public final String a;
    public final int d;

    CryptoProvider(String str, int i) {
        this.a = str;
        this.d = i;
    }

    public static CryptoProvider b(String str) {
        if (C8168dfL.g(str)) {
            return null;
        }
        String trim = str.trim();
        CryptoProvider cryptoProvider = LEGACY;
        if (cryptoProvider.name().equals(trim)) {
            return cryptoProvider;
        }
        CryptoProvider cryptoProvider2 = WIDEVINE_L1;
        if (cryptoProvider2.name().equals(trim)) {
            return cryptoProvider2;
        }
        CryptoProvider cryptoProvider3 = WIDEVINE_L3;
        if (cryptoProvider3.name().equals(trim)) {
            return cryptoProvider3;
        }
        return null;
    }
}
