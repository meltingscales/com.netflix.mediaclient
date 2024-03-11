package o;

/* renamed from: o.bDw  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3600bDw {
    private final String a;
    private final String b;
    private final int c;
    private final int d;

    public final String a() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3600bDw) {
            C3600bDw c3600bDw = (C3600bDw) obj;
            return C8632dsu.c((Object) this.a, (Object) c3600bDw.a) && C8632dsu.c((Object) this.b, (Object) c3600bDw.b) && this.c == c3600bDw.c && this.d == c3600bDw.d;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Integer.hashCode(this.c)) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        int i = this.c;
        int i2 = this.d;
        return "FormattedTimeInfo(formattedValue=" + str + ", formattedValueForA11y=" + str2 + ", hours=" + i + ", minutes=" + i2 + ")";
    }

    public C3600bDw(String str, String str2, int i, int i2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }
}
