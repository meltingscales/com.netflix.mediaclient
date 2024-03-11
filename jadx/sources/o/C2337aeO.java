package o;

import java.util.List;

/* renamed from: o.aeO  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2337aeO implements InterfaceC9037hy {
    private final String d;
    private final b e;

    public final String b() {
        return this.d;
    }

    public final b d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2337aeO) {
            C2337aeO c2337aeO = (C2337aeO) obj;
            return C8632dsu.c((Object) this.d, (Object) c2337aeO.d) && C8632dsu.c(this.e, c2337aeO.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        b bVar = this.e;
        return (hashCode * 31) + (bVar == null ? 0 : bVar.hashCode());
    }

    public String toString() {
        String str = this.d;
        b bVar = this.e;
        return "GameContentAdvisory(__typename=" + str + ", contentAdvisory=" + bVar + ")";
    }

    public C2337aeO(String str, b bVar) {
        C8632dsu.c((Object) str, "");
        this.d = str;
        this.e = bVar;
    }

    /* renamed from: o.aeO$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String a;
        private final Integer b;
        private final String c;
        private final Integer d;
        private final String e;
        private final List<a> f;
        private final String g;
        private final Integer h;
        private final String i;
        private final String j;

        public final String a() {
            return this.j;
        }

        public final Integer b() {
            return this.d;
        }

        public final String c() {
            return this.e;
        }

        public final Integer d() {
            return this.b;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.c, (Object) bVar.c) && C8632dsu.c((Object) this.e, (Object) bVar.e) && C8632dsu.c(this.d, bVar.d) && C8632dsu.c(this.b, bVar.b) && C8632dsu.c((Object) this.a, (Object) bVar.a) && C8632dsu.c((Object) this.j, (Object) bVar.j) && C8632dsu.c(this.h, bVar.h) && C8632dsu.c(this.f, bVar.f) && C8632dsu.c((Object) this.i, (Object) bVar.i) && C8632dsu.c((Object) this.g, (Object) bVar.g);
            }
            return false;
        }

        public final Integer f() {
            return this.h;
        }

        public final String g() {
            return this.g;
        }

        public final String h() {
            return this.i;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            String str = this.e;
            int hashCode2 = str == null ? 0 : str.hashCode();
            Integer num = this.d;
            int hashCode3 = num == null ? 0 : num.hashCode();
            Integer num2 = this.b;
            int hashCode4 = num2 == null ? 0 : num2.hashCode();
            String str2 = this.a;
            int hashCode5 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.j;
            int hashCode6 = str3 == null ? 0 : str3.hashCode();
            Integer num3 = this.h;
            int hashCode7 = num3 == null ? 0 : num3.hashCode();
            List<a> list = this.f;
            int hashCode8 = list == null ? 0 : list.hashCode();
            String str4 = this.i;
            int hashCode9 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.g;
            return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (str5 != null ? str5.hashCode() : 0);
        }

        public final String i() {
            return this.c;
        }

        public final List<a> j() {
            return this.f;
        }

        public String toString() {
            String str = this.c;
            String str2 = this.e;
            Integer num = this.d;
            Integer num2 = this.b;
            String str3 = this.a;
            String str4 = this.j;
            Integer num3 = this.h;
            List<a> list = this.f;
            String str5 = this.i;
            String str6 = this.g;
            return "ContentAdvisory(__typename=" + str + ", certificationValue=" + str2 + ", certificationRatingId=" + num + ", boardId=" + num2 + ", boardName=" + str3 + ", i18nRating=" + str4 + ", maturityLevel=" + num3 + ", reasons=" + list + ", maturityDescription=" + str5 + ", shortDescription=" + str6 + ")";
        }

        public b(String str, String str2, Integer num, Integer num2, String str3, String str4, Integer num3, List<a> list, String str5, String str6) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.e = str2;
            this.d = num;
            this.b = num2;
            this.a = str3;
            this.j = str4;
            this.h = num3;
            this.f = list;
            this.i = str5;
            this.g = str6;
        }
    }

    /* renamed from: o.aeO$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final String b;
        private final Integer d;

        public final Integer b() {
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
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.b, (Object) aVar.b) && C8632dsu.c(this.d, aVar.d) && C8632dsu.c((Object) this.a, (Object) aVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            Integer num = this.d;
            int hashCode2 = num == null ? 0 : num.hashCode();
            String str = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            Integer num = this.d;
            String str2 = this.a;
            return "Reason(__typename=" + str + ", iconId=" + num + ", text=" + str2 + ")";
        }

        public a(String str, Integer num, String str2) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.d = num;
            this.a = str2;
        }
    }
}
