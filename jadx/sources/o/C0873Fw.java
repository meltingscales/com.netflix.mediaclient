package o;

/* renamed from: o.Fw  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0873Fw implements FJ {
    private final String a;
    private final boolean b;
    private final Boolean c;
    private final String d;

    public final String a() {
        return this.a;
    }

    public final Boolean b() {
        return this.c;
    }

    public final boolean d() {
        return this.b;
    }

    @Override // o.FJ
    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0873Fw) {
            C0873Fw c0873Fw = (C0873Fw) obj;
            return C8632dsu.c((Object) this.d, (Object) c0873Fw.d) && C8632dsu.c(this.c, c0873Fw.c) && this.b == c0873Fw.b && C8632dsu.c((Object) this.a, (Object) c0873Fw.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        Boolean bool = this.c;
        int hashCode2 = bool == null ? 0 : bool.hashCode();
        int hashCode3 = Boolean.hashCode(this.b);
        String str = this.a;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.d;
        Boolean bool = this.c;
        boolean z = this.b;
        String str2 = this.a;
        return "BooleanField(id=" + str + ", initialValue=" + bool + ", mustBeTrue=" + z + ", errorMessage=" + str2 + ")";
    }

    public C0873Fw(String str, Boolean bool, boolean z, String str2) {
        C8632dsu.c((Object) str, "");
        this.d = str;
        this.c = bool;
        this.b = z;
        this.a = str2;
    }
}
