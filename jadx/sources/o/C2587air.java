package o;

import j$.time.Instant;

/* renamed from: o.air  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2587air implements InterfaceC9037hy {
    private final Integer a;
    private final b b;
    private final Integer c;
    private final String d;
    private final Integer e;

    public final String a() {
        return this.d;
    }

    public final b b() {
        return this.b;
    }

    public final Integer c() {
        return this.a;
    }

    public final Integer d() {
        return this.e;
    }

    public final Integer e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2587air) {
            C2587air c2587air = (C2587air) obj;
            return C8632dsu.c((Object) this.d, (Object) c2587air.d) && C8632dsu.c(this.e, c2587air.e) && C8632dsu.c(this.a, c2587air.a) && C8632dsu.c(this.c, c2587air.c) && C8632dsu.c(this.b, c2587air.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        Integer num = this.e;
        int hashCode2 = num == null ? 0 : num.hashCode();
        Integer num2 = this.a;
        int hashCode3 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.c;
        int hashCode4 = num3 == null ? 0 : num3.hashCode();
        b bVar = this.b;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.d;
        Integer num = this.e;
        Integer num2 = this.a;
        Integer num3 = this.c;
        b bVar = this.b;
        return "PlayerViewable(__typename=" + str + ", runtimeSec=" + num + ", displayRuntimeSec=" + num2 + ", logicalEndOffsetSec=" + num3 + ", bookmark=" + bVar + ")";
    }

    public C2587air(String str, Integer num, Integer num2, Integer num3, b bVar) {
        C8632dsu.c((Object) str, "");
        this.d = str;
        this.e = num;
        this.a = num2;
        this.c = num3;
        this.b = bVar;
    }

    /* renamed from: o.air$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final Integer a;
        private final Double c;
        private final String d;
        private final Instant e;

        public final Double a() {
            return this.c;
        }

        public final String b() {
            return this.d;
        }

        public final Integer c() {
            return this.a;
        }

        public final Instant d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.d, (Object) bVar.d) && C8632dsu.c(this.a, bVar.a) && C8632dsu.c(this.e, bVar.e) && C8632dsu.c(this.c, bVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            Integer num = this.a;
            int hashCode2 = num == null ? 0 : num.hashCode();
            Instant instant = this.e;
            int hashCode3 = instant == null ? 0 : instant.hashCode();
            Double d = this.c;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (d != null ? d.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            Integer num = this.a;
            Instant instant = this.e;
            Double d = this.c;
            return "Bookmark(__typename=" + str + ", interactivePlaybackProgressPercentage=" + num + ", lastModified=" + instant + ", position=" + d + ")";
        }

        public b(String str, Integer num, Instant instant, Double d) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.a = num;
            this.e = instant;
            this.c = d;
        }
    }
}
