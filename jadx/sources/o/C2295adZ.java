package o;

import j$.time.Instant;

/* renamed from: o.adZ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2295adZ implements InterfaceC9037hy {
    private final String a;
    private final Integer b;
    private final e c;
    private final Integer d;
    private final Integer e;

    public final String a() {
        return this.a;
    }

    public final e b() {
        return this.c;
    }

    public final Integer c() {
        return this.b;
    }

    public final Integer d() {
        return this.e;
    }

    public final Integer e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2295adZ) {
            C2295adZ c2295adZ = (C2295adZ) obj;
            return C8632dsu.c((Object) this.a, (Object) c2295adZ.a) && C8632dsu.c(this.e, c2295adZ.e) && C8632dsu.c(this.d, c2295adZ.d) && C8632dsu.c(this.b, c2295adZ.b) && C8632dsu.c(this.c, c2295adZ.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        Integer num = this.e;
        int hashCode2 = num == null ? 0 : num.hashCode();
        Integer num2 = this.d;
        int hashCode3 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.b;
        int hashCode4 = num3 == null ? 0 : num3.hashCode();
        e eVar = this.c;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (eVar != null ? eVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.a;
        Integer num = this.e;
        Integer num2 = this.d;
        Integer num3 = this.b;
        e eVar = this.c;
        return "DetailsViewable(__typename=" + str + ", runtimeSec=" + num + ", displayRuntimeSec=" + num2 + ", logicalEndOffsetSec=" + num3 + ", bookmark=" + eVar + ")";
    }

    public C2295adZ(String str, Integer num, Integer num2, Integer num3, e eVar) {
        C8632dsu.c((Object) str, "");
        this.a = str;
        this.e = num;
        this.d = num2;
        this.b = num3;
        this.c = eVar;
    }

    /* renamed from: o.adZ$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String a;
        private final Integer b;
        private final Instant c;
        private final Double d;

        public final Integer a() {
            return this.b;
        }

        public final Instant b() {
            return this.c;
        }

        public final Double c() {
            return this.d;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.a, (Object) eVar.a) && C8632dsu.c(this.b, eVar.b) && C8632dsu.c(this.c, eVar.c) && C8632dsu.c(this.d, eVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            Integer num = this.b;
            int hashCode2 = num == null ? 0 : num.hashCode();
            Instant instant = this.c;
            int hashCode3 = instant == null ? 0 : instant.hashCode();
            Double d = this.d;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (d != null ? d.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            Integer num = this.b;
            Instant instant = this.c;
            Double d = this.d;
            return "Bookmark(__typename=" + str + ", interactivePlaybackProgressPercentage=" + num + ", lastModified=" + instant + ", position=" + d + ")";
        }

        public e(String str, Integer num, Instant instant, Double d) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.b = num;
            this.c = instant;
            this.d = d;
        }
    }
}
