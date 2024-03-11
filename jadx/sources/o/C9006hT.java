package o;

/* renamed from: o.hT  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9006hT {
    private final String b;
    private final String e;

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9006hT) {
            C9006hT c9006hT = (C9006hT) obj;
            return C8632dsu.c((Object) this.e, (Object) c9006hT.e) && C8632dsu.c((Object) this.b, (Object) c9006hT.b);
        }
        return false;
    }

    public int hashCode() {
        return (this.e.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "HttpHeader(name=" + this.e + ", value=" + this.b + ')';
    }

    public C9006hT(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.e = str;
        this.b = str2;
    }
}
