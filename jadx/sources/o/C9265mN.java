package o;

/* renamed from: o.mN  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9265mN {
    private final int c;
    private final int d;

    public final int a() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9265mN) {
            C9265mN c9265mN = (C9265mN) obj;
            return this.c == c9265mN.c && this.d == c9265mN.d;
        }
        return false;
    }

    public int hashCode() {
        return (Integer.hashCode(this.c) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "TrimMetrics(itemsTrimmed=" + this.c + ", dataTrimmed=" + this.d + ')';
    }

    public C9265mN(int i, int i2) {
        this.c = i;
        this.d = i2;
    }
}
