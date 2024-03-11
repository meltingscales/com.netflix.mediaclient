package o;

/* renamed from: o.fQ  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8897fQ<A> {
    private final A e;

    public final A c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8897fQ) && C8632dsu.c(this.e, ((C8897fQ) obj).e);
    }

    public int hashCode() {
        A a = this.e;
        if (a == null) {
            return 0;
        }
        return a.hashCode();
    }

    public String toString() {
        return "MavericksTuple1(a=" + this.e + ')';
    }

    public C8897fQ(A a) {
        this.e = a;
    }
}
