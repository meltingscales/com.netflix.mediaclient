package o;

/* renamed from: o.agM  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2450agM implements InterfaceC9037hy {
    private final C2475agl a;
    private final String b;

    public final C2475agl c() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2450agM) {
            C2450agM c2450agM = (C2450agM) obj;
            return C8632dsu.c((Object) this.b, (Object) c2450agM.b) && C8632dsu.c(this.a, c2450agM.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = this.b;
        C2475agl c2475agl = this.a;
        return "LolomoPopularGamesRow(__typename=" + str + ", lolomoGameRow=" + c2475agl + ")";
    }

    public C2450agM(String str, C2475agl c2475agl) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2475agl, "");
        this.b = str;
        this.a = c2475agl;
    }
}
