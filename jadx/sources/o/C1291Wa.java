package o;

/* renamed from: o.Wa  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1291Wa {
    private final int a;
    private final String b;
    private final String c;
    private final int d;

    public final String a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final int d() {
        return this.d;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1291Wa) {
            C1291Wa c1291Wa = (C1291Wa) obj;
            return C8632dsu.c((Object) this.c, (Object) c1291Wa.c) && this.d == c1291Wa.d && C8632dsu.c((Object) this.b, (Object) c1291Wa.b) && this.a == c1291Wa.a;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.c.hashCode() * 31) + Integer.hashCode(this.d)) * 31) + this.b.hashCode()) * 31) + Integer.hashCode(this.a);
    }

    public String toString() {
        String str = this.c;
        int i = this.d;
        String str2 = this.b;
        int i2 = this.a;
        return "SeasonData(name=" + str + ", number=" + i + ", id=" + str2 + ", numOfEpisodes=" + i2 + ")";
    }

    public C1291Wa(String str, int i, String str2, int i2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.c = str;
        this.d = i;
        this.b = str2;
        this.a = i2;
    }
}
