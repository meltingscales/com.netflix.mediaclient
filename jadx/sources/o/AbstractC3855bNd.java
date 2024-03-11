package o;

import j$.time.Instant;

/* renamed from: o.bNd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3855bNd {
    private final Instant a;
    private final int b;
    private final String d;
    private final String e;

    public /* synthetic */ AbstractC3855bNd(String str, String str2, Instant instant, int i, C8627dsp c8627dsp) {
        this(str, str2, instant, i);
    }

    public String b() {
        return this.d;
    }

    public String c() {
        return this.e;
    }

    public int d() {
        return this.b;
    }

    public Instant e() {
        return this.a;
    }

    private AbstractC3855bNd(String str, String str2, Instant instant, int i) {
        this.e = str;
        this.d = str2;
        this.a = instant;
        this.b = i;
    }

    /* renamed from: o.bNd$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3855bNd {
        private final Instant a;
        private final String c;
        private final int d;
        private final String e;

        public static /* synthetic */ c e(c cVar, String str, String str2, Instant instant, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = cVar.e;
            }
            if ((i2 & 2) != 0) {
                str2 = cVar.c;
            }
            if ((i2 & 4) != 0) {
                instant = cVar.a;
            }
            if ((i2 & 8) != 0) {
                i = cVar.d;
            }
            return cVar.a(str, str2, instant, i);
        }

        public final c a(String str, String str2, Instant instant, int i) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) instant, "");
            return new c(str, str2, instant, i);
        }

        @Override // o.AbstractC3855bNd
        public String b() {
            return this.c;
        }

        @Override // o.AbstractC3855bNd
        public String c() {
            return this.e;
        }

        @Override // o.AbstractC3855bNd
        public int d() {
            return this.d;
        }

        @Override // o.AbstractC3855bNd
        public Instant e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.e, (Object) cVar.e) && C8632dsu.c((Object) this.c, (Object) cVar.c) && C8632dsu.c(this.a, cVar.a) && this.d == cVar.d;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.e.hashCode() * 31) + this.c.hashCode()) * 31) + this.a.hashCode()) * 31) + Integer.hashCode(this.d);
        }

        public String toString() {
            String str = this.e;
            String str2 = this.c;
            Instant instant = this.a;
            int i = this.d;
            return "CreateBeacon(beaconType=" + str + ", beaconCode=" + str2 + ", validUntil=" + instant + ", gameId=" + i + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, Instant instant, int i) {
            super(str, str2, instant, i, null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) instant, "");
            this.e = str;
            this.c = str2;
            this.a = instant;
            this.d = i;
        }
    }

    /* renamed from: o.bNd$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3855bNd {
        private final int b;
        private final Instant c;
        private final String d;
        private final String e;

        @Override // o.AbstractC3855bNd
        public String b() {
            return this.e;
        }

        @Override // o.AbstractC3855bNd
        public String c() {
            return this.d;
        }

        @Override // o.AbstractC3855bNd
        public int d() {
            return this.b;
        }

        @Override // o.AbstractC3855bNd
        public Instant e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.d, (Object) dVar.d) && C8632dsu.c((Object) this.e, (Object) dVar.e) && C8632dsu.c(this.c, dVar.c) && this.b == dVar.b;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.d.hashCode() * 31) + this.e.hashCode()) * 31) + this.c.hashCode()) * 31) + Integer.hashCode(this.b);
        }

        public String toString() {
            String str = this.d;
            String str2 = this.e;
            Instant instant = this.c;
            int i = this.b;
            return "CloseBeacon(beaconType=" + str + ", beaconCode=" + str2 + ", validUntil=" + instant + ", gameId=" + i + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, Instant instant, int i) {
            super(str, str2, instant, i, null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) instant, "");
            this.d = str;
            this.e = str2;
            this.c = instant;
            this.b = i;
        }
    }

    /* renamed from: o.bNd$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3855bNd {
        private final int a;
        private final Instant b;
        private final String c;
        private final String e;

        @Override // o.AbstractC3855bNd
        public String b() {
            return this.c;
        }

        @Override // o.AbstractC3855bNd
        public String c() {
            return this.e;
        }

        @Override // o.AbstractC3855bNd
        public int d() {
            return this.a;
        }

        @Override // o.AbstractC3855bNd
        public Instant e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.e, (Object) aVar.e) && C8632dsu.c((Object) this.c, (Object) aVar.c) && C8632dsu.c(this.b, aVar.b) && this.a == aVar.a;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.e.hashCode() * 31) + this.c.hashCode()) * 31) + this.b.hashCode()) * 31) + Integer.hashCode(this.a);
        }

        public String toString() {
            String str = this.e;
            String str2 = this.c;
            Instant instant = this.b;
            int i = this.a;
            return "ExtendBeacon(beaconType=" + str + ", beaconCode=" + str2 + ", validUntil=" + instant + ", gameId=" + i + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, Instant instant, int i) {
            super(str, str2, instant, i, null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) instant, "");
            this.e = str;
            this.c = str2;
            this.b = instant;
            this.a = i;
        }
    }
}
