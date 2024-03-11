package o;

/* loaded from: classes3.dex */
public final class XR {
    private final XI a;
    private final XI b;
    private final XI c;
    private final XI d;
    private final XI e;
    private final XI j;

    public final XI a() {
        return this.b;
    }

    public final XI b() {
        return this.e;
    }

    public final XI c() {
        return this.c;
    }

    public final XI d() {
        return this.d;
    }

    public final XI e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof XR) {
            XR xr = (XR) obj;
            return C8632dsu.c(this.c, xr.c) && C8632dsu.c(this.d, xr.d) && C8632dsu.c(this.b, xr.b) && C8632dsu.c(this.e, xr.e) && C8632dsu.c(this.j, xr.j) && C8632dsu.c(this.a, xr.a);
        }
        return false;
    }

    public final XI h() {
        return this.j;
    }

    public int hashCode() {
        return (((((((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.b.hashCode()) * 31) + this.e.hashCode()) * 31) + this.j.hashCode()) * 31) + this.a.hashCode();
    }

    public String toString() {
        XI xi = this.c;
        XI xi2 = this.d;
        XI xi3 = this.b;
        XI xi4 = this.e;
        XI xi5 = this.j;
        XI xi6 = this.a;
        return "ParsedFeatureConfig(browseConfig=" + xi + ", mdxConfig=" + xi2 + ", downloadConfig=" + xi3 + ", partialDownloadPlaybackConfig=" + xi4 + ", smartDownloadConfig=" + xi5 + ", downloadsForYouConfig=" + xi6 + ")";
    }

    public XR(XI xi, XI xi2, XI xi3, XI xi4, XI xi5, XI xi6) {
        C8632dsu.c((Object) xi, "");
        C8632dsu.c((Object) xi2, "");
        C8632dsu.c((Object) xi3, "");
        C8632dsu.c((Object) xi4, "");
        C8632dsu.c((Object) xi5, "");
        C8632dsu.c((Object) xi6, "");
        this.c = xi;
        this.d = xi2;
        this.b = xi3;
        this.e = xi4;
        this.j = xi5;
        this.a = xi6;
    }
}
