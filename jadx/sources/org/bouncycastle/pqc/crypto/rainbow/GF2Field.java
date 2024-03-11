package org.bouncycastle.pqc.crypto.rainbow;

import com.netflix.android.org.json.zip.JSONzip;
import java.lang.reflect.Array;
import org.bouncycastle.util.Pack;

/* loaded from: classes6.dex */
class GF2Field {
    static final byte[][] gfMulTable = (byte[][]) Array.newInstance(Byte.TYPE, JSONzip.end, JSONzip.end);
    static final byte[] gfInvTable = new byte[JSONzip.end];

    static {
        int i;
        long j;
        int i2 = 1;
        long j2 = 72340172838076673L;
        while (true) {
            i = 0;
            j = 506097522914230528L;
            if (i2 > 255) {
                break;
            }
            while (i < 256) {
                Pack.longToLittleEndian(gf256Mul_64(j2, j), gfMulTable[i2], i);
                j += 578721382704613384L;
                i += 8;
            }
            j2 += 72340172838076673L;
            i2++;
        }
        while (i < 256) {
            Pack.longToLittleEndian(gf256Inv_64(j), gfInvTable, i);
            j += 578721382704613384L;
            i += 8;
        }
    }

    GF2Field() {
    }

    public static short addElem(short s, short s2) {
        return (short) (s ^ s2);
    }

    private static long gf16Mul8_64(long j) {
        long j2 = (-3689348814741910324L) & j;
        long j3 = j2 >>> 2;
        return gf4Mul2_64((((j & 3689348814741910323L) << 2) ^ j2) ^ j3) ^ j3;
    }

    private static long gf16Mul_64(long j, long j2) {
        long gf4Mul_64 = gf4Mul_64(j, j2);
        long j3 = 3689348814741910323L & gf4Mul_64;
        return (gf4Mul_64(((j ^ (j << 2)) & (-3689348814741910324L)) ^ ((gf4Mul_64 & (-3689348814741910324L)) >>> 2), ((j2 ^ (j2 << 2)) & (-3689348814741910324L)) ^ 2459565876494606882L) ^ (j3 << 2)) ^ j3;
    }

    private static long gf16Squ_64(long j) {
        long gf4Squ_64 = gf4Squ_64(j);
        return gf4Squ_64 ^ (gf4Mul2_64((-3689348814741910324L) & gf4Squ_64) >>> 2);
    }

    private static long gf256Inv_64(long j) {
        long gf256Squ_64 = gf256Squ_64(j);
        long gf256Squ_642 = gf256Squ_64(gf256Squ_64);
        long gf256Mul_64 = gf256Mul_64(gf256Mul_64(gf256Squ_642, gf256Squ_64), gf256Squ_64(gf256Squ_642));
        return gf256Mul_64(gf256Squ_64, gf256Squ_64(gf256Mul_64(gf256Squ_64(gf256Squ_64(gf256Squ_64(gf256Mul_64))), gf256Mul_64)));
    }

    private static long gf256Mul_64(long j, long j2) {
        long gf16Mul_64 = gf16Mul_64(j, j2);
        long j3 = 1085102592571150095L & gf16Mul_64;
        return (gf16Mul_64(((j ^ (j << 4)) & (-1085102592571150096L)) ^ ((gf16Mul_64 & (-1085102592571150096L)) >>> 4), ((j2 ^ (j2 << 4)) & (-1085102592571150096L)) ^ 578721382704613384L) ^ (j3 << 4)) ^ j3;
    }

    private static long gf256Squ_64(long j) {
        long gf16Squ_64 = gf16Squ_64(j);
        return gf16Squ_64 ^ (gf16Mul8_64((-1085102592571150096L) & gf16Squ_64) >>> 4);
    }

    private static long gf4Mul2_64(long j) {
        long j2 = (-6148914691236517206L) & j;
        return (((j & 6148914691236517205L) << 1) ^ j2) ^ (j2 >>> 1);
    }

    private static long gf4Mul_64(long j, long j2) {
        long j3 = j & j2;
        return ((((j & (j2 << 1)) ^ ((j << 1) & j2)) & (-6148914691236517206L)) ^ j3) ^ ((j3 & (-6148914691236517206L)) >>> 1);
    }

    private static long gf4Squ_64(long j) {
        return j ^ (((-6148914691236517206L) & j) >>> 1);
    }

    public static short multElem(short s, short s2) {
        return (short) (gfMulTable[s][s2] & 255);
    }
}
