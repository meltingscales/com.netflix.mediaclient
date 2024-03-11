package o;

/* renamed from: o.ahW  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2513ahW implements InterfaceC9037hy {
    private final e a;
    private final Integer b;
    private final String c;
    private final Boolean d;
    private final C2412afk e;
    private final d g;
    private final C2638ajp h;
    private final C2630ajh i;

    public final Integer a() {
        return this.b;
    }

    public final Boolean b() {
        return this.d;
    }

    public final e c() {
        return this.a;
    }

    public final C2412afk d() {
        return this.e;
    }

    public final d e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2513ahW) {
            C2513ahW c2513ahW = (C2513ahW) obj;
            return C8632dsu.c((Object) this.c, (Object) c2513ahW.c) && C8632dsu.c(this.d, c2513ahW.d) && C8632dsu.c(this.b, c2513ahW.b) && C8632dsu.c(this.g, c2513ahW.g) && C8632dsu.c(this.a, c2513ahW.a) && C8632dsu.c(this.i, c2513ahW.i) && C8632dsu.c(this.h, c2513ahW.h) && C8632dsu.c(this.e, c2513ahW.e);
        }
        return false;
    }

    public final C2638ajp f() {
        return this.h;
    }

    public final C2630ajh h() {
        return this.i;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        Boolean bool = this.d;
        int hashCode2 = bool == null ? 0 : bool.hashCode();
        Integer num = this.b;
        int hashCode3 = num == null ? 0 : num.hashCode();
        d dVar = this.g;
        int hashCode4 = dVar == null ? 0 : dVar.hashCode();
        e eVar = this.a;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (eVar != null ? eVar.hashCode() : 0)) * 31) + this.i.hashCode()) * 31) + this.h.hashCode()) * 31) + this.e.hashCode();
    }

    public final String j() {
        return this.c;
    }

    public String toString() {
        String str = this.c;
        Boolean bool = this.d;
        Integer num = this.b;
        d dVar = this.g;
        e eVar = this.a;
        C2630ajh c2630ajh = this.i;
        C2638ajp c2638ajp = this.h;
        C2412afk c2412afk = this.e;
        return "PlayableEpisode(__typename=" + str + ", hiddenEpisodeNumbers=" + bool + ", number=" + num + ", parentShow=" + dVar + ", parentSeason=" + eVar + ", videoSummary=" + c2630ajh + ", viewable=" + c2638ajp + ", interactiveVideo=" + c2412afk + ")";
    }

    public C2513ahW(String str, Boolean bool, Integer num, d dVar, e eVar, C2630ajh c2630ajh, C2638ajp c2638ajp, C2412afk c2412afk) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2630ajh, "");
        C8632dsu.c((Object) c2638ajp, "");
        C8632dsu.c((Object) c2412afk, "");
        this.c = str;
        this.d = bool;
        this.b = num;
        this.g = dVar;
        this.a = eVar;
        this.i = c2630ajh;
        this.h = c2638ajp;
        this.e = c2412afk;
    }

    /* renamed from: o.ahW$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final int b;
        private final String c;
        private final String e;

        public final int a() {
            return this.b;
        }

        public final String c() {
            return this.e;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.c, (Object) dVar.c) && this.b == dVar.b && C8632dsu.c((Object) this.e, (Object) dVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            int hashCode2 = Integer.hashCode(this.b);
            String str = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.c;
            int i = this.b;
            String str2 = this.e;
            return "ParentShow(__typename=" + str + ", videoId=" + i + ", title=" + str2 + ")";
        }

        public d(String str, int i, String str2) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.b = i;
            this.e = str2;
        }
    }

    /* renamed from: o.ahW$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final Integer a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;
        private final int g;

        public final int a() {
            return this.g;
        }

        public final String b() {
            return this.e;
        }

        public final String c() {
            return this.c;
        }

        public final Integer d() {
            return this.a;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.d, (Object) eVar.d) && this.g == eVar.g && C8632dsu.c(this.a, eVar.a) && C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c((Object) this.b, (Object) eVar.b) && C8632dsu.c((Object) this.e, (Object) eVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            int hashCode2 = Integer.hashCode(this.g);
            Integer num = this.a;
            int hashCode3 = num == null ? 0 : num.hashCode();
            String str = this.c;
            int hashCode4 = str == null ? 0 : str.hashCode();
            String str2 = this.b;
            int hashCode5 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.e;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final String j() {
            return this.d;
        }

        public String toString() {
            String str = this.d;
            int i = this.g;
            Integer num = this.a;
            String str2 = this.c;
            String str3 = this.b;
            String str4 = this.e;
            return "ParentSeason(__typename=" + str + ", videoId=" + i + ", number=" + num + ", numberLabelV2=" + str2 + ", longNumberLabel=" + str3 + ", title=" + str4 + ")";
        }

        public e(String str, int i, Integer num, String str2, String str3, String str4) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.g = i;
            this.a = num;
            this.c = str2;
            this.b = str3;
            this.e = str4;
        }
    }
}
