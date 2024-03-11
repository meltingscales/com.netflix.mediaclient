package org.bouncycastle.crypto.digests;

import com.netflix.android.org.json.zip.JSONzip;
import org.bouncycastle.crypto.CryptoServicePurpose;

/* loaded from: classes6.dex */
public class SHA3Digest extends KeccakDigest {
    public SHA3Digest() {
        this(JSONzip.end, CryptoServicePurpose.ANY);
    }

    public SHA3Digest(int i) {
        super(checkBitLength(i), CryptoServicePurpose.ANY);
    }

    public SHA3Digest(int i, CryptoServicePurpose cryptoServicePurpose) {
        super(checkBitLength(i), cryptoServicePurpose);
    }

    private static int checkBitLength(int i) {
        if (i == 224 || i == 256 || i == 384 || i == 512) {
            return i;
        }
        throw new IllegalArgumentException("'bitLength' " + i + " not supported for SHA-3");
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        absorbBits(2, 2);
        return super.doFinal(bArr, i);
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA3-" + this.fixedOutputLength;
    }
}
