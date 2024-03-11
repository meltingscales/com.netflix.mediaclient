package o;

/* renamed from: o.agr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2481agr implements InterfaceC9037hy {
    private final C2475agl d;
    private final String e;

    public final C2475agl c() {
        return this.d;
    }

    public final String d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2481agr) {
            C2481agr c2481agr = (C2481agr) obj;
            return C8632dsu.c((Object) this.e, (Object) c2481agr.e) && C8632dsu.c(this.d, c2481agr.d);
        }
        return false;
    }

    public int hashCode() {
        return (this.e.hashCode() * 31) + this.d.hashCode();
    }

    public String toString() {
        String str = this.e;
        C2475agl c2475agl = this.d;
        return "LolomoGamesPlaylistRow(__typename=" + str + ", lolomoGameRow=" + c2475agl + ")";
    }

    public C2481agr(String str, C2475agl c2475agl) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2475agl, "");
        this.e = str;
        this.d = c2475agl;
    }
}
