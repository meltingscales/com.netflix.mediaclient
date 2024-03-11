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

/* loaded from: classes3.dex */
public final class aEK implements InterfaceC5160btX {
    private final C2356aeh b;

    @Override // o.InterfaceC5176btn
    public boolean aY_() {
        return true;
    }

    public aEK(C2356aeh c2356aeh) {
        C8632dsu.c((Object) c2356aeh, "");
        this.b = c2356aeh;
    }

    @Override // o.InterfaceC5176btn
    public String aH_() {
        return String.valueOf(this.b.g().e());
    }

    @Override // o.InterfaceC5176btn
    public boolean d() {
        Boolean f = this.b.g().f();
        Boolean bool = Boolean.TRUE;
        return C8632dsu.c(f, bool) && C8632dsu.c(this.b.j(), bool);
    }

    @Override // o.InterfaceC5176btn
    public boolean isPlayable() {
        return C8632dsu.c(this.b.g().g(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5160btX
    public String aI_() {
        String c = this.b.g().c();
        return c == null ? "" : c;
    }

    @Override // o.InterfaceC5160btX
    public boolean isAvailableToPlay() {
        return C8632dsu.c(this.b.j(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5160btX
    public int aJ_() {
        Integer e;
        C2295adZ b = this.b.b();
        if (b == null || (e = b.e()) == null) {
            return -1;
        }
        return e.intValue();
    }

    @Override // o.InterfaceC5160btX
    public long aG_() {
        C2295adZ.e b;
        Instant b2;
        C2295adZ b3 = this.b.b();
        if (b3 == null || (b = b3.b()) == null || (b2 = b.b()) == null) {
            return -1L;
        }
        return b2.d();
    }

    @Override // o.InterfaceC5160btX
    public long aF_() {
        return C8175dfS.b(aq_(), av_(), aJ_());
    }

    @Override // o.InterfaceC5160btX
    public long aq_() {
        C2295adZ.e b;
        Double c;
        C2295adZ b2 = this.b.b();
        if (b2 == null || (b = b2.b()) == null || (c = b.c()) == null) {
            return -1L;
        }
        return TimeUnit.SECONDS.toMillis((long) c.doubleValue());
    }

    @Override // o.InterfaceC5160btX
    public int av_() {
        Integer c;
        C2295adZ b = this.b.b();
        if (b == null || (c = b.c()) == null) {
            return -1;
        }
        return c.intValue();
    }

    @Override // o.InterfaceC5160btX
    public Integer ay_() {
        C2295adZ.e b;
        C2295adZ b2 = this.b.b();
        if (b2 == null || (b = b2.b()) == null) {
            return null;
        }
        return b.a();
    }

    @Override // o.InterfaceC5160btX
    public boolean bd_() {
        C2295adZ b = this.b.b();
        return (b != null ? b.b() : null) != null;
    }

    @Override // o.InterfaceC5160btX
    public InteractiveSummary az_() {
        return new GraphQLInteractiveSummary(this.b.d());
    }

    @Override // o.InterfaceC5160btX
    public boolean aS_() {
        C2289adT.d d;
        C2289adT e = this.b.e();
        if (e == null || (d = e.d()) == null) {
            return false;
        }
        return C8632dsu.c(d.b(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5160btX
    public boolean aX_() {
        C2289adT.d d;
        C2289adT e = this.b.e();
        if (e == null || (d = e.d()) == null) {
            return false;
        }
        return C8632dsu.c(d.c(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5160btX
    public boolean H() {
        C2289adT.d d;
        C2289adT e = this.b.e();
        if (e == null || (d = e.d()) == null) {
            return false;
        }
        return C8632dsu.c(d.a(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5160btX
    public int g() {
        Integer e;
        C2295adZ b = this.b.b();
        if (b == null || (e = b.e()) == null) {
            return -1;
        }
        return e.intValue();
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
