package org.bouncycastle.math.raw;

import org.chromium.net.PrivateKeyType;

/* loaded from: classes6.dex */
public class Interleave {
    public static int expand16to32(int i) {
        int i2 = i & 65535;
        int i3 = (i2 | (i2 << 8)) & 16711935;
        int i4 = (i3 | (i3 << 4)) & 252645135;
        int i5 = (i4 | (i4 << 2)) & 858993459;
        return (i5 | (i5 << 1)) & 1431655765;
    }

    public static long expand32to64(int i) {
        int bitPermuteStep = Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(i, 65280, 8), 15728880, 4), 202116108, 2), 572662306, 1);
        return (((bitPermuteStep >>> 1) & 1431655765) << 32) | (1431655765 & bitPermuteStep);
    }

    public static void expand64To128(long j, long[] jArr, int i) {
        long bitPermuteStep = Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(j, 4294901760L, 16), 280375465148160L, 8), 67555025218437360L, 4), 868082074056920076L, 2), 2459565876494606882L, 1);
        jArr[i] = bitPermuteStep & 6148914691236517205L;
        jArr[i + 1] = (bitPermuteStep >>> 1) & 6148914691236517205L;
    }

    public static void expand64To128(long[] jArr, int i, int i2, long[] jArr2, int i3) {
        for (int i4 = 0; i4 < i2; i4++) {
            expand64To128(jArr[i + i4], jArr2, i3);
            i3 += 2;
        }
    }

    public static int expand8to16(int i) {
        int i2 = i & PrivateKeyType.INVALID;
        int i3 = (i2 | (i2 << 4)) & 3855;
        int i4 = (i3 | (i3 << 2)) & 13107;
        return (i4 | (i4 << 1)) & 21845;
    }

    public static long unshuffle(long j) {
        return Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(Bits.bitPermuteStep(j, 2459565876494606882L, 1), 868082074056920076L, 2), 67555025218437360L, 4), 280375465148160L, 8), 4294901760L, 16);
    }
}
