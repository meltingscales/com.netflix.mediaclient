package o;

/* renamed from: o.aiA  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2544aiA implements InterfaceC9037hy {
    private final C2547aiD a;
    private final String d;
    private final C2360ael e;

    public final String c() {
        return this.d;
    }

    public final C2360ael d() {
        return this.e;
    }

    public final C2547aiD e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2544aiA) {
            C2544aiA c2544aiA = (C2544aiA) obj;
            return C8632dsu.c((Object) this.d, (Object) c2544aiA.d) && C8632dsu.c(this.a, c2544aiA.a) && C8632dsu.c(this.e, c2544aiA.e);
        }
        return false;
    }

    public int hashCode() {
        return (((this.d.hashCode() * 31) + this.a.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        String str = this.d;
        C2547aiD c2547aiD = this.a;
        C2360ael c2360ael = this.e;
        return "SeasonDetails(__typename=" + str + ", seasonInfo=" + c2547aiD + ", episodeListInfo=" + c2360ael + ")";
    }

    public C2544aiA(String str, C2547aiD c2547aiD, C2360ael c2360ael) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c2547aiD, "");
        C8632dsu.c((Object) c2360ael, "");
        this.d = str;
        this.a = c2547aiD;
        this.e = c2360ael;
    }
}
