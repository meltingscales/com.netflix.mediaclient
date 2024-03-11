package o;

/* renamed from: o.adJ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2279adJ implements InterfaceC9037hy {
    private final C2514ahX a;
    private final String b;
    private final C2630ajh d;
    private final C2280adK e;

    public final String a() {
        return this.b;
    }

    public final C2630ajh b() {
        return this.d;
    }

    public final C2280adK c() {
        return this.e;
    }

    public final C2514ahX e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2279adJ) {
            C2279adJ c2279adJ = (C2279adJ) obj;
            return C8632dsu.c((Object) this.b, (Object) c2279adJ.b) && C8632dsu.c(this.d, c2279adJ.d) && C8632dsu.c(this.a, c2279adJ.a) && C8632dsu.c(this.e, c2279adJ.e);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.b.hashCode() * 31) + this.d.hashCode()) * 31) + this.a.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        String str = this.b;
        C2630ajh c2630ajh = this.d;
        C2514ahX c2514ahX = this.a;
        C2280adK c2280adK = this.e;
        return "CommanderPlaybackData(__typename=" + str + ", videoSummary=" + c2630ajh + ", playable=" + c2514ahX + ", commanderTitleHorizontalArt=" + c2280adK + ")";
    }

    public C2279adJ(String str, C2630ajh c2630ajh, C2514ahX c2514ahX, C2280adK c2280adK) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2630ajh, "");
        C8632dsu.c((Object) c2514ahX, "");
        C8632dsu.c((Object) c2280adK, "");
        this.b = str;
        this.d = c2630ajh;
        this.a = c2514ahX;
        this.e = c2280adK;
    }
}
