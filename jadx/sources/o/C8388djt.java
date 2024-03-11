package o;

import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.msl.MslConstants;
import com.netflix.msl.MslCryptoException;
import com.netflix.msl.MslInternalException;
import com.netflix.msl.crypto.MslCiphertextEnvelope;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: o.djt  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8388djt implements InterfaceC8394djz {
    private static final byte[] c = {-90, -90, -90, -90, -90, -90, -90, -90};
    protected final Random a;
    protected final SecretKey b;
    protected final SecretKey d;

    @Override // o.InterfaceC8394djz
    public boolean d() {
        return this.b != null;
    }

    public C8388djt(Random random, SecretKey secretKey, SecretKey secretKey2) {
        if (secretKey != null && !secretKey.getAlgorithm().equals("AES")) {
            throw new IllegalArgumentException("Encryption key must be an AES key.");
        }
        if (secretKey2 != null && !secretKey2.getAlgorithm().equals("AES")) {
            throw new IllegalArgumentException("Wrapping key must be an AES key.");
        }
        this.b = secretKey;
        this.d = secretKey2;
        this.a = random;
    }

    private byte[] e() {
        byte[] bArr = new byte[16];
        this.a.nextBytes(bArr);
        return bArr;
    }

    @Override // o.InterfaceC8394djz
    public MslCiphertextEnvelope a(byte[] bArr, MslCiphertextEnvelope.Version version, String str) {
        byte[] bArr2;
        if (!d()) {
            throw new MslCryptoException(C8373dje.k, "no encryption/decryption key");
        }
        byte[] e = e();
        try {
            if (bArr.length != 0) {
                Cipher e2 = djA.e(AleCryptoBouncyCastle.AES_CBC_PKCS5_ALGO);
                e2.init(1, this.b, new IvParameterSpec(e));
                bArr2 = e2.doFinal(bArr);
            } else {
                bArr2 = new byte[0];
            }
            if (version == MslCiphertextEnvelope.Version.V1) {
                return new MslCiphertextEnvelope(str, e, bArr2);
            }
            return new MslCiphertextEnvelope(MslConstants.CipherSpec.AES_CBC_PKCS5Padding, e, bArr2);
        } catch (InvalidAlgorithmParameterException e3) {
            throw new MslCryptoException(C8373dje.N, e3);
        } catch (InvalidKeyException e4) {
            throw new MslCryptoException(C8373dje.S, e4);
        } catch (NoSuchAlgorithmException e5) {
            throw new MslInternalException("Invalid cipher algorithm specified.", e5);
        } catch (BadPaddingException e6) {
            throw new MslCryptoException(C8373dje.bu, "not expected when encrypting", e6);
        } catch (IllegalBlockSizeException e7) {
            throw new MslCryptoException(C8373dje.br, "not expected when padding is specified", e7);
        } catch (NoSuchPaddingException e8) {
            throw new MslInternalException("Unsupported padding exception.", e8);
        }
    }

    @Override // o.InterfaceC8394djz
    public byte[] a(MslCiphertextEnvelope mslCiphertextEnvelope) {
        if (!d()) {
            throw new MslCryptoException(C8373dje.j, "no encryption/decryption key");
        }
        try {
            byte[] c2 = mslCiphertextEnvelope.c();
            if (c2.length == 0) {
                return new byte[0];
            }
            byte[] b = mslCiphertextEnvelope.b();
            Cipher e = djA.e(AleCryptoBouncyCastle.AES_CBC_PKCS5_ALGO);
            e.init(2, this.b, new IvParameterSpec(b));
            return e.doFinal(c2);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new MslCryptoException(C8373dje.f13847J, e2);
        } catch (InvalidAlgorithmParameterException e3) {
            throw new MslCryptoException(C8373dje.N, e3);
        } catch (InvalidKeyException e4) {
            throw new MslCryptoException(C8373dje.S, e4);
        } catch (NoSuchAlgorithmException e5) {
            throw new MslInternalException("Invalid cipher algorithm specified.", e5);
        } catch (BadPaddingException e6) {
            throw new MslCryptoException(C8373dje.c, e6);
        } catch (IllegalBlockSizeException e7) {
            throw new MslCryptoException(C8373dje.e, e7);
        } catch (NoSuchPaddingException e8) {
            throw new MslInternalException("Unsupported padding exception.", e8);
        }
    }
}
