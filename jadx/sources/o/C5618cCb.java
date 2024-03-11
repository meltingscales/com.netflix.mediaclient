package o;

/* renamed from: o.cCb  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5618cCb {
    private final String a;
    private final long c;
    private final long e;

    public final long b() {
        return this.c;
    }

    public final long c() {
        return this.e;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5618cCb) {
            C5618cCb c5618cCb = (C5618cCb) obj;
            return C8632dsu.c((Object) this.a, (Object) c5618cCb.a) && this.e == c5618cCb.e && this.c == c5618cCb.c;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + Long.hashCode(this.e)) * 31) + Long.hashCode(this.c);
    }

    public String toString() {
        String str = this.a;
        long j = this.e;
        long j2 = this.c;
        return "CacheUri(localUrl=" + str + ", offset=" + j + ", length=" + j2 + ")";
    }

    public C5618cCb(String str, long j, long j2) {
        C8632dsu.c((Object) str, "");
        this.a = str;
        this.e = j;
        this.c = j2;
    }
}
