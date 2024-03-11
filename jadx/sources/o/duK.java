package o;

import kotlin.time.DurationUnit;
import o.duI;

/* loaded from: classes6.dex */
public final class duK {
    private static final long b(long j) {
        return j < 0 ? duI.d.d() : duI.d.a();
    }

    public static final long e(long j, long j2, DurationUnit durationUnit) {
        C8632dsu.c((Object) durationUnit, "");
        if ((1 | (j2 - 1)) == Long.MAX_VALUE) {
            return duI.q(b(j2));
        }
        return b(j, j2, durationUnit);
    }

    public static final long d(long j, long j2, DurationUnit durationUnit) {
        C8632dsu.c((Object) durationUnit, "");
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            if (j == j2) {
                return duI.d.b();
            }
            return duI.q(b(j2));
        } else if ((1 | (j - 1)) == Long.MAX_VALUE) {
            return b(j);
        } else {
            return b(j, j2, durationUnit);
        }
    }

    private static final long b(long j, long j2, DurationUnit durationUnit) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) < 0) {
            DurationUnit durationUnit2 = DurationUnit.a;
            if (durationUnit.compareTo(durationUnit2) < 0) {
                long b = duJ.b(1L, durationUnit2, durationUnit);
                duI.b bVar = duI.d;
                return duI.a(duM.e((j / b) - (j2 / b), durationUnit2), duM.e((j % b) - (j2 % b), durationUnit));
            }
            return duI.q(b(j3));
        }
        return duM.e(j3, durationUnit);
    }
}
