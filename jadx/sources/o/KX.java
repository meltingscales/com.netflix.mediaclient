package o;

/* loaded from: classes3.dex */
public final class KX {
    public static final int b = 0;
    private final String a;
    private final String c;
    private final String d;
    private final String e;

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.e;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KX) {
            KX kx = (KX) obj;
            return C8632dsu.c((Object) this.e, (Object) kx.e) && C8632dsu.c((Object) this.a, (Object) kx.a) && C8632dsu.c((Object) this.d, (Object) kx.d) && C8632dsu.c((Object) this.c, (Object) kx.c);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.e.hashCode() * 31) + this.a.hashCode()) * 31) + this.d.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        String str = this.e;
        String str2 = this.a;
        String str3 = this.d;
        String str4 = this.c;
        return "HawkinsPhoneInputCountry(code=" + str + ", name=" + str2 + ", phoneCodePrefix=" + str3 + ", flagEmoji=" + str4 + ")";
    }

    public KX(String str, String str2, String str3, String str4) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) str4, "");
        this.e = str;
        this.a = str2;
        this.d = str3;
        this.c = str4;
    }
}
