package o;

import com.netflix.model.leafs.VideoInfo;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.blades.CreditMarks;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import java.util.List;
import o.C1362Yt;
import o.C2289adT;

/* loaded from: classes3.dex */
public final class aDJ implements InterfaceC5160btX {
    private final C1362Yt.C1367f c;
    private final /* synthetic */ InterfaceC5160btX e;

    @Override // o.InterfaceC5160btX
    public VideoInfo.TimeCodes B() {
        return this.e.B();
    }

    @Override // o.InterfaceC5160btX
    public boolean F() {
        return this.e.F();
    }

    @Override // o.InterfaceC5160btX
    public boolean G() {
        return this.e.G();
    }

    @Override // o.InterfaceC5160btX
    public boolean M() {
        return this.e.M();
    }

    @Override // o.InterfaceC5160btX
    public boolean N() {
        return this.e.N();
    }

    @Override // o.InterfaceC5160btX
    public int aB_() {
        return this.e.aB_();
    }

    @Override // o.InterfaceC5160btX
    public long aF_() {
        return this.e.aF_();
    }

    @Override // o.InterfaceC5160btX
    public long aG_() {
        return this.e.aG_();
    }

    @Override // o.InterfaceC5160btX
    public int aJ_() {
        return this.e.aJ_();
    }

    @Override // o.InterfaceC5160btX
    public String aO_() {
        return this.e.aO_();
    }

    @Override // o.InterfaceC5160btX
    public boolean aR_() {
        return this.e.aR_();
    }

    @Override // o.InterfaceC5160btX
    public boolean aS_() {
        return this.e.aS_();
    }

    @Override // o.InterfaceC5160btX
    public boolean aU_() {
        return this.e.aU_();
    }

    @Override // o.InterfaceC5160btX
    public boolean aV_() {
        return this.e.aV_();
    }

    @Override // o.InterfaceC5160btX
    public boolean aX_() {
        return this.e.aX_();
    }

    @Override // o.InterfaceC5176btn
    public boolean aY_() {
        return true;
    }

    @Override // o.InterfaceC5160btX
    public int an_() {
        return this.e.an_();
    }

    @Override // o.InterfaceC5160btX
    public CreditMarks ap_() {
        return this.e.ap_();
    }

    @Override // o.InterfaceC5160btX
    public long aq_() {
        return this.e.aq_();
    }

    @Override // o.InterfaceC5160btX
    public int av_() {
        return this.e.av_();
    }

    @Override // o.InterfaceC5160btX
    public Integer ay_() {
        return this.e.ay_();
    }

    @Override // o.InterfaceC5160btX
    public InteractiveSummary az_() {
        return this.e.az_();
    }

    @Override // o.InterfaceC5160btX
    public boolean bd_() {
        return this.e.bd_();
    }

    @Override // o.InterfaceC5176btn
    public boolean d() {
        return this.e.d();
    }

    @Override // o.InterfaceC5160btX
    public List<Advisory> e() {
        return this.e.e();
    }

    @Override // o.InterfaceC5160btX
    public int g() {
        return this.e.g();
    }

    @Override // o.InterfaceC5160btX
    public boolean isAvailableToPlay() {
        return this.e.isAvailableToPlay();
    }

    @Override // o.InterfaceC5176btn
    public boolean isPlayable() {
        return this.e.isPlayable();
    }

    @Override // o.InterfaceC5160btX
    public int x() {
        return this.e.x();
    }

    public aDJ(C1362Yt.C1367f c1367f, InterfaceC5160btX interfaceC5160btX) {
        C8632dsu.c((Object) c1367f, "");
        C8632dsu.c((Object) interfaceC5160btX, "");
        this.c = c1367f;
        this.e = interfaceC5160btX;
    }

    @Override // o.InterfaceC5160btX
    public String aI_() {
        String f = this.c.f();
        return f == null ? "" : f;
    }

    @Override // o.InterfaceC5176btn
    public String aH_() {
        return String.valueOf(this.c.j());
    }

    @Override // o.InterfaceC5160btX
    public int aw_() {
        Integer b = this.c.b();
        if (b != null) {
            return b.intValue();
        }
        return -1;
    }

    @Override // o.InterfaceC5160btX
    public String aK_() {
        C1362Yt.u e = this.c.e();
        if (e != null) {
            return e.a();
        }
        return null;
    }

    @Override // o.InterfaceC5160btX
    public String aL_() {
        C1362Yt.u e = this.c.e();
        String b = e != null ? e.b() : null;
        return b == null ? "" : b;
    }

    @Override // o.InterfaceC5160btX
    public String aC_() {
        C1362Yt.u e = this.c.e();
        String c = e != null ? e.c() : null;
        return c == null ? "" : c;
    }

    @Override // o.InterfaceC5160btX
    public boolean H() {
        C2289adT.d d = this.c.d().d();
        if (d != null) {
            return C8632dsu.c(d.a(), Boolean.TRUE);
        }
        return false;
    }
}
