package o;

import o.C2451agN;
import o.C2529ahm;

/* loaded from: classes3.dex */
public final class aEH extends aEV implements InterfaceC5161btY {
    private final C2451agN.b b;
    private final C2451agN.c d;
    private final InterfaceC5223buh e;
    private final C2529ahm.e g;
    private final C2451agN.j h;

    @Override // o.InterfaceC5161btY
    public InterfaceC5223buh e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aEH) {
            aEH aeh = (aEH) obj;
            return C8632dsu.c(this.g, aeh.g) && C8632dsu.c(this.h, aeh.h) && C8632dsu.c(this.d, aeh.d) && C8632dsu.c(this.b, aeh.b) && C8632dsu.c(this.e, aeh.e);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.g.hashCode() * 31) + this.h.hashCode()) * 31) + this.d.hashCode()) * 31) + this.b.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        C2529ahm.e eVar = this.g;
        C2451agN.j jVar = this.h;
        C2451agN.c cVar = this.d;
        C2451agN.b bVar = this.b;
        InterfaceC5223buh interfaceC5223buh = this.e;
        return "GraphQLRecentlyWatchedEpisode(videoEdge=" + eVar + ", titleTreatment=" + jVar + ", artwork=" + cVar + ", episode=" + bVar + ", parentVideo=" + interfaceC5223buh + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aEH(C2529ahm.e eVar, C2451agN.j jVar, C2451agN.c cVar, C2451agN.b bVar, InterfaceC5223buh interfaceC5223buh) {
        super(eVar);
        C8632dsu.c((Object) eVar, "");
        C8632dsu.c((Object) jVar, "");
        C8632dsu.c((Object) cVar, "");
        C8632dsu.c((Object) bVar, "");
        C8632dsu.c((Object) interfaceC5223buh, "");
        this.g = eVar;
        this.h = jVar;
        this.d = cVar;
        this.b = bVar;
        this.e = interfaceC5223buh;
    }

    @Override // o.InterfaceC5162btZ
    public String i() {
        return this.h.d();
    }

    @Override // o.InterfaceC5162btZ
    public String b() {
        return this.d.d();
    }

    @Override // o.InterfaceC5162btZ
    public String a() {
        return this.d.c();
    }

    @Override // o.InterfaceC5161btY
    public int c() {
        Integer e = this.b.e();
        if (e != null) {
            return e.intValue();
        }
        return -1;
    }

    @Override // o.InterfaceC5161btY
    public String d() {
        C2451agN.i d = this.b.d();
        if (d != null) {
            return d.c();
        }
        return null;
    }

    @Override // o.InterfaceC5161btY
    public boolean h() {
        Boolean a = this.b.a();
        if (a != null) {
            return a.booleanValue();
        }
        return false;
    }
}
