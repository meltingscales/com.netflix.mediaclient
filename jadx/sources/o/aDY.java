package o;

import com.netflix.model.leafs.VideoInfo;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.blades.CreditMarks;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import java.util.List;
import kotlin.NotImplementedError;

/* loaded from: classes3.dex */
public final class aDY implements InterfaceC5160btX {
    private final C2630ajh e;

    @Override // o.InterfaceC5160btX
    public boolean H() {
        return false;
    }

    @Override // o.InterfaceC5160btX
    public int aJ_() {
        return -1;
    }

    @Override // o.InterfaceC5160btX
    public String aK_() {
        return "";
    }

    @Override // o.InterfaceC5160btX
    public boolean aU_() {
        return true;
    }

    @Override // o.InterfaceC5176btn
    public boolean aY_() {
        return false;
    }

    @Override // o.InterfaceC5160btX
    public long aq_() {
        return -1L;
    }

    @Override // o.InterfaceC5160btX
    public int av_() {
        return -1;
    }

    @Override // o.InterfaceC5160btX
    public Integer ay_() {
        return null;
    }

    @Override // o.InterfaceC5160btX
    public InteractiveSummary az_() {
        return null;
    }

    @Override // o.InterfaceC5160btX
    public boolean bd_() {
        return false;
    }

    @Override // o.InterfaceC5160btX
    public int g() {
        return -1;
    }

    public aDY(C2630ajh c2630ajh) {
        C8632dsu.c((Object) c2630ajh, "");
        this.e = c2630ajh;
    }

    @Override // o.InterfaceC5176btn
    public String aH_() {
        return String.valueOf(this.e.e());
    }

    @Override // o.InterfaceC5176btn
    public boolean d() {
        Boolean f = this.e.f();
        Boolean bool = Boolean.TRUE;
        return C8632dsu.c(f, bool) && C8632dsu.c(this.e.i(), bool);
    }

    @Override // o.InterfaceC5176btn
    public boolean isPlayable() {
        return C8632dsu.c(this.e.g(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5160btX
    public String aI_() {
        String c = this.e.c();
        return c == null ? "" : c;
    }

    @Override // o.InterfaceC5160btX
    public long aG_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5160btX
    public long aF_() {
        return C8175dfS.b(aq_(), av_(), aJ_());
    }

    @Override // o.InterfaceC5160btX
    public String aC_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5160btX
    public String aO_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5160btX
    public int aB_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5160btX
    public int aw_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5160btX
    public int x() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5160btX
    public int an_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5160btX
    public boolean aV_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5160btX
    public boolean aS_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5160btX
    public boolean aX_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5160btX
    public List<Advisory> e() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5160btX
    public boolean aR_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5160btX
    public String aL_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5160btX
    public boolean isAvailableToPlay() {
        return C8632dsu.c(this.e.i(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5160btX
    public boolean F() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5160btX
    public boolean G() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5160btX
    public boolean M() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5160btX
    public boolean N() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5160btX
    public CreditMarks ap_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5160btX
    public VideoInfo.TimeCodes B() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}
