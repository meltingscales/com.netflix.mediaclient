package o;

/* renamed from: o.aic  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2572aic implements InterfaceC9037hy {
    private final Boolean a;
    private final c b;
    private final String c;
    private final Boolean d;
    private final Integer e;
    private final b h;

    public final Boolean a() {
        return this.d;
    }

    public final Boolean b() {
        return this.a;
    }

    public final Integer c() {
        return this.e;
    }

    public final c d() {
        return this.b;
    }

    public final b e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2572aic) {
            C2572aic c2572aic = (C2572aic) obj;
            return C8632dsu.c((Object) this.c, (Object) c2572aic.c) && C8632dsu.c(this.d, c2572aic.d) && C8632dsu.c(this.e, c2572aic.e) && C8632dsu.c(this.b, c2572aic.b) && C8632dsu.c(this.h, c2572aic.h) && C8632dsu.c(this.a, c2572aic.a);
        }
        return false;
    }

    public final String g() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        Boolean bool = this.d;
        int hashCode2 = bool == null ? 0 : bool.hashCode();
        Integer num = this.e;
        int hashCode3 = num == null ? 0 : num.hashCode();
        c cVar = this.b;
        int hashCode4 = cVar == null ? 0 : cVar.hashCode();
        b bVar = this.h;
        int hashCode5 = bVar == null ? 0 : bVar.hashCode();
        Boolean bool2 = this.a;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        String str = this.c;
        Boolean bool = this.d;
        Integer num = this.e;
        c cVar = this.b;
        b bVar = this.h;
        Boolean bool2 = this.a;
        return "PlayerEpisodeDetails(__typename=" + str + ", hiddenEpisodeNumbers=" + bool + ", number=" + num + ", parentSeason=" + cVar + ", parentShow=" + bVar + ", hasOriginalTreatment=" + bool2 + ")";
    }

    public C2572aic(String str, Boolean bool, Integer num, c cVar, b bVar, Boolean bool2) {
        C8632dsu.c((Object) str, "");
        this.c = str;
        this.d = bool;
        this.e = num;
        this.b = cVar;
        this.h = bVar;
        this.a = bool2;
    }

    /* renamed from: o.aic$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String b;
        private final d c;

        public final d a() {
            return this.c;
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
                return C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c(this.c, cVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.b;
            d dVar = this.c;
            return "ParentSeason(__typename=" + str + ", onSeason=" + dVar + ")";
        }

        public c(String str, d dVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) dVar, "");
            this.b = str;
            this.c = dVar;
        }
    }

    /* renamed from: o.aic$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final C2576aig b;
        private final String c;

        public final String a() {
            return this.c;
        }

        public final C2576aig d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.c, (Object) bVar.c) && C8632dsu.c(this.b, bVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.c;
            C2576aig c2576aig = this.b;
            return "ParentShow(__typename=" + str + ", playerShowBasic=" + c2576aig + ")";
        }

        public b(String str, C2576aig c2576aig) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2576aig, "");
            this.c = str;
            this.b = c2576aig;
        }
    }

    /* renamed from: o.aic$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String a;
        private final String b;
        private final Integer c;
        private final String d;
        private final String e;
        private final int f;

        public final Integer a() {
            return this.c;
        }

        public final String b() {
            return this.d;
        }

        public final String c() {
            return this.e;
        }

        public final int d() {
            return this.f;
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
                return C8632dsu.c((Object) this.b, (Object) dVar.b) && this.f == dVar.f && C8632dsu.c(this.c, dVar.c) && C8632dsu.c((Object) this.d, (Object) dVar.d) && C8632dsu.c((Object) this.e, (Object) dVar.e) && C8632dsu.c((Object) this.a, (Object) dVar.a);
            }
            return false;
        }

        public final String g() {
            return this.b;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            int hashCode2 = Integer.hashCode(this.f);
            Integer num = this.c;
            int hashCode3 = num == null ? 0 : num.hashCode();
            String str = this.d;
            int hashCode4 = str == null ? 0 : str.hashCode();
            String str2 = this.e;
            int hashCode5 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.a;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            int i = this.f;
            Integer num = this.c;
            String str2 = this.d;
            String str3 = this.e;
            String str4 = this.a;
            return "OnSeason(__typename=" + str + ", videoId=" + i + ", number=" + num + ", numberLabel=" + str2 + ", longNumberLabelForPlayer=" + str3 + ", title=" + str4 + ")";
        }

        public d(String str, int i, Integer num, String str2, String str3, String str4) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.f = i;
            this.c = num;
            this.d = str2;
            this.e = str3;
            this.a = str4;
        }
    }
}
