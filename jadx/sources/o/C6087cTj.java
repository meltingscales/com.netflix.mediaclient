package o;

/* renamed from: o.cTj  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6087cTj {
    private final C6089cTl a;
    private final int b;
    private final long c;
    private final int d;
    private final int e;
    private final int f;

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.e;
    }

    public final C6089cTl c() {
        return this.a;
    }

    public final long d() {
        return this.c;
    }

    public final int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6087cTj) {
            C6087cTj c6087cTj = (C6087cTj) obj;
            return this.c == c6087cTj.c && this.b == c6087cTj.b && this.e == c6087cTj.e && this.d == c6087cTj.d && this.f == c6087cTj.f && C8632dsu.c(this.a, c6087cTj.a);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.c) * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.e)) * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.f)) * 31) + this.a.hashCode();
    }

    public final int i() {
        return this.f;
    }

    public String toString() {
        long j = this.c;
        int i = this.b;
        int i2 = this.e;
        int i3 = this.d;
        int i4 = this.f;
        C6089cTl c6089cTl = this.a;
        return "SearchRequestData(requestId=" + j + ", fromSection=" + i + ", toSection=" + i2 + ", fromVideoIndex=" + i3 + ", toVideoIndex=" + i4 + ", result=" + c6089cTl + ")";
    }

    public C6087cTj(long j, int i, int i2, int i3, int i4, C6089cTl c6089cTl) {
        C8632dsu.c((Object) c6089cTl, "");
        this.c = j;
        this.b = i;
        this.e = i2;
        this.d = i3;
        this.f = i4;
        this.a = c6089cTl;
    }
}
