package o;

import j$.time.Instant;
import java.util.List;

/* renamed from: o.afr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2428afr implements InterfaceC9037hy {
    private final Instant a;
    private final d b;
    private final String c;
    private final String d;
    private final String e;
    private final e f;

    public final Instant a() {
        return this.a;
    }

    public final e b() {
        return this.f;
    }

    public final String c() {
        return this.c;
    }

    public final d d() {
        return this.b;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2428afr) {
            C2428afr c2428afr = (C2428afr) obj;
            return C8632dsu.c((Object) this.e, (Object) c2428afr.e) && C8632dsu.c((Object) this.c, (Object) c2428afr.c) && C8632dsu.c((Object) this.d, (Object) c2428afr.d) && C8632dsu.c(this.a, c2428afr.a) && C8632dsu.c(this.f, c2428afr.f) && C8632dsu.c(this.b, c2428afr.b);
        }
        return false;
    }

    public final String g() {
        return this.e;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        int hashCode2 = this.c.hashCode();
        String str = this.d;
        int hashCode3 = str == null ? 0 : str.hashCode();
        Instant instant = this.a;
        int hashCode4 = instant == null ? 0 : instant.hashCode();
        e eVar = this.f;
        int hashCode5 = eVar == null ? 0 : eVar.hashCode();
        d dVar = this.b;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (dVar != null ? dVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.e;
        String str2 = this.c;
        String str3 = this.d;
        Instant instant = this.a;
        e eVar = this.f;
        d dVar = this.b;
        return "IrmaPageSection(__typename=" + str + ", id=" + str2 + ", sessionId=" + str3 + ", expires=" + instant + ", trackingInfo=" + eVar + ", sections=" + dVar + ")";
    }

    public C2428afr(String str, String str2, String str3, Instant instant, e eVar, d dVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.e = str;
        this.c = str2;
        this.d = str3;
        this.a = instant;
        this.f = eVar;
        this.b = dVar;
    }

    /* renamed from: o.afr$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String b;
        private final String c;

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c((Object) this.b, (Object) eVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.c;
            String str2 = this.b;
            return "TrackingInfo(__typename=" + str + ", requestId=" + str2 + ")";
        }

        public e(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.c = str;
            this.b = str2;
        }
    }

    /* renamed from: o.afr$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final int a;
        private final String b;
        private final b d;
        private final List<c> e;

        public final String a() {
            return this.b;
        }

        public final b b() {
            return this.d;
        }

        public final int d() {
            return this.a;
        }

        public final List<c> e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.b, (Object) dVar.b) && this.a == dVar.a && C8632dsu.c(this.e, dVar.e) && C8632dsu.c(this.d, dVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            int hashCode2 = Integer.hashCode(this.a);
            List<c> list = this.e;
            return (((((hashCode * 31) + hashCode2) * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.b;
            int i = this.a;
            List<c> list = this.e;
            b bVar = this.d;
            return "Sections(__typename=" + str + ", totalCount=" + i + ", edges=" + list + ", pageInfo=" + bVar + ")";
        }

        public d(String str, int i, List<c> list, b bVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bVar, "");
            this.b = str;
            this.a = i;
            this.e = list;
            this.d = bVar;
        }
    }

    /* renamed from: o.afr$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String b;
        private final String d;
        private final a e;

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.d;
        }

        public final a e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.d, (Object) cVar.d) && C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c(this.e, cVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            int hashCode2 = this.b.hashCode();
            a aVar = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            String str = this.d;
            String str2 = this.b;
            a aVar = this.e;
            return "Edge(__typename=" + str + ", cursor=" + str2 + ", node=" + aVar + ")";
        }

        public c(String str, String str2, a aVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.d = str;
            this.b = str2;
            this.e = aVar;
        }
    }

    /* renamed from: o.afr$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final C2411afj a;
        private final String c;
        private final C2415afn d;

        public final C2415afn a() {
            return this.d;
        }

        public final String c() {
            return this.c;
        }

        public final C2411afj d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.c, (Object) aVar.c) && C8632dsu.c(this.d, aVar.d) && C8632dsu.c(this.a, aVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            C2415afn c2415afn = this.d;
            int hashCode2 = c2415afn == null ? 0 : c2415afn.hashCode();
            C2411afj c2411afj = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (c2411afj != null ? c2411afj.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            C2415afn c2415afn = this.d;
            C2411afj c2411afj = this.a;
            return "Node(__typename=" + str + ", irmaEntityCollectionSectionFragment=" + c2415afn + ", irmaCreatorHomeFragment=" + c2411afj + ")";
        }

        public a(String str, C2415afn c2415afn, C2411afj c2411afj) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.d = c2415afn;
            this.a = c2411afj;
        }
    }

    /* renamed from: o.afr$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String a;
        private final boolean d;

        public final boolean b() {
            return this.d;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.a, (Object) bVar.a) && this.d == bVar.d;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + Boolean.hashCode(this.d);
        }

        public String toString() {
            String str = this.a;
            boolean z = this.d;
            return "PageInfo(__typename=" + str + ", hasNextPage=" + z + ")";
        }

        public b(String str, boolean z) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.d = z;
        }
    }
}
