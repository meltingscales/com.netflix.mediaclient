package o;

import com.netflix.ale.AleCryptoBouncyCastle;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.digests.SHA1Digest;

/* loaded from: classes3.dex */
public final class aLU implements aLT {
    private static final byte[] a = {110, 117, 50, 107, 111, 111, 66, 111, 98, 105, 101, 118, 50, 72, 97, 105};
    private SecretKey c;

    protected static String c() {
        return AleCryptoBouncyCastle.AES_GCM_NOPAD_ALGO;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aLU(InterfaceC1843aQh interfaceC1843aQh) {
        if (interfaceC1843aQh == null || interfaceC1843aQh.m() == null) {
            throw new IllegalArgumentException("ESN can not be null!");
        }
        c(interfaceC1843aQh.m());
    }

    private void c(String str) {
        this.c = new SecretKeySpec(c(str.getBytes(), a, "netflix-device-bound-store-key".getBytes(), 16), "AES");
    }

    @Override // o.aLT
    public byte[] c(byte[] bArr) {
        Cipher cipher = Cipher.getInstance(c());
        byte[] bArr2 = new byte[12];
        new SecureRandom().nextBytes(bArr2);
        cipher.init(1, this.c, new GCMParameterSpec(128, bArr2));
        byte[] doFinal = cipher.doFinal(bArr);
        byte[] bArr3 = new byte[doFinal.length + 12];
        System.arraycopy(bArr2, 0, bArr3, 0, 12);
        System.arraycopy(doFinal, 0, bArr3, 12, doFinal.length);
        return bArr3;
    }

    @Override // o.aLT
    public byte[] a(byte[] bArr) {
        Cipher cipher = Cipher.getInstance(c());
        byte[] bArr2 = new byte[12];
        int length = bArr.length - 12;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, 12);
        System.arraycopy(bArr, 12, bArr3, 0, length);
        cipher.init(2, this.c, new GCMParameterSpec(128, bArr2));
        return cipher.doFinal(bArr3);
    }

    private static byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        C8343dib c8343dib = new C8343dib(new SHA1Digest());
        c8343dib.d(new C8346die(bArr, bArr2, bArr3));
        byte[] bArr4 = new byte[i];
        c8343dib.c(bArr4, 0, i);
        return bArr4;
    }
}
