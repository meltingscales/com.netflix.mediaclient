package org.bouncycastle.pqc.crypto.crystals.kyber;

import org.bouncycastle.util.Arrays;

/* loaded from: classes6.dex */
public class KyberPrivateKeyParameters extends KyberKeyParameters {
    final byte[] hpk;
    final byte[] nonce;
    final byte[] rho;
    final byte[] s;
    final byte[] t;

    public KyberPrivateKeyParameters(KyberParameters kyberParameters, byte[] bArr) {
        super(true, kyberParameters);
        KyberEngine engine = kyberParameters.getEngine();
        this.s = Arrays.copyOfRange(bArr, 0, engine.getKyberIndCpaSecretKeyBytes());
        int kyberIndCpaSecretKeyBytes = engine.getKyberIndCpaSecretKeyBytes();
        this.t = Arrays.copyOfRange(bArr, kyberIndCpaSecretKeyBytes, (engine.getKyberIndCpaPublicKeyBytes() + kyberIndCpaSecretKeyBytes) - 32);
        int kyberIndCpaPublicKeyBytes = kyberIndCpaSecretKeyBytes + (engine.getKyberIndCpaPublicKeyBytes() - 32);
        int i = kyberIndCpaPublicKeyBytes + 32;
        this.rho = Arrays.copyOfRange(bArr, kyberIndCpaPublicKeyBytes, i);
        int i2 = kyberIndCpaPublicKeyBytes + 64;
        this.hpk = Arrays.copyOfRange(bArr, i, i2);
        this.nonce = Arrays.copyOfRange(bArr, i2, kyberIndCpaPublicKeyBytes + 96);
    }

    public byte[] getEncoded() {
        return Arrays.concatenate(new byte[][]{this.s, this.t, this.rho, this.hpk, this.nonce});
    }
}