package o;

import java.util.List;

/* loaded from: classes2.dex */
public final class FQ implements FD {
    private final String a;
    private final List<a> b;
    private final String c;
    private final String d;
    private final C0880Gd e;
    private final FE f;
    private final String g;
    private final FE h;
    private final C0880Gd i;
    private final FE j;
    private final String k;

    /* renamed from: o  reason: collision with root package name */
    private final String f13355o;

    public final C0880Gd a() {
        return this.e;
    }

    public String b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.g;
    }

    public final List<a> e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FQ) {
            FQ fq = (FQ) obj;
            return C8632dsu.c((Object) this.a, (Object) fq.a) && C8632dsu.c((Object) this.d, (Object) fq.d) && C8632dsu.c((Object) this.k, (Object) fq.k) && C8632dsu.c((Object) this.g, (Object) fq.g) && C8632dsu.c(this.e, fq.e) && C8632dsu.c(this.i, fq.i) && C8632dsu.c((Object) this.f13355o, (Object) fq.f13355o) && C8632dsu.c((Object) this.c, (Object) fq.c) && C8632dsu.c(this.f, fq.f) && C8632dsu.c(this.j, fq.j) && C8632dsu.c(this.h, fq.h) && C8632dsu.c(this.b, fq.b);
        }
        return false;
    }

    public final String f() {
        return this.f13355o;
    }

    public final C0880Gd g() {
        return this.i;
    }

    public final FE h() {
        return this.h;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        String str = this.d;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.k;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.g;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        C0880Gd c0880Gd = this.e;
        int hashCode5 = c0880Gd == null ? 0 : c0880Gd.hashCode();
        C0880Gd c0880Gd2 = this.i;
        int hashCode6 = c0880Gd2 == null ? 0 : c0880Gd2.hashCode();
        String str4 = this.f13355o;
        int hashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.c;
        int hashCode8 = str5 == null ? 0 : str5.hashCode();
        FE fe = this.f;
        int hashCode9 = fe == null ? 0 : fe.hashCode();
        FE fe2 = this.j;
        int hashCode10 = fe2 == null ? 0 : fe2.hashCode();
        FE fe3 = this.h;
        int hashCode11 = fe3 == null ? 0 : fe3.hashCode();
        List<a> list = this.b;
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String i() {
        return this.k;
    }

    public final FE j() {
        return this.j;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.d;
        String str3 = this.k;
        String str4 = this.g;
        C0880Gd c0880Gd = this.e;
        C0880Gd c0880Gd2 = this.i;
        String str5 = this.f13355o;
        String str6 = this.c;
        FE fe = this.f;
        FE fe2 = this.j;
        FE fe3 = this.h;
        List<a> list = this.b;
        return "PhoneInput(key=" + str + ", accessibilityDescription=" + str2 + ", trackingInfo=" + str3 + ", loggingViewName=" + str4 + ", countryCodeField=" + c0880Gd + ", phoneNumberField=" + c0880Gd2 + ", phoneNumberPlaceholder=" + str5 + ", initialErrorMessage=" + str6 + ", onChange=" + fe + ", onFocus=" + fe2 + ", onEnterKey=" + fe3 + ", countries=" + list + ")";
    }

    public FQ(String str, String str2, String str3, String str4, C0880Gd c0880Gd, C0880Gd c0880Gd2, String str5, String str6, FE fe, FE fe2, FE fe3, List<a> list) {
        C8632dsu.c((Object) str, "");
        this.a = str;
        this.d = str2;
        this.k = str3;
        this.g = str4;
        this.e = c0880Gd;
        this.i = c0880Gd2;
        this.f13355o = str5;
        this.c = str6;
        this.f = fe;
        this.j = fe2;
        this.h = fe3;
        this.b = list;
    }

    /* loaded from: classes2.dex */
    public static final class a {
        private final String a;
        private final String c;
        private final String d;

        public final String a() {
            return this.c;
        }

        public final String c() {
            return this.a;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.d, (Object) aVar.d) && C8632dsu.c((Object) this.c, (Object) aVar.c) && C8632dsu.c((Object) this.a, (Object) aVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            String str = this.c;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            String str2 = this.c;
            String str3 = this.a;
            return "Country(code=" + str + ", phoneCodePrefix=" + str2 + ", name=" + str3 + ")";
        }

        public a(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.c = str2;
            this.a = str3;
        }
    }
}
