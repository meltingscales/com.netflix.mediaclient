package o;

import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.VideoInfo;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.blades.CreditMarks;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import java.util.List;

/* loaded from: classes4.dex */
public final class cTQ implements InterfaceC5278bvj {
    private final C1535aEx b;
    private final aEX e;

    @Override // o.InterfaceC5173btk
    public String bM_() {
        return null;
    }

    public cTQ(aEX aex, C1535aEx c1535aEx) {
        C8632dsu.c((Object) aex, "");
        this.e = aex;
        this.b = c1535aEx;
    }

    @Override // o.InterfaceC5175btm
    public String getId() {
        return this.e.getId();
    }

    @Override // o.InterfaceC5175btm
    public String getTitle() {
        return this.e.getTitle();
    }

    @Override // o.InterfaceC5175btm
    public VideoType getType() {
        return this.e.getType();
    }

    @Override // o.InterfaceC5175btm
    public String getUnifiedEntityId() {
        return this.e.getUnifiedEntityId();
    }

    @Override // o.InterfaceC5151btO
    public boolean isOriginal() {
        return this.e.isOriginal();
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableToPlay() {
        return this.e.isAvailableToPlay();
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableForDownload() {
        return this.e.isAvailableForDownload();
    }

    @Override // o.InterfaceC5151btO
    public boolean isPlayable() {
        return this.e.isPlayable();
    }

    @Override // o.InterfaceC5223buh
    public String getBoxshotUrl() {
        return this.e.getBoxshotUrl();
    }

    @Override // o.InterfaceC5223buh
    public String getBoxartId() {
        return this.e.getBoxartId();
    }

    @Override // o.InterfaceC5223buh
    public String getVideoMerchComputeId() {
        return this.e.getVideoMerchComputeId();
    }

    @Override // o.InterfaceC5176btn
    public String aH_() {
        C1535aEx c1535aEx = this.b;
        if (c1535aEx != null) {
            return c1535aEx.aH_();
        }
        return null;
    }

    @Override // o.InterfaceC5176btn
    public boolean aY_() {
        C1535aEx c1535aEx = this.b;
        if (c1535aEx != null) {
            return c1535aEx.aY_();
        }
        return false;
    }

    @Override // o.InterfaceC5176btn
    public boolean d() {
        C1535aEx c1535aEx = this.b;
        if (c1535aEx != null) {
            return c1535aEx.d();
        }
        return false;
    }

    @Override // o.InterfaceC5160btX
    public String aI_() {
        C1535aEx c1535aEx = this.b;
        String aI_ = c1535aEx != null ? c1535aEx.aI_() : null;
        return aI_ == null ? "" : aI_;
    }

    @Override // o.InterfaceC5160btX
    public long aG_() {
        C1535aEx c1535aEx = this.b;
        if (c1535aEx != null) {
            return c1535aEx.aG_();
        }
        return 0L;
    }

    @Override // o.InterfaceC5160btX
    public long aF_() {
        C1535aEx c1535aEx = this.b;
        if (c1535aEx != null) {
            return c1535aEx.aF_();
        }
        return 0L;
    }

    @Override // o.InterfaceC5160btX
    public long aq_() {
        C1535aEx c1535aEx = this.b;
        if (c1535aEx != null) {
            return c1535aEx.aq_();
        }
        return 0L;
    }

    @Override // o.InterfaceC5160btX
    public String aC_() {
        C1535aEx c1535aEx = this.b;
        String aC_ = c1535aEx != null ? c1535aEx.aC_() : null;
        return aC_ == null ? "" : aC_;
    }

    @Override // o.InterfaceC5160btX
    public String aO_() {
        C1535aEx c1535aEx = this.b;
        String aO_ = c1535aEx != null ? c1535aEx.aO_() : null;
        return aO_ == null ? "" : aO_;
    }

    @Override // o.InterfaceC5160btX
    public int g() {
        C1535aEx c1535aEx = this.b;
        if (c1535aEx != null) {
            return c1535aEx.g();
        }
        return 0;
    }

    @Override // o.InterfaceC5160btX
    public int aJ_() {
        C1535aEx c1535aEx = this.b;
        if (c1535aEx != null) {
            return c1535aEx.aJ_();
        }
        return 0;
    }

    @Override // o.InterfaceC5160btX
    public int av_() {
        C1535aEx c1535aEx = this.b;
        if (c1535aEx != null) {
            return c1535aEx.av_();
        }
        return 0;
    }

    @Override // o.InterfaceC5160btX
    public int aB_() {
        C1535aEx c1535aEx = this.b;
        if (c1535aEx != null) {
            return c1535aEx.aB_();
        }
        return 0;
    }

    @Override // o.InterfaceC5160btX
    public int aw_() {
        C1535aEx c1535aEx = this.b;
        if (c1535aEx != null) {
            return c1535aEx.aw_();
        }
        return 0;
    }

    @Override // o.InterfaceC5160btX
    public int x() {
        C1535aEx c1535aEx = this.b;
        if (c1535aEx != null) {
            return c1535aEx.x();
        }
        return 0;
    }

    @Override // o.InterfaceC5160btX
    public int an_() {
        C1535aEx c1535aEx = this.b;
        if (c1535aEx != null) {
            return c1535aEx.an_();
        }
        return 0;
    }

    @Override // o.InterfaceC5160btX
    public boolean aV_() {
        C1535aEx c1535aEx = this.b;
        if (c1535aEx != null) {
            return c1535aEx.aV_();
        }
        return false;
    }

    @Override // o.InterfaceC5160btX
    public boolean aS_() {
        C1535aEx c1535aEx = this.b;
        if (c1535aEx != null) {
            return c1535aEx.aS_();
        }
        return false;
    }

    @Override // o.InterfaceC5160btX
    public boolean aX_() {
        C1535aEx c1535aEx = this.b;
        if (c1535aEx != null) {
            return c1535aEx.aX_();
        }
        return false;
    }

    @Override // o.InterfaceC5160btX
    public boolean H() {
        C1535aEx c1535aEx = this.b;
        if (c1535aEx != null) {
            return c1535aEx.H();
        }
        return false;
    }

    @Override // o.InterfaceC5160btX
    public List<Advisory> e() {
        List<Advisory> i;
        List<Advisory> e;
        C1535aEx c1535aEx = this.b;
        if (c1535aEx == null || (e = c1535aEx.e()) == null) {
            i = C8569dql.i();
            return i;
        }
        return e;
    }

    @Override // o.InterfaceC5160btX
    public boolean aR_() {
        C1535aEx c1535aEx = this.b;
        if (c1535aEx != null) {
            return c1535aEx.aR_();
        }
        return false;
    }

    @Override // o.InterfaceC5160btX
    public String aK_() {
        C1535aEx c1535aEx = this.b;
        String aK_ = c1535aEx != null ? c1535aEx.aK_() : null;
        return aK_ == null ? "" : aK_;
    }

    @Override // o.InterfaceC5160btX
    public String aL_() {
        C1535aEx c1535aEx = this.b;
        String aL_ = c1535aEx != null ? c1535aEx.aL_() : null;
        return aL_ == null ? "" : aL_;
    }

    @Override // o.InterfaceC5160btX
    public boolean F() {
        C1535aEx c1535aEx = this.b;
        if (c1535aEx != null) {
            return c1535aEx.F();
        }
        return false;
    }

    @Override // o.InterfaceC5160btX
    public boolean G() {
        C1535aEx c1535aEx = this.b;
        if (c1535aEx != null) {
            return c1535aEx.G();
        }
        return false;
    }

    @Override // o.InterfaceC5160btX
    public boolean aU_() {
        C1535aEx c1535aEx = this.b;
        if (c1535aEx != null) {
            return c1535aEx.aU_();
        }
        return false;
    }

    @Override // o.InterfaceC5160btX
    public boolean M() {
        C1535aEx c1535aEx = this.b;
        if (c1535aEx != null) {
            return c1535aEx.M();
        }
        return false;
    }

    @Override // o.InterfaceC5160btX
    public boolean N() {
        C1535aEx c1535aEx = this.b;
        if (c1535aEx != null) {
            return c1535aEx.N();
        }
        return false;
    }

    @Override // o.InterfaceC5160btX
    public CreditMarks ap_() {
        C1535aEx c1535aEx = this.b;
        if (c1535aEx != null) {
            return c1535aEx.ap_();
        }
        return null;
    }

    @Override // o.InterfaceC5160btX
    public VideoInfo.TimeCodes B() {
        C1535aEx c1535aEx = this.b;
        if (c1535aEx != null) {
            return c1535aEx.B();
        }
        return null;
    }

    @Override // o.InterfaceC5160btX
    public InteractiveSummary az_() {
        C1535aEx c1535aEx = this.b;
        if (c1535aEx != null) {
            return c1535aEx.az_();
        }
        return null;
    }

    @Override // o.InterfaceC5160btX
    public Integer ay_() {
        C1535aEx c1535aEx = this.b;
        if (c1535aEx != null) {
            return c1535aEx.ay_();
        }
        return null;
    }

    @Override // o.InterfaceC5160btX
    public boolean bd_() {
        C1535aEx c1535aEx = this.b;
        return c1535aEx != null && c1535aEx.bd_();
    }
}
