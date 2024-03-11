package o;

import kotlin.KotlinNothingValueException;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes5.dex */
public final class duA {
    public static final byte a(String str) {
        C8632dsu.c((Object) str, "");
        dpF b = b(str);
        if (b != null) {
            return b.c();
        }
        C8689dux.o(str);
        throw new KotlinNothingValueException();
    }

    public static final short i(String str) {
        C8632dsu.c((Object) str, "");
        dpO j = j(str);
        if (j != null) {
            return j.c();
        }
        C8689dux.o(str);
        throw new KotlinNothingValueException();
    }

    public static final int d(String str) {
        C8632dsu.c((Object) str, "");
        dpJ c = c(str);
        if (c != null) {
            return c.a();
        }
        C8689dux.o(str);
        throw new KotlinNothingValueException();
    }

    public static final long e(String str) {
        C8632dsu.c((Object) str, "");
        dpL h = h(str);
        if (h != null) {
            return h.a();
        }
        C8689dux.o(str);
        throw new KotlinNothingValueException();
    }

    public static final dpF b(String str) {
        C8632dsu.c((Object) str, "");
        return a(str, 10);
    }

    public static final dpF a(String str, int i) {
        int compare;
        C8632dsu.c((Object) str, "");
        dpJ b = b(str, i);
        if (b != null) {
            int a = b.a();
            compare = Integer.compare(a ^ Integer.MIN_VALUE, dpJ.c(PrivateKeyType.INVALID) ^ Integer.MIN_VALUE);
            if (compare > 0) {
                return null;
            }
            return dpF.e(dpF.a((byte) a));
        }
        return null;
    }

    public static final dpO j(String str) {
        C8632dsu.c((Object) str, "");
        return e(str, 10);
    }

    public static final dpO e(String str, int i) {
        int compare;
        C8632dsu.c((Object) str, "");
        dpJ b = b(str, i);
        if (b != null) {
            int a = b.a();
            compare = Integer.compare(a ^ Integer.MIN_VALUE, dpJ.c(65535) ^ Integer.MIN_VALUE);
            if (compare > 0) {
                return null;
            }
            return dpO.a(dpO.c((short) a));
        }
        return null;
    }

    public static final dpJ c(String str) {
        C8632dsu.c((Object) str, "");
        return b(str, 10);
    }

    public static final dpJ b(String str, int i) {
        int i2;
        int compare;
        int compare2;
        int compare3;
        C8632dsu.c((Object) str, "");
        C8672dug.c(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        if (C8632dsu.d(charAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i2 = 0;
        }
        int c = dpJ.c(i);
        int i4 = 119304647;
        while (i2 < length) {
            int d = C8672dug.d(str.charAt(i2), i);
            if (d < 0) {
                return null;
            }
            compare = Integer.compare(i3 ^ Integer.MIN_VALUE, i4 ^ Integer.MIN_VALUE);
            if (compare > 0) {
                if (i4 == 119304647) {
                    i4 = dpE.b(-1, c);
                    compare3 = Integer.compare(i3 ^ Integer.MIN_VALUE, i4 ^ Integer.MIN_VALUE);
                    if (compare3 > 0) {
                    }
                }
                return null;
            }
            int c2 = dpJ.c(i3 * c);
            int c3 = dpJ.c(dpJ.c(d) + c2);
            compare2 = Integer.compare(c3 ^ Integer.MIN_VALUE, c2 ^ Integer.MIN_VALUE);
            if (compare2 < 0) {
                return null;
            }
            i2++;
            i3 = c3;
        }
        return dpJ.a(i3);
    }

    public static final dpL h(String str) {
        C8632dsu.c((Object) str, "");
        return d(str, 10);
    }

    public static final dpL d(String str, int i) {
        int d;
        int compare;
        int compare2;
        int compare3;
        C8632dsu.c((Object) str, "");
        C8672dug.c(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        if (C8632dsu.d(charAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long b = dpL.b(i);
        long j = 0;
        long j2 = 512409557603043100L;
        while (i2 < length) {
            if (C8672dug.d(str.charAt(i2), i) < 0) {
                return null;
            }
            compare = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
            if (compare > 0) {
                if (j2 == 512409557603043100L) {
                    j2 = dpG.e(-1L, b);
                    compare3 = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
                    if (compare3 > 0) {
                    }
                }
                return null;
            }
            long b2 = dpL.b(j * b);
            long b3 = dpL.b(dpL.b(dpJ.c(d) & 4294967295L) + b2);
            compare2 = Long.compare(b3 ^ Long.MIN_VALUE, b2 ^ Long.MIN_VALUE);
            if (compare2 < 0) {
                return null;
            }
            i2++;
            j = b3;
        }
        return dpL.e(j);
    }
}
