package com.netflix.mediaclient.media;

/* loaded from: classes6.dex */
public class AesCbcCryptoModeDescriptor extends AesCtrCryptoModeDescriptor {
    private int clearBlocks;
    private int encryptedBlocks;

    public int getClearBlocks() {
        return this.clearBlocks;
    }

    public int getEncryptedBlocks() {
        return this.encryptedBlocks;
    }

    public AesCbcCryptoModeDescriptor(int i, int i2) {
        this.encryptedBlocks = i;
        this.clearBlocks = i2;
    }
}
