package o;

/* renamed from: o.afv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2432afv implements InterfaceC9037hy {
    private final b a;
    private final String c;
    private final d d;
    private final e e;

    public final String a() {
        return this.c;
    }

    public final b b() {
        return this.a;
    }

    public final d d() {
        return this.d;
    }

    public final e e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2432afv) {
            C2432afv c2432afv = (C2432afv) obj;
            return C8632dsu.c((Object) this.c, (Object) c2432afv.c) && C8632dsu.c(this.d, c2432afv.d) && C8632dsu.c(this.e, c2432afv.e) && C8632dsu.c(this.a, c2432afv.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        d dVar = this.d;
        int hashCode2 = dVar == null ? 0 : dVar.hashCode();
        e eVar = this.e;
        int hashCode3 = eVar == null ? 0 : eVar.hashCode();
        b bVar = this.a;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.c;
        d dVar = this.d;
        e eVar = this.e;
        b bVar = this.a;
        return "ListItemKidsFavoriteArt(__typename=" + str + ", characterCompact=" + dVar + ", titleCard=" + eVar + ", mysteryBox=" + bVar + ")";
    }

    public C2432afv(String str, d dVar, e eVar, b bVar) {
        C8632dsu.c((Object) str, "");
        this.c = str;
        this.d = dVar;
        this.e = eVar;
        this.a = bVar;
    }

    /* renamed from: o.afv$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String a;
        private final String b;
        private final Boolean c;
        private final String d;

        public final Boolean a() {
            return this.c;
        }

        public final String b() {
            return this.d;
        }

        public final String d() {
            return this.b;
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
                return C8632dsu.c((Object) this.a, (Object) dVar.a) && C8632dsu.c((Object) this.b, (Object) dVar.b) && C8632dsu.c((Object) this.d, (Object) dVar.d) && C8632dsu.c(this.c, dVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            String str = this.b;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.d;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            Boolean bool = this.c;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            String str3 = this.d;
            Boolean bool = this.c;
            return "CharacterCompact(__typename=" + str + ", key=" + str2 + ", url=" + str3 + ", available=" + bool + ")";
        }

        public d(String str, String str2, String str3, Boolean bool) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.b = str2;
            this.d = str3;
            this.c = bool;
        }
    }

    /* renamed from: o.afv$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String a;
        private final String d;
        private final String e;

        public final String a() {
            return this.d;
        }

        public final String b() {
            return this.e;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.e, (Object) eVar.e) && C8632dsu.c((Object) this.a, (Object) eVar.a) && C8632dsu.c((Object) this.d, (Object) eVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            String str = this.a;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            String str2 = this.a;
            String str3 = this.d;
            return "TitleCard(__typename=" + str + ", key=" + str2 + ", url=" + str3 + ")";
        }

        public e(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.a = str2;
            this.d = str3;
        }
    }

    /* renamed from: o.afv$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String b;
        private final String d;
        private final String e;

        public final String a() {
            return this.d;
        }

        public final String c() {
            return this.b;
        }

        public final String d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.d, (Object) bVar.d) && C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c((Object) this.e, (Object) bVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            String str = this.b;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            String str2 = this.b;
            String str3 = this.e;
            return "MysteryBox(__typename=" + str + ", url=" + str2 + ", key=" + str3 + ")";
        }

        public b(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.b = str2;
            this.e = str3;
        }
    }
}
