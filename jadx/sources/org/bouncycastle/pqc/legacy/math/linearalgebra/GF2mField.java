package org.bouncycastle.pqc.legacy.math.linearalgebra;

import o.C9573sE;

/* loaded from: classes6.dex */
public class GF2mField {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char a$s39$146 = 61116;
    private static char b$s37$146 = 17754;
    private static char c$s38$146 = 55930;
    private static int d = 1;
    private static char d$s40$146 = 8800;
    private static int e;
    private int degree;
    private int polynomial;

    public GF2mField(byte[] bArr) {
        this.degree = 0;
        if (bArr.length != 4) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        int OS2IP = LittleEndianConversions.OS2IP(bArr);
        this.polynomial = OS2IP;
        if (!PolynomialRingGF2.isIrreducible(OS2IP)) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        int i = d + 17;
        e = i % 128;
        int i2 = i % 2;
        this.degree = PolynomialRingGF2.degree(this.polynomial);
        int i3 = d + 79;
        e = i3 % 128;
        int i4 = i3 % 2;
    }

    private static String polyToString(int i) {
        String str;
        Object obj;
        int i2 = 2 % 2;
        if (i == 0) {
            int i3 = e + 33;
            d = i3 % 128;
            int i4 = i3 % 2;
            return "0";
        }
        if (((byte) (i & 1)) == 1) {
            int i5 = d + 73;
            e = i5 % 128;
            char[] cArr = {53765, 46367};
            if (i5 % 2 != 0) {
                Object[] objArr = new Object[1];
                b(1, cArr, objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                b(1, cArr, objArr2);
                obj = objArr2[0];
            }
            str = ((String) obj).intern();
        } else {
            str = "";
        }
        int i6 = i >>> 1;
        int i7 = 1;
        while (i6 != 0) {
            if (((byte) (i6 & 1)) == 1) {
                str = str + "+x^" + i7;
            }
            i6 >>>= 1;
            i7++;
        }
        return str;
    }

    public int add(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = d;
        int i5 = i4 + 59;
        e = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i ^ i2;
        int i8 = i4 + 35;
        e = i8 % 128;
        if (i8 % 2 == 0) {
            return i7;
        }
        throw null;
    }

    public String elementToStr(int i) {
        StringBuilder sb;
        String intern;
        int i2 = 2 % 2;
        int i3 = e + 11;
        d = i3 % 128;
        String str = "";
        for (int i4 = i3 % 2 == 0 ? 1 : 0; i4 < this.degree; i4++) {
            if ((((byte) i) & 1) == 0) {
                sb = new StringBuilder();
                intern = "0";
            } else {
                sb = new StringBuilder();
                Object[] objArr = new Object[1];
                b(1, new char[]{53765, 46367}, objArr);
                intern = ((String) objArr[0]).intern();
                int i5 = d + 103;
                e = i5 % 128;
                int i6 = i5 % 2;
            }
            sb.append(intern);
            sb.append(str);
            str = sb.toString();
            i >>>= 1;
        }
        return str;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = e + 123;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        if (obj != null && (obj instanceof GF2mField)) {
            GF2mField gF2mField = (GF2mField) obj;
            if (this.degree == gF2mField.degree && this.polynomial == gF2mField.polynomial) {
                return true;
            }
        }
        int i5 = i3 + 77;
        e = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        r2 = r2 + 61;
        org.bouncycastle.pqc.legacy.math.linearalgebra.GF2mField.e = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r6 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (r7 >= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
        r2 = r2 + 45;
        org.bouncycastle.pqc.legacy.math.linearalgebra.GF2mField.e = r2 % 128;
        r2 = r2 % 2;
        r6 = inverse(r6);
        r7 = -r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r7 == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        if ((r7 & 1) != 1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
        r0 = mult(r0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
        r6 = mult(r6, r6);
        r7 = r7 >>> 1;
        r1 = org.bouncycastle.pqc.legacy.math.linearalgebra.GF2mField.d + 101;
        org.bouncycastle.pqc.legacy.math.linearalgebra.GF2mField.e = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        if ((r1 % 2) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
        r1 = 4 % 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r7 == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r7 == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r6 != 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int exp(int r6, int r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = org.bouncycastle.pqc.legacy.math.linearalgebra.GF2mField.e
            int r1 = r1 + 7
            int r2 = r1 % 128
            org.bouncycastle.pqc.legacy.math.linearalgebra.GF2mField.d = r2
            int r1 = r1 % r0
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L16
            r1 = 76
            int r1 = r1 / r3
            if (r7 != 0) goto L19
            goto L18
        L16:
            if (r7 != 0) goto L19
        L18:
            return r4
        L19:
            if (r6 != 0) goto L23
            int r2 = r2 + 61
            int r6 = r2 % 128
            org.bouncycastle.pqc.legacy.math.linearalgebra.GF2mField.e = r6
            int r2 = r2 % r0
            return r3
        L23:
            if (r6 != r4) goto L26
            return r4
        L26:
            if (r7 >= 0) goto L34
            int r2 = r2 + 45
            int r1 = r2 % 128
            org.bouncycastle.pqc.legacy.math.linearalgebra.GF2mField.e = r1
            int r2 = r2 % r0
            int r6 = r5.inverse(r6)
            int r7 = -r7
        L34:
            r0 = r4
        L35:
            if (r7 == 0) goto L54
            r1 = r7 & 1
            if (r1 != r4) goto L3f
            int r0 = r5.mult(r0, r6)
        L3f:
            int r6 = r5.mult(r6, r6)
            int r7 = r7 >>> 1
            int r1 = org.bouncycastle.pqc.legacy.math.linearalgebra.GF2mField.d
            int r1 = r1 + 101
            int r2 = r1 % 128
            org.bouncycastle.pqc.legacy.math.linearalgebra.GF2mField.e = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L35
            r1 = 4
            int r1 = r1 % r1
            goto L35
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.legacy.math.linearalgebra.GF2mField.exp(int, int):int");
    }

    public int getDegree() {
        int i = 2 % 2;
        int i2 = e;
        int i3 = i2 + 21;
        d = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.degree;
        int i6 = i2 + 21;
        d = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 5 / 0;
        }
        return i5;
    }

    public byte[] getEncoded() {
        int i = 2 % 2;
        int i2 = e + 9;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            LittleEndianConversions.I2OSP(this.polynomial);
            throw null;
        }
        byte[] I2OSP = LittleEndianConversions.I2OSP(this.polynomial);
        int i3 = d + 73;
        e = i3 % 128;
        int i4 = i3 % 2;
        return I2OSP;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = e + 125;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        int i5 = this.polynomial;
        int i6 = i3 + 7;
        e = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public int inverse(int i) {
        int i2 = 2 % 2;
        int i3 = e + 103;
        d = i3 % 128;
        return exp(i, i3 % 2 == 0 ? (0 % this.degree) / 2 : (1 << this.degree) - 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r2 == 31) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isElementOfThisField(int r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = org.bouncycastle.pqc.legacy.math.linearalgebra.GF2mField.e
            int r2 = r1 + 33
            int r3 = r2 % 128
            org.bouncycastle.pqc.legacy.math.linearalgebra.GF2mField.d = r3
            int r2 = r2 % r0
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L19
            int r2 = r6.degree
            r5 = 14
            if (r2 != r5) goto L17
            goto L1f
        L17:
            r3 = r4
            goto L34
        L19:
            int r2 = r6.degree
            r5 = 31
            if (r2 != r5) goto L34
        L1f:
            if (r7 < 0) goto L33
            int r7 = r1 + 87
            int r2 = r7 % 128
            org.bouncycastle.pqc.legacy.math.linearalgebra.GF2mField.d = r2
            int r7 = r7 % r0
            if (r7 != 0) goto L2b
            goto L2c
        L2b:
            r3 = r4
        L2c:
            int r1 = r1 + 51
            int r7 = r1 % 128
            org.bouncycastle.pqc.legacy.math.linearalgebra.GF2mField.d = r7
            int r1 = r1 % r0
        L33:
            return r3
        L34:
            if (r7 < 0) goto L3b
            int r0 = r4 << r2
            if (r7 >= r0) goto L3b
            goto L3c
        L3b:
            r4 = r3
        L3c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.legacy.math.linearalgebra.GF2mField.isElementOfThisField(int):boolean");
    }

    public int mult(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = d + 115;
        e = i4 % 128;
        int i5 = i4 % 2;
        int modMultiply = PolynomialRingGF2.modMultiply(i, i2, this.polynomial);
        int i6 = d + 89;
        e = i6 % 128;
        int i7 = i6 % 2;
        return modMultiply;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Finite Field GF(2^" + this.degree + ") = GF(2)[X]/<" + polyToString(this.polynomial) + "> ";
        int i2 = d + 83;
        e = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private static void b(int i, char[] cArr, Object[] objArr) {
        int i2 = 2 % 2;
        C9573sE c9573sE = new C9573sE();
        char[] cArr2 = new char[cArr.length];
        c9573sE.b = 0;
        char[] cArr3 = new char[2];
        while (c9573sE.b < cArr.length) {
            cArr3[0] = cArr[c9573sE.b];
            cArr3[1] = cArr[c9573sE.b + 1];
            int i3 = 58224;
            for (int i4 = 0; i4 < 16; i4++) {
                int i5 = $11 + 23;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                char c = cArr3[1];
                char c2 = cArr3[0];
                char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + ((char) (a$s39$146 ^ (-3358735357273865631L))))) ^ ((c2 >>> 5) + ((char) (d$s40$146 ^ (-3358735357273865631L))))));
                cArr3[1] = c3;
                cArr3[0] = (char) (c2 - (((c3 >>> 5) + ((char) (c$s38$146 ^ (-3358735357273865631L)))) ^ ((c3 + i3) ^ ((c3 << 4) + ((char) (b$s37$146 ^ (-3358735357273865631L)))))));
                i3 -= 40503;
            }
            cArr2[c9573sE.b] = cArr3[0];
            cArr2[c9573sE.b + 1] = cArr3[1];
            c9573sE.b += 2;
            int i7 = $10 + 123;
            $11 = i7 % 128;
            int i8 = i7 % 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
