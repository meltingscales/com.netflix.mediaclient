package o;

import com.netflix.msl.MslCryptoException;
import com.netflix.msl.MslEncodingException;
import com.netflix.msl.MslInternalException;
import com.netflix.msl.crypto.MslCiphertextEnvelope;
import com.netflix.msl.crypto.MslSignatureEnvelope;
import com.netflix.msl.io.MslEncoderException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* renamed from: o.dju  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC8389dju extends AbstractC8393djy {
    private final String a;
    protected final PrivateKey b;
    protected final PublicKey c;
    protected final String d;
    private final AlgorithmParameterSpec e;
    private final String f;

    public AbstractC8389dju(String str, PrivateKey privateKey, PublicKey publicKey, String str2, AlgorithmParameterSpec algorithmParameterSpec, String str3) {
        this.d = str;
        this.b = privateKey;
        this.c = publicKey;
        this.f = str2;
        this.e = algorithmParameterSpec;
        this.a = str3;
    }

    @Override // o.AbstractC8393djy
    public byte[] a(byte[] bArr, AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        if ("nullOp".equals(this.f)) {
            return bArr;
        }
        if (this.c == null) {
            throw new MslCryptoException(C8373dje.k, "no public key");
        }
        try {
            try {
                try {
                    try {
                        try {
                            Cipher e = djA.e(this.f);
                            e.init(1, this.c, this.e);
                            return new MslCiphertextEnvelope(this.d, (byte[]) null, e.doFinal(bArr)).c(abstractC8399dkd, c8404dki);
                        } catch (BadPaddingException e2) {
                            throw new MslCryptoException(C8373dje.bu, "not expected when encrypting", e2);
                        } catch (NoSuchPaddingException e3) {
                            throw new MslInternalException("Unsupported padding exception.", e3);
                        }
                    } catch (RuntimeException e4) {
                        throw e4;
                    } catch (InvalidKeyException e5) {
                        throw new MslCryptoException(C8373dje.T, e5);
                    }
                } catch (InvalidAlgorithmParameterException e6) {
                    throw new MslCryptoException(C8373dje.N, e6);
                } catch (NoSuchAlgorithmException e7) {
                    throw new MslInternalException("Invalid cipher algorithm specified.", e7);
                }
            } catch (MslEncoderException e8) {
                throw new MslCryptoException(C8373dje.a, e8);
            } catch (IllegalBlockSizeException e9) {
                throw new MslCryptoException(C8373dje.br, "not expected when padding is specified", e9);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                djA.c(this.f);
            }
            throw th;
        }
    }

    @Override // o.AbstractC8393djy
    public byte[] e(byte[] bArr, AbstractC8399dkd abstractC8399dkd) {
        if ("nullOp".equals(this.f)) {
            return bArr;
        }
        if (this.b == null) {
            throw new MslCryptoException(C8373dje.j, "no private key");
        }
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        MslCiphertextEnvelope mslCiphertextEnvelope = new MslCiphertextEnvelope(abstractC8399dkd.c(bArr), MslCiphertextEnvelope.Version.V1);
                                        Cipher e = djA.e(this.f);
                                        e.init(2, this.b, this.e);
                                        return e.doFinal(mslCiphertextEnvelope.c());
                                    } catch (MslEncodingException e2) {
                                        throw new MslCryptoException(C8373dje.d, e2);
                                    } catch (NoSuchPaddingException e3) {
                                        throw new MslInternalException("Unsupported padding exception.", e3);
                                    }
                                } catch (InvalidKeyException e4) {
                                    throw new MslCryptoException(C8373dje.W, e4);
                                } catch (NoSuchAlgorithmException e5) {
                                    throw new MslInternalException("Invalid cipher algorithm specified.", e5);
                                }
                            } catch (InvalidAlgorithmParameterException e6) {
                                throw new MslCryptoException(C8373dje.N, e6);
                            }
                        } catch (BadPaddingException e7) {
                            throw new MslCryptoException(C8373dje.c, e7);
                        }
                    } catch (IllegalBlockSizeException e8) {
                        throw new MslCryptoException(C8373dje.e, e8);
                    }
                } catch (MslEncoderException e9) {
                    throw new MslCryptoException(C8373dje.d, e9);
                }
            } catch (RuntimeException e10) {
                throw e10;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                djA.c(this.f);
            }
            throw th;
        }
    }

    @Override // o.AbstractC8393djy
    public byte[] b(byte[] bArr, AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        if ("nullOp".equals(this.a)) {
            return new byte[0];
        }
        if (this.b == null) {
            throw new MslCryptoException(C8373dje.bR, "no private key.");
        }
        try {
            Signature d = djA.d(this.a);
            d.initSign(this.b);
            d.update(bArr);
            return new MslSignatureEnvelope(d.sign()).a(abstractC8399dkd, c8404dki);
        } catch (MslEncoderException e) {
            throw new MslCryptoException(C8373dje.bL, e);
        } catch (InvalidKeyException e2) {
            throw new MslCryptoException(C8373dje.W, e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new MslInternalException("Invalid signature algorithm specified.", e3);
        } catch (SignatureException e4) {
            throw new MslCryptoException(C8373dje.bS, e4);
        }
    }

    @Override // o.AbstractC8393djy
    public boolean b(byte[] bArr, byte[] bArr2, AbstractC8399dkd abstractC8399dkd) {
        if ("nullOp".equals(this.a)) {
            return true;
        }
        if (this.c == null) {
            throw new MslCryptoException(C8373dje.dl, "no public key.");
        }
        try {
            MslSignatureEnvelope c = MslSignatureEnvelope.c(bArr2, abstractC8399dkd);
            Signature d = djA.d(this.a);
            d.initVerify(this.c);
            d.update(bArr);
            return d.verify(c.d());
        } catch (MslEncodingException e) {
            throw new MslCryptoException(C8373dje.bT, e);
        } catch (InvalidKeyException e2) {
            throw new MslCryptoException(C8373dje.T, e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new MslInternalException("Invalid signature algorithm specified.", e3);
        } catch (SignatureException e4) {
            throw new MslCryptoException(C8373dje.bS, e4);
        }
    }
}
