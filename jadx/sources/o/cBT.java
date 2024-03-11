package o;

import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.VideoInfo;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.blades.CreditMarks;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import java.util.List;

/* loaded from: classes4.dex */
public final class cBT implements InterfaceC5160btX {
    private final /* synthetic */ InterfaceC5160btX b;
    private final VideoType c;
    private final String d;

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
    public boolean H() {
        return this.b.H();
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
    public long aF_() {
        return this.b.aF_();
    }

    @Override // o.InterfaceC5160btX
    public long aG_() {
        return this.b.aG_();
    }

    @Override // o.InterfaceC5176btn
    public String aH_() {
        return this.d;
    }

    @Override // o.InterfaceC5160btX
    public String aI_() {
        return this.b.aI_();
    }

    @Override // o.InterfaceC5160btX
    public int aJ_() {
        return this.b.aJ_();
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
    public boolean aS_() {
        return this.b.aS_();
    }

    @Override // o.InterfaceC5160btX
    public boolean aU_() {
        return this.b.aU_();
    }

    @Override // o.InterfaceC5160btX
    public boolean aV_() {
        return this.b.aV_();
    }

    @Override // o.InterfaceC5160btX
    public boolean aX_() {
        return this.b.aX_();
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
    public long aq_() {
        return this.b.aq_();
    }

    @Override // o.InterfaceC5160btX
    public int av_() {
        return this.b.av_();
    }

    @Override // o.InterfaceC5160btX
    public int aw_() {
        return this.b.aw_();
    }

    @Override // o.InterfaceC5160btX
    public Integer ay_() {
        return this.b.ay_();
    }

    @Override // o.InterfaceC5160btX
    public InteractiveSummary az_() {
        return this.b.az_();
    }

    @Override // o.InterfaceC5160btX
    public boolean bd_() {
        return this.b.bd_();
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
    public int g() {
        return this.b.g();
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

    public cBT(InterfaceC5160btX interfaceC5160btX, String str, VideoType videoType) {
        C8632dsu.c((Object) interfaceC5160btX, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        this.d = str;
        this.c = videoType;
        this.b = interfaceC5160btX;
    }

    @Override // o.InterfaceC5176btn
    public boolean aY_() {
        return this.c == VideoType.EPISODE;
    }
}
