package o;

import j$.time.Instant;
import java.util.List;

/* renamed from: o.ahR  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2508ahR implements InterfaceC9037hy {
    private final b a;
    private final Instant b;
    private final String c;
    private final String d;
    private final String e;
    private final d g;

    public final d a() {
        return this.g;
    }

    public final b b() {
        return this.a;
    }

    public final Instant c() {
        return this.b;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2508ahR) {
            C2508ahR c2508ahR = (C2508ahR) obj;
            return C8632dsu.c((Object) this.e, (Object) c2508ahR.e) && C8632dsu.c((Object) this.d, (Object) c2508ahR.d) && C8632dsu.c((Object) this.c, (Object) c2508ahR.c) && C8632dsu.c(this.b, c2508ahR.b) && C8632dsu.c(this.g, c2508ahR.g) && C8632dsu.c(this.a, c2508ahR.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        int hashCode2 = this.d.hashCode();
        String str = this.c;
        int hashCode3 = str == null ? 0 : str.hashCode();
        Instant instant = this.b;
        int hashCode4 = instant == null ? 0 : instant.hashCode();
        d dVar = this.g;
        int hashCode5 = dVar == null ? 0 : dVar.hashCode();
        b bVar = this.a;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String i() {
        return this.e;
    }

    public String toString() {
        String str = this.e;
        String str2 = this.d;
        String str3 = this.c;
        Instant instant = this.b;
        d dVar = this.g;
        b bVar = this.a;
        return "PinotPageSectionFragment(__typename=" + str + ", id=" + str2 + ", sessionId=" + str3 + ", expires=" + instant + ", trackingInfo=" + dVar + ", sections=" + bVar + ")";
    }

    public C2508ahR(String str, String str2, String str3, Instant instant, d dVar, b bVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.e = str;
        this.d = str2;
        this.c = str3;
        this.b = instant;
        this.g = dVar;
        this.a = bVar;
    }

    /* renamed from: o.ahR$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String a;
        private final String e;

        public final String b() {
            return this.e;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.a, (Object) dVar.a) && C8632dsu.c((Object) this.e, (Object) dVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.a;
            String str2 = this.e;
            return "TrackingInfo(__typename=" + str + ", requestId=" + str2 + ")";
        }

        public d(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.a = str;
            this.e = str2;
        }
    }

    /* renamed from: o.ahR$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final List<c> a;
        private final e b;
        private final int c;
        private final String e;

        public final int a() {
            return this.c;
        }

        public final String b() {
            return this.e;
        }

        public final e c() {
            return this.b;
        }

        public final List<c> d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.e, (Object) bVar.e) && this.c == bVar.c && C8632dsu.c(this.a, bVar.a) && C8632dsu.c(this.b, bVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            int hashCode2 = Integer.hashCode(this.c);
            List<c> list = this.a;
            return (((((hashCode * 31) + hashCode2) * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.e;
            int i = this.c;
            List<c> list = this.a;
            e eVar = this.b;
            return "Sections(__typename=" + str + ", totalCount=" + i + ", edges=" + list + ", pageInfo=" + eVar + ")";
        }

        public b(String str, int i, List<c> list, e eVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) eVar, "");
            this.e = str;
            this.c = i;
            this.a = list;
            this.b = eVar;
        }
    }

    /* renamed from: o.ahR$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final a a;
        private final String c;
        private final String d;

        public final a b() {
            return this.a;
        }

        public final String c() {
            return this.d;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.c, (Object) cVar.c) && C8632dsu.c((Object) this.d, (Object) cVar.d) && C8632dsu.c(this.a, cVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            int hashCode2 = this.d.hashCode();
            a aVar = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            String str = this.c;
            String str2 = this.d;
            a aVar = this.a;
            return "Edge(__typename=" + str + ", cursor=" + str2 + ", node=" + aVar + ")";
        }

        public c(String str, String str2, a aVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.c = str;
            this.d = str2;
            this.a = aVar;
        }
    }

    /* renamed from: o.ahR$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final C2498ahH a;
        private final String c;
        private final C2499ahI e;

        public final String b() {
            return this.c;
        }

        public final C2498ahH c() {
            return this.a;
        }

        public final C2499ahI e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.c, (Object) aVar.c) && C8632dsu.c(this.e, aVar.e) && C8632dsu.c(this.a, aVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            C2499ahI c2499ahI = this.e;
            int hashCode2 = c2499ahI == null ? 0 : c2499ahI.hashCode();
            C2498ahH c2498ahH = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (c2498ahH != null ? c2498ahH.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            C2499ahI c2499ahI = this.e;
            C2498ahH c2498ahH = this.a;
            return "Node(__typename=" + str + ", pinotOption5EntityCollectionSectionFragment=" + c2499ahI + ", pinotOption5CreatorHomeFragment=" + c2498ahH + ")";
        }

        public a(String str, C2499ahI c2499ahI, C2498ahH c2498ahH) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.e = c2499ahI;
            this.a = c2498ahH;
        }
    }

    /* renamed from: o.ahR$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final boolean c;
        private final String d;

        public final boolean a() {
            return this.c;
        }

        public final String b() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.d, (Object) eVar.d) && this.c == eVar.c;
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + Boolean.hashCode(this.c);
        }

        public String toString() {
            String str = this.d;
            boolean z = this.c;
            return "PageInfo(__typename=" + str + ", hasNextPage=" + z + ")";
        }

        public e(String str, boolean z) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.c = z;
        }
    }
}
