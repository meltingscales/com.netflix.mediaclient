package o;

/* renamed from: o.dqu  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8578dqu<T> {
    private final int d;
    private final T e;

    public final T b() {
        return this.e;
    }

    public final T c() {
        return this.e;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8578dqu) {
            C8578dqu c8578dqu = (C8578dqu) obj;
            return this.d == c8578dqu.d && C8632dsu.c(this.e, c8578dqu.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.d);
        T t = this.e;
        return (hashCode * 31) + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.d + ", value=" + this.e + ')';
    }

    public C8578dqu(int i, T t) {
        this.d = i;
        this.e = t;
    }
}
