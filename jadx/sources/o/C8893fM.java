package o;

/* renamed from: o.fM  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8893fM<A, B, C> {
    private final A a;
    private final C c;
    private final B d;

    public final A b() {
        return this.a;
    }

    public final C c() {
        return this.c;
    }

    public final B d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8893fM) {
            C8893fM c8893fM = (C8893fM) obj;
            return C8632dsu.c(this.a, c8893fM.a) && C8632dsu.c(this.d, c8893fM.d) && C8632dsu.c(this.c, c8893fM.c);
        }
        return false;
    }

    public int hashCode() {
        A a = this.a;
        int hashCode = a == null ? 0 : a.hashCode();
        B b = this.d;
        int hashCode2 = b == null ? 0 : b.hashCode();
        C c = this.c;
        return (((hashCode * 31) + hashCode2) * 31) + (c != null ? c.hashCode() : 0);
    }

    public String toString() {
        return "MavericksTuple3(a=" + this.a + ", b=" + this.d + ", c=" + this.c + ')';
    }

    public C8893fM(A a, B b, C c) {
        this.a = a;
        this.d = b;
        this.c = c;
    }
}
