package org.bouncycastle.pqc.crypto.frodo;

import org.bouncycastle.util.Arrays;

/* loaded from: classes6.dex */
public class FrodoPrivateKeyParameters extends FrodoKeyParameters {
    private byte[] privateKey;

    public FrodoPrivateKeyParameters(FrodoParameters frodoParameters, byte[] bArr) {
        super(true, frodoParameters);
        this.privateKey = Arrays.clone(bArr);
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.privateKey);
    }
}
