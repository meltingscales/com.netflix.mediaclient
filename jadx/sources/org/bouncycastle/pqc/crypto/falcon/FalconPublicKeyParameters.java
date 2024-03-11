package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.util.Arrays;

/* loaded from: classes6.dex */
public class FalconPublicKeyParameters extends FalconKeyParameters {
    private byte[] H;

    public FalconPublicKeyParameters(FalconParameters falconParameters, byte[] bArr) {
        super(false, falconParameters);
        this.H = Arrays.clone(bArr);
    }

    public byte[] getH() {
        return Arrays.clone(this.H);
    }
}