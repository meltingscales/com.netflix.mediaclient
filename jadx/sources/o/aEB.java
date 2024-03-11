package o;

import com.netflix.mediaclient.graphqlrepo.transformers.GraphQLInteractiveSummary;
import com.netflix.mediaclient.graphqlrepo.transformers.GraphQLTimeCodes;
import com.netflix.model.leafs.VideoInfo;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.blades.CreditMarks;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.NotImplementedError;
import o.C2512ahV;
import o.C2572aic;
import o.C2573aid;
import o.C2580aik;
import o.C2587air;

/* loaded from: classes3.dex */
public final class aEB implements InterfaceC5160btX {
    private final C2572aic a;
    private final C2576aig d;
    private final C2579aij e;

    @Override // o.InterfaceC5160btX
    public int an_() {
        return 3;
    }

    public final C2572aic f() {
        return this.a;
    }

    public aEB(C2579aij c2579aij, C2576aig c2576aig, C2572aic c2572aic) {
        C8632dsu.c((Object) c2579aij, "");
        this.e = c2579aij;
        this.d = c2576aig;
        this.a = c2572aic;
    }

    public final C2587air w() {
        C2580aik.d c = this.e.d().c();
        if (c != null) {
            return c.b();
        }
        return null;
    }

    public final C2573aid i() {
        return this.e.d().a();
    }

    @Override // o.InterfaceC5176btn
    public String aH_() {
        return String.valueOf(this.e.b().e());
    }

    @Override // o.InterfaceC5176btn
    public boolean aY_() {
        return f() != null;
    }

    @Override // o.InterfaceC5176btn
    public boolean d() {
        return C8632dsu.c(this.e.b().f(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5176btn
    public boolean isPlayable() {
        Boolean g = this.e.b().g();
        if (g != null) {
            return g.booleanValue();
        }
        return true;
    }

    @Override // o.InterfaceC5160btX
    public String aI_() {
        String c = this.e.b().c();
        return c == null ? "" : c;
    }

    @Override // o.InterfaceC5160btX
    public long aG_() {
        C2587air.b b;
        Instant d;
        C2587air w = w();
        if (w == null || (b = w.b()) == null || (d = b.d()) == null) {
            return -1L;
        }
        return d.b();
    }

    @Override // o.InterfaceC5160btX
    public long aF_() {
        return C8175dfS.b(aq_(), av_(), aJ_());
    }

    @Override // o.InterfaceC5160btX
    public long aq_() {
        C2587air.b b;
        Double a;
        C2587air w = w();
        if (w == null || (b = w.b()) == null || (a = b.a()) == null) {
            return -1L;
        }
        return (long) (a.doubleValue() * 1000);
    }

    @Override // o.InterfaceC5160btX
    public String aC_() {
        String d;
        C2576aig c2576aig = this.d;
        return (c2576aig == null || (d = c2576aig.d()) == null) ? this.e.b().c() : d;
    }

    @Override // o.InterfaceC5160btX
    public String aO_() {
        C2576aig d;
        C2576aig c2576aig = this.d;
        if (c2576aig != null) {
            return String.valueOf(c2576aig.a());
        }
        C2572aic c2572aic = this.a;
        if (c2572aic != null) {
            C2572aic.b e = c2572aic.e();
            return String.valueOf((e == null || (d = e.d()) == null) ? null : Integer.valueOf(d.a()));
        }
        return String.valueOf(this.e.b().e());
    }

    @Override // o.InterfaceC5160btX
    public int g() {
        Integer c;
        C2587air w = w();
        if (w == null || (c = w.c()) == null) {
            return -1;
        }
        return c.intValue();
    }

    @Override // o.InterfaceC5160btX
    public int aJ_() {
        Integer d;
        C2587air w = w();
        if (w == null || (d = w.d()) == null) {
            return -1;
        }
        return d.intValue();
    }

    @Override // o.InterfaceC5160btX
    public int av_() {
        Integer e;
        C2587air w = w();
        return (w == null || (e = w.e()) == null) ? aJ_() : e.intValue();
    }

    @Override // o.InterfaceC5160btX
    public int aB_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5160btX
    public int aw_() {
        Integer c;
        C2572aic f = f();
        if (f == null || (c = f.c()) == null) {
            return -1;
        }
        return c.intValue();
    }

    @Override // o.InterfaceC5160btX
    public int x() {
        C2572aic.c d;
        C2572aic.d a;
        Integer a2;
        C2572aic f = f();
        if (f == null || (d = f.d()) == null || (a = d.a()) == null || (a2 = a.a()) == null) {
            return -1;
        }
        return a2.intValue();
    }

    @Override // o.InterfaceC5160btX
    public boolean aV_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5160btX
    public boolean aS_() {
        C2573aid.a e;
        C2573aid i = i();
        if (i == null || (e = i.e()) == null) {
            return false;
        }
        return C8632dsu.c(e.d(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5160btX
    public boolean aX_() {
        C2573aid.a e;
        C2573aid i = i();
        if (i == null || (e = i.e()) == null) {
            return false;
        }
        return C8632dsu.c(e.c(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5160btX
    public boolean H() {
        C2573aid.a e;
        C2573aid i = i();
        if (i == null || (e = i.e()) == null) {
            return false;
        }
        return C8632dsu.c(e.a(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5160btX
    public List<Advisory> e() {
        int d;
        List<Advisory> U;
        Object c1537aEz;
        List<C2512ahV.a> a = this.e.e().a();
        if (a != null) {
            d = C8572dqo.d(a, 10);
            ArrayList arrayList = new ArrayList(d);
            for (C2512ahV.a aVar : a) {
                if (aVar.a().a() != null) {
                    c1537aEz = new aEC(aVar.a(), this.e.e().b());
                } else {
                    c1537aEz = new C1537aEz(aVar.a());
                }
                arrayList.add(c1537aEz);
            }
            U = C8576dqs.U(arrayList);
            return U;
        }
        return null;
    }

    @Override // o.InterfaceC5160btX
    public boolean aR_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5160btX
    public String aK_() {
        C2572aic.c d;
        C2572aic.d a;
        C2572aic f = f();
        if (f == null || (d = f.d()) == null || (a = d.a()) == null) {
            return null;
        }
        return a.b();
    }

    @Override // o.InterfaceC5160btX
    public String aL_() {
        C2572aic.c d;
        C2572aic.d a;
        C2572aic f = f();
        String c = (f == null || (d = f.d()) == null || (a = d.a()) == null) ? null : a.c();
        return c == null ? "" : c;
    }

    @Override // o.InterfaceC5160btX
    public boolean isAvailableToPlay() {
        return C8632dsu.c(this.e.b().i(), Boolean.TRUE);
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
        Boolean a;
        C2572aic f = f();
        if (f == null || (a = f.a()) == null) {
            return false;
        }
        return a.booleanValue();
    }

    @Override // o.InterfaceC5160btX
    public boolean M() {
        return C8632dsu.c((Object) this.e.b().h(), (Object) C3180auA.c.b().b());
    }

    @Override // o.InterfaceC5160btX
    public boolean N() {
        C2572aic f;
        C2572aic f2;
        C2572aic.c d;
        C2572aic.d a;
        Integer a2;
        C2572aic f3;
        Integer c;
        return (f() == null || (f = f()) == null || !C8632dsu.c(f.b(), Boolean.TRUE) || (f2 = f()) == null || (d = f2.d()) == null || (a = d.a()) == null || (a2 = a.a()) == null || a2.intValue() <= 1 || (f3 = f()) == null || (c = f3.c()) == null || c.intValue() != 1) ? false : true;
    }

    @Override // o.InterfaceC5160btX
    public CreditMarks ap_() {
        return new GraphQLTimeCodes(this.e.c(), this.e.b()).getTimeCodesData().creditMarks();
    }

    @Override // o.InterfaceC5160btX
    public VideoInfo.TimeCodes B() {
        return new GraphQLTimeCodes(this.e.c(), this.e.b());
    }

    @Override // o.InterfaceC5160btX
    public InteractiveSummary az_() {
        return new GraphQLInteractiveSummary(this.e.d().b());
    }

    @Override // o.InterfaceC5160btX
    public Integer ay_() {
        C2587air b;
        C2587air.b b2;
        C2580aik.d c = this.e.d().c();
        if (c == null || (b = c.b()) == null || (b2 = b.b()) == null) {
            return null;
        }
        return b2.c();
    }

    @Override // o.InterfaceC5160btX
    public boolean bd_() {
        C2587air w = w();
        return (w != null ? w.b() : null) != null;
    }
}
