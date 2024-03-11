package o;

/* renamed from: o.aed  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2352aed implements InterfaceC9037hy {
    private final Boolean a;
    private final String c;
    private final int e;

    public final Boolean b() {
        return this.a;
    }

    public final int d() {
        return this.e;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2352aed) {
            C2352aed c2352aed = (C2352aed) obj;
            return C8632dsu.c((Object) this.c, (Object) c2352aed.c) && this.e == c2352aed.e && C8632dsu.c(this.a, c2352aed.a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        int hashCode2 = Integer.hashCode(this.e);
        Boolean bool = this.a;
        return (((hashCode * 31) + hashCode2) * 31) + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        String str = this.c;
        int i = this.e;
        Boolean bool = this.a;
        return "DownloadsForYouVideo(__typename=" + str + ", videoId=" + i + ", isAvailableForDownload=" + bool + ")";
    }

    public C2352aed(String str, int i, Boolean bool) {
        C8632dsu.c((Object) str, "");
        this.c = str;
        this.e = i;
        this.a = bool;
    }
}
