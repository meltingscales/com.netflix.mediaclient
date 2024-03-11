package o;

import j$.time.Instant;

/* renamed from: o.atY  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3151atY {
    private final boolean a;
    private final String c;
    private final Instant d;

    public final String a() {
        return this.c;
    }

    public final boolean b() {
        return this.a;
    }

    public final Instant c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3151atY) {
            C3151atY c3151atY = (C3151atY) obj;
            return C8632dsu.c((Object) this.c, (Object) c3151atY.c) && C8632dsu.c(this.d, c3151atY.d) && this.a == c3151atY.a;
        }
        return false;
    }

    public int hashCode() {
        return (((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.a);
    }

    public String toString() {
        String str = this.c;
        Instant instant = this.d;
        boolean z = this.a;
        return "RdidConsentState(id=" + str + ", displayedAt=" + instant + ", isDenied=" + z + ")";
    }

    public C3151atY(String str, Instant instant, boolean z) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) instant, "");
        this.c = str;
        this.d = instant;
        this.a = z;
    }
}
