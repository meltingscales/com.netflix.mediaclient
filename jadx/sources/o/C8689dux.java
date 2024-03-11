package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dux  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8689dux extends C8690duy {
    public static Integer n(String str) {
        C8632dsu.c((Object) str, "");
        return a(str, 10);
    }

    public static final Integer a(String str, int i) {
        int i2;
        boolean z;
        int i3;
        C8632dsu.c((Object) str, "");
        C8672dug.c(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char charAt = str.charAt(0);
        int i5 = -2147483647;
        if (C8632dsu.d(charAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                i5 = Integer.MIN_VALUE;
                i2 = 1;
            } else if (charAt != '+') {
                return null;
            } else {
                i2 = 1;
                z = false;
            }
        } else {
            i2 = 0;
            z = false;
        }
        int i6 = -59652323;
        while (i2 < length) {
            int d = C8672dug.d(str.charAt(i2), i);
            if (d < 0) {
                return null;
            }
            if ((i4 < i6 && (i6 != -59652323 || i4 < (i6 = i5 / i))) || (i3 = i4 * i) < i5 + d) {
                return null;
            }
            i4 = i3 - d;
            i2++;
        }
        return z ? Integer.valueOf(i4) : Integer.valueOf(-i4);
    }

    public static Long m(String str) {
        C8632dsu.c((Object) str, "");
        return b(str, 10);
    }

    public static final Long b(String str, int i) {
        boolean z;
        C8632dsu.c((Object) str, "");
        C8672dug.c(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (C8632dsu.d(charAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j = Long.MIN_VALUE;
                i2 = 1;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
                i2 = 1;
            }
        } else {
            z = false;
        }
        long j2 = -256204778801521550L;
        long j3 = 0;
        long j4 = -256204778801521550L;
        while (i2 < length) {
            int d = C8672dug.d(str.charAt(i2), i);
            if (d < 0) {
                return null;
            }
            if (j3 < j4) {
                if (j4 == j2) {
                    j4 = j / i;
                    if (j3 < j4) {
                    }
                }
                return null;
            }
            long j5 = j3 * i;
            long j6 = d;
            if (j5 < j + j6) {
                return null;
            }
            j3 = j5 - j6;
            i2++;
            j2 = -256204778801521550L;
        }
        return z ? Long.valueOf(j3) : Long.valueOf(-j3);
    }

    public static final Void o(String str) {
        C8632dsu.c((Object) str, "");
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }
}
