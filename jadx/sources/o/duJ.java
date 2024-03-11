package o;

import kotlin.time.DurationUnit;

/* loaded from: classes5.dex */
class duJ {
    public static final double c(double d, DurationUnit durationUnit, DurationUnit durationUnit2) {
        C8632dsu.c((Object) durationUnit, "");
        C8632dsu.c((Object) durationUnit2, "");
        long convert = durationUnit2.d().convert(1L, durationUnit.d());
        return convert > 0 ? d * convert : d / durationUnit.d().convert(1L, durationUnit2.d());
    }

    public static final long a(long j, DurationUnit durationUnit, DurationUnit durationUnit2) {
        C8632dsu.c((Object) durationUnit, "");
        C8632dsu.c((Object) durationUnit2, "");
        return durationUnit2.d().convert(j, durationUnit.d());
    }

    public static final long b(long j, DurationUnit durationUnit, DurationUnit durationUnit2) {
        C8632dsu.c((Object) durationUnit, "");
        C8632dsu.c((Object) durationUnit2, "");
        return durationUnit2.d().convert(j, durationUnit.d());
    }
}
