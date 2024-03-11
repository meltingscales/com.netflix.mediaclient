package o;

import com.netflix.mediaclient.graphqlrepo.transformers.GraphQLInteractiveSummary;
import com.netflix.model.leafs.VideoInfo;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.blades.CreditMarks;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import j$.time.Instant;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NotImplementedError;
import o.C2289adT;
import o.C2295adZ;
import o.C2328aeF;

/* loaded from: classes3.dex */
public final class aDM implements InterfaceC5160btX {
    private final C2328aeF.e e;

    @Override // o.InterfaceC5176btn
    public boolean aY_() {
        return true;
    }

    public aDM(C2328aeF.e eVar) {
        C8632dsu.c((Object) eVar, "");
        this.e = eVar;
    }

    @Override // o.InterfaceC5176btn
    public String aH_() {
        return String.valueOf(this.e.k());
    }

    @Override // o.InterfaceC5176btn
    public boolean d() {
        Boolean r = this.e.r();
        Boolean bool = Boolean.TRUE;
        return C8632dsu.c(r, bool) && C8632dsu.c(this.e.o(), bool);
    }

    @Override // o.InterfaceC5176btn
    public boolean isPlayable() {
        return C8632dsu.c(this.e.q(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5160btX
    public String aI_() {
        String m = this.e.m();
        return m == null ? "" : m;
    }

    @Override // o.InterfaceC5160btX
    public boolean isAvailableToPlay() {
        return C8632dsu.c(this.e.o(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5160btX
    public int aJ_() {
        Integer d = this.e.e().d();
        if (d != null) {
            return d.intValue();
        }
        return -1;
    }

    @Override // o.InterfaceC5160btX
    public long aG_() {
        Instant b;
        C2295adZ.e b2 = this.e.e().b();
        if (b2 == null || (b = b2.b()) == null) {
            return -1L;
        }
        return b.d();
    }

    @Override // o.InterfaceC5160btX
    public long aF_() {
        return C8175dfS.b(aq_(), av_(), aJ_());
    }

    @Override // o.InterfaceC5160btX
    public long aq_() {
        Double c;
        C2295adZ.e b = this.e.e().b();
        if (b == null || (c = b.c()) == null) {
            return -1L;
        }
        return TimeUnit.SECONDS.toMillis((long) c.doubleValue());
    }

    @Override // o.InterfaceC5160btX
    public int av_() {
        Integer c = this.e.e().c();
        if (c != null) {
            return c.intValue();
        }
        return -1;
    }

    @Override // o.InterfaceC5160btX
    public Integer ay_() {
        C2295adZ.e b = this.e.e().b();
        if (b != null) {
            return b.a();
        }
        return null;
    }

    @Override // o.InterfaceC5160btX
    public boolean bd_() {
        return this.e.e().b() != null;
    }

    @Override // o.InterfaceC5160btX
    public InteractiveSummary az_() {
        return new GraphQLInteractiveSummary(this.e.j());
    }

    @Override // o.InterfaceC5160btX
    public boolean aS_() {
        C2289adT.d d = this.e.b().d();
        if (d != null) {
            return C8632dsu.c(d.b(), Boolean.TRUE);
        }
        return false;
    }

    @Override // o.InterfaceC5160btX
    public boolean aX_() {
        C2289adT.d d = this.e.b().d();
        if (d != null) {
            return C8632dsu.c(d.c(), Boolean.TRUE);
        }
        return false;
    }

    @Override // o.InterfaceC5160btX
    public boolean H() {
        C2289adT.d d = this.e.b().d();
        if (d != null) {
            return C8632dsu.c(d.a(), Boolean.TRUE);
        }
        return false;
    }

    @Override // o.InterfaceC5160btX
    public int g() {
        Integer e = this.e.e().e();
        if (e != null) {
            return e.intValue();
        }
        return -1;
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
    public List<Advisory> e() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5160btX
    public boolean aR_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5160btX
    public String aK_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5160btX
    public String aL_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
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
    public boolean aU_() {
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
