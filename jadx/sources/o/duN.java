package o;

import kotlin.time.DurationUnit;
import o.duQ;

/* loaded from: classes6.dex */
public final class duN implements duP {
    public static final duN e = new duN();
    private static final long c = System.nanoTime();

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }

    private duN() {
    }

    private final long b() {
        return System.nanoTime() - c;
    }

    public long c() {
        return duQ.e.b.a(b());
    }

    public final long a(long j) {
        return duK.e(b(), j, DurationUnit.j);
    }

    public final long a(long j, long j2) {
        return duK.d(j, j2, DurationUnit.j);
    }
}
