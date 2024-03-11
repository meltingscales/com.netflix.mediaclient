package o;

/* renamed from: o.aei  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2357aei implements InterfaceC9037hy {
    private final C2514ahX a;
    private final String b;
    private final String c;
    private final a d;
    private final Integer e;
    private final C2630ajh f;
    private final C2627aje g;
    private final C2628ajf h;
    private final Boolean i;
    private final C2625ajc j;

    public final Integer a() {
        return this.e;
    }

    public final String b() {
        return this.b;
    }

    public final Boolean c() {
        return this.i;
    }

    public final C2514ahX d() {
        return this.a;
    }

    public final a e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2357aei) {
            C2357aei c2357aei = (C2357aei) obj;
            return C8632dsu.c((Object) this.c, (Object) c2357aei.c) && C8632dsu.c(this.e, c2357aei.e) && C8632dsu.c((Object) this.b, (Object) c2357aei.b) && C8632dsu.c(this.i, c2357aei.i) && C8632dsu.c(this.d, c2357aei.d) && C8632dsu.c(this.f, c2357aei.f) && C8632dsu.c(this.a, c2357aei.a) && C8632dsu.c(this.j, c2357aei.j) && C8632dsu.c(this.h, c2357aei.h) && C8632dsu.c(this.g, c2357aei.g);
        }
        return false;
    }

    public final C2627aje f() {
        return this.g;
    }

    public final C2630ajh g() {
        return this.f;
    }

    public final String h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        Integer num = this.e;
        int hashCode2 = num == null ? 0 : num.hashCode();
        String str = this.b;
        int hashCode3 = str == null ? 0 : str.hashCode();
        Boolean bool = this.i;
        int hashCode4 = bool == null ? 0 : bool.hashCode();
        a aVar = this.d;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.f.hashCode()) * 31) + this.a.hashCode()) * 31) + this.j.hashCode()) * 31) + this.h.hashCode()) * 31) + this.g.hashCode();
    }

    public final C2628ajf i() {
        return this.h;
    }

    public final C2625ajc j() {
        return this.j;
    }

    public String toString() {
        String str = this.c;
        Integer num = this.e;
        String str2 = this.b;
        Boolean bool = this.i;
        a aVar = this.d;
        C2630ajh c2630ajh = this.f;
        C2514ahX c2514ahX = this.a;
        C2625ajc c2625ajc = this.j;
        C2628ajf c2628ajf = this.h;
        C2627aje c2627aje = this.g;
        return "DpLiteVideoDetails(__typename=" + str + ", latestYear=" + num + ", shortSynopsis=" + str2 + ", supportsInteractiveExperiences=" + bool + ", onShow=" + aVar + ", videoSummary=" + c2630ajh + ", playable=" + c2514ahX + ", videoBoxart=" + c2625ajc + ", videoCertificationRating=" + c2628ajf + ", videoInQueue=" + c2627aje + ")";
    }

    public C2357aei(String str, Integer num, String str2, Boolean bool, a aVar, C2630ajh c2630ajh, C2514ahX c2514ahX, C2625ajc c2625ajc, C2628ajf c2628ajf, C2627aje c2627aje) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2630ajh, "");
        C8632dsu.c((Object) c2514ahX, "");
        C8632dsu.c((Object) c2625ajc, "");
        C8632dsu.c((Object) c2628ajf, "");
        C8632dsu.c((Object) c2627aje, "");
        this.c = str;
        this.e = num;
        this.b = str2;
        this.i = bool;
        this.d = aVar;
        this.f = c2630ajh;
        this.a = c2514ahX;
        this.j = c2625ajc;
        this.h = c2628ajf;
        this.g = c2627aje;
    }

    /* renamed from: o.aei$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final int c;
        private final String e;

        public final String b() {
            return this.a;
        }

        public final String c() {
            return this.e;
        }

        public final int e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.e, (Object) aVar.e) && this.c == aVar.c && C8632dsu.c((Object) this.a, (Object) aVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            int hashCode2 = Integer.hashCode(this.c);
            String str = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.e;
            int i = this.c;
            String str2 = this.a;
            return "OnShow(__typename=" + str + ", videoId=" + i + ", numSeasonsLabel=" + str2 + ")";
        }

        public a(String str, int i, String str2) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.c = i;
            this.a = str2;
        }
    }
}
