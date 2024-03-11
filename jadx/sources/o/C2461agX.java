package o;

import j$.time.Instant;

/* renamed from: o.agX  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2461agX implements InterfaceC9037hy {
    private final Instant a;
    private final String b;
    private final d c;
    private final Instant d;
    private final String e;
    private final String f;
    private final String g;
    private final Integer h;
    private final String i;
    private final String j;

    /* renamed from: o  reason: collision with root package name */
    private final Integer f13469o;

    public final String a() {
        return this.i;
    }

    public final d b() {
        return this.c;
    }

    public final Instant c() {
        return this.a;
    }

    public final Instant d() {
        return this.d;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2461agX) {
            C2461agX c2461agX = (C2461agX) obj;
            return C8632dsu.c((Object) this.e, (Object) c2461agX.e) && C8632dsu.c((Object) this.i, (Object) c2461agX.i) && C8632dsu.c((Object) this.b, (Object) c2461agX.b) && C8632dsu.c((Object) this.g, (Object) c2461agX.g) && C8632dsu.c(this.f13469o, c2461agX.f13469o) && C8632dsu.c(this.a, c2461agX.a) && C8632dsu.c(this.h, c2461agX.h) && C8632dsu.c(this.d, c2461agX.d) && C8632dsu.c((Object) this.j, (Object) c2461agX.j) && C8632dsu.c(this.c, c2461agX.c) && C8632dsu.c((Object) this.f, (Object) c2461agX.f);
        }
        return false;
    }

    public final Integer f() {
        return this.h;
    }

    public final Integer g() {
        return this.f13469o;
    }

    public final String h() {
        return this.j;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        int hashCode2 = this.i.hashCode();
        int hashCode3 = this.b.hashCode();
        String str = this.g;
        int hashCode4 = str == null ? 0 : str.hashCode();
        Integer num = this.f13469o;
        int hashCode5 = num == null ? 0 : num.hashCode();
        Instant instant = this.a;
        int hashCode6 = instant == null ? 0 : instant.hashCode();
        Integer num2 = this.h;
        int hashCode7 = num2 == null ? 0 : num2.hashCode();
        Instant instant2 = this.d;
        int hashCode8 = instant2 == null ? 0 : instant2.hashCode();
        String str2 = this.j;
        int hashCode9 = str2 == null ? 0 : str2.hashCode();
        d dVar = this.c;
        int hashCode10 = dVar == null ? 0 : dVar.hashCode();
        String str3 = this.f;
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final String i() {
        return this.g;
    }

    public final String j() {
        return this.f;
    }

    public final String m() {
        return this.e;
    }

    public String toString() {
        String str = this.e;
        String str2 = this.i;
        String str3 = this.b;
        String str4 = this.g;
        Integer num = this.f13469o;
        Instant instant = this.a;
        Integer num2 = this.h;
        Instant instant2 = this.d;
        String str5 = this.j;
        d dVar = this.c;
        String str6 = this.f;
        return "LolomoRowSummary(__typename=" + str + ", listId=" + str2 + ", listContext=" + str3 + ", title=" + str4 + ", trackId=" + num + ", expires=" + instant + ", refreshInterval=" + num2 + ", createTime=" + instant2 + ", sectionUid=" + str5 + ", entitiesConnection=" + dVar + ", titleIconId=" + str6 + ")";
    }

    public C2461agX(String str, String str2, String str3, String str4, Integer num, Instant instant, Integer num2, Instant instant2, String str5, d dVar, String str6) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        this.e = str;
        this.i = str2;
        this.b = str3;
        this.g = str4;
        this.f13469o = num;
        this.a = instant;
        this.h = num2;
        this.d = instant2;
        this.j = str5;
        this.c = dVar;
        this.f = str6;
    }

    /* renamed from: o.agX$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String b;
        private final Integer d;

        public final String a() {
            return this.b;
        }

        public final Integer b() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.b, (Object) dVar.b) && C8632dsu.c(this.d, dVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            Integer num = this.d;
            return (hashCode * 31) + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            String str = this.b;
            Integer num = this.d;
            return "EntitiesConnection(__typename=" + str + ", totalCount=" + num + ")";
        }

        public d(String str, Integer num) {
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.d = num;
        }
    }
}
