package com.netflix.mediaclient.media;

/* loaded from: classes6.dex */
public class CryptoModeDescriptorFactory {
    private CryptoModeDescriptorFactory() {
    }

    public static CryptoModeDescriptor createAesCtrCryptoModeDescriptor() {
        return new AesCtrCryptoModeDescriptor();
    }

    public static CryptoModeDescriptor createAesCbcCryptoModeDescriptor(int i, int i2) {
        return new AesCbcCryptoModeDescriptor(i, i2);
    }
}
