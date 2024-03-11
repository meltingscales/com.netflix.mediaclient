package o;

import com.netflix.mediaclient.graphqlrepo.transformers.GraphQLInteractiveSummary;
import com.netflix.model.leafs.VideoInfo;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.blades.CreditMarks;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import java.util.List;
import kotlin.NotImplementedError;
import o.C1362Yt;

/* loaded from: classes3.dex */
public final class aDH implements InterfaceC5160btX {
    private final C1362Yt.G a;

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
    public int g() {
        return -1;
    }

    public aDH(C1362Yt.G g) {
        C8632dsu.c((Object) g, "");
        this.a = g;
    }

    @Override // o.InterfaceC5176btn
    public String aH_() {
        return String.valueOf(this.a.v());
    }

    @Override // o.InterfaceC5176btn
    public boolean d() {
        Boolean B = this.a.B();
        Boolean bool = Boolean.TRUE;
        return C8632dsu.c(B, bool) && C8632dsu.c(this.a.D(), bool);
    }

    @Override // o.InterfaceC5176btn
    public boolean isPlayable() {
        return C8632dsu.c(this.a.G(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5160btX
    public String aI_() {
        String u = this.a.u();
        return u == null ? "" : u;
    }

    @Override // o.InterfaceC5160btX
    public long aG_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5160btX
    public InteractiveSummary az_() {
        return new GraphQLInteractiveSummary(this.a.f());
    }

    @Override // o.InterfaceC5160btX
    public boolean aU_() {
        Boolean C = this.a.C();
        if (C != null) {
            return C.booleanValue();
        }
        return false;
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

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (((r0 == null || (r0 = r0.b()) == null || (r0 = r0.a()) == null) ? null : r0.b()) != null) goto L11;
     */
    @Override // o.InterfaceC5160btX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean bd_() {
        /*
            r2 = this;
            o.Yt$G r0 = r2.a
            o.Yt$y r0 = r0.l()
            r1 = 0
            if (r0 == 0) goto L26
            o.Yt$G r0 = r2.a
            o.Yt$y r0 = r0.l()
            if (r0 == 0) goto L22
            o.Yt$f r0 = r0.b()
            if (r0 == 0) goto L22
            o.adZ r0 = r0.a()
            if (r0 == 0) goto L22
            o.adZ$e r0 = r0.b()
            goto L23
        L22:
            r0 = r1
        L23:
            if (r0 == 0) goto L26
            goto L42
        L26:
            o.Yt$G r0 = r2.a
            o.Yt$v r0 = r0.n()
            if (r0 == 0) goto L44
            o.Yt$G r0 = r2.a
            o.Yt$v r0 = r0.n()
            if (r0 == 0) goto L40
            o.adZ r0 = r0.c()
            if (r0 == 0) goto L40
            o.adZ$e r1 = r0.b()
        L40:
            if (r1 == 0) goto L44
        L42:
            r0 = 1
            goto L45
        L44:
            r0 = 0
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aDH.bd_():boolean");
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
        return C8632dsu.c(this.a.D(), Boolean.TRUE);
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
