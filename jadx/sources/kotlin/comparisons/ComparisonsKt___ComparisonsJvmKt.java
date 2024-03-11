package kotlin.comparisons;

import o.C8632dsu;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ComparisonsKt___ComparisonsJvmKt extends ComparisonsKt__ComparisonsKt {
    public static <T extends Comparable<? super T>> T maxOf(T t, T t2) {
        C8632dsu.c((Object) t, "");
        C8632dsu.c((Object) t2, "");
        return t.compareTo(t2) >= 0 ? t : t2;
    }

    public static final <T extends Comparable<? super T>> T maxOf(T t, T t2, T t3) {
        C8632dsu.c((Object) t, "");
        C8632dsu.c((Object) t2, "");
        C8632dsu.c((Object) t3, "");
        return (T) ComparisonsKt.maxOf(t, ComparisonsKt.maxOf(t2, t3));
    }

    public static final <T extends Comparable<? super T>> T maxOf(T t, T... tArr) {
        C8632dsu.c((Object) t, "");
        C8632dsu.c((Object) tArr, "");
        for (T t2 : tArr) {
            t = (T) ComparisonsKt.maxOf(t, t2);
        }
        return t;
    }

    public static final byte maxOf(byte b, byte... bArr) {
        C8632dsu.c((Object) bArr, "");
        for (byte b2 : bArr) {
            b = (byte) Math.max((int) b, (int) b2);
        }
        return b;
    }

    public static final short maxOf(short s, short... sArr) {
        C8632dsu.c((Object) sArr, "");
        for (short s2 : sArr) {
            s = (short) Math.max((int) s, (int) s2);
        }
        return s;
    }

    public static int maxOf(int i, int... iArr) {
        C8632dsu.c((Object) iArr, "");
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        return i;
    }

    public static final long maxOf(long j, long... jArr) {
        C8632dsu.c((Object) jArr, "");
        for (long j2 : jArr) {
            j = Math.max(j, j2);
        }
        return j;
    }

    public static float maxOf(float f, float... fArr) {
        C8632dsu.c((Object) fArr, "");
        for (float f2 : fArr) {
            f = Math.max(f, f2);
        }
        return f;
    }

    public static final double maxOf(double d, double... dArr) {
        C8632dsu.c((Object) dArr, "");
        for (double d2 : dArr) {
            d = Math.max(d, d2);
        }
        return d;
    }

    public static final <T extends Comparable<? super T>> T minOf(T t, T t2) {
        C8632dsu.c((Object) t, "");
        C8632dsu.c((Object) t2, "");
        return t.compareTo(t2) <= 0 ? t : t2;
    }

    public static final <T extends Comparable<? super T>> T minOf(T t, T t2, T t3) {
        C8632dsu.c((Object) t, "");
        C8632dsu.c((Object) t2, "");
        C8632dsu.c((Object) t3, "");
        return (T) minOf(t, minOf(t2, t3));
    }

    public static final <T extends Comparable<? super T>> T minOf(T t, T... tArr) {
        C8632dsu.c((Object) t, "");
        C8632dsu.c((Object) tArr, "");
        for (T t2 : tArr) {
            t = (T) minOf(t, t2);
        }
        return t;
    }

    public static final byte minOf(byte b, byte... bArr) {
        C8632dsu.c((Object) bArr, "");
        for (byte b2 : bArr) {
            b = (byte) Math.min((int) b, (int) b2);
        }
        return b;
    }

    public static final short minOf(short s, short... sArr) {
        C8632dsu.c((Object) sArr, "");
        for (short s2 : sArr) {
            s = (short) Math.min((int) s, (int) s2);
        }
        return s;
    }

    public static final int minOf(int i, int... iArr) {
        C8632dsu.c((Object) iArr, "");
        for (int i2 : iArr) {
            i = Math.min(i, i2);
        }
        return i;
    }

    public static final long minOf(long j, long... jArr) {
        C8632dsu.c((Object) jArr, "");
        for (long j2 : jArr) {
            j = Math.min(j, j2);
        }
        return j;
    }

    public static float minOf(float f, float... fArr) {
        C8632dsu.c((Object) fArr, "");
        for (float f2 : fArr) {
            f = Math.min(f, f2);
        }
        return f;
    }

    public static final double minOf(double d, double... dArr) {
        C8632dsu.c((Object) dArr, "");
        for (double d2 : dArr) {
            d = Math.min(d, d2);
        }
        return d;
    }
}
