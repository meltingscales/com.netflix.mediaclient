package o;

import com.netflix.msl.MslConstants;
import com.netflix.msl.MslCryptoException;
import com.netflix.msl.MslEncodingException;
import com.netflix.msl.crypto.MslCiphertextEnvelope;
import com.netflix.msl.crypto.MslSignatureEnvelope;
import com.netflix.msl.io.MslEncoderException;
import com.netflix.msl.util.MslContext;
import java.util.Random;
import javax.crypto.SecretKey;

/* loaded from: classes5.dex */
public class djF extends AbstractC8393djy {
    protected final MslCiphertextEnvelope.Version a;
    protected final String b;
    protected final InterfaceC8394djz c;
    protected final MslContext d;
    protected final djE e;

    private static InterfaceC8394djz c(MslConstants.EncryptionAlgo encryptionAlgo, SecretKey secretKey, SecretKey secretKey2, Random random) {
        if (secretKey == null && secretKey2 == null) {
            return null;
        }
        if (encryptionAlgo == null) {
            encryptionAlgo = c(secretKey);
        }
        if ((encryptionAlgo == MslConstants.EncryptionAlgo.AES && secretKey != null) || (secretKey2 != null && secretKey2.getAlgorithm().equals("AES"))) {
            return new C8388djt(random, secretKey, secretKey2);
        }
        throw new IllegalArgumentException("Encryption key must be an AES key.");
    }

    private static djE c(MslConstants.SignatureAlgo signatureAlgo, SecretKey secretKey) {
        if (secretKey != null) {
            if (signatureAlgo == null) {
                signatureAlgo = d(secretKey);
            }
            if (signatureAlgo == MslConstants.SignatureAlgo.HmacSHA256) {
                return new C8392djx(secretKey);
            }
            if (signatureAlgo == MslConstants.SignatureAlgo.AESCmac) {
                return new C8390djv(secretKey);
            }
            throw new IllegalArgumentException("Signature key must be an HmacSHA256 or AESCmac key.");
        }
        return null;
    }

    private static MslConstants.SignatureAlgo d(SecretKey secretKey) {
        if (secretKey == null) {
            return null;
        }
        if (secretKey.getAlgorithm().equals("HmacSHA256")) {
            return MslConstants.SignatureAlgo.HmacSHA256;
        }
        if (secretKey.getAlgorithm().equals("AESCmac")) {
            return MslConstants.SignatureAlgo.AESCmac;
        }
        return null;
    }

    private static MslConstants.EncryptionAlgo c(SecretKey secretKey) {
        if (secretKey != null && secretKey.getAlgorithm().equals("AES")) {
            return MslConstants.EncryptionAlgo.AES;
        }
        return null;
    }

    public djF(MslContext mslContext, MslConstants.EncryptionAlgo encryptionAlgo, SecretKey secretKey, SecretKey secretKey2, MslConstants.SignatureAlgo signatureAlgo, SecretKey secretKey3, MslCiphertextEnvelope.Version version, String str) {
        this.c = c(encryptionAlgo, secretKey, secretKey2, mslContext.j());
        this.e = c(signatureAlgo, secretKey3);
        this.d = mslContext;
        this.b = str;
        this.a = version;
    }

    @Override // o.AbstractC8393djy
    public byte[] a(byte[] bArr, AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        InterfaceC8394djz interfaceC8394djz = this.c;
        if (interfaceC8394djz == null || !interfaceC8394djz.d()) {
            throw new MslCryptoException(C8373dje.k, "No encryptor configured, or encrypt not supported.");
        }
        try {
            return this.c.a(bArr, this.a, this.b).c(abstractC8399dkd, c8404dki);
        } catch (MslEncoderException e) {
            throw new MslCryptoException(C8373dje.a, e);
        }
    }

    @Override // o.AbstractC8393djy
    public byte[] e(byte[] bArr, AbstractC8399dkd abstractC8399dkd) {
        InterfaceC8394djz interfaceC8394djz = this.c;
        if (interfaceC8394djz == null || !interfaceC8394djz.d()) {
            throw new MslCryptoException(C8373dje.j, "No encryptor configured, or decrypt not supported.");
        }
        try {
            return this.c.a(new MslCiphertextEnvelope(abstractC8399dkd.c(bArr)));
        } catch (MslEncodingException | MslEncoderException e) {
            throw new MslCryptoException(C8373dje.d, e);
        }
    }

    @Override // o.AbstractC8393djy
    public byte[] b(byte[] bArr, AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        djE dje = this.e;
        if (dje == null) {
            throw new MslCryptoException(C8373dje.bR, "No signer configured.");
        }
        try {
            return dje.c(bArr).a(abstractC8399dkd, c8404dki);
        } catch (MslEncoderException e) {
            throw new MslCryptoException(C8373dje.bL, e);
        }
    }

    @Override // o.AbstractC8393djy
    public boolean b(byte[] bArr, byte[] bArr2, AbstractC8399dkd abstractC8399dkd) {
        if (this.e == null) {
            throw new MslCryptoException(C8373dje.dl, "No signer configured.");
        }
        try {
            return this.e.c(bArr, MslSignatureEnvelope.c(bArr2, abstractC8399dkd));
        } catch (MslEncodingException e) {
            throw new MslCryptoException(C8373dje.bT, e);
        }
    }
}
