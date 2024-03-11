package o;

/* renamed from: o.aig  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2576aig implements InterfaceC9037hy {
    private final int a;
    private final String d;
    private final String e;

    public final int a() {
        return this.a;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2576aig) {
            C2576aig c2576aig = (C2576aig) obj;
            return C8632dsu.c((Object) this.e, (Object) c2576aig.e) && this.a == c2576aig.a && C8632dsu.c((Object) this.d, (Object) c2576aig.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.e.hashCode();
        int hashCode2 = Integer.hashCode(this.a);
        String str = this.d;
        return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.e;
        int i = this.a;
        String str2 = this.d;
        return "PlayerShowBasic(__typename=" + str + ", videoId=" + i + ", title=" + str2 + ")";
    }

    public C2576aig(String str, int i, String str2) {
        C8632dsu.c((Object) str, "");
        this.e = str;
        this.a = i;
        this.d = str2;
    }
}
