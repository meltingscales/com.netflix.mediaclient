package kotlin;

import java.io.Serializable;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class Triple<A, B, C> implements Serializable {
    private final C b;
    private final B c;
    private final A e;

    public final C a() {
        return this.b;
    }

    public final B b() {
        return this.c;
    }

    public final A c() {
        return this.e;
    }

    public final B d() {
        return this.c;
    }

    public final A e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Triple) {
            Triple triple = (Triple) obj;
            return C8632dsu.c(this.e, triple.e) && C8632dsu.c(this.c, triple.c) && C8632dsu.c(this.b, triple.b);
        }
        return false;
    }

    public final C f() {
        return this.b;
    }

    public int hashCode() {
        A a = this.e;
        int hashCode = a == null ? 0 : a.hashCode();
        B b = this.c;
        int hashCode2 = b == null ? 0 : b.hashCode();
        C c = this.b;
        return (((hashCode * 31) + hashCode2) * 31) + (c != null ? c.hashCode() : 0);
    }

    public Triple(A a, B b, C c) {
        this.e = a;
        this.c = b;
        this.b = c;
    }

    public String toString() {
        return '(' + this.e + ", " + this.c + ", " + this.b + ')';
    }
}
