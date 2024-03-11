package o;

/* renamed from: o.adB  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2271adB implements InterfaceC9037hy {
    private final C2630ajh b;
    private final C2319adx c;
    private final String e;

    public final C2630ajh a() {
        return this.b;
    }

    public final C2319adx b() {
        return this.c;
    }

    public final String d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2271adB) {
            C2271adB c2271adB = (C2271adB) obj;
            return C8632dsu.c((Object) this.e, (Object) c2271adB.e) && C8632dsu.c(this.b, c2271adB.b) && C8632dsu.c(this.c, c2271adB.c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.e.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        String str = this.e;
        C2630ajh c2630ajh = this.b;
        C2319adx c2319adx = this.c;
        return "CollectTasteRatedTitleData(__typename=" + str + ", videoSummary=" + c2630ajh + ", collectTasteRatedTitleLogoArt=" + c2319adx + ")";
    }

    public C2271adB(String str, C2630ajh c2630ajh, C2319adx c2319adx) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2630ajh, "");
        C8632dsu.c((Object) c2319adx, "");
        this.e = str;
        this.b = c2630ajh;
        this.c = c2319adx;
    }
}
