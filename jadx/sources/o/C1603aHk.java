package o;

/* renamed from: o.aHk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1603aHk {
    private final C1604aHl a;
    private final C1604aHl b;
    private final C1604aHl c;
    private final boolean d;
    private final boolean e;

    public C1603aHk() {
        this(null, null, null, false, false, 31, null);
    }

    public final boolean a() {
        return this.d;
    }

    public final C1604aHl b() {
        return this.c;
    }

    public final boolean c() {
        return this.e;
    }

    public final C1604aHl d() {
        return this.a;
    }

    public final C1604aHl e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1603aHk) {
            C1603aHk c1603aHk = (C1603aHk) obj;
            return C8632dsu.c(this.b, c1603aHk.b) && C8632dsu.c(this.a, c1603aHk.a) && C8632dsu.c(this.c, c1603aHk.c) && this.d == c1603aHk.d && this.e == c1603aHk.e;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.b.hashCode() * 31) + this.a.hashCode()) * 31) + this.c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.e);
    }

    public String toString() {
        C1604aHl c1604aHl = this.b;
        C1604aHl c1604aHl2 = this.a;
        C1604aHl c1604aHl3 = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        return "LoggerState(monitoringEventState=" + c1604aHl + ", errorEventState=" + c1604aHl2 + ", errorEventStateForExternalLogging=" + c1604aHl3 + ", isBreadcrumbLoggingEnabled=" + z + ", shouldFilterBlocklistedCrashes=" + z2 + ")";
    }

    public C1603aHk(C1604aHl c1604aHl, C1604aHl c1604aHl2, C1604aHl c1604aHl3, boolean z, boolean z2) {
        C8632dsu.c((Object) c1604aHl, "");
        C8632dsu.c((Object) c1604aHl2, "");
        C8632dsu.c((Object) c1604aHl3, "");
        this.b = c1604aHl;
        this.a = c1604aHl2;
        this.c = c1604aHl3;
        this.d = z;
        this.e = z2;
    }

    public /* synthetic */ C1603aHk(C1604aHl c1604aHl, C1604aHl c1604aHl2, C1604aHl c1604aHl3, boolean z, boolean z2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? new C1604aHl(null, null, 3, null) : c1604aHl, (i & 2) != 0 ? new C1604aHl(null, null, 3, null) : c1604aHl2, (i & 4) != 0 ? new C1604aHl(null, null, 3, null) : c1604aHl3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }
}
