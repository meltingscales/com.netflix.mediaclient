package o;

import java.util.Arrays;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes3.dex */
public final class aWH {
    private final byte[] a;
    private final byte[] d;
    private final int e;

    public aWH(byte[] bArr, int i, byte[] bArr2) {
        C8632dsu.c((Object) bArr, "");
        C8632dsu.c((Object) bArr2, "");
        this.d = bArr;
        this.e = i;
        this.a = bArr2;
    }

    public final boolean b() {
        return !(this.a.length == 0);
    }

    public final boolean b(aWH awh) {
        C8632dsu.c((Object) awh, "");
        if (b()) {
            byte[] bArr = this.d;
            if (bArr.length != 0) {
                byte[] bArr2 = awh.d;
                if (bArr2.length == 0 || Arrays.equals(bArr, bArr2)) {
                    return false;
                }
                if (awh.b()) {
                    return a(awh);
                }
                return e(awh);
            }
        }
        return false;
    }

    private final boolean e(aWH awh) {
        byte[] bArr = this.d;
        byte[] bArr2 = awh.d;
        if (bArr.length != bArr2.length) {
            return false;
        }
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            byte max = (byte) (255 & (PrivateKeyType.INVALID << (8 - Math.max(Math.min(this.e - (i * 8), 8), 0))));
            if ((bArr[i] & max) != (max & bArr2[i])) {
                return false;
            }
        }
        return true;
    }

    public final boolean a(aWH awh) {
        C8632dsu.c((Object) awh, "");
        return this.e == awh.e && Arrays.equals(this.a, awh.a);
    }
}
