package o;

/* renamed from: o.aiD  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2547aiD implements InterfaceC9037hy {
    private final e a;
    private final Integer b;
    private final b c;
    private final String d;
    private final Integer e;
    private final String g;
    private final String h;
    private final int i;
    private final String j;

    public final Integer a() {
        return this.b;
    }

    public final e b() {
        return this.a;
    }

    public final Integer c() {
        return this.e;
    }

    public final String d() {
        return this.g;
    }

    public final b e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2547aiD) {
            C2547aiD c2547aiD = (C2547aiD) obj;
            return C8632dsu.c((Object) this.d, (Object) c2547aiD.d) && this.i == c2547aiD.i && C8632dsu.c((Object) this.j, (Object) c2547aiD.j) && C8632dsu.c((Object) this.h, (Object) c2547aiD.h) && C8632dsu.c(this.e, c2547aiD.e) && C8632dsu.c((Object) this.g, (Object) c2547aiD.g) && C8632dsu.c(this.b, c2547aiD.b) && C8632dsu.c(this.c, c2547aiD.c) && C8632dsu.c(this.a, c2547aiD.a);
        }
        return false;
    }

    public final String g() {
        return this.j;
    }

    public final String h() {
        return this.h;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        int hashCode2 = Integer.hashCode(this.i);
        String str = this.j;
        int hashCode3 = str == null ? 0 : str.hashCode();
        int hashCode4 = this.h.hashCode();
        Integer num = this.e;
        int hashCode5 = num == null ? 0 : num.hashCode();
        String str2 = this.g;
        int hashCode6 = str2 == null ? 0 : str2.hashCode();
        Integer num2 = this.b;
        int hashCode7 = num2 == null ? 0 : num2.hashCode();
        b bVar = this.c;
        int hashCode8 = bVar == null ? 0 : bVar.hashCode();
        e eVar = this.a;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String i() {
        return this.d;
    }

    public final int j() {
        return this.i;
    }

    public String toString() {
        String str = this.d;
        int i = this.i;
        String str2 = this.j;
        String str3 = this.h;
        Integer num = this.e;
        String str4 = this.g;
        Integer num2 = this.b;
        b bVar = this.c;
        e eVar = this.a;
        return "SeasonInfo(__typename=" + str + ", videoId=" + i + ", title=" + str2 + ", unifiedEntityId=" + str3 + ", number=" + num + ", seasonSeq=" + str4 + ", releaseYear=" + num2 + ", parentShow=" + bVar + ", episodesToGetCount=" + eVar + ")";
    }

    public C2547aiD(String str, int i, String str2, String str3, Integer num, String str4, Integer num2, b bVar, e eVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str3, "");
        this.d = str;
        this.i = i;
        this.j = str2;
        this.h = str3;
        this.e = num;
        this.g = str4;
        this.b = num2;
        this.c = bVar;
        this.a = eVar;
    }

    /* renamed from: o.aiD$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String b;
        private final int c;

        public final String b() {
            return this.b;
        }

        public final int d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.b, (Object) bVar.b) && this.c == bVar.c;
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + Integer.hashCode(this.c);
        }

        public String toString() {
            String str = this.b;
            int i = this.c;
            return "ParentShow(__typename=" + str + ", videoId=" + i + ")";
        }

        public b(String str, int i) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.c = i;
        }
    }

    /* renamed from: o.aiD$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String c;
        private final Integer e;

        public final Integer c() {
            return this.e;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c(this.e, eVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            Integer num = this.e;
            return (hashCode * 31) + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            String str = this.c;
            Integer num = this.e;
            return "EpisodesToGetCount(__typename=" + str + ", totalCount=" + num + ")";
        }

        public e(String str, Integer num) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.e = num;
        }
    }
}
