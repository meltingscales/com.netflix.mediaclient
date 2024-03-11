package o;

/* renamed from: o.afY  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2400afY implements InterfaceC9037hy {
    private final C2475agl b;
    private final String d;

    public final C2475agl a() {
        return this.b;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2400afY) {
            C2400afY c2400afY = (C2400afY) obj;
            return C8632dsu.c((Object) this.d, (Object) c2400afY.d) && C8632dsu.c(this.b, c2400afY.b);
        }
        return false;
    }

    public int hashCode() {
        return (this.d.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.d;
        C2475agl c2475agl = this.b;
        return "LolomoDefaultGamesRow(__typename=" + str + ", lolomoGameRow=" + c2475agl + ")";
    }

    public C2400afY(String str, C2475agl c2475agl) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2475agl, "");
        this.d = str;
        this.b = c2475agl;
    }
}
