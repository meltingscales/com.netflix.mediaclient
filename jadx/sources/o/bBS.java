package o;

/* loaded from: classes4.dex */
public final class bBS {
    private final InterfaceC1286Vv a;
    private final VG b;
    private final VC c;
    private final InterfaceC1290Vz d;
    private final InterfaceC1284Vt e;
    private final VH f;
    private final VD g;
    private final VF i;

    public final VG a() {
        return this.b;
    }

    public final InterfaceC1286Vv b() {
        return this.a;
    }

    public final VC c() {
        return this.c;
    }

    public final InterfaceC1284Vt d() {
        return this.e;
    }

    public final InterfaceC1290Vz e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bBS) {
            bBS bbs = (bBS) obj;
            return C8632dsu.c(this.i, bbs.i) && C8632dsu.c(this.f, bbs.f) && C8632dsu.c(this.a, bbs.a) && C8632dsu.c(this.b, bbs.b) && C8632dsu.c(this.g, bbs.g) && C8632dsu.c(this.d, bbs.d) && C8632dsu.c(this.c, bbs.c) && C8632dsu.c(this.e, bbs.e);
        }
        return false;
    }

    public final VH f() {
        return this.f;
    }

    public final VF h() {
        return this.i;
    }

    public int hashCode() {
        return (((((((((((((this.i.hashCode() * 31) + this.f.hashCode()) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.g.hashCode()) * 31) + this.d.hashCode()) * 31) + this.c.hashCode()) * 31) + this.e.hashCode();
    }

    public final VD j() {
        return this.g;
    }

    public String toString() {
        VF vf = this.i;
        VH vh = this.f;
        InterfaceC1286Vv interfaceC1286Vv = this.a;
        VG vg = this.b;
        VD vd = this.g;
        InterfaceC1290Vz interfaceC1290Vz = this.d;
        VC vc = this.c;
        InterfaceC1284Vt interfaceC1284Vt = this.e;
        return "PairingInfraData(targetDiscoveryInfra=" + vf + ", targetConnectionInfra=" + vh + ", autoPairingInfra=" + interfaceC1286Vv + ", profileSwitchInfra=" + vg + ", uiInfra=" + vd + ", commanderUiInfra=" + interfaceC1290Vz + ", commanderMessageInfra=" + vc + ", clEventHandlerInfra=" + interfaceC1284Vt + ")";
    }

    public bBS(VF vf, VH vh, InterfaceC1286Vv interfaceC1286Vv, VG vg, VD vd, InterfaceC1290Vz interfaceC1290Vz, VC vc, InterfaceC1284Vt interfaceC1284Vt) {
        C8632dsu.c((Object) vf, "");
        C8632dsu.c((Object) vh, "");
        C8632dsu.c((Object) interfaceC1286Vv, "");
        C8632dsu.c((Object) vg, "");
        C8632dsu.c((Object) vd, "");
        C8632dsu.c((Object) interfaceC1290Vz, "");
        C8632dsu.c((Object) vc, "");
        C8632dsu.c((Object) interfaceC1284Vt, "");
        this.i = vf;
        this.f = vh;
        this.a = interfaceC1286Vv;
        this.b = vg;
        this.g = vd;
        this.d = interfaceC1290Vz;
        this.c = vc;
        this.e = interfaceC1284Vt;
    }
}
