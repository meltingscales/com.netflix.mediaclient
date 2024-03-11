package org.bouncycastle.math.raw;

/* loaded from: classes6.dex */
public abstract class Bits {
    public static int bitPermuteStep(int i, int i2, int i3) {
        int i4 = i2 & ((i >>> i3) ^ i);
        return i ^ (i4 ^ (i4 << i3));
    }

    public static long bitPermuteStep(long j, long j2, int i) {
        long j3 = j2 & ((j >>> i) ^ j);
        return j ^ (j3 ^ (j3 << i));
    }
}
