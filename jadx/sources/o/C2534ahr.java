package o;

import java.util.List;

/* renamed from: o.ahr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2534ahr implements InterfaceC9037hy {
    private final List<c> a;
    private final d b;
    private final String c;
    private final int d;
    private final e e;
    private final String f;
    private final String h;
    private final String i;

    public final int a() {
        return this.d;
    }

    public final String b() {
        return this.f;
    }

    public final d c() {
        return this.b;
    }

    public final List<c> d() {
        return this.a;
    }

    public final e e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2534ahr) {
            C2534ahr c2534ahr = (C2534ahr) obj;
            return C8632dsu.c((Object) this.c, (Object) c2534ahr.c) && this.d == c2534ahr.d && C8632dsu.c((Object) this.h, (Object) c2534ahr.h) && C8632dsu.c((Object) this.i, (Object) c2534ahr.i) && C8632dsu.c((Object) this.f, (Object) c2534ahr.f) && C8632dsu.c(this.a, c2534ahr.a) && C8632dsu.c(this.e, c2534ahr.e) && C8632dsu.c(this.b, c2534ahr.b);
        }
        return false;
    }

    public final String f() {
        return this.c;
    }

    public final String g() {
        return this.i;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        int hashCode2 = Integer.hashCode(this.d);
        int hashCode3 = this.h.hashCode();
        String str = this.i;
        int hashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.f;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        List<c> list = this.a;
        int hashCode6 = list == null ? 0 : list.hashCode();
        e eVar = this.e;
        int hashCode7 = eVar == null ? 0 : eVar.hashCode();
        d dVar = this.b;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String i() {
        return this.h;
    }

    public String toString() {
        String str = this.c;
        int i = this.d;
        String str2 = this.h;
        String str3 = this.i;
        String str4 = this.f;
        List<c> list = this.a;
        e eVar = this.e;
        d dVar = this.b;
        return "MyListGameSummary(__typename=" + str + ", gameId=" + i + ", unifiedEntityId=" + str2 + ", urlScheme=" + str3 + ", title=" + str4 + ", tags=" + list + ", androidInstallation=" + eVar + ", artwork=" + dVar + ")";
    }

    public C2534ahr(String str, int i, String str2, String str3, String str4, List<c> list, e eVar, d dVar) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.c = str;
        this.d = i;
        this.h = str2;
        this.i = str3;
        this.f = str4;
        this.a = list;
        this.e = eVar;
        this.b = dVar;
    }

    /* renamed from: o.ahr$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final Integer a;
        private final String b;
        private final String c;

        public final String b() {
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
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.c, (Object) cVar.c) && C8632dsu.c(this.a, cVar.a) && C8632dsu.c((Object) this.b, (Object) cVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            Integer num = this.a;
            int hashCode2 = num == null ? 0 : num.hashCode();
            String str = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            String str = this.c;
            Integer num = this.a;
            String str2 = this.b;
            return "Tag(__typename=" + str + ", id=" + num + ", displayName=" + str2 + ")";
        }

        public c(String str, Integer num, String str2) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            this.a = num;
            this.b = str2;
        }
    }

    /* renamed from: o.ahr$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final Integer a;
        private final Integer b;
        private final String c;
        private final String d;
        private final Integer e;
        private final String i;
        private final Integer j;

        public final String a() {
            return this.c;
        }

        public final Integer b() {
            return this.b;
        }

        public final Integer c() {
            return this.e;
        }

        public final Integer d() {
            return this.a;
        }

        public final String e() {
            return this.i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.d, (Object) eVar.d) && C8632dsu.c(this.e, eVar.e) && C8632dsu.c(this.b, eVar.b) && C8632dsu.c(this.j, eVar.j) && C8632dsu.c(this.a, eVar.a) && C8632dsu.c((Object) this.i, (Object) eVar.i) && C8632dsu.c((Object) this.c, (Object) eVar.c);
            }
            return false;
        }

        public final String g() {
            return this.d;
        }

        public final Integer h() {
            return this.j;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            Integer num = this.e;
            int hashCode2 = num == null ? 0 : num.hashCode();
            Integer num2 = this.b;
            int hashCode3 = num2 == null ? 0 : num2.hashCode();
            Integer num3 = this.j;
            int hashCode4 = num3 == null ? 0 : num3.hashCode();
            Integer num4 = this.a;
            int hashCode5 = num4 == null ? 0 : num4.hashCode();
            int hashCode6 = this.i.hashCode();
            String str = this.c;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            Integer num = this.e;
            Integer num2 = this.b;
            Integer num3 = this.j;
            Integer num4 = this.a;
            String str2 = this.i;
            String str3 = this.c;
            return "AndroidInstallation(__typename=" + str + ", minMemoryGb=" + num + ", minSdkVersion=" + num2 + ", packageSizeInMb=" + num3 + ", numProcessors=" + num4 + ", packageName=" + str2 + ", appStoreUrl=" + str3 + ")";
        }

        public e(String str, Integer num, Integer num2, Integer num3, Integer num4, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.d = str;
            this.e = num;
            this.b = num2;
            this.j = num3;
            this.a = num4;
            this.i = str2;
            this.c = str3;
        }
    }

    /* renamed from: o.ahr$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String a;
        private final Boolean b;
        private final Integer c;
        private final String d;
        private final Double e;
        private final String h;
        private final Integer i;
        private final String j;

        public final String a() {
            return this.d;
        }

        public final Double b() {
            return this.e;
        }

        public final Integer c() {
            return this.c;
        }

        public final Boolean d() {
            return this.b;
        }

        public final String e() {
            return this.j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.a, (Object) dVar.a) && C8632dsu.c((Object) this.d, (Object) dVar.d) && C8632dsu.c((Object) this.h, (Object) dVar.h) && C8632dsu.c(this.i, dVar.i) && C8632dsu.c(this.c, dVar.c) && C8632dsu.c((Object) this.j, (Object) dVar.j) && C8632dsu.c(this.b, dVar.b) && C8632dsu.c(this.e, dVar.e);
            }
            return false;
        }

        public final Integer g() {
            return this.i;
        }

        public final String h() {
            return this.h;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            String str = this.d;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.h;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            Integer num = this.i;
            int hashCode4 = num == null ? 0 : num.hashCode();
            Integer num2 = this.c;
            int hashCode5 = num2 == null ? 0 : num2.hashCode();
            String str3 = this.j;
            int hashCode6 = str3 == null ? 0 : str3.hashCode();
            Boolean bool = this.b;
            int hashCode7 = bool == null ? 0 : bool.hashCode();
            Double d = this.e;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (d != null ? d.hashCode() : 0);
        }

        public final String j() {
            return this.a;
        }

        public String toString() {
            String str = this.a;
            String str2 = this.d;
            String str3 = this.h;
            Integer num = this.i;
            Integer num2 = this.c;
            String str4 = this.j;
            Boolean bool = this.b;
            Double d = this.e;
            return "Artwork(__typename=" + str + ", key=" + str2 + ", url=" + str3 + ", width=" + num + ", height=" + num2 + ", type=" + str4 + ", available=" + bool + ", scale=" + d + ")";
        }

        public d(String str, String str2, String str3, Integer num, Integer num2, String str4, Boolean bool, Double d) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.d = str2;
            this.h = str3;
            this.i = num;
            this.c = num2;
            this.j = str4;
            this.b = bool;
            this.e = d;
        }
    }
}
