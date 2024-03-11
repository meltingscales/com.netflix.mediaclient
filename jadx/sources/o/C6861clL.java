package o;

/* renamed from: o.clL  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6861clL {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final boolean g;
    private final String h;
    private final boolean i;

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.f;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6861clL) {
            C6861clL c6861clL = (C6861clL) obj;
            return C8632dsu.c((Object) this.h, (Object) c6861clL.h) && C8632dsu.c((Object) this.f, (Object) c6861clL.f) && C8632dsu.c((Object) this.a, (Object) c6861clL.a) && C8632dsu.c((Object) this.e, (Object) c6861clL.e) && C8632dsu.c((Object) this.b, (Object) c6861clL.b) && C8632dsu.c((Object) this.c, (Object) c6861clL.c) && C8632dsu.c((Object) this.d, (Object) c6861clL.d) && this.i == c6861clL.i && this.g == c6861clL.g;
        }
        return false;
    }

    public final boolean f() {
        return this.g;
    }

    public final boolean g() {
        return this.i;
    }

    public int hashCode() {
        return (((((((((((((((this.h.hashCode() * 31) + this.f.hashCode()) * 31) + this.a.hashCode()) * 31) + this.e.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.i)) * 31) + Boolean.hashCode(this.g);
    }

    public String toString() {
        String str = this.h;
        String str2 = this.f;
        String str3 = this.a;
        String str4 = this.e;
        String str5 = this.b;
        String str6 = this.c;
        String str7 = this.d;
        boolean z = this.i;
        boolean z2 = this.g;
        return "OfferChoice(planId=" + str + ", offerId=" + str2 + ", duration=" + str3 + ", durationType=" + str4 + ", discountPercentage=" + str5 + ", fullPrice=" + str6 + ", discountedPrice=" + str7 + ", isBestValue=" + z + ", isSelected=" + z2 + ")";
    }

    public C6861clL(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) str4, "");
        C8632dsu.c((Object) str5, "");
        C8632dsu.c((Object) str6, "");
        C8632dsu.c((Object) str7, "");
        this.h = str;
        this.f = str2;
        this.a = str3;
        this.e = str4;
        this.b = str5;
        this.c = str6;
        this.d = str7;
        this.i = z;
        this.g = z2;
    }
}
