package o;

/* renamed from: o.ait  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2589ait implements InterfaceC9037hy {
    private final h a;
    private final String c;
    private final i d;

    public final i a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final h e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2589ait) {
            C2589ait c2589ait = (C2589ait) obj;
            return C8632dsu.c((Object) this.c, (Object) c2589ait.c) && C8632dsu.c(this.a, c2589ait.a) && C8632dsu.c(this.d, c2589ait.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        h hVar = this.a;
        int hashCode2 = hVar == null ? 0 : hVar.hashCode();
        i iVar = this.d;
        return (((hashCode * 31) + hashCode2) * 31) + (iVar != null ? iVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.c;
        h hVar = this.a;
        i iVar = this.d;
        return "ProfileIdentityFields(__typename=" + str + ", publicIdentity=" + hVar + ", publicIdentityConfiguration=" + iVar + ")";
    }

    public C2589ait(String str, h hVar, i iVar) {
        C8632dsu.c((Object) str, "");
        this.c = str;
        this.a = hVar;
        this.d = iVar;
    }

    /* renamed from: o.ait$h */
    /* loaded from: classes3.dex */
    public static final class h {
        private final c c;
        private final String e;

        public final String d() {
            return this.e;
        }

        public final c e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return C8632dsu.c((Object) this.e, (Object) hVar.e) && C8632dsu.c(this.c, hVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            c cVar = this.c;
            return (hashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.e;
            c cVar = this.c;
            return "PublicIdentity(__typename=" + str + ", handle=" + cVar + ")";
        }

        public h(String str, c cVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.c = cVar;
        }
    }

    /* renamed from: o.ait$i */
    /* loaded from: classes3.dex */
    public static final class i {
        private final a c;
        private final String d;
        private final b e;

        public final b a() {
            return this.e;
        }

        public final String b() {
            return this.d;
        }

        public final a c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return C8632dsu.c((Object) this.d, (Object) iVar.d) && C8632dsu.c(this.c, iVar.c) && C8632dsu.c(this.e, iVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            a aVar = this.c;
            int hashCode2 = aVar == null ? 0 : aVar.hashCode();
            b bVar = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (bVar != null ? bVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            a aVar = this.c;
            b bVar = this.e;
            return "PublicIdentityConfiguration(__typename=" + str + ", onUPIConfiguration=" + aVar + ", onFeatureUnavailable=" + bVar + ")";
        }

        public i(String str, a aVar, b bVar) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.c = aVar;
            this.e = bVar;
        }
    }

    /* renamed from: o.ait$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String a;
        private final String e;

        public final String c() {
            return this.a;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.e, (Object) cVar.e) && C8632dsu.c((Object) this.a, (Object) cVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            String str = this.a;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.e;
            String str2 = this.a;
            return "Handle(__typename=" + str + ", fullHandle=" + str2 + ")";
        }

        public c(String str, String str2) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.a = str2;
        }
    }

    /* renamed from: o.ait$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final d d;

        public final d b() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c(this.d, ((a) obj).d);
        }

        public int hashCode() {
            d dVar = this.d;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public String toString() {
            d dVar = this.d;
            return "OnUPIConfiguration(handleConfiguration=" + dVar + ")";
        }

        public a(d dVar) {
            this.d = dVar;
        }
    }

    /* renamed from: o.ait$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final e a;
        private final f b;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final e b() {
            return this.a;
        }

        public final f c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.e, (Object) dVar.e) && C8632dsu.c(this.b, dVar.b) && C8632dsu.c(this.a, dVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            f fVar = this.b;
            int hashCode2 = fVar == null ? 0 : fVar.hashCode();
            e eVar = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (eVar != null ? eVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            f fVar = this.b;
            e eVar = this.a;
            return "HandleConfiguration(__typename=" + str + ", onUPIHandleConfiguration=" + fVar + ", onFeatureConfigurationUnavailable=" + eVar + ")";
        }

        public d(String str, f fVar, e eVar) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.b = fVar;
            this.a = eVar;
        }
    }

    /* renamed from: o.ait$f */
    /* loaded from: classes3.dex */
    public static final class f {
        private final String a;
        private final Integer d;
        private final Integer e;

        public final String a() {
            return this.a;
        }

        public final Integer c() {
            return this.d;
        }

        public final Integer e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return C8632dsu.c(this.e, fVar.e) && C8632dsu.c(this.d, fVar.d) && C8632dsu.c((Object) this.a, (Object) fVar.a);
            }
            return false;
        }

        public int hashCode() {
            Integer num = this.e;
            int hashCode = num == null ? 0 : num.hashCode();
            Integer num2 = this.d;
            int hashCode2 = num2 == null ? 0 : num2.hashCode();
            String str = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            Integer num = this.e;
            Integer num2 = this.d;
            String str = this.a;
            return "OnUPIHandleConfiguration(handleMinLength=" + num + ", handleMaxLength=" + num2 + ", handlePattern=" + str + ")";
        }

        public f(Integer num, Integer num2, String str) {
            this.e = num;
            this.d = num2;
            this.a = str;
        }
    }

    /* renamed from: o.ait$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String a;

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c((Object) this.a, (Object) ((e) obj).a);
        }

        public int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.a;
            return "OnFeatureConfigurationUnavailable(reason=" + str + ")";
        }

        public e(String str) {
            this.a = str;
        }
    }

    /* renamed from: o.ait$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String e;

        public final String d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C8632dsu.c((Object) this.e, (Object) ((b) obj).e);
        }

        public int hashCode() {
            String str = this.e;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.e;
            return "OnFeatureUnavailable(reason=" + str + ")";
        }

        public b(String str) {
            this.e = str;
        }
    }
}
