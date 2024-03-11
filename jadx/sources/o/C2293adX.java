package o;

/* renamed from: o.adX  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2293adX implements InterfaceC9037hy {
    private final C2354aef a;
    private final String d;
    private final C2352aed e;

    public final C2354aef a() {
        return this.a;
    }

    public final String b() {
        return this.d;
    }

    public final C2352aed d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2293adX) {
            C2293adX c2293adX = (C2293adX) obj;
            return C8632dsu.c((Object) this.d, (Object) c2293adX.d) && C8632dsu.c(this.e, c2293adX.e) && C8632dsu.c(this.a, c2293adX.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        int hashCode2 = this.e.hashCode();
        C2354aef c2354aef = this.a;
        return (((hashCode * 31) + hashCode2) * 31) + (c2354aef == null ? 0 : c2354aef.hashCode());
    }

    public String toString() {
        String str = this.d;
        C2352aed c2352aed = this.e;
        C2354aef c2354aef = this.a;
        return "DownloadsForYouData(__typename=" + str + ", downloadsForYouVideo=" + c2352aed + ", downloadsForYouShow=" + c2354aef + ")";
    }

    public C2293adX(String str, C2352aed c2352aed, C2354aef c2354aef) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2352aed, "");
        this.d = str;
        this.e = c2352aed;
        this.a = c2354aef;
    }
}
