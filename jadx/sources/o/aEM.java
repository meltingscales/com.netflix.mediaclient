package o;

import o.C2451agN;
import o.C2529ahm;

/* loaded from: classes3.dex */
public final class aEM extends aEV implements InterfaceC5162btZ {
    private final C2451agN.c b;
    private final C2529ahm.e d;
    private final C2451agN.j e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aEM) {
            aEM aem = (aEM) obj;
            return C8632dsu.c(this.d, aem.d) && C8632dsu.c(this.e, aem.e) && C8632dsu.c(this.b, aem.b);
        }
        return false;
    }

    public int hashCode() {
        return (((this.d.hashCode() * 31) + this.e.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        C2529ahm.e eVar = this.d;
        C2451agN.j jVar = this.e;
        C2451agN.c cVar = this.b;
        return "GraphQLRecentlyWatchedMovie(videoEdge=" + eVar + ", titleTreatment=" + jVar + ", artwork=" + cVar + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aEM(C2529ahm.e eVar, C2451agN.j jVar, C2451agN.c cVar) {
        super(eVar);
        C8632dsu.c((Object) eVar, "");
        C8632dsu.c((Object) jVar, "");
        C8632dsu.c((Object) cVar, "");
        this.d = eVar;
        this.e = jVar;
        this.b = cVar;
    }

    @Override // o.InterfaceC5162btZ
    public String i() {
        return this.e.d();
    }

    @Override // o.InterfaceC5162btZ
    public String b() {
        return this.b.d();
    }

    @Override // o.InterfaceC5162btZ
    public String a() {
        return this.b.c();
    }
}
