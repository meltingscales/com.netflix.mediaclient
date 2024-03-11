package kotlin.comparisons;

import o.C8632dsu;
import o.dpI;
import o.dpK;
import o.dpN;
import o.dpP;

/* loaded from: classes6.dex */
class UComparisonsKt___UComparisonsKt {
    /* renamed from: maxOf-J1ME1BU  reason: not valid java name */
    public static int m3135maxOfJ1ME1BU(int i, int i2) {
        int compare;
        compare = Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
        return compare >= 0 ? i : i2;
    }

    /* renamed from: maxOf-eb3DHEI  reason: not valid java name */
    public static long m3140maxOfeb3DHEI(long j, long j2) {
        int compare;
        compare = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
        return compare >= 0 ? j : j2;
    }

    /* renamed from: maxOf-Kr8caGY  reason: not valid java name */
    public static final byte m3136maxOfKr8caGY(byte b, byte b2) {
        return C8632dsu.d(b & 255, b2 & 255) >= 0 ? b : b2;
    }

    /* renamed from: maxOf-5PvTz6A  reason: not valid java name */
    public static final short m3134maxOf5PvTz6A(short s, short s2) {
        return C8632dsu.d(s & 65535, 65535 & s2) >= 0 ? s : s2;
    }

    /* renamed from: maxOf-Md2H83M  reason: not valid java name */
    public static final int m3137maxOfMd2H83M(int i, int... iArr) {
        C8632dsu.c((Object) iArr, "");
        int a = dpN.a(iArr);
        for (int i2 = 0; i2 < a; i2++) {
            i = m3135maxOfJ1ME1BU(i, dpN.e(iArr, i2));
        }
        return i;
    }

    /* renamed from: maxOf-R03FKyM  reason: not valid java name */
    public static final long m3138maxOfR03FKyM(long j, long... jArr) {
        C8632dsu.c((Object) jArr, "");
        int b = dpK.b(jArr);
        for (int i = 0; i < b; i++) {
            j = m3140maxOfeb3DHEI(j, dpK.e(jArr, i));
        }
        return j;
    }

    /* renamed from: maxOf-Wr6uiD8  reason: not valid java name */
    public static final byte m3139maxOfWr6uiD8(byte b, byte... bArr) {
        C8632dsu.c((Object) bArr, "");
        int b2 = dpI.b(bArr);
        for (int i = 0; i < b2; i++) {
            b = m3136maxOfKr8caGY(b, dpI.e(bArr, i));
        }
        return b;
    }

    /* renamed from: maxOf-t1qELG4  reason: not valid java name */
    public static final short m3141maxOft1qELG4(short s, short... sArr) {
        C8632dsu.c((Object) sArr, "");
        int c = dpP.c(sArr);
        for (int i = 0; i < c; i++) {
            s = m3134maxOf5PvTz6A(s, dpP.c(sArr, i));
        }
        return s;
    }

    /* renamed from: minOf-J1ME1BU  reason: not valid java name */
    public static int m3143minOfJ1ME1BU(int i, int i2) {
        int compare;
        compare = Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
        return compare <= 0 ? i : i2;
    }

    /* renamed from: minOf-eb3DHEI  reason: not valid java name */
    public static long m3148minOfeb3DHEI(long j, long j2) {
        int compare;
        compare = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
        return compare <= 0 ? j : j2;
    }

    /* renamed from: minOf-Kr8caGY  reason: not valid java name */
    public static final byte m3144minOfKr8caGY(byte b, byte b2) {
        return C8632dsu.d(b & 255, b2 & 255) <= 0 ? b : b2;
    }

    /* renamed from: minOf-5PvTz6A  reason: not valid java name */
    public static final short m3142minOf5PvTz6A(short s, short s2) {
        return C8632dsu.d(s & 65535, 65535 & s2) <= 0 ? s : s2;
    }

    /* renamed from: minOf-Md2H83M  reason: not valid java name */
    public static final int m3145minOfMd2H83M(int i, int... iArr) {
        C8632dsu.c((Object) iArr, "");
        int a = dpN.a(iArr);
        for (int i2 = 0; i2 < a; i2++) {
            i = m3143minOfJ1ME1BU(i, dpN.e(iArr, i2));
        }
        return i;
    }

    /* renamed from: minOf-R03FKyM  reason: not valid java name */
    public static final long m3146minOfR03FKyM(long j, long... jArr) {
        C8632dsu.c((Object) jArr, "");
        int b = dpK.b(jArr);
        for (int i = 0; i < b; i++) {
            j = m3148minOfeb3DHEI(j, dpK.e(jArr, i));
        }
        return j;
    }

    /* renamed from: minOf-Wr6uiD8  reason: not valid java name */
    public static final byte m3147minOfWr6uiD8(byte b, byte... bArr) {
        C8632dsu.c((Object) bArr, "");
        int b2 = dpI.b(bArr);
        for (int i = 0; i < b2; i++) {
            b = m3144minOfKr8caGY(b, dpI.e(bArr, i));
        }
        return b;
    }

    /* renamed from: minOf-t1qELG4  reason: not valid java name */
    public static final short m3149minOft1qELG4(short s, short... sArr) {
        C8632dsu.c((Object) sArr, "");
        int c = dpP.c(sArr);
        for (int i = 0; i < c; i++) {
            s = m3142minOf5PvTz6A(s, dpP.c(sArr, i));
        }
        return s;
    }
}
