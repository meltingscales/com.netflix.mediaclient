package o;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.dib  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8343dib {
    private byte[] a;
    private int b;
    private byte[] c;
    private HMac d;
    private int e;

    public C8343dib(Digest digest) {
        this.d = new HMac(digest);
        this.b = digest.getDigestSize();
    }

    public void d(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof C8346die)) {
            throw new IllegalArgumentException("HKDF parameters required for HKDFBytesGenerator");
        }
        C8346die c8346die = (C8346die) derivationParameters;
        if (c8346die.d()) {
            this.d.init(new KeyParameter(c8346die.b()));
        } else {
            this.d.init(e(c8346die.a(), c8346die.b()));
        }
        this.c = c8346die.c();
        this.e = 0;
        this.a = new byte[this.b];
    }

    private KeyParameter e(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            this.d.init(new KeyParameter(new byte[this.b]));
        } else {
            this.d.init(new KeyParameter(bArr));
        }
        this.d.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = new byte[this.b];
        this.d.doFinal(bArr3, 0);
        return new KeyParameter(bArr3);
    }

    private void a() {
        int i = this.e;
        int i2 = this.b;
        int i3 = (i / i2) + 1;
        if (i3 >= 256) {
            throw new DataLengthException("HKDF cannot generate more than 255 blocks of HashLen size");
        }
        if (i != 0) {
            this.d.update(this.a, 0, i2);
        }
        HMac hMac = this.d;
        byte[] bArr = this.c;
        hMac.update(bArr, 0, bArr.length);
        this.d.update((byte) i3);
        this.d.doFinal(this.a, 0);
    }

    public int c(byte[] bArr, int i, int i2) {
        int i3 = this.e;
        int i4 = this.b;
        if (i3 + i2 > i4 * PrivateKeyType.INVALID) {
            throw new DataLengthException("HKDF may only be used for 255 * HashLen bytes of output");
        }
        if (i3 % i4 == 0) {
            a();
        }
        int i5 = this.e;
        int i6 = this.b;
        int i7 = i5 % i6;
        int min = Math.min(i6 - i7, i2);
        System.arraycopy(this.a, i7, bArr, i, min);
        this.e += min;
        int i8 = i2 - min;
        while (true) {
            i += min;
            if (i8 <= 0) {
                return i2;
            }
            a();
            min = Math.min(this.b, i8);
            System.arraycopy(this.a, 0, bArr, i, min);
            this.e += min;
            i8 -= min;
        }
    }
}
