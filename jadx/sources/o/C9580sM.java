package o;

import org.chromium.net.PrivateKeyType;

/* renamed from: o.sM  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9580sM {
    public int a;
    public int b;
    public int e;

    public static void e(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    public static int e(int i) {
        C9579sL c9579sL = C9579sL.e;
        return ((c9579sL.d[0][(i >>> 24) & PrivateKeyType.INVALID] + c9579sL.d[1][(i >>> 16) & PrivateKeyType.INVALID]) ^ c9579sL.d[2][(i >>> 8) & PrivateKeyType.INVALID]) + c9579sL.d[3][i & PrivateKeyType.INVALID];
    }
}
