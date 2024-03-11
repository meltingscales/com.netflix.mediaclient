package o;

import java.util.List;

/* renamed from: o.agl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2475agl implements InterfaceC9037hy {
    private final C2454agQ b;
    private final d d;
    private final String e;

    public final d a() {
        return this.d;
    }

    public final String b() {
        return this.e;
    }

    public final C2454agQ c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2475agl) {
            C2475agl c2475agl = (C2475agl) obj;
            return C8632dsu.c((Object) this.e, (Object) c2475agl.e) && C8632dsu.c(this.d, c2475agl.d) && C8632dsu.c(this.b, c2475agl.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        d dVar = this.d;
        return (((hashCode * 31) + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.e;
        d dVar = this.d;
        C2454agQ c2454agQ = this.b;
        return "LolomoGameRow(__typename=" + str + ", gameEntities=" + dVar + ", lolomoRow=" + c2454agQ + ")";
    }

    public C2475agl(String str, d dVar, C2454agQ c2454agQ) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2454agQ, "");
        this.e = str;
        this.d = dVar;
        this.b = c2454agQ;
    }

    /* renamed from: o.agl$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final List<b> a;
        private final String e;

        public final String c() {
            return this.e;
        }

        public final List<b> e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.e, (Object) dVar.e) && C8632dsu.c(this.a, dVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            List<b> list = this.a;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            String str = this.e;
            List<b> list = this.a;
            return "GameEntities(__typename=" + str + ", edges=" + list + ")";
        }

        public d(String str, List<b> list) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.a = list;
        }
    }

    /* renamed from: o.agl$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final c a;
        private final String b;
        private final C2342aeT c;
        private final Integer d;
        private final String e;

        public final c a() {
            return this.a;
        }

        public final C2342aeT b() {
            return this.c;
        }

        public final String c() {
            return this.b;
        }

        public final Integer d() {
            return this.d;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c((Object) this.e, (Object) bVar.e) && C8632dsu.c(this.d, bVar.d) && C8632dsu.c(this.a, bVar.a) && C8632dsu.c(this.c, bVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            String str = this.e;
            int hashCode2 = str == null ? 0 : str.hashCode();
            Integer num = this.d;
            int hashCode3 = num == null ? 0 : num.hashCode();
            c cVar = this.a;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (cVar != null ? cVar.hashCode() : 0)) * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.b;
            String str2 = this.e;
            Integer num = this.d;
            c cVar = this.a;
            C2342aeT c2342aeT = this.c;
            return "Edge(__typename=" + str + ", cursor=" + str2 + ", index=" + num + ", node=" + cVar + ", gameLolomoArtwork=" + c2342aeT + ")";
        }

        public b(String str, String str2, Integer num, c cVar, C2342aeT c2342aeT) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2342aeT, "");
            this.b = str;
            this.e = str2;
            this.d = num;
            this.a = cVar;
            this.c = c2342aeT;
        }
    }

    /* renamed from: o.agl$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final j b;
        private final h c;
        private final String d;
        private final f e;

        public final String a() {
            return this.d;
        }

        public final j c() {
            return this.b;
        }

        public final h d() {
            return this.c;
        }

        public final f e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.d, (Object) cVar.d) && C8632dsu.c(this.b, cVar.b) && C8632dsu.c(this.c, cVar.c) && C8632dsu.c(this.e, cVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            j jVar = this.b;
            int hashCode2 = jVar == null ? 0 : jVar.hashCode();
            h hVar = this.c;
            int hashCode3 = hVar == null ? 0 : hVar.hashCode();
            f fVar = this.e;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (fVar != null ? fVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            j jVar = this.b;
            h hVar = this.c;
            f fVar = this.e;
            return "Node(__typename=" + str + ", onLolomoDefaultNode=" + jVar + ", onLolomoBillboardNode=" + hVar + ", onLolomoGameNode=" + fVar + ")";
        }

        public c(String str, j jVar, h hVar, f fVar) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.b = jVar;
            this.c = hVar;
            this.e = fVar;
        }
    }

    /* renamed from: o.agl$j */
    /* loaded from: classes3.dex */
    public static final class j {
        private final g e;

        public final g d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && C8632dsu.c(this.e, ((j) obj).e);
        }

        public int hashCode() {
            g gVar = this.e;
            if (gVar == null) {
                return 0;
            }
            return gVar.hashCode();
        }

        public String toString() {
            g gVar = this.e;
            return "OnLolomoDefaultNode(reference=" + gVar + ")";
        }

        public j(g gVar) {
            this.e = gVar;
        }
    }

    /* renamed from: o.agl$g */
    /* loaded from: classes3.dex */
    public static final class g {
        private final String d;
        private final e e;

        public final String c() {
            return this.d;
        }

        public final e e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return C8632dsu.c((Object) this.d, (Object) gVar.d) && C8632dsu.c(this.e, gVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            e eVar = this.e;
            return (hashCode * 31) + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            String str = this.d;
            e eVar = this.e;
            return "Reference(__typename=" + str + ", onGame=" + eVar + ")";
        }

        public g(String str, e eVar) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.e = eVar;
        }
    }

    /* renamed from: o.agl$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final C2344aeV b;

        public final C2344aeV d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.b, ((e) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            C2344aeV c2344aeV = this.b;
            return "OnGame(gameSummary=" + c2344aeV + ")";
        }

        public e(C2344aeV c2344aeV) {
            C8632dsu.c((Object) c2344aeV, "");
            this.b = c2344aeV;
        }
    }

    /* renamed from: o.agl$h */
    /* loaded from: classes3.dex */
    public static final class h {
        private final k e;

        public final k b() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && C8632dsu.c(this.e, ((h) obj).e);
        }

        public int hashCode() {
            k kVar = this.e;
            if (kVar == null) {
                return 0;
            }
            return kVar.hashCode();
        }

        public String toString() {
            k kVar = this.e;
            return "OnLolomoBillboardNode(reference=" + kVar + ")";
        }

        public h(k kVar) {
            this.e = kVar;
        }
    }

    /* renamed from: o.agl$k */
    /* loaded from: classes3.dex */
    public static final class k {
        private final String a;
        private final a e;

        public final a c() {
            return this.e;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k) {
                k kVar = (k) obj;
                return C8632dsu.c((Object) this.a, (Object) kVar.a) && C8632dsu.c(this.e, kVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            a aVar = this.e;
            return (hashCode * 31) + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            String str = this.a;
            a aVar = this.e;
            return "Reference1(__typename=" + str + ", onGame=" + aVar + ")";
        }

        public k(String str, a aVar) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.e = aVar;
        }
    }

    /* renamed from: o.agl$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final C2344aeV d;

        public final C2344aeV b() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c(this.d, ((a) obj).d);
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        public String toString() {
            C2344aeV c2344aeV = this.d;
            return "OnGame1(gameSummary=" + c2344aeV + ")";
        }

        public a(C2344aeV c2344aeV) {
            C8632dsu.c((Object) c2344aeV, "");
            this.d = c2344aeV;
        }
    }

    /* renamed from: o.agl$f */
    /* loaded from: classes3.dex */
    public static final class f {
        private final m c;

        public final m a() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && C8632dsu.c(this.c, ((f) obj).c);
        }

        public int hashCode() {
            m mVar = this.c;
            if (mVar == null) {
                return 0;
            }
            return mVar.hashCode();
        }

        public String toString() {
            m mVar = this.c;
            return "OnLolomoGameNode(reference=" + mVar + ")";
        }

        public f(m mVar) {
            this.c = mVar;
        }
    }

    /* renamed from: o.agl$m */
    /* loaded from: classes3.dex */
    public static final class m {
        private final i a;
        private final String e;

        public final i a() {
            return this.a;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof m) {
                m mVar = (m) obj;
                return C8632dsu.c((Object) this.e, (Object) mVar.e) && C8632dsu.c(this.a, mVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            i iVar = this.a;
            return (hashCode * 31) + (iVar == null ? 0 : iVar.hashCode());
        }

        public String toString() {
            String str = this.e;
            i iVar = this.a;
            return "Reference2(__typename=" + str + ", onGame=" + iVar + ")";
        }

        public m(String str, i iVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.a = iVar;
        }
    }

    /* renamed from: o.agl$i */
    /* loaded from: classes3.dex */
    public static final class i {
        private final C2344aeV a;

        public final C2344aeV c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && C8632dsu.c(this.a, ((i) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            C2344aeV c2344aeV = this.a;
            return "OnGame2(gameSummary=" + c2344aeV + ")";
        }

        public i(C2344aeV c2344aeV) {
            C8632dsu.c((Object) c2344aeV, "");
            this.a = c2344aeV;
        }
    }
}
