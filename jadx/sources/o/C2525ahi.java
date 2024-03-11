package o;

/* renamed from: o.ahi  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2525ahi implements InterfaceC9037hy {
    private final C2529ahm d;
    private final String e;

    public final String b() {
        return this.e;
    }

    public final C2529ahm c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2525ahi) {
            C2525ahi c2525ahi = (C2525ahi) obj;
            return C8632dsu.c((Object) this.e, (Object) c2525ahi.e) && C8632dsu.c(this.d, c2525ahi.d);
        }
        return false;
    }

    public int hashCode() {
        return (this.e.hashCode() * 31) + this.d.hashCode();
    }

    public String toString() {
        String str = this.e;
        C2529ahm c2529ahm = this.d;
        return "LolomoTrailersYouWatchedRow(__typename=" + str + ", lolomoVideoRow=" + c2529ahm + ")";
    }

    public C2525ahi(String str, C2529ahm c2529ahm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2529ahm, "");
        this.e = str;
        this.d = c2529ahm;
    }
}
