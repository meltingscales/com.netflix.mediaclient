package o;

/* renamed from: o.aPu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1829aPu {
    private final String c;
    private final String e;

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1829aPu) {
            C1829aPu c1829aPu = (C1829aPu) obj;
            return C8632dsu.c((Object) this.c, (Object) c1829aPu.c) && C8632dsu.c((Object) this.e, (Object) c1829aPu.e);
        }
        return false;
    }

    public int hashCode() {
        return (this.c.hashCode() * 31) + this.e.hashCode();
    }

    public String toString() {
        String str = this.c;
        String str2 = this.e;
        return "TeeInfo(key=" + str + ", value=" + str2 + ")";
    }

    public C1829aPu(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.c = str;
        this.e = str2;
    }
}
