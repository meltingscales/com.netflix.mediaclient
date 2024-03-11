package o;

/* renamed from: o.deI  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8112deI {
    private final String a;
    private final int b;
    private final int d;
    private final String e;

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
        if (obj instanceof C8112deI) {
            C8112deI c8112deI = (C8112deI) obj;
            return C8632dsu.c((Object) this.a, (Object) c8112deI.a) && C8632dsu.c((Object) this.e, (Object) c8112deI.e) && this.d == c8112deI.d && this.b == c8112deI.b;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.e.hashCode()) * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.b);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.e;
        int i = this.d;
        int i2 = this.b;
        return "FormattedTimeInfo(formattedValue=" + str + ", formattedValueForA11y=" + str2 + ", hours=" + i + ", minutes=" + i2 + ")";
    }

    public C8112deI(String str, String str2, int i, int i2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.a = str;
        this.e = str2;
        this.d = i;
        this.b = i2;
    }
}
