package o;

import com.netflix.msl.MslCryptoException;
import com.netflix.msl.MslInternalException;
import com.netflix.msl.crypto.MslSignatureEnvelope;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;

/* renamed from: o.djx  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8392djx implements djE {
    protected final SecretKey d;

    public C8392djx(SecretKey secretKey) {
        if (secretKey != null && !secretKey.getAlgorithm().equals("HmacSHA256")) {
            throw new IllegalArgumentException("Signature key must be an HmacSHA256 key.");
        }
        this.d = secretKey;
    }

    @Override // o.djE
    public MslSignatureEnvelope c(byte[] bArr) {
        if (this.d == null) {
            throw new MslCryptoException(C8373dje.bR, "No signature key.");
        }
        try {
            Mac a = djA.a("HmacSHA256");
            a.init(this.d);
            return new MslSignatureEnvelope(a.doFinal(bArr));
        } catch (InvalidKeyException e) {
            throw new MslCryptoException(C8373dje.O, e);
        } catch (NoSuchAlgorithmException e2) {
            throw new MslInternalException("Invalid MAC algorithm specified.", e2);
        }
    }

    @Override // o.djE
    public boolean c(byte[] bArr, MslSignatureEnvelope mslSignatureEnvelope) {
        if (this.d == null) {
            throw new MslCryptoException(C8373dje.dl, "No signature key.");
        }
        try {
            Mac a = djA.a("HmacSHA256");
            a.init(this.d);
            return C8434dll.e(a.doFinal(bArr), mslSignatureEnvelope.d());
        } catch (InvalidKeyException e) {
            throw new MslCryptoException(C8373dje.O, e);
        } catch (NoSuchAlgorithmException e2) {
            throw new MslInternalException("Invalid MAC algorithm specified.", e2);
        }
    }
}
