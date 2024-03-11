package o;

import o.C9404ou;

/* renamed from: o.oy  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C9408oy {
    private static final float[] b = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float e(boolean z, long j, int i, boolean z2, int i2) {
        if (j == 0) {
            return 0.0f;
        }
        if (z2) {
            if (-45 <= i2 && i2 <= 38) {
                float b2 = b(z, j, i2);
                float b3 = b(z, j + 1, i2);
                if (!Float.isNaN(b2) && b3 == b2) {
                    return b2;
                }
            }
        } else if (-45 <= i && i <= 38) {
            return b(z, j, i);
        }
        return Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float d(boolean z, long j, int i, boolean z2, int i2) {
        if (j == 0) {
            return 0.0f;
        }
        if (z2) {
            if (-126 <= i2 && i2 <= 127) {
                float a = a(z, j, i2);
                float a2 = a(z, j + 1, i2);
                if (!Double.isNaN(a) && a2 == a) {
                    return a;
                }
            }
        } else if (-126 <= i && i <= 127) {
            return a(z, j, i);
        }
        return Float.NaN;
    }

    static float b(boolean z, long j, int i) {
        int compare;
        int compare2;
        int compare3;
        int compare4;
        float f;
        if (-10 <= i && i <= 10) {
            compare4 = Long.compare(j ^ Long.MIN_VALUE, 16777215 ^ Long.MIN_VALUE);
            if (compare4 <= 0) {
                float f2 = (float) j;
                if (i < 0) {
                    f = f2 / b[-i];
                } else {
                    f = f2 * b[i];
                }
                return z ? -f : f;
            }
        }
        int i2 = i + 325;
        long j2 = C9404ou.c[i2];
        long j3 = i;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j);
        long j4 = j << numberOfLeadingZeros;
        C9404ou.a c = C9404ou.c(j4, j2);
        long j5 = c.a;
        long j6 = c.b;
        if ((j6 & 274877906943L) == 274877906943L) {
            compare = Long.compare((j5 + j4) ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
            if (compare < 0) {
                C9404ou.a c2 = C9404ou.c(j4, C9404ou.a[i2]);
                long j7 = c2.a;
                long j8 = c2.b + j5;
                compare2 = Long.compare(j8 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
                if (compare2 < 0) {
                    j6++;
                }
                if (j8 + 1 == 0 && (j6 & 549755813887L) == 549755813887L) {
                    compare3 = Long.compare(j4 ^ Long.MIN_VALUE, j7 ^ Long.MIN_VALUE);
                    if (j7 + compare3 < 0) {
                        return Float.NaN;
                    }
                }
            }
        }
        long j9 = j6 >>> 63;
        long j10 = j6 >>> ((int) (38 + j9));
        int i3 = numberOfLeadingZeros + ((int) (j9 ^ 1));
        long j11 = j6 & 274877906943L;
        if (j11 != 274877906943L && (j11 != 0 || (3 & j10) != 1)) {
            long j12 = (j10 + 1) >>> 1;
            if (j12 >= 16777216) {
                i3--;
                j12 = 8388608;
            }
            long j13 = (((j3 * 217706) >> 16) + 191) - i3;
            if (j13 >= 1 && j13 <= 254) {
                return Float.intBitsToFloat((int) ((j13 << 23) | ((-8388609) & j12) | (z ? 2147483648L : 0L)));
            }
        }
        return Float.NaN;
    }

    static float a(boolean z, long j, int i) {
        int compare;
        if (j == 0 || i < -180) {
            return 0.0f;
        }
        if (i > 127) {
            return z ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
        }
        compare = Long.compare(j ^ Long.MIN_VALUE, 9007199254740991L ^ Long.MIN_VALUE);
        if (compare <= 0) {
            float scalb = ((float) j) * Math.scalb(1.0f, i);
            return z ? -scalb : scalb;
        }
        return Float.NaN;
    }
}
