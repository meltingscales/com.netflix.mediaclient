package o;

import com.netflix.model.leafs.originals.interactive.Prefetch;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: o.oo  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9398oo {
    static final String a = String.valueOf(Long.MIN_VALUE).substring(1);
    static final String d = String.valueOf(Long.MAX_VALUE);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int e(char[] cArr, int i, int i2) {
        if (i2 > 0 && cArr[i] == '+') {
            i++;
            i2--;
        }
        int i3 = cArr[(i + i2) - 1] - '0';
        switch (i2) {
            case 2:
                break;
            case 3:
                i3 += (cArr[i] - '0') * 100;
                i++;
                break;
            case 4:
                i3 += (cArr[i] - '0') * 1000;
                i++;
                i3 += (cArr[i] - '0') * 100;
                i++;
                break;
            case 5:
                i3 += (cArr[i] - '0') * 10000;
                i++;
                i3 += (cArr[i] - '0') * 1000;
                i++;
                i3 += (cArr[i] - '0') * 100;
                i++;
                break;
            case 6:
                i3 += (cArr[i] - '0') * 100000;
                i++;
                i3 += (cArr[i] - '0') * 10000;
                i++;
                i3 += (cArr[i] - '0') * 1000;
                i++;
                i3 += (cArr[i] - '0') * 100;
                i++;
                break;
            case 7:
                i3 += (cArr[i] - '0') * Prefetch.NANOSECONDS_PER_MILLISECOND;
                i++;
                i3 += (cArr[i] - '0') * 100000;
                i++;
                i3 += (cArr[i] - '0') * 10000;
                i++;
                i3 += (cArr[i] - '0') * 1000;
                i++;
                i3 += (cArr[i] - '0') * 100;
                i++;
                break;
            case 8:
                i3 += (cArr[i] - '0') * 10000000;
                i++;
                i3 += (cArr[i] - '0') * Prefetch.NANOSECONDS_PER_MILLISECOND;
                i++;
                i3 += (cArr[i] - '0') * 100000;
                i++;
                i3 += (cArr[i] - '0') * 10000;
                i++;
                i3 += (cArr[i] - '0') * 1000;
                i++;
                i3 += (cArr[i] - '0') * 100;
                i++;
                break;
            case 9:
                i3 += (cArr[i] - '0') * 100000000;
                i++;
                i3 += (cArr[i] - '0') * 10000000;
                i++;
                i3 += (cArr[i] - '0') * Prefetch.NANOSECONDS_PER_MILLISECOND;
                i++;
                i3 += (cArr[i] - '0') * 100000;
                i++;
                i3 += (cArr[i] - '0') * 10000;
                i++;
                i3 += (cArr[i] - '0') * 1000;
                i++;
                i3 += (cArr[i] - '0') * 100;
                i++;
                break;
            default:
                return i3;
        }
        return i3 + ((cArr[i] - '0') * 10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0072, code lost:
        return java.lang.Integer.parseInt(r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int d(java.lang.String r10) {
        /*
            r0 = 0
            char r1 = r10.charAt(r0)
            int r2 = r10.length()
            r3 = 45
            r4 = 1
            if (r1 != r3) goto Lf
            r0 = r4
        Lf:
            r3 = 2
            r5 = 10
            if (r0 == 0) goto L24
            if (r2 == r4) goto L1f
            if (r2 <= r5) goto L19
            goto L1f
        L19:
            char r1 = r10.charAt(r4)
            r4 = r3
            goto L2d
        L1f:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L24:
            r6 = 9
            if (r2 <= r6) goto L2d
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L2d:
            r6 = 57
            if (r1 > r6) goto L81
            r7 = 48
            if (r1 >= r7) goto L36
            goto L81
        L36:
            int r1 = r1 - r7
            if (r4 >= r2) goto L7d
            int r8 = r4 + 1
            char r9 = r10.charAt(r4)
            if (r9 > r6) goto L78
            if (r9 >= r7) goto L44
            goto L78
        L44:
            int r1 = r1 * 10
            int r9 = r9 - r7
            int r1 = r1 + r9
            if (r8 >= r2) goto L7d
            int r4 = r4 + r3
            char r3 = r10.charAt(r8)
            if (r3 > r6) goto L73
            if (r3 >= r7) goto L54
            goto L73
        L54:
            int r1 = r1 * 10
            int r3 = r3 - r7
            int r1 = r1 + r3
            if (r4 >= r2) goto L7d
        L5a:
            int r3 = r4 + 1
            char r4 = r10.charAt(r4)
            if (r4 > r6) goto L6e
            if (r4 >= r7) goto L65
            goto L6e
        L65:
            int r1 = r1 * r5
            int r4 = r4 + (-48)
            int r1 = r1 + r4
            if (r3 < r2) goto L6c
            goto L7d
        L6c:
            r4 = r3
            goto L5a
        L6e:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L73:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L78:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L7d:
            if (r0 == 0) goto L80
            int r1 = -r1
        L80:
            return r1
        L81:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9398oo.d(java.lang.String):int");
    }

    public static long a(char[] cArr, int i, int i2) {
        int i3 = i2 - 9;
        return (e(cArr, i, i3) * 1000000000) + e(cArr, i + i3, 9);
    }

    public static long e(String str) {
        if (str.length() <= 9) {
            return d(str);
        }
        return Long.parseLong(str);
    }

    public static boolean e(char[] cArr, int i, int i2, boolean z) {
        String str = z ? a : d;
        int length = str.length();
        if (i2 < length) {
            return true;
        }
        if (i2 > length) {
            return false;
        }
        for (int i3 = 0; i3 < length; i3++) {
            int charAt = cArr[i + i3] - str.charAt(i3);
            if (charAt != 0) {
                return charAt < 0;
            }
        }
        return true;
    }

    public static boolean b(String str, boolean z) {
        String str2 = z ? a : d;
        int length = str2.length();
        int length2 = str.length();
        if (length2 < length) {
            return true;
        }
        if (length2 > length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            int charAt = str.charAt(i) - str2.charAt(i);
            if (charAt != 0) {
                return charAt < 0;
            }
        }
        return true;
    }

    public static int b(String str, int i) {
        String trim;
        int length;
        if (str == null || (length = (trim = str.trim()).length()) == 0) {
            return i;
        }
        int i2 = 0;
        char charAt = trim.charAt(0);
        if (charAt == '+') {
            trim = trim.substring(1);
            length = trim.length();
        } else if (charAt == '-') {
            i2 = 1;
        }
        while (i2 < length) {
            char charAt2 = trim.charAt(i2);
            if (charAt2 > '9' || charAt2 < '0') {
                try {
                    return (int) c(trim, true);
                } catch (NumberFormatException unused) {
                    return i;
                }
            }
            i2++;
        }
        try {
            return Integer.parseInt(trim);
        } catch (NumberFormatException unused2) {
            return i;
        }
    }

    public static long e(String str, long j) {
        String trim;
        int length;
        if (str == null || (length = (trim = str.trim()).length()) == 0) {
            return j;
        }
        int i = 0;
        char charAt = trim.charAt(0);
        if (charAt == '+') {
            trim = trim.substring(1);
            length = trim.length();
        } else if (charAt == '-') {
            i = 1;
        }
        while (i < length) {
            char charAt2 = trim.charAt(i);
            if (charAt2 > '9' || charAt2 < '0') {
                try {
                    return (long) c(trim, true);
                } catch (NumberFormatException unused) {
                    return j;
                }
            }
            i++;
        }
        try {
            return Long.parseLong(trim);
        } catch (NumberFormatException unused2) {
            return j;
        }
    }

    public static double c(String str) {
        return c(str, false);
    }

    public static double c(String str, boolean z) {
        return z ? C9407ox.b(str) : Double.parseDouble(str);
    }

    public static float e(String str, boolean z) {
        return z ? C9406ow.e(str) : Float.parseFloat(str);
    }

    public static BigDecimal a(String str) {
        return C9393oj.e(str);
    }

    public static BigInteger b(String str) {
        if (str.length() > 1250) {
            return C9393oj.e(str).toBigInteger();
        }
        return new BigInteger(str);
    }
}
