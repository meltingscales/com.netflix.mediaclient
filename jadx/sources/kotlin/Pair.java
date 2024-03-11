package kotlin;

import java.io.Serializable;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class Pair<A, B> implements Serializable {
    private final A a;
    private final B b;

    public final B a() {
        return this.b;
    }

    public final A b() {
        return this.a;
    }

    public final B c() {
        return this.b;
    }

    public final A d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            return C8632dsu.c(this.a, pair.a) && C8632dsu.c(this.b, pair.b);
        }
        return false;
    }

    public int hashCode() {
        A a = this.a;
        int hashCode = a == null ? 0 : a.hashCode();
        B b = this.b;
        return (hashCode * 31) + (b != null ? b.hashCode() : 0);
    }

    public Pair(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return '(' + this.a + ", " + this.b + ')';
    }
}
