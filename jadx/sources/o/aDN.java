package o;

import com.netflix.model.leafs.VideoInfo;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.blades.CreditMarks;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o.C1362Yt;
import o.C2289adT;
import o.C2295adZ;

/* loaded from: classes3.dex */
public final class aDN implements InterfaceC5160btX {
    private final C2295adZ a;
    private final /* synthetic */ InterfaceC5160btX b;
    private final C2289adT c;

    @Override // o.InterfaceC5160btX
    public VideoInfo.TimeCodes B() {
        return this.b.B();
    }

    @Override // o.InterfaceC5160btX
    public boolean F() {
        return this.b.F();
    }

    @Override // o.InterfaceC5160btX
    public boolean G() {
        return this.b.G();
    }

    @Override // o.InterfaceC5160btX
    public boolean M() {
        return this.b.M();
    }

    @Override // o.InterfaceC5160btX
    public boolean N() {
        return this.b.N();
    }

    @Override // o.InterfaceC5160btX
    public int aB_() {
        return this.b.aB_();
    }

    @Override // o.InterfaceC5160btX
    public String aC_() {
        return this.b.aC_();
    }

    @Override // o.InterfaceC5160btX
    public long aG_() {
        return this.b.aG_();
    }

    @Override // o.InterfaceC5176btn
    public String aH_() {
        return this.b.aH_();
    }

    @Override // o.InterfaceC5160btX
    public String aI_() {
        return this.b.aI_();
    }

    @Override // o.InterfaceC5160btX
    public String aK_() {
        return this.b.aK_();
    }

    @Override // o.InterfaceC5160btX
    public String aL_() {
        return this.b.aL_();
    }

    @Override // o.InterfaceC5160btX
    public String aO_() {
        return this.b.aO_();
    }

    @Override // o.InterfaceC5160btX
    public boolean aR_() {
        return this.b.aR_();
    }

    @Override // o.InterfaceC5160btX
    public boolean aU_() {
        return this.b.aU_();
    }

    @Override // o.InterfaceC5160btX
    public boolean aV_() {
        return this.b.aV_();
    }

    @Override // o.InterfaceC5176btn
    public boolean aY_() {
        return this.b.aY_();
    }

    @Override // o.InterfaceC5160btX
    public int an_() {
        return this.b.an_();
    }

    @Override // o.InterfaceC5160btX
    public CreditMarks ap_() {
        return this.b.ap_();
    }

    @Override // o.InterfaceC5160btX
    public int aw_() {
        return this.b.aw_();
    }

    @Override // o.InterfaceC5160btX
    public InteractiveSummary az_() {
        return this.b.az_();
    }

    @Override // o.InterfaceC5176btn
    public boolean d() {
        return this.b.d();
    }

    @Override // o.InterfaceC5160btX
    public List<Advisory> e() {
        return this.b.e();
    }

    @Override // o.InterfaceC5160btX
    public boolean isAvailableToPlay() {
        return this.b.isAvailableToPlay();
    }

    @Override // o.InterfaceC5176btn
    public boolean isPlayable() {
        return this.b.isPlayable();
    }

    @Override // o.InterfaceC5160btX
    public int x() {
        return this.b.x();
    }

    public aDN(InterfaceC5160btX interfaceC5160btX, C2295adZ c2295adZ, C2289adT c2289adT) {
        C8632dsu.c((Object) interfaceC5160btX, "");
        C8632dsu.c((Object) c2295adZ, "");
        C8632dsu.c((Object) c2289adT, "");
        this.a = c2295adZ;
        this.c = c2289adT;
        this.b = interfaceC5160btX;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aDN(C1362Yt.G g, C2295adZ c2295adZ, C2289adT c2289adT) {
        this(new aDH(g), c2295adZ, c2289adT);
        C8632dsu.c((Object) g, "");
        C8632dsu.c((Object) c2295adZ, "");
        C8632dsu.c((Object) c2289adT, "");
    }

    @Override // o.InterfaceC5160btX
    public long aF_() {
        return C8175dfS.b(aq_(), av_(), aJ_());
    }

    @Override // o.InterfaceC5160btX
    public long aq_() {
        Double c;
        C2295adZ.e b = this.a.b();
        if (b == null || (c = b.c()) == null) {
            return -1L;
        }
        return TimeUnit.SECONDS.toMillis((long) c.doubleValue());
    }

    @Override // o.InterfaceC5160btX
    public int g() {
        Integer e = this.a.e();
        if (e != null) {
            return e.intValue();
        }
        return -1;
    }

    @Override // o.InterfaceC5160btX
    public boolean bd_() {
        return this.a.b() != null;
    }

    @Override // o.InterfaceC5160btX
    public int aJ_() {
        Integer d = this.a.d();
        if (d != null) {
            return d.intValue();
        }
        return -1;
    }

    @Override // o.InterfaceC5160btX
    public int av_() {
        Integer c = this.a.c();
        if (c != null) {
            return c.intValue();
        }
        return -1;
    }

    @Override // o.InterfaceC5160btX
    public boolean H() {
        C2289adT.d d = this.c.d();
        if (d != null) {
            return C8632dsu.c(d.a(), Boolean.TRUE);
        }
        return false;
    }

    @Override // o.InterfaceC5160btX
    public Integer ay_() {
        C2295adZ.e b = this.a.b();
        if (b != null) {
            return b.a();
        }
        return null;
    }

    @Override // o.InterfaceC5160btX
    public boolean aS_() {
        C2289adT.d d = this.c.d();
        if (d != null) {
            return C8632dsu.c(d.b(), Boolean.TRUE);
        }
        return false;
    }

    @Override // o.InterfaceC5160btX
    public boolean aX_() {
        C2289adT.d d = this.c.d();
        if (d != null) {
            return C8632dsu.c(d.c(), Boolean.TRUE);
        }
        return false;
    }
}
