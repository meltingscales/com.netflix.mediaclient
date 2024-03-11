package o;

/* renamed from: o.bux  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5239bux {
    private final int a;
    private final int b;
    private final String d;
    private final boolean e;

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5239bux) {
            C5239bux c5239bux = (C5239bux) obj;
            return this.b == c5239bux.b && this.a == c5239bux.a && this.e == c5239bux.e && C8632dsu.c((Object) this.d, (Object) c5239bux.d);
        }
        return false;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.b) * 31) + Integer.hashCode(this.a)) * 31) + Boolean.hashCode(this.e)) * 31) + this.d.hashCode();
    }

    public String toString() {
        int i = this.b;
        int i2 = this.a;
        boolean z = this.e;
        String str = this.d;
        return "PageInfo(totalItems=" + i + ", lastItemOnPage=" + i2 + ", hasNextPage=" + z + ", endCursor=" + str + ")";
    }

    public C5239bux(int i, int i2, boolean z, String str) {
        C8632dsu.c((Object) str, "");
        this.b = i;
        this.a = i2;
        this.e = z;
        this.d = str;
    }
}
