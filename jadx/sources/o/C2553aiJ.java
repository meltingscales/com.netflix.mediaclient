package o;

/* renamed from: o.aiJ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2553aiJ implements InterfaceC9037hy {
    private final C2546aiC b;
    private final C2555aiL c;
    private final String d;
    private final C2283adN e;

    public final C2546aiC a() {
        return this.b;
    }

    public final C2555aiL b() {
        return this.c;
    }

    public final C2283adN c() {
        return this.e;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2553aiJ) {
            C2553aiJ c2553aiJ = (C2553aiJ) obj;
            return C8632dsu.c((Object) this.d, (Object) c2553aiJ.d) && C8632dsu.c(this.e, c2553aiJ.e) && C8632dsu.c(this.b, c2553aiJ.b) && C8632dsu.c(this.c, c2553aiJ.c);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.d.hashCode() * 31) + this.e.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        String str = this.d;
        C2283adN c2283adN = this.e;
        C2546aiC c2546aiC = this.b;
        C2555aiL c2555aiL = this.c;
        return "ShowDetails(__typename=" + str + ", currentEpisodeInfo=" + c2283adN + ", seasonListInfo=" + c2546aiC + ", showSummary=" + c2555aiL + ")";
    }

    public C2553aiJ(String str, C2283adN c2283adN, C2546aiC c2546aiC, C2555aiL c2555aiL) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2283adN, "");
        C8632dsu.c((Object) c2546aiC, "");
        C8632dsu.c((Object) c2555aiL, "");
        this.d = str;
        this.e = c2283adN;
        this.b = c2546aiC;
        this.c = c2555aiL;
    }
}
