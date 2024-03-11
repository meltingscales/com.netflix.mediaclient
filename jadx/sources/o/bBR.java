package o;

/* loaded from: classes4.dex */
public final class bBR {
    private final InterfaceC1285Vu a;
    private final VC b;
    private final InterfaceC1288Vx c;
    private final InterfaceC1284Vt d;
    private final InterfaceC1290Vz e;
    private final VD g;
    private final InterfaceC1289Vy i;
    private final VH j;

    public final InterfaceC1284Vt a() {
        return this.d;
    }

    public final InterfaceC1290Vz b() {
        return this.e;
    }

    public final VC c() {
        return this.b;
    }

    public final InterfaceC1288Vx d() {
        return this.c;
    }

    public final InterfaceC1285Vu e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bBR) {
            bBR bbr = (bBR) obj;
            return C8632dsu.c(this.j, bbr.j) && C8632dsu.c(this.g, bbr.g) && C8632dsu.c(this.a, bbr.a) && C8632dsu.c(this.c, bbr.c) && C8632dsu.c(this.b, bbr.b) && C8632dsu.c(this.i, bbr.i) && C8632dsu.c(this.d, bbr.d) && C8632dsu.c(this.e, bbr.e);
        }
        return false;
    }

    public final VH f() {
        return this.j;
    }

    public int hashCode() {
        return (((((((((((((this.j.hashCode() * 31) + this.g.hashCode()) * 31) + this.a.hashCode()) * 31) + this.c.hashCode()) * 31) + this.b.hashCode()) * 31) + this.i.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final InterfaceC1289Vy i() {
        return this.i;
    }

    public final VD j() {
        return this.g;
    }

    public String toString() {
        VH vh = this.j;
        VD vd = this.g;
        InterfaceC1285Vu interfaceC1285Vu = this.a;
        InterfaceC1288Vx interfaceC1288Vx = this.c;
        VC vc = this.b;
        InterfaceC1289Vy interfaceC1289Vy = this.i;
        InterfaceC1284Vt interfaceC1284Vt = this.d;
        InterfaceC1290Vz interfaceC1290Vz = this.e;
        return "ControllerInfraData(targetConnectionInfra=" + vh + ", uiInfra=" + vd + ", bifInfra=" + interfaceC1285Vu + ", audioSubtitlesHandlerInfra=" + interfaceC1288Vx + ", commanderMessageInfra=" + vc + ", keyHandlerInfra=" + interfaceC1289Vy + ", clEventHandlerInfra=" + interfaceC1284Vt + ", commanderUiInfra=" + interfaceC1290Vz + ")";
    }

    public bBR(VH vh, VD vd, InterfaceC1285Vu interfaceC1285Vu, InterfaceC1288Vx interfaceC1288Vx, VC vc, InterfaceC1289Vy interfaceC1289Vy, InterfaceC1284Vt interfaceC1284Vt, InterfaceC1290Vz interfaceC1290Vz) {
        C8632dsu.c((Object) vh, "");
        C8632dsu.c((Object) vd, "");
        C8632dsu.c((Object) interfaceC1285Vu, "");
        C8632dsu.c((Object) interfaceC1288Vx, "");
        C8632dsu.c((Object) vc, "");
        C8632dsu.c((Object) interfaceC1289Vy, "");
        C8632dsu.c((Object) interfaceC1284Vt, "");
        C8632dsu.c((Object) interfaceC1290Vz, "");
        this.j = vh;
        this.g = vd;
        this.a = interfaceC1285Vu;
        this.c = interfaceC1288Vx;
        this.b = vc;
        this.i = interfaceC1289Vy;
        this.d = interfaceC1284Vt;
        this.e = interfaceC1290Vz;
    }
}
