package o;

import org.chromium.net.PrivateKeyType;

/* renamed from: o.dIi  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7868dIi {
    public static final int e(int i) {
        return ((i & 65280) << 8) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((i & PrivateKeyType.INVALID) << 24);
    }

    public static final short e(short s) {
        return (short) (((s & 65280) >>> 8) | ((s & 255) << 8));
    }

    public static final void a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    public static final boolean e(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        C8632dsu.c((Object) bArr, "");
        C8632dsu.c((Object) bArr2, "");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final String d(byte b) {
        return new String(new char[]{dIN.b()[(b >> 4) & 15], dIN.b()[b & 15]});
    }

    public static final String b(int i) {
        if (i == 0) {
            return "0";
        }
        int i2 = 0;
        char[] cArr = {dIN.b()[(i >> 28) & 15], dIN.b()[(i >> 24) & 15], dIN.b()[(i >> 20) & 15], dIN.b()[(i >> 16) & 15], dIN.b()[(i >> 12) & 15], dIN.b()[(i >> 8) & 15], dIN.b()[(i >> 4) & 15], dIN.b()[i & 15]};
        while (i2 < 8 && cArr[i2] == '0') {
            i2++;
        }
        return new String(cArr, i2, 8 - i2);
    }
}
