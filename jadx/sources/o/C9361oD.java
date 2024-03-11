package o;

import androidx.emoji2.text.flatbuffer.Utf8Old$$ExternalSyntheticThreadLocal1;
import java.util.function.Supplier;

/* renamed from: o.oD  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9361oD {
    private static final ThreadLocal<C9361oD> c = new Utf8Old$$ExternalSyntheticThreadLocal1(new Supplier() { // from class: o.oz
        @Override // java.util.function.Supplier
        public final Object get() {
            return C9361oD.c();
        }
    });
    private int e;
    public final int a = 24;
    private final byte[] d = new byte[24];
    private final char[] b = new char[24];

    public static /* synthetic */ C9361oD c() {
        return new C9361oD();
    }

    private C9361oD() {
    }

    public static String c(double d) {
        return d().d(d);
    }

    private static C9361oD d() {
        return c.get();
    }

    private String d(double d) {
        int e = e(d);
        if (e != 0) {
            return e != 1 ? e != 2 ? e != 3 ? e != 4 ? "NaN" : "-Infinity" : "Infinity" : "-0.0" : "0.0";
        }
        return a();
    }

    private int e(double d) {
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        long j = 4503599627370495L & doubleToRawLongBits;
        int i = ((int) (doubleToRawLongBits >>> 52)) & 2047;
        if (i >= 2047) {
            if (j != 0) {
                return 5;
            }
            return doubleToRawLongBits > 0 ? 3 : 4;
        }
        this.e = -1;
        int i2 = (doubleToRawLongBits > 0L ? 1 : (doubleToRawLongBits == 0L ? 0 : -1));
        if (i2 < 0) {
            d(45);
        }
        if (i == 0) {
            if (j == 0) {
                return i2 == 0 ? 1 : 2;
            } else if (j < 3) {
                return d(-1074, j * 10, -1);
            } else {
                return d(-1074, j, 0);
            }
        }
        int i3 = 1075 - i;
        long j2 = j | 4503599627370496L;
        if ((i3 < 53) & (i3 > 0)) {
            long j3 = j2 >> i3;
            if ((j3 << i3) == j2) {
                return c(j3, 0);
            }
        }
        return d(-i3, j2, 0);
    }

    private int d(int i, long j, int i2) {
        long j2;
        int d;
        long j3;
        long j4;
        int i3 = ((int) j) & 1;
        long j5 = j << 2;
        if ((j != 4503599627370496L) | (i == -1074)) {
            j2 = j5 - 2;
            d = C9363oF.e(i);
        } else {
            j2 = j5 - 1;
            d = C9363oF.d(i);
        }
        int a = i + C9363oF.a(-d) + 2;
        long c2 = C9363oF.c(d);
        long b = C9363oF.b(d);
        long a2 = a(c2, b, j5 << a);
        long a3 = a(c2, b, j2 << a);
        long a4 = a(c2, b, (j5 + 2) << a);
        long j6 = a2 >> 2;
        if (j6 >= 100) {
            long b2 = C9363oF.b(j6, 1844674407370955168L) * 10;
            long j7 = 10 + b2;
            j3 = j6;
            long j8 = i3;
            boolean z = a3 + j8 <= (b2 << 2);
            if (z != ((j7 << 2) + j8 <= a4)) {
                if (!z) {
                    b2 = j7;
                }
                return c(b2, d);
            }
            j4 = 1;
        } else {
            j3 = j6;
            j4 = 1;
        }
        long j9 = j3 + j4;
        long j10 = i3;
        boolean z2 = a3 + j10 <= (j3 << 2);
        if (z2 != ((j9 << 2) + j10 <= a4)) {
            return c(z2 ? j3 : j9, d + i2);
        }
        int i4 = ((a2 - ((j3 + j9) << 1)) > 0L ? 1 : ((a2 - ((j3 + j9) << 1)) == 0L ? 0 : -1));
        return c((i4 < 0 || (i4 == 0 && (j3 & 1) == 0)) ? j3 : j9, d + i2);
    }

    private static long a(long j, long j2, long j3) {
        long b = C9363oF.b(j2, j3);
        long b2 = C9363oF.b(j, j3);
        long j4 = ((j * j3) >>> 1) + b;
        return (((j4 & Long.MAX_VALUE) + Long.MAX_VALUE) >>> 63) | (b2 + (j4 >>> 63));
    }

    private int c(long j, int i) {
        int e = C9363oF.e(64 - Long.numberOfLeadingZeros(j));
        if (j >= C9363oF.h(e)) {
            e++;
        }
        long h = j * C9363oF.h(17 - e);
        int i2 = i + e;
        long b = C9363oF.b(h, 193428131138340668L) >>> 20;
        int i3 = (int) (h - (100000000 * b));
        int i4 = (int) ((1441151881 * b) >>> 57);
        int i5 = (int) (b - (100000000 * i4));
        if (i2 <= 0 || i2 > 7) {
            if (-3 < i2 && i2 <= 0) {
                return d(i4, i5, i3, i2);
            }
            return b(i4, i5, i3, i2);
        }
        return c(i4, i5, i3, i2);
    }

    private int c(int i, int i2, int i3, int i4) {
        e(i);
        int f = f(i2);
        int i5 = 1;
        while (i5 < i4) {
            int i6 = f * 10;
            e(i6 >>> 28);
            f = i6 & 268435455;
            i5++;
        }
        d(46);
        while (i5 <= 8) {
            int i7 = f * 10;
            e(i7 >>> 28);
            f = i7 & 268435455;
            i5++;
        }
        c(i3);
        return 0;
    }

    private int d(int i, int i2, int i3, int i4) {
        e(0);
        d(46);
        while (i4 < 0) {
            e(0);
            i4++;
        }
        e(i);
        b(i2);
        c(i3);
        return 0;
    }

    private int b(int i, int i2, int i3, int i4) {
        e(i);
        d(46);
        b(i2);
        c(i3);
        a(i4 - 1);
        return 0;
    }

    private void c(int i) {
        if (i != 0) {
            b(i);
        }
        e();
    }

    private void b(int i) {
        int f = f(i);
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = f * 10;
            e(i3 >>> 28);
            f = i3 & 268435455;
        }
    }

    private void e() {
        int i;
        byte b;
        while (true) {
            byte[] bArr = this.d;
            i = this.e;
            b = bArr[i];
            if (b != 48) {
                break;
            }
            this.e = i - 1;
        }
        if (b == 46) {
            this.e = i + 1;
        }
    }

    private int f(int i) {
        return ((int) (C9363oF.b((i + 1) << 28, 193428131138340668L) >>> 20)) - 1;
    }

    private void a(int i) {
        d(69);
        if (i < 0) {
            d(45);
            i = -i;
        }
        if (i < 10) {
            e(i);
            return;
        }
        if (i >= 100) {
            int i2 = (i * 1311) >>> 17;
            e(i2);
            i -= i2 * 100;
        }
        int i3 = (i * 103) >>> 10;
        e(i3);
        e(i - (i3 * 10));
    }

    private void d(int i) {
        byte[] bArr = this.d;
        int i2 = this.e + 1;
        this.e = i2;
        bArr[i2] = (byte) i;
    }

    private void e(int i) {
        byte[] bArr = this.d;
        int i2 = this.e + 1;
        this.e = i2;
        bArr[i2] = (byte) (i + 48);
    }

    private String a() {
        return new String(this.d, 0, 0, this.e + 1);
    }
}
