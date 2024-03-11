package o;

import java.util.TimeZone;

/* renamed from: o.dfQ  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8173dfQ extends C1045Mp {
    private static final TimeZone a;
    private static final TimeZone b;
    private static final TimeZone c;
    private static TimeZone d;
    public static final C8173dfQ e = new C8173dfQ();

    private C8173dfQ() {
        super("TimeZoneUtils");
    }

    static {
        TimeZone c2 = C8543dpm.c("America/New_York");
        C8632dsu.a(c2, "");
        b = c2;
        TimeZone c3 = C8543dpm.c("America/Denver");
        C8632dsu.a(c3, "");
        c = c3;
        TimeZone c4 = C8543dpm.c("America/Los_Angeles");
        C8632dsu.a(c4, "");
        a = c4;
        d = TimeZone.getDefault();
    }

    public final String d() {
        return d.getID();
    }
}
