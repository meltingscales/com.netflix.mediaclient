package o;

import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.VideoInfo;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.blades.CreditMarks;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import java.util.List;

/* loaded from: classes3.dex */
public final class aDU implements InterfaceC5240buy {
    private final InterfaceC5223buh c;
    private final InterfaceC5160btX e;

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
    public boolean H() {
        return this.e.H();
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
    public String aC_() {
        return this.e.aC_();
    }

    @Override // o.InterfaceC5160btX
    public long aF_() {
        return this.e.aF_();
    }

    @Override // o.InterfaceC5160btX
    public long aG_() {
        return this.e.aG_();
    }

    @Override // o.InterfaceC5176btn
    public String aH_() {
        return this.e.aH_();
    }

    @Override // o.InterfaceC5160btX
    public String aI_() {
        return this.e.aI_();
    }

    @Override // o.InterfaceC5160btX
    public int aJ_() {
        return this.e.aJ_();
    }

    @Override // o.InterfaceC5160btX
    public String aK_() {
        return this.e.aK_();
    }

    @Override // o.InterfaceC5160btX
    public String aL_() {
        return this.e.aL_();
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
        return this.e.aY_();
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
    public int aw_() {
        return this.e.aw_();
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

    @Override // o.InterfaceC5223buh
    public String getBoxartId() {
        return this.c.getBoxartId();
    }

    @Override // o.InterfaceC5223buh
    public String getBoxshotUrl() {
        return this.c.getBoxshotUrl();
    }

    @Override // o.InterfaceC5175btm
    public String getId() {
        return this.c.getId();
    }

    @Override // o.InterfaceC5175btm
    public String getTitle() {
        return this.c.getTitle();
    }

    @Override // o.InterfaceC5175btm
    public VideoType getType() {
        return this.c.getType();
    }

    @Override // o.InterfaceC5175btm
    public String getUnifiedEntityId() {
        return this.c.getUnifiedEntityId();
    }

    @Override // o.InterfaceC5223buh
    public String getVideoMerchComputeId() {
        return this.c.getVideoMerchComputeId();
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableForDownload() {
        return this.c.isAvailableForDownload();
    }

    @Override // o.InterfaceC5151btO
    public boolean isOriginal() {
        return this.c.isOriginal();
    }

    @Override // o.InterfaceC5160btX
    public int x() {
        return this.e.x();
    }

    public aDU(InterfaceC5223buh interfaceC5223buh, InterfaceC5160btX interfaceC5160btX) {
        C8632dsu.c((Object) interfaceC5223buh, "");
        C8632dsu.c((Object) interfaceC5160btX, "");
        this.c = interfaceC5223buh;
        this.e = interfaceC5160btX;
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableToPlay() {
        return this.e.isAvailableToPlay();
    }

    @Override // o.InterfaceC5151btO
    public boolean isPlayable() {
        return this.e.isPlayable();
    }
}
