package o;

/* renamed from: o.bpJ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4934bpJ {
    private final String c;
    private final String d;

    public final String c() {
        return this.d;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4934bpJ) {
            C4934bpJ c4934bpJ = (C4934bpJ) obj;
            return C8632dsu.c((Object) this.c, (Object) c4934bpJ.c) && C8632dsu.c((Object) this.d, (Object) c4934bpJ.d);
        }
        return false;
    }

    public int hashCode() {
        return (this.c.hashCode() * 31) + this.d.hashCode();
    }

    public String toString() {
        String str = this.c;
        String str2 = this.d;
        return "PVideoUrlRequest(id=" + str + ", imageUrl=" + str2 + ")";
    }

    public C4934bpJ(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.c = str;
        this.d = str2;
    }
}
