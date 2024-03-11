package o;

import org.chromium.net.PrivateKeyType;

/* renamed from: o.dGz  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7831dGz {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String a(java.lang.String r5) {
        /*
            java.lang.String r0 = ""
            o.C8632dsu.d(r5, r0)
            java.lang.String r1 = ":"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r1 = o.C8684dus.a(r5, r1, r2, r3, r4)
            if (r1 == 0) goto L6c
            java.lang.String r1 = "["
            boolean r1 = o.C8684dus.c(r5, r1, r2, r3, r4)
            if (r1 == 0) goto L2b
            java.lang.String r1 = "]"
            boolean r1 = o.C8684dus.b(r5, r1, r2, r3, r4)
            if (r1 == 0) goto L2b
            int r1 = r5.length()
            r2 = 1
            int r1 = r1 - r2
            java.net.InetAddress r1 = e(r5, r2, r1)
            goto L33
        L2b:
            int r1 = r5.length()
            java.net.InetAddress r1 = e(r5, r2, r1)
        L33:
            if (r1 == 0) goto L6b
            byte[] r2 = r1.getAddress()
            int r3 = r2.length
            r4 = 16
            if (r3 != r4) goto L46
            o.C8632dsu.b(r2, r0)
            java.lang.String r5 = c(r2)
            return r5
        L46:
            int r0 = r2.length
            r2 = 4
            if (r0 != r2) goto L4f
            java.lang.String r5 = r1.getHostAddress()
            return r5
        L4f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid IPv6 address: '"
            r0.append(r1)
            r0.append(r5)
            r5 = 39
            r0.append(r5)
            java.lang.AssertionError r5 = new java.lang.AssertionError
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L6b:
            return r4
        L6c:
            java.lang.String r5 = java.net.IDN.toASCII(r5)     // Catch: java.lang.IllegalArgumentException -> L99
            o.C8632dsu.b(r5, r0)     // Catch: java.lang.IllegalArgumentException -> L99
            java.util.Locale r1 = java.util.Locale.US     // Catch: java.lang.IllegalArgumentException -> L99
            o.C8632dsu.b(r1, r0)     // Catch: java.lang.IllegalArgumentException -> L99
            if (r5 == 0) goto L91
            java.lang.String r5 = r5.toLowerCase(r1)     // Catch: java.lang.IllegalArgumentException -> L99
            o.C8632dsu.b(r5, r0)     // Catch: java.lang.IllegalArgumentException -> L99
            int r0 = r5.length()     // Catch: java.lang.IllegalArgumentException -> L99
            if (r0 != 0) goto L88
            return r4
        L88:
            boolean r0 = c(r5)     // Catch: java.lang.IllegalArgumentException -> L99
            if (r0 == 0) goto L8f
            goto L90
        L8f:
            r4 = r5
        L90:
            return r4
        L91:
            kotlin.TypeCastException r5 = new kotlin.TypeCastException     // Catch: java.lang.IllegalArgumentException -> L99
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            r5.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L99
            throw r5     // Catch: java.lang.IllegalArgumentException -> L99
        L99:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7831dGz.a(java.lang.String):java.lang.String");
    }

    private static final boolean c(String str) {
        int b;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                return true;
            }
            b = duD.b((CharSequence) " #%/:?@[\\]", charAt, 0, false, 6, (Object) null);
            if (b != -1) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0098, code lost:
        if (r13 == 16) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009a, code lost:
        if (r14 != (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009c, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009d, code lost:
        r0 = r13 - r14;
        java.lang.System.arraycopy(r9, r14, r9, 16 - r0, r0);
        java.util.Arrays.fill(r9, r14, (16 - r13) + r14, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00af, code lost:
        return java.net.InetAddress.getByAddress(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.net.InetAddress e(java.lang.String r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 176
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7831dGz.e(java.lang.String, int, int):java.net.InetAddress");
    }

    private static final boolean a(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char charAt = str.charAt(i5);
                if (charAt < '0' || charAt > '9') {
                    break;
                } else if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                    return false;
                } else {
                    i5++;
                }
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        return i4 == i3 + 4;
    }

    private static final String c(byte[] bArr) {
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        C7872dIo c7872dIo = new C7872dIo();
        while (i2 < bArr.length) {
            if (i2 == i) {
                c7872dIo.c(58);
                i2 += i4;
                if (i2 == 16) {
                    c7872dIo.c(58);
                }
            } else {
                if (i2 > 0) {
                    c7872dIo.c(58);
                }
                c7872dIo.l((dGB.b(bArr[i2], (int) PrivateKeyType.INVALID) << 8) | dGB.b(bArr[i2 + 1], (int) PrivateKeyType.INVALID));
                i2 += 2;
            }
        }
        return c7872dIo.v();
    }
}
