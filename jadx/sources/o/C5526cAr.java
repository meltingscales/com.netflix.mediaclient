package o;

/* renamed from: o.cAr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5526cAr {
    private boolean b;
    private final C5528cAt e;

    public final C5528cAt a() {
        return this.e;
    }

    public final void a(boolean z) {
        this.b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5526cAr) {
            C5526cAr c5526cAr = (C5526cAr) obj;
            return C8632dsu.c(this.e, c5526cAr.e) && this.b == c5526cAr.b;
        }
        return false;
    }

    public int hashCode() {
        return (this.e.hashCode() * 31) + Boolean.hashCode(this.b);
    }

    public String toString() {
        C5528cAt c5528cAt = this.e;
        boolean z = this.b;
        return "PreviewTile(previewVideoInfo=" + c5528cAt + ", displayArtLoaded=" + z + ")";
    }

    public C5526cAr(C5528cAt c5528cAt, boolean z) {
        C8632dsu.c((Object) c5528cAt, "");
        this.e = c5528cAt;
        this.b = z;
    }
}
