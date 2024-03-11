package o;

/* renamed from: o.chg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6670chg {
    private final String a;
    private final String b;
    private final String c;
    private final String e;

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.e;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6670chg) {
            C6670chg c6670chg = (C6670chg) obj;
            return C8632dsu.c((Object) this.b, (Object) c6670chg.b) && C8632dsu.c((Object) this.a, (Object) c6670chg.a) && C8632dsu.c((Object) this.c, (Object) c6670chg.c) && C8632dsu.c((Object) this.e, (Object) c6670chg.e);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.b.hashCode() * 31) + this.a.hashCode()) * 31) + this.c.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        String str = this.b;
        String str2 = this.a;
        String str3 = this.c;
        String str4 = this.e;
        return "PlanData(planName=" + str + ", planPrice=" + str2 + ", planDescription=" + str3 + ", id=" + str4 + ")";
    }

    public C6670chg(String str, String str2, String str3, String str4) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) str4, "");
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.e = str4;
    }
}
