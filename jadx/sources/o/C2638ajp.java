package o;

import j$.time.Instant;

/* renamed from: o.ajp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2638ajp implements InterfaceC9037hy {
    private final String a;
    private final Integer b;
    private final c c;
    private final Integer d;
    private final d e;
    private final Integer g;

    public final Integer a() {
        return this.b;
    }

    public final d b() {
        return this.e;
    }

    public final Integer c() {
        return this.g;
    }

    public final Integer d() {
        return this.d;
    }

    public final c e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2638ajp) {
            C2638ajp c2638ajp = (C2638ajp) obj;
            return C8632dsu.c((Object) this.a, (Object) c2638ajp.a) && C8632dsu.c(this.e, c2638ajp.e) && C8632dsu.c(this.d, c2638ajp.d) && C8632dsu.c(this.g, c2638ajp.g) && C8632dsu.c(this.b, c2638ajp.b) && C8632dsu.c(this.c, c2638ajp.c);
        }
        return false;
    }

    public final String h() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        d dVar = this.e;
        int hashCode2 = dVar == null ? 0 : dVar.hashCode();
        Integer num = this.d;
        int hashCode3 = num == null ? 0 : num.hashCode();
        Integer num2 = this.g;
        int hashCode4 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.b;
        int hashCode5 = num3 == null ? 0 : num3.hashCode();
        c cVar = this.c;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (cVar != null ? cVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.a;
        d dVar = this.e;
        Integer num = this.d;
        Integer num2 = this.g;
        Integer num3 = this.b;
        c cVar = this.c;
        return "Viewable(__typename=" + str + ", bookmark=" + dVar + ", displayRuntime=" + num + ", runtime=" + num2 + ", logicalEndOffset=" + num3 + ", protected=" + cVar + ")";
    }

    public C2638ajp(String str, d dVar, Integer num, Integer num2, Integer num3, c cVar) {
        C8632dsu.c((Object) str, "");
        this.a = str;
        this.e = dVar;
        this.d = num;
        this.g = num2;
        this.b = num3;
        this.c = cVar;
    }

    /* renamed from: o.ajp$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final Double b;
        private final Instant d;
        private final String e;

        public final Instant a() {
            return this.d;
        }

        public final Double b() {
            return this.b;
        }

        public final String c() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.e, (Object) dVar.e) && C8632dsu.c(this.b, dVar.b) && C8632dsu.c(this.d, dVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            Double d = this.b;
            int hashCode2 = d == null ? 0 : d.hashCode();
            Instant instant = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (instant != null ? instant.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            Double d = this.b;
            Instant instant = this.d;
            return "Bookmark(__typename=" + str + ", position=" + d + ", lastModified=" + instant + ")";
        }

        public d(String str, Double d, Instant instant) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.b = d;
            this.d = instant;
        }
    }

    /* renamed from: o.ajp$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final Boolean a;
        private final String b;
        private final Boolean c;
        private final Boolean e;

        public final Boolean b() {
            return this.c;
        }

        public final Boolean c() {
            return this.a;
        }

        public final Boolean d() {
            return this.e;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c(this.a, cVar.a) && C8632dsu.c(this.e, cVar.e) && C8632dsu.c(this.c, cVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            Boolean bool = this.a;
            int hashCode2 = bool == null ? 0 : bool.hashCode();
            Boolean bool2 = this.e;
            int hashCode3 = bool2 == null ? 0 : bool2.hashCode();
            Boolean bool3 = this.c;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (bool3 != null ? bool3.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            Boolean bool = this.a;
            Boolean bool2 = this.e;
            Boolean bool3 = this.c;
            return "Protected(__typename=" + str + ", isPinProtected=" + bool + ", isAgeVerificationProtected=" + bool2 + ", isPreReleasePinProtected=" + bool3 + ")";
        }

        public c(String str, Boolean bool, Boolean bool2, Boolean bool3) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.a = bool;
            this.e = bool2;
            this.c = bool3;
        }
    }
}
