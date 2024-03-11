package com.google.common.primitives;

import com.google.common.base.Preconditions;

/* loaded from: classes2.dex */
public final class UnsignedBytes {
    public static int toInt(byte b) {
        return b & 255;
    }

    public static byte checkedCast(long j) {
        Preconditions.checkArgument((j >> 8) == 0, "out of range: %s", j);
        return (byte) j;
    }
}
