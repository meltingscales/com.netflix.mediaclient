package o;

import java.util.List;

/* renamed from: o.aia  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2570aia implements InterfaceC9037hy {
    private final String a;
    private final Integer b;
    private final b c;
    private final Integer d;
    private final String e;

    public final b a() {
        return this.c;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.a;
    }

    public final Integer d() {
        return this.b;
    }

    public final Integer e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2570aia) {
            C2570aia c2570aia = (C2570aia) obj;
            return C8632dsu.c((Object) this.a, (Object) c2570aia.a) && C8632dsu.c(this.b, c2570aia.b) && C8632dsu.c(this.d, c2570aia.d) && C8632dsu.c((Object) this.e, (Object) c2570aia.e) && C8632dsu.c(this.c, c2570aia.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        Integer num = this.b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        Integer num2 = this.d;
        int hashCode3 = num2 == null ? 0 : num2.hashCode();
        String str = this.e;
        int hashCode4 = str == null ? 0 : str.hashCode();
        b bVar = this.c;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.a;
        Integer num = this.b;
        Integer num2 = this.d;
        String str2 = this.e;
        b bVar = this.c;
        return "PlayerAdvisory(__typename=" + str + ", displayDurationMillis=" + num + ", displayDelayMillis=" + num2 + ", text=" + str2 + ", onContentAdvisory=" + bVar + ")";
    }

    public C2570aia(String str, Integer num, Integer num2, String str2, b bVar) {
        C8632dsu.c((Object) str, "");
        this.a = str;
        this.b = num;
        this.d = num2;
        this.e = str2;
        this.c = bVar;
    }

    /* renamed from: o.aia$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String a;
        private final String b;
        private final Integer c;
        private final String d;
        private final Integer e;
        private final Integer f;
        private final String g;
        private final String h;
        private final List<a> i;
        private final String j;
        private final String m;

        public final Integer a() {
            return this.e;
        }

        public final String b() {
            return this.d;
        }

        public final String c() {
            return this.a;
        }

        public final Integer d() {
            return this.c;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.d, (Object) bVar.d) && C8632dsu.c(this.e, bVar.e) && C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c(this.c, bVar.c) && C8632dsu.c((Object) this.h, (Object) bVar.h) && C8632dsu.c((Object) this.j, (Object) bVar.j) && C8632dsu.c((Object) this.g, (Object) bVar.g) && C8632dsu.c(this.f, bVar.f) && C8632dsu.c((Object) this.m, (Object) bVar.m) && C8632dsu.c(this.i, bVar.i) && C8632dsu.c((Object) this.a, (Object) bVar.a);
            }
            return false;
        }

        public final Integer f() {
            return this.f;
        }

        public final List<a> g() {
            return this.i;
        }

        public final String h() {
            return this.j;
        }

        public int hashCode() {
            String str = this.d;
            int hashCode = str == null ? 0 : str.hashCode();
            Integer num = this.e;
            int hashCode2 = num == null ? 0 : num.hashCode();
            String str2 = this.b;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            Integer num2 = this.c;
            int hashCode4 = num2 == null ? 0 : num2.hashCode();
            String str3 = this.h;
            int hashCode5 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.j;
            int hashCode6 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.g;
            int hashCode7 = str5 == null ? 0 : str5.hashCode();
            Integer num3 = this.f;
            int hashCode8 = num3 == null ? 0 : num3.hashCode();
            String str6 = this.m;
            int hashCode9 = str6 == null ? 0 : str6.hashCode();
            List<a> list = this.i;
            int hashCode10 = list == null ? 0 : list.hashCode();
            String str7 = this.a;
            return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (str7 != null ? str7.hashCode() : 0);
        }

        public final String i() {
            return this.h;
        }

        public final String j() {
            return this.g;
        }

        public final String o() {
            return this.m;
        }

        public String toString() {
            String str = this.d;
            Integer num = this.e;
            String str2 = this.b;
            Integer num2 = this.c;
            String str3 = this.h;
            String str4 = this.j;
            String str5 = this.g;
            Integer num3 = this.f;
            String str6 = this.m;
            List<a> list = this.i;
            String str7 = this.a;
            return "OnContentAdvisory(boardName=" + str + ", boardId=" + num + ", certificationValue=" + str2 + ", certificationRatingId=" + num2 + ", i18nRating=" + str3 + ", i18nReasonsText=" + str4 + ", maturityDescription=" + str5 + ", maturityLevel=" + num3 + ", shortDescription=" + str6 + ", reasons=" + list + ", certSystemConfirmationId=" + str7 + ")";
        }

        public b(String str, Integer num, String str2, Integer num2, String str3, String str4, String str5, Integer num3, String str6, List<a> list, String str7) {
            this.d = str;
            this.e = num;
            this.b = str2;
            this.c = num2;
            this.h = str3;
            this.j = str4;
            this.g = str5;
            this.f = num3;
            this.m = str6;
            this.i = list;
            this.a = str7;
        }
    }

    /* renamed from: o.aia$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final Integer c;
        private final String e;

        public final Integer a() {
            return this.c;
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
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.e, (Object) aVar.e) && C8632dsu.c(this.c, aVar.c) && C8632dsu.c((Object) this.a, (Object) aVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            Integer num = this.c;
            int hashCode2 = num == null ? 0 : num.hashCode();
            String str = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            String str = this.e;
            Integer num = this.c;
            String str2 = this.a;
            return "Reason(__typename=" + str + ", iconId=" + num + ", text=" + str2 + ")";
        }

        public a(String str, Integer num, String str2) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.c = num;
            this.a = str2;
        }
    }
}
