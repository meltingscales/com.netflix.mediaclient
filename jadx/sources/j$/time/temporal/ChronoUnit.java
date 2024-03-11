package j$.time.temporal;

import j$.time.Duration;
import o.InterfaceC8540dpj;
import o.doX;

/* loaded from: classes.dex */
public enum ChronoUnit implements InterfaceC8540dpj {
    NANOS("Nanos", Duration.e(1)),
    MICROS("Micros", Duration.e(1000)),
    MILLIS("Millis", Duration.e(1000000)),
    SECONDS("Seconds", Duration.b(1)),
    MINUTES("Minutes", Duration.b(60)),
    HOURS("Hours", Duration.b(3600)),
    HALF_DAYS("HalfDays", Duration.b(43200)),
    DAYS("Days", Duration.b(86400)),
    WEEKS("Weeks", Duration.b(604800)),
    MONTHS("Months", Duration.b(2629746)),
    YEARS("Years", Duration.b(31556952)),
    DECADES("Decades", Duration.b(315569520)),
    CENTURIES("Centuries", Duration.b(3155695200L)),
    MILLENNIA("Millennia", Duration.b(31556952000L)),
    ERAS("Eras", Duration.b(31556952000000000L)),
    FOREVER("Forever", Duration.b(Long.MAX_VALUE, 999999999));
    
    private final String s;
    private final Duration t;

    ChronoUnit(String str, Duration duration) {
        this.s = str;
        this.t = duration;
    }

    @Override // o.InterfaceC8540dpj
    public boolean a() {
        return compareTo(DAYS) < 0;
    }

    @Override // o.InterfaceC8540dpj
    public long d(doX dox, doX dox2) {
        return dox.a(dox2, this);
    }

    public Duration d() {
        return this.t;
    }

    @Override // o.InterfaceC8540dpj
    public doX e(doX dox, long j) {
        return dox.b(j, this);
    }

    @Override // o.InterfaceC8540dpj
    public boolean e() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.s;
    }
}
