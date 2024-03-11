package o;

import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.util.Arrays;

/* renamed from: o.die  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8346die implements DerivationParameters {
    private final byte[] a;
    private final boolean b;
    private final byte[] c;
    private final byte[] e;

    public boolean d() {
        return this.b;
    }

    private C8346die(byte[] bArr, boolean z, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            throw new IllegalArgumentException("IKM (input keying material) should not be null");
        }
        this.c = Arrays.clone(bArr);
        this.b = z;
        if (bArr2 == null || bArr2.length == 0) {
            this.a = null;
        } else {
            this.a = Arrays.clone(bArr2);
        }
        if (bArr3 == null) {
            this.e = new byte[0];
        } else {
            this.e = Arrays.clone(bArr3);
        }
    }

    public C8346die(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this(bArr, false, bArr2, bArr3);
    }

    public byte[] b() {
        return Arrays.clone(this.c);
    }

    public byte[] a() {
        return Arrays.clone(this.a);
    }

    public byte[] c() {
        return Arrays.clone(this.e);
    }
}
