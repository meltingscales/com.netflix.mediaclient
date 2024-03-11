package o;

/* renamed from: o.afh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2409afh implements InterfaceC9037hy {
    private final String a;
    private final String b;
    private final String e;

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2409afh) {
            C2409afh c2409afh = (C2409afh) obj;
            return C8632dsu.c((Object) this.a, (Object) c2409afh.a) && C8632dsu.c((Object) this.b, (Object) c2409afh.b) && C8632dsu.c((Object) this.e, (Object) c2409afh.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        String str = this.b;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.e;
        return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.e;
        return "HeaderData(__typename=" + str + ", headerId=" + str2 + ", headerText=" + str3 + ")";
    }

    public C2409afh(String str, String str2, String str3) {
        C8632dsu.c((Object) str, "");
        this.a = str;
        this.b = str2;
        this.e = str3;
    }
}
