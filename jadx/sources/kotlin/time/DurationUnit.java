package kotlin.time;

import java.util.concurrent.TimeUnit;
import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class DurationUnit {
    private static final /* synthetic */ DurationUnit[] h;
    private static final /* synthetic */ InterfaceC8598drn i;
    private final TimeUnit g;
    public static final DurationUnit j = new DurationUnit("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
    public static final DurationUnit e = new DurationUnit("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    public static final DurationUnit a = new DurationUnit("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    public static final DurationUnit f = new DurationUnit("SECONDS", 3, TimeUnit.SECONDS);
    public static final DurationUnit c = new DurationUnit("MINUTES", 4, TimeUnit.MINUTES);
    public static final DurationUnit d = new DurationUnit("HOURS", 5, TimeUnit.HOURS);
    public static final DurationUnit b = new DurationUnit("DAYS", 6, TimeUnit.DAYS);

    private static final /* synthetic */ DurationUnit[] a() {
        return new DurationUnit[]{j, e, a, f, c, d, b};
    }

    public static DurationUnit valueOf(String str) {
        return (DurationUnit) Enum.valueOf(DurationUnit.class, str);
    }

    public static DurationUnit[] values() {
        return (DurationUnit[]) h.clone();
    }

    public final TimeUnit d() {
        return this.g;
    }

    private DurationUnit(String str, int i2, TimeUnit timeUnit) {
        this.g = timeUnit;
    }

    static {
        DurationUnit[] a2 = a();
        h = a2;
        i = C8600drp.e(a2);
    }
}
