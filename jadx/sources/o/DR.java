package o;

/* loaded from: classes2.dex */
public final class DR {
    private final DQ a;
    private final String b;

    public final String b() {
        return this.b;
    }

    public final DQ e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DR) {
            DR dr = (DR) obj;
            return C8632dsu.c((Object) this.b, (Object) dr.b) && C8632dsu.c(this.a, dr.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = this.b;
        DQ dq = this.a;
        return "CLCSInputField(name=" + str + ", value=" + dq + ")";
    }

    public DR(String str, DQ dq) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) dq, "");
        this.b = str;
        this.a = dq;
    }
}
