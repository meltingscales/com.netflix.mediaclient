package o;

import j$.time.Instant;

/* renamed from: o.afz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2436afz implements InterfaceC9037hy {
    private final e b;
    private final String c;
    private final Instant d;

    public final String a() {
        return this.c;
    }

    public final e b() {
        return this.b;
    }

    public final Instant c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2436afz) {
            C2436afz c2436afz = (C2436afz) obj;
            return C8632dsu.c((Object) this.c, (Object) c2436afz.c) && C8632dsu.c(this.d, c2436afz.d) && C8632dsu.c(this.b, c2436afz.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        Instant instant = this.d;
        int hashCode2 = instant == null ? 0 : instant.hashCode();
        e eVar = this.b;
        return (((hashCode * 31) + hashCode2) * 31) + (eVar != null ? eVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.c;
        Instant instant = this.d;
        e eVar = this.b;
        return "LiveEventData(__typename=" + str + ", availabilityStartTime=" + instant + ", timeWindow=" + eVar + ")";
    }

    public C2436afz(String str, Instant instant, e eVar) {
        C8632dsu.c((Object) str, "");
        this.c = str;
        this.d = instant;
        this.b = eVar;
    }

    /* renamed from: o.afz$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final Instant d;
        private final String e;

        public final Instant b() {
            return this.d;
        }

        public final String c() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.e, (Object) eVar.e) && C8632dsu.c(this.d, eVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            Instant instant = this.d;
            return (hashCode * 31) + (instant == null ? 0 : instant.hashCode());
        }

        public String toString() {
            String str = this.e;
            Instant instant = this.d;
            return "TimeWindow(__typename=" + str + ", endTime=" + instant + ")";
        }

        public e(String str, Instant instant) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = instant;
        }
    }
}
