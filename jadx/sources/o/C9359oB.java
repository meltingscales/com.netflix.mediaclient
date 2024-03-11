package o;

import androidx.emoji2.text.flatbuffer.Utf8Old$$ExternalSyntheticThreadLocal1;
import java.util.function.Supplier;
import org.chromium.net.NetError;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.oB  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9359oB {
    private static final ThreadLocal<C9359oB> b = new Utf8Old$$ExternalSyntheticThreadLocal1(new Supplier() { // from class: o.oC
        @Override // java.util.function.Supplier
        public final Object get() {
            return C9359oB.c();
        }
    });
    private int e;
    public final int a = 15;
    private final byte[] d = new byte[15];
    private final char[] c = new char[15];

    public static /* synthetic */ C9359oB c() {
        return new C9359oB();
    }

    private C9359oB() {
    }

    public static String d(float f) {
        return d().b(f);
    }

    private static C9359oB d() {
        return b.get();
    }

    private String b(float f) {
        int e = e(f);
        if (e != 0) {
            return e != 1 ? e != 2 ? e != 3 ? e != 4 ? "NaN" : "-Infinity" : "Infinity" : "-0.0" : "0.0";
        }
        return e();
    }

    private int e(float f) {
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        int i = 8388607 & floatToRawIntBits;
        int i2 = (floatToRawIntBits >>> 23) & PrivateKeyType.INVALID;
        if (i2 >= 255) {
            if (i != 0) {
                return 5;
            }
            return floatToRawIntBits > 0 ? 3 : 4;
        }
        this.e = -1;
        if (floatToRawIntBits < 0) {
            e(45);
        }
        if (i2 == 0) {
            if (i == 0) {
                return floatToRawIntBits == 0 ? 1 : 2;
            } else if (i < 8) {
                return b(NetError.ERR_SSL_BAD_PEER_PUBLIC_KEY, i * 10, -1);
            } else {
                return b(NetError.ERR_SSL_BAD_PEER_PUBLIC_KEY, i, 0);
            }
        }
        int i3 = 150 - i2;
        int i4 = i | 8388608;
        if ((i3 > 0) & (i3 < 24)) {
            int i5 = i4 >> i3;
            if ((i5 << i3) == i4) {
                return c(i5, 0);
            }
        }
        return b(-i3, i4, 0);
    }

    private int b(int i, int i2, int i3) {
        long j;
        int d;
        int i4 = i2 & 1;
        long j2 = i2 << 2;
        if ((i2 != 8388608) | (i == -149)) {
            j = j2 - 2;
            d = C9363oF.e(i);
        } else {
            j = j2 - 1;
            d = C9363oF.d(i);
        }
        int a = i + C9363oF.a(-d) + 33;
        long c = 1 + C9363oF.c(d);
        int d2 = d(c, j2 << a);
        int d3 = d(c, j << a);
        int d4 = d(c, (j2 + 2) << a);
        int i5 = d2 >> 2;
        if (i5 >= 100) {
            int i6 = ((int) ((i5 * 1717986919) >>> 34)) * 10;
            int i7 = i6 + 10;
            boolean z = d3 + i4 <= (i6 << 2);
            if (z != ((i7 << 2) + i4 <= d4)) {
                if (!z) {
                    i6 = i7;
                }
                return c(i6, d);
            }
        }
        int i8 = i5 + 1;
        boolean z2 = d3 + i4 <= (i5 << 2);
        if (z2 != ((i8 << 2) + i4 <= d4)) {
            if (!z2) {
                i5 = i8;
            }
            return c(i5, d + i3);
        }
        int i9 = d2 - ((i5 + i8) << 1);
        if (i9 >= 0 && (i9 != 0 || (i5 & 1) != 0)) {
            i5 = i8;
        }
        return c(i5, d + i3);
    }

    private static int d(long j, long j2) {
        long b2 = C9363oF.b(j, j2);
        return (int) ((b2 >>> 31) | (((b2 & 4294967295L) + 4294967295L) >>> 32));
    }

    private int c(int i, int i2) {
        int e = C9363oF.e(32 - Integer.numberOfLeadingZeros(i));
        long j = i;
        if (j >= C9363oF.h(e)) {
            e++;
        }
        int h = (int) (j * C9363oF.h(9 - e));
        int i3 = i2 + e;
        int i4 = (int) ((h * 1441151881) >>> 57);
        int i5 = h - (100000000 * i4);
        if (i3 <= 0 || i3 > 7) {
            if (-3 < i3 && i3 <= 0) {
                return e(i4, i5, i3);
            }
            return c(i4, i5, i3);
        }
        return d(i4, i5, i3);
    }

    private int d(int i, int i2, int i3) {
        b(i);
        int a = a(i2);
        int i4 = 1;
        while (i4 < i3) {
            int i5 = a * 10;
            b(i5 >>> 28);
            a = i5 & 268435455;
            i4++;
        }
        e(46);
        while (i4 <= 8) {
            int i6 = a * 10;
            b(i6 >>> 28);
            a = i6 & 268435455;
            i4++;
        }
        b();
        return 0;
    }

    private int e(int i, int i2, int i3) {
        b(0);
        e(46);
        while (i3 < 0) {
            b(0);
            i3++;
        }
        b(i);
        c(i2);
        b();
        return 0;
    }

    private int c(int i, int i2, int i3) {
        b(i);
        e(46);
        c(i2);
        b();
        d(i3 - 1);
        return 0;
    }

    private void c(int i) {
        int a = a(i);
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = a * 10;
            b(i3 >>> 28);
            a = i3 & 268435455;
        }
    }

    private void b() {
        int i;
        byte b2;
        while (true) {
            byte[] bArr = this.d;
            i = this.e;
            b2 = bArr[i];
            if (b2 != 48) {
                break;
            }
            this.e = i - 1;
        }
        if (b2 == 46) {
            this.e = i + 1;
        }
    }

    private int a(int i) {
        return ((int) (C9363oF.b((i + 1) << 28, 193428131138340668L) >>> 20)) - 1;
    }

    private void d(int i) {
        e(69);
        if (i < 0) {
            e(45);
            i = -i;
        }
        if (i < 10) {
            b(i);
            return;
        }
        int i2 = (i * 103) >>> 10;
        b(i2);
        b(i - (i2 * 10));
    }

    private void e(int i) {
        byte[] bArr = this.d;
        int i2 = this.e + 1;
        this.e = i2;
        bArr[i2] = (byte) i;
    }

    private void b(int i) {
        byte[] bArr = this.d;
        int i2 = this.e + 1;
        this.e = i2;
        bArr[i2] = (byte) (i + 48);
    }

    private String e() {
        return new String(this.d, 0, 0, this.e + 1);
    }
}
