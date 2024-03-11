package o;

import java.util.List;

/* renamed from: o.adI  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2278adI implements InterfaceC9037hy {
    private final String a;
    private final d d;

    public final String a() {
        return this.a;
    }

    public final d e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2278adI) {
            C2278adI c2278adI = (C2278adI) obj;
            return C8632dsu.c((Object) this.a, (Object) c2278adI.a) && C8632dsu.c(this.d, c2278adI.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        d dVar = this.d;
        return (hashCode * 31) + (dVar == null ? 0 : dVar.hashCode());
    }

    public String toString() {
        String str = this.a;
        d dVar = this.d;
        return "ContentAdvisory(__typename=" + str + ", contentAdvisory=" + dVar + ")";
    }

    public C2278adI(String str, d dVar) {
        C8632dsu.c((Object) str, "");
        this.a = str;
        this.d = dVar;
    }

    /* renamed from: o.adI$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String a;
        private final Integer b;
        private final String c;
        private final Integer d;
        private final String e;
        private final String f;
        private final Integer g;
        private final String h;
        private final String i;
        private final List<e> j;

        /* renamed from: o  reason: collision with root package name */
        private final String f13464o;

        public final Integer a() {
            return this.b;
        }

        public final String b() {
            return this.c;
        }

        public final String c() {
            return this.a;
        }

        public final Integer d() {
            return this.d;
        }

        public final String e() {
            return this.h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.e, (Object) dVar.e) && C8632dsu.c((Object) this.a, (Object) dVar.a) && C8632dsu.c(this.b, dVar.b) && C8632dsu.c((Object) this.c, (Object) dVar.c) && C8632dsu.c(this.d, dVar.d) && C8632dsu.c((Object) this.h, (Object) dVar.h) && C8632dsu.c((Object) this.i, (Object) dVar.i) && C8632dsu.c((Object) this.f, (Object) dVar.f) && C8632dsu.c(this.g, dVar.g) && C8632dsu.c((Object) this.f13464o, (Object) dVar.f13464o) && C8632dsu.c(this.j, dVar.j);
            }
            return false;
        }

        public final Integer f() {
            return this.g;
        }

        public final String g() {
            return this.f13464o;
        }

        public final List<e> h() {
            return this.j;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            String str = this.a;
            int hashCode2 = str == null ? 0 : str.hashCode();
            Integer num = this.b;
            int hashCode3 = num == null ? 0 : num.hashCode();
            String str2 = this.c;
            int hashCode4 = str2 == null ? 0 : str2.hashCode();
            Integer num2 = this.d;
            int hashCode5 = num2 == null ? 0 : num2.hashCode();
            String str3 = this.h;
            int hashCode6 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.i;
            int hashCode7 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.f;
            int hashCode8 = str5 == null ? 0 : str5.hashCode();
            Integer num3 = this.g;
            int hashCode9 = num3 == null ? 0 : num3.hashCode();
            String str6 = this.f13464o;
            int hashCode10 = str6 == null ? 0 : str6.hashCode();
            List<e> list = this.j;
            return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final String i() {
            return this.i;
        }

        public final String j() {
            return this.f;
        }

        public final String l() {
            return this.e;
        }

        public String toString() {
            String str = this.e;
            String str2 = this.a;
            Integer num = this.b;
            String str3 = this.c;
            Integer num2 = this.d;
            String str4 = this.h;
            String str5 = this.i;
            String str6 = this.f;
            Integer num3 = this.g;
            String str7 = this.f13464o;
            List<e> list = this.j;
            return "ContentAdvisory(__typename=" + str + ", boardName=" + str2 + ", boardId=" + num + ", certificationValue=" + str3 + ", certificationRatingId=" + num2 + ", i18nRating=" + str4 + ", i18nReasonsText=" + str5 + ", maturityDescription=" + str6 + ", maturityLevel=" + num3 + ", shortDescription=" + str7 + ", reasons=" + list + ")";
        }

        public d(String str, String str2, Integer num, String str3, Integer num2, String str4, String str5, String str6, Integer num3, String str7, List<e> list) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.a = str2;
            this.b = num;
            this.c = str3;
            this.d = num2;
            this.h = str4;
            this.i = str5;
            this.f = str6;
            this.g = num3;
            this.f13464o = str7;
            this.j = list;
        }
    }

    /* renamed from: o.adI$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String b;
        private final String c;
        private final Integer e;

        public final String b() {
            return this.c;
        }

        public final String c() {
            return this.b;
        }

        public final Integer d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c(this.e, eVar.e) && C8632dsu.c((Object) this.b, (Object) eVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            Integer num = this.e;
            int hashCode2 = num == null ? 0 : num.hashCode();
            String str = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            Integer num = this.e;
            String str2 = this.b;
            return "Reason(__typename=" + str + ", iconId=" + num + ", text=" + str2 + ")";
        }

        public e(String str, Integer num, String str2) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.e = num;
            this.b = str2;
        }
    }
}
