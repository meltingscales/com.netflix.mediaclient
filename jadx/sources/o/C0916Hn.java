package o;

/* renamed from: o.Hn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0916Hn {
    private final boolean a;
    private final String b;
    private final boolean e;

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.e;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0916Hn) {
            C0916Hn c0916Hn = (C0916Hn) obj;
            return C8632dsu.c((Object) this.b, (Object) c0916Hn.b) && this.a == c0916Hn.a && this.e == c0916Hn.e;
        }
        return false;
    }

    public int hashCode() {
        return (((this.b.hashCode() * 31) + Boolean.hashCode(this.a)) * 31) + Boolean.hashCode(this.e);
    }

    public String toString() {
        String str = this.b;
        boolean z = this.a;
        boolean z2 = this.e;
        return "SqliteDiskCacheConfig(databaseName=" + str + ", optimizeLeafyObjects=" + z + ", valuesAsBlobs=" + z2 + ")";
    }

    public C0916Hn(String str, boolean z, boolean z2) {
        C8632dsu.c((Object) str, "");
        this.b = str;
        this.a = z;
        this.e = z2;
    }
}
