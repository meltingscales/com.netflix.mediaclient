package o;

/* renamed from: o.bzL  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5466bzL {
    private final String a;
    private final String e;

    public final String b() {
        return this.a;
    }

    public final String d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5466bzL) {
            C5466bzL c5466bzL = (C5466bzL) obj;
            return C8632dsu.c((Object) this.e, (Object) c5466bzL.e) && C8632dsu.c((Object) this.a, (Object) c5466bzL.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.e.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = this.e;
        String str2 = this.a;
        return "Gender(localizedName=" + str + ", key=" + str2 + ")";
    }

    public C5466bzL(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.e = str;
        this.a = str2;
    }
}
