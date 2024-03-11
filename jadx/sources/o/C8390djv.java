package o;

import com.netflix.msl.MslCryptoException;
import com.netflix.msl.crypto.MslSignatureEnvelope;
import javax.crypto.SecretKey;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.crypto.params.KeyParameter;

/* renamed from: o.djv  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8390djv implements djE {
    protected final SecretKey a;

    public C8390djv(SecretKey secretKey) {
        if (secretKey != null && !secretKey.getAlgorithm().equals("AESCmac")) {
            throw new IllegalArgumentException("Signature key must be an AESCmac key.");
        }
        this.a = secretKey;
    }

    private byte[] a(byte[] bArr) {
        KeyParameter keyParameter = new KeyParameter(this.a.getEncoded());
        CMac cMac = new CMac(new AESEngine());
        cMac.init(keyParameter);
        cMac.update(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[cMac.getMacSize()];
        cMac.doFinal(bArr2, 0);
        return bArr2;
    }

    @Override // o.djE
    public MslSignatureEnvelope c(byte[] bArr) {
        if (this.a == null) {
            throw new MslCryptoException(C8373dje.bR, "No signature key.");
        }
        return new MslSignatureEnvelope(a(bArr));
    }

    @Override // o.djE
    public boolean c(byte[] bArr, MslSignatureEnvelope mslSignatureEnvelope) {
        if (this.a == null) {
            throw new MslCryptoException(C8373dje.dl, "No signature key.");
        }
        return C8434dll.e(a(bArr), mslSignatureEnvelope.d());
    }
}
