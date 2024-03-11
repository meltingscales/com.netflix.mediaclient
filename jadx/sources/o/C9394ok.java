package o;

/* renamed from: o.ok  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9394ok {
    private static int $10 = 0;
    private static int $11 = 1;
    static final String a;
    private static long b = 2147483647L;
    private static char[] b$s43$2912 = null;
    static final String c;
    private static long d = 1000000000;
    private static long d$s44$2912 = 0;
    private static int e = 1000000000;
    private static final String[] f;
    private static final String[] g;
    private static final int[] h;
    private static long i = -2147483648L;
    private static int j = 1000000;
    private static int n = 1;

    /* renamed from: o  reason: collision with root package name */
    private static int f13893o;

    static void a() {
        d$s44$2912 = -8757020025784626350L;
        b$s43$2912 = new char[]{13510};
    }

    static {
        a();
        a = String.valueOf(Integer.MIN_VALUE);
        c = String.valueOf(Long.MIN_VALUE);
        h = new int[1000];
        int i2 = n + 9;
        f13893o = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 2 % 2;
        int i5 = 0;
        for (int i6 = 0; i6 < 10; i6++) {
            for (int i7 = 0; i7 < 10; i7++) {
                int i8 = f13893o + 97;
                n = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 3 / 5;
                }
                int i10 = 0;
                while (i10 < 10) {
                    int i11 = f13893o + 25;
                    n = i11 % 128;
                    int i12 = i11 % 2;
                    h[i5] = ((i6 + 48) << 16) | ((i7 + 48) << 8) | (i10 + 48);
                    i10++;
                    i5++;
                }
            }
        }
        Object[] objArr = new Object[1];
        k(1, (char) 29613, 0, objArr);
        f = new String[]{"0", ((String) objArr[0]).intern(), "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        g = new String[]{"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};
    }

    public static int c(int i2, char[] cArr, int i3) {
        int i4;
        int i5 = 2 % 2;
        if (i2 < 0) {
            if (i2 == Integer.MIN_VALUE) {
                return c(cArr, i3);
            }
            cArr[i3] = '-';
            i2 = -i2;
            i3++;
        }
        if (i2 < j) {
            int i6 = f13893o + 55;
            int i7 = i6 % 128;
            n = i7;
            if (i6 % 2 != 0 ? i2 >= 1000 : i2 >= 6936) {
                int i8 = i2 / 1000;
                return d(i2 - (i8 * 1000), cArr, a(i8, cArr, i3));
            }
            int i9 = i7 + 43;
            f13893o = i9 % 128;
            int i10 = i9 % 2;
            if (i2 < 10) {
                cArr[i3] = (char) (i2 + 48);
                return i3 + 1;
            }
            return a(i2, cArr, i3);
        }
        int i11 = e;
        if (i2 < i11) {
            int i12 = i2 / 1000;
            int i13 = i12 / 1000;
            return d(i2 - (i12 * 1000), cArr, d(i12 - (i13 * 1000), cArr, a(i13, cArr, i3)));
        }
        int i14 = i2 - i11;
        if (i14 >= i11) {
            int i15 = f13893o + 91;
            n = i15 % 128;
            int i16 = i15 % 2;
            i14 -= i11;
            i4 = i3 + 1;
            cArr[i3] = '2';
        } else {
            i4 = i3 + 1;
            cArr[i3] = '1';
        }
        return b(i14, cArr, i4);
    }

    public static int d(int i2, byte[] bArr, int i3) {
        int i4;
        int i5 = 2 % 2;
        if (i2 < 0) {
            int i6 = f13893o + 85;
            n = i6 % 128;
            int i7 = i6 % 2;
            if (i2 == Integer.MIN_VALUE) {
                return a(bArr, i3);
            }
            bArr[i3] = 45;
            i2 = -i2;
            i3++;
        }
        if (i2 < j) {
            int i8 = n + 13;
            f13893o = i8 % 128;
            int i9 = i8 % 2;
            if (i2 < 1000) {
                if (i2 < 10) {
                    int i10 = i3 + 1;
                    bArr[i3] = (byte) (i2 + 48);
                    return i10;
                }
                return e(i2, bArr, i3);
            }
            int i11 = i2 / 1000;
            int c2 = c(i2 - (i11 * 1000), bArr, e(i11, bArr, i3));
            int i12 = f13893o + 85;
            n = i12 % 128;
            int i13 = i12 % 2;
            return c2;
        }
        int i14 = e;
        if (i2 < i14) {
            int i15 = i2 / 1000;
            int i16 = i15 / 1000;
            return c(i2 - (i15 * 1000), bArr, c(i15 - (i16 * 1000), bArr, e(i16, bArr, i3)));
        }
        int i17 = f13893o + 1;
        n = i17 % 128;
        int i18 = i17 % 2;
        int i19 = i2 - i14;
        if (i19 >= i14) {
            i19 -= i14;
            i4 = i3 + 1;
            bArr[i3] = 50;
        } else {
            i4 = i3 + 1;
            bArr[i3] = 49;
        }
        return a(i19, bArr, i4);
    }

    public static int e(long j2, char[] cArr, int i2) {
        int b2;
        int i3 = 2 % 2;
        if (j2 < 0) {
            if (j2 > i) {
                int i4 = f13893o + 37;
                n = i4 % 128;
                if (i4 % 2 != 0) {
                    return c((int) j2, cArr, i2);
                }
                c((int) j2, cArr, i2);
                Object obj = null;
                obj.hashCode();
                throw null;
            } else if (j2 == Long.MIN_VALUE) {
                return e(cArr, i2);
            } else {
                cArr[i2] = '-';
                j2 = -j2;
                i2++;
            }
        } else if (j2 <= b) {
            return c((int) j2, cArr, i2);
        }
        long j3 = d;
        long j4 = j2 / j3;
        if (j4 < j3) {
            int i5 = n + 97;
            f13893o = i5 % 128;
            int i6 = i5 % 2;
            b2 = e((int) j4, cArr, i2);
        } else {
            long j5 = j4 / j3;
            b2 = b((int) (j4 - (j5 * j3)), cArr, a((int) j5, cArr, i2));
        }
        return b((int) (j2 - (j4 * j3)), cArr, b2);
    }

    public static int c(long j2, byte[] bArr, int i2) {
        int a2;
        int i3 = 2 % 2;
        int i4 = n + 83;
        int i5 = i4 % 128;
        f13893o = i5;
        int i6 = i4 % 2;
        if (j2 < 0) {
            int i7 = i5 + 55;
            int i8 = i7 % 128;
            n = i8;
            int i9 = i7 % 2;
            if (j2 > i) {
                int i10 = i8 + 61;
                f13893o = i10 % 128;
                int i11 = i10 % 2;
                return d((int) j2, bArr, i2);
            } else if (j2 == Long.MIN_VALUE) {
                return c(bArr, i2);
            } else {
                bArr[i2] = 45;
                j2 = -j2;
                i2++;
            }
        } else if (j2 <= b) {
            int d2 = d((int) j2, bArr, i2);
            int i12 = f13893o + 65;
            n = i12 % 128;
            int i13 = i12 % 2;
            return d2;
        }
        long j3 = d;
        long j4 = j2 / j3;
        if (j4 < j3) {
            a2 = b((int) j4, bArr, i2);
        } else {
            long j5 = j4 / j3;
            a2 = a((int) (j4 - (j5 * j3)), bArr, e((int) j5, bArr, i2));
        }
        return a((int) (j2 - (j4 * j3)), bArr, a2);
    }

    public static String c(int i2) {
        int i3 = 2 % 2;
        int i4 = f13893o;
        int i5 = i4 + 49;
        int i6 = i5 % 128;
        n = i6;
        int i7 = i5 % 2;
        String[] strArr = f;
        if (i2 < strArr.length) {
            if (i2 >= 0) {
                int i8 = i4 + 93;
                n = i8 % 128;
                int i9 = i8 % 2;
                String str = strArr[i2];
                int i10 = i4 + 49;
                n = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 44 / 0;
                }
                return str;
            }
            int i12 = (-i2) - 1;
            String[] strArr2 = g;
            if (i12 < strArr2.length) {
                int i13 = i6 + 105;
                f13893o = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 98 / 0;
                    return strArr2[i12];
                }
                return strArr2[i12];
            }
        }
        return Integer.toString(i2);
    }

    public static String e(long j2) {
        int i2 = 2 % 2;
        if (j2 > 2147483647L || j2 < -2147483648L) {
            String l = Long.toString(j2);
            int i3 = n + 45;
            f13893o = i3 % 128;
            int i4 = i3 % 2;
            return l;
        }
        int i5 = n + 13;
        f13893o = i5 % 128;
        int i6 = (int) j2;
        if (i5 % 2 == 0) {
            return c(i6);
        }
        c(i6);
        throw null;
    }

    public static String d(double d2) {
        int i2 = 2 % 2;
        int i3 = f13893o + 105;
        n = i3 % 128;
        return a(d2, i3 % 2 == 0);
    }

    public static String a(double d2, boolean z) {
        String d3;
        int i2 = 2 % 2;
        int i3 = n;
        int i4 = i3 + 109;
        f13893o = i4 % 128;
        int i5 = i4 % 2;
        if (z) {
            int i6 = i3 + 17;
            f13893o = i6 % 128;
            int i7 = i6 % 2;
            d3 = C9361oD.c(d2);
            if (i7 != 0) {
                int i8 = 75 / 0;
            }
        } else {
            d3 = Double.toString(d2);
        }
        int i9 = n + 59;
        f13893o = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 82 / 0;
        }
        return d3;
    }

    public static String d(float f2) {
        int i2 = 2 % 2;
        int i3 = f13893o + 111;
        n = i3 % 128;
        int i4 = i3 % 2;
        String e2 = e(f2, false);
        int i5 = n + 27;
        f13893o = i5 % 128;
        if (i5 % 2 == 0) {
            return e2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String e(float f2, boolean z) {
        int i2 = 2 % 2;
        if (z) {
            int i3 = f13893o + 123;
            n = i3 % 128;
            int i4 = i3 % 2;
            String d2 = C9359oB.d(f2);
            int i5 = f13893o + 37;
            n = i5 % 128;
            int i6 = i5 % 2;
            return d2;
        }
        return Float.toString(f2);
    }

    public static boolean c(double d2) {
        int i2 = 2 % 2;
        int i3 = n + 59;
        f13893o = i3 % 128;
        int i4 = i3 % 2;
        if (!Double.isNaN(d2)) {
            int i5 = n + 43;
            f13893o = i5 % 128;
            int i6 = i5 % 2;
            if (!Double.isInfinite(d2)) {
                return false;
            }
        }
        int i7 = f13893o + 93;
        n = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public static boolean e(float f2) {
        int i2 = 2 % 2;
        int i3 = n + 55;
        f13893o = i3 % 128;
        if (i3 % 2 != 0) {
            Float.isNaN(f2);
            throw null;
        } else if (Float.isNaN(f2) || Float.isInfinite(f2)) {
            return true;
        } else {
            int i4 = n + 39;
            f13893o = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 5;
            }
            return false;
        }
    }

    private static int e(int i2, char[] cArr, int i3) {
        int i4 = 2 % 2;
        int i5 = f13893o + 7;
        int i6 = i5 % 128;
        n = i6;
        int i7 = i5 % 2;
        if (i2 < j) {
            if (i2 < 1000) {
                int i8 = i6 + 29;
                f13893o = i8 % 128;
                int i9 = i8 % 2;
                int a2 = a(i2, cArr, i3);
                if (i9 != 0) {
                    int i10 = 32 / 0;
                }
                return a2;
            }
            int i11 = i2 / 1000;
            return b(cArr, i3, i11, i2 - (i11 * 1000));
        }
        int i12 = i2 / 1000;
        int i13 = i12 / 1000;
        int a3 = a(i13, cArr, i3);
        int[] iArr = h;
        int i14 = iArr[i12 - (i13 * 1000)];
        cArr[a3] = (char) (i14 >> 16);
        cArr[a3 + 1] = (char) ((i14 >> 8) & 127);
        cArr[a3 + 2] = (char) (i14 & 127);
        int i15 = iArr[i2 - (i12 * 1000)];
        cArr[a3 + 3] = (char) (i15 >> 16);
        cArr[a3 + 4] = (char) ((i15 >> 8) & 127);
        cArr[a3 + 5] = (char) (i15 & 127);
        return a3 + 6;
    }

    private static int b(int i2, char[] cArr, int i3) {
        int i4 = 2 % 2;
        int i5 = f13893o;
        int i6 = i5 + 81;
        n = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i2 / 1000;
        int i9 = i8 / 1000;
        int[] iArr = h;
        int i10 = iArr[i9];
        cArr[i3] = (char) (i10 >> 16);
        cArr[i3 + 1] = (char) ((i10 >> 8) & 127);
        cArr[i3 + 2] = (char) (i10 & 127);
        int i11 = iArr[i8 - (i9 * 1000)];
        cArr[i3 + 3] = (char) (i11 >> 16);
        cArr[i3 + 4] = (char) ((i11 >> 8) & 127);
        cArr[i3 + 5] = (char) (i11 & 127);
        int i12 = iArr[i2 - (i8 * 1000)];
        cArr[i3 + 6] = (char) (i12 >> 16);
        cArr[i3 + 7] = (char) ((i12 >> 8) & 127);
        cArr[i3 + 8] = (char) (i12 & 127);
        int i13 = i3 + 9;
        int i14 = i5 + 73;
        n = i14 % 128;
        if (i14 % 2 != 0) {
            return i13;
        }
        throw null;
    }

    private static int b(int i2, byte[] bArr, int i3) {
        int i4 = 2 % 2;
        int i5 = n + 99;
        int i6 = i5 % 128;
        f13893o = i6;
        int i7 = i5 % 2;
        if (i2 < j) {
            int i8 = i6 + 91;
            int i9 = i8 % 128;
            n = i9;
            if (i8 % 2 != 0 ? i2 >= 1000 : i2 >= 29313) {
                int i10 = i2 / 1000;
                return d(bArr, i3, i10, i2 - (i10 * 1000));
            }
            int i11 = i9 + 5;
            f13893o = i11 % 128;
            int i12 = i11 % 2;
            return e(i2, bArr, i3);
        }
        int i13 = i2 / 1000;
        int i14 = i13 / 1000;
        int e2 = e(i14, bArr, i3);
        int[] iArr = h;
        int i15 = iArr[i13 - (i14 * 1000)];
        bArr[e2] = (byte) (i15 >> 16);
        bArr[e2 + 1] = (byte) (i15 >> 8);
        bArr[e2 + 2] = (byte) i15;
        int i16 = iArr[i2 - (i13 * 1000)];
        bArr[e2 + 3] = (byte) (i16 >> 16);
        bArr[e2 + 4] = (byte) (i16 >> 8);
        bArr[e2 + 5] = (byte) i16;
        return e2 + 6;
    }

    private static int a(int i2, byte[] bArr, int i3) {
        int i4 = 2 % 2;
        int i5 = n;
        int i6 = i5 + 15;
        f13893o = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i2 / 1000;
        int i9 = i8 / 1000;
        int[] iArr = h;
        int i10 = iArr[i9];
        bArr[i3] = (byte) (i10 >> 16);
        bArr[i3 + 1] = (byte) (i10 >> 8);
        bArr[i3 + 2] = (byte) i10;
        int i11 = iArr[i8 - (i9 * 1000)];
        bArr[i3 + 3] = (byte) (i11 >> 16);
        bArr[i3 + 4] = (byte) (i11 >> 8);
        bArr[i3 + 5] = (byte) i11;
        int i12 = iArr[i2 - (i8 * 1000)];
        bArr[i3 + 6] = (byte) (i12 >> 16);
        bArr[i3 + 7] = (byte) (i12 >> 8);
        bArr[i3 + 8] = (byte) i12;
        int i13 = i3 + 9;
        int i14 = i5 + 21;
        f13893o = i14 % 128;
        if (i14 % 2 == 0) {
            return i13;
        }
        throw null;
    }

    private static int b(char[] cArr, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int[] iArr = h;
        int i6 = iArr[i3];
        if (i3 > 9) {
            int i7 = f13893o + 115;
            int i8 = i7 % 128;
            n = i8;
            if (i7 % 2 != 0 ? i3 > 99 : i3 > 97) {
                int i9 = i8 + 19;
                f13893o = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr[i2] = (char) (i6 * 78);
                } else {
                    cArr[i2] = (char) (i6 >> 16);
                    i2++;
                }
            }
            cArr[i2] = (char) ((i6 >> 8) & 127);
            i2++;
        }
        cArr[i2] = (char) (i6 & 127);
        int i10 = iArr[i4];
        cArr[i2 + 1] = (char) (i10 >> 16);
        cArr[i2 + 2] = (char) ((i10 >> 8) & 127);
        cArr[i2 + 3] = (char) (i10 & 127);
        return i2 + 4;
    }

    private static int d(byte[] bArr, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = f13893o + 17;
        int i7 = i6 % 128;
        n = i7;
        int i8 = i6 % 2;
        int[] iArr = h;
        int i9 = iArr[i3];
        if (i3 > 9) {
            if (i3 > 99) {
                bArr[i2] = (byte) (i9 >> 16);
                i2++;
            }
            bArr[i2] = (byte) (i9 >> 8);
            i2++;
            int i10 = i7 + 35;
            f13893o = i10 % 128;
            int i11 = i10 % 2;
        }
        bArr[i2] = (byte) i9;
        int i12 = iArr[i4];
        bArr[i2 + 1] = (byte) (i12 >> 16);
        bArr[i2 + 2] = (byte) (i12 >> 8);
        bArr[i2 + 3] = (byte) i12;
        return i2 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r4 <= 99) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
        r1 = r1 + 117;
        o.C9394ok.n = r1 % 128;
        r1 = r1 % 2;
        r5[r6] = (char) (r2 >> 16);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        r5[r6] = (char) ((r2 >> 8) & 127);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r4 > 73) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r4 > 9) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int a(int r4, char[] r5, int r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.C9394ok.f13893o
            int r2 = r1 + 67
            int r3 = r2 % 128
            o.C9394ok.n = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L17
            int[] r2 = o.C9394ok.h
            r2 = r2[r4]
            r3 = 73
            if (r4 <= r3) goto L3a
            goto L1f
        L17:
            int[] r2 = o.C9394ok.h
            r2 = r2[r4]
            r3 = 9
            if (r4 <= r3) goto L3a
        L1f:
            r3 = 99
            if (r4 <= r3) goto L31
            int r1 = r1 + 117
            int r4 = r1 % 128
            o.C9394ok.n = r4
            int r1 = r1 % r0
            int r4 = r2 >> 16
            char r4 = (char) r4
            r5[r6] = r4
            int r6 = r6 + 1
        L31:
            int r4 = r2 >> 8
            r4 = r4 & 127(0x7f, float:1.78E-43)
            char r4 = (char) r4
            r5[r6] = r4
            int r6 = r6 + 1
        L3a:
            r4 = r2 & 127(0x7f, float:1.78E-43)
            char r4 = (char) r4
            r5[r6] = r4
            int r6 = r6 + 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9394ok.a(int, char[], int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r4 <= 99) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
        r2 = r2 + 47;
        o.C9394ok.n = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        if ((r2 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        r5[r6] = (byte) (r1 % 117);
        r6 = r6 % 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        r5[r6] = (byte) (r1 >> 16);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
        r5[r6] = (byte) (r1 >> 8);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r4 > 68) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r4 > 9) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int e(int r4, byte[] r5, int r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.C9394ok.n
            int r1 = r1 + 5
            int r2 = r1 % 128
            o.C9394ok.f13893o = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L17
            int[] r1 = o.C9394ok.h
            r1 = r1[r4]
            r3 = 68
            if (r4 <= r3) goto L42
            goto L1f
        L17:
            int[] r1 = o.C9394ok.h
            r1 = r1[r4]
            r3 = 9
            if (r4 <= r3) goto L42
        L1f:
            r3 = 99
            if (r4 <= r3) goto L3b
            int r2 = r2 + 47
            int r4 = r2 % 128
            o.C9394ok.n = r4
            int r2 = r2 % r0
            if (r2 != 0) goto L34
            int r4 = r1 % 117
            byte r4 = (byte) r4
            r5[r6] = r4
            int r6 = r6 % 1
            goto L3b
        L34:
            int r4 = r1 >> 16
            byte r4 = (byte) r4
            r5[r6] = r4
            int r6 = r6 + 1
        L3b:
            int r4 = r1 >> 8
            byte r4 = (byte) r4
            r5[r6] = r4
            int r6 = r6 + 1
        L42:
            byte r4 = (byte) r1
            r5[r6] = r4
            int r6 = r6 + 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9394ok.e(int, byte[], int):int");
    }

    private static int d(int i2, char[] cArr, int i3) {
        int i4 = 2 % 2;
        int i5 = n + 5;
        int i6 = i5 % 128;
        f13893o = i6;
        int i7 = i5 % 2;
        int i8 = h[i2];
        cArr[i3] = (char) (i8 >> 16);
        cArr[i3 + 1] = (char) ((i8 >> 8) & 127);
        cArr[i3 + 2] = (char) (i8 & 127);
        int i9 = i3 + 3;
        int i10 = i6 + 111;
        n = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 87 / 0;
        }
        return i9;
    }

    private static int c(int i2, byte[] bArr, int i3) {
        int i4;
        int i5 = 2 % 2;
        int i6 = f13893o + 7;
        int i7 = i6 % 128;
        n = i7;
        if (i6 % 2 == 0) {
            int i8 = h[i2];
            bArr[i3] = (byte) (i8 >> 74);
            bArr[i3] = (byte) (i8 << 50);
            bArr[i3 + 5] = (byte) i8;
            i4 = i3 / 3;
        } else {
            int i9 = h[i2];
            bArr[i3] = (byte) (i9 >> 16);
            bArr[i3 + 1] = (byte) (i9 >> 8);
            bArr[i3 + 2] = (byte) i9;
            i4 = i3 + 3;
        }
        int i10 = i7 + 123;
        f13893o = i10 % 128;
        int i11 = i10 % 2;
        return i4;
    }

    private static int e(char[] cArr, int i2) {
        int i3 = 2 % 2;
        int i4 = f13893o + 79;
        n = i4 % 128;
        int i5 = i4 % 2;
        String str = c;
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i6 = i2 + length;
        int i7 = f13893o + 11;
        n = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    private static int c(byte[] bArr, int i2) {
        int i3 = 2 % 2;
        int length = c.length();
        int i4 = f13893o + 15;
        n = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        while (i6 < length) {
            bArr[i2] = (byte) c.charAt(i6);
            i6++;
            i2++;
            int i7 = f13893o + 59;
            n = i7 % 128;
            int i8 = i7 % 2;
        }
        return i2;
    }

    private static int c(char[] cArr, int i2) {
        int i3 = 2 % 2;
        int i4 = n + 13;
        f13893o = i4 % 128;
        int i5 = i4 % 2;
        String str = a;
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i6 = i2 + length;
        int i7 = f13893o + 111;
        n = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    private static int a(byte[] bArr, int i2) {
        int i3 = 2 % 2;
        int i4 = f13893o + 47;
        n = i4 % 128;
        int i5 = i4 % 2;
        int length = a.length();
        int i6 = 0;
        while (i6 < length) {
            int i7 = f13893o + 91;
            n = i7 % 128;
            if (i7 % 2 == 0) {
                bArr[i2] = (byte) a.charAt(i6);
                i6 += 50;
                i2 += 121;
            } else {
                bArr[i2] = (byte) a.charAt(i6);
                i6++;
                i2++;
            }
        }
        return i2;
    }

    private static void k(int i2, char c2, int i3, Object[] objArr) {
        int i4 = 2 % 2;
        C9581sN c9581sN = new C9581sN();
        long[] jArr = new long[i2];
        c9581sN.d = 0;
        while (c9581sN.d < i2) {
            int i5 = $11 + 51;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            jArr[c9581sN.d] = (((char) (b$s43$2912[i3 + c9581sN.d] ^ 8527296503698573146L)) ^ (c9581sN.d * (8527296503698573146L ^ d$s44$2912))) ^ c2;
            c9581sN.d++;
        }
        char[] cArr = new char[i2];
        c9581sN.d = 0;
        int i7 = $11 + 19;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        while (c9581sN.d < i2) {
            int i9 = $11 + 21;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr[c9581sN.d] = (char) jArr[c9581sN.d];
            c9581sN.d++;
        }
        objArr[0] = new String(cArr);
    }
}
