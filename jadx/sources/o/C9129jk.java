package o;

/* renamed from: o.jk  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9129jk {
    private final String a;
    private final String e;

    public final String c() {
        return this.e;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9129jk) {
            C9129jk c9129jk = (C9129jk) obj;
            return C8632dsu.c((Object) this.e, (Object) c9129jk.e) && C8632dsu.c((Object) this.a, (Object) c9129jk.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.e.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        return "RecordsForKeys(key=" + this.e + ", record=" + this.a + ')';
    }

    public C9129jk(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.e = str;
        this.a = str2;
    }
}
