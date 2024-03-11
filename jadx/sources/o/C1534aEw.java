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
import java.util.concurrent.TimeUnit;
import kotlin.NotImplementedError;
import o.C1534aEw;
import o.C1537aEz;
import o.C2512ahV;
import o.C2570aia;
import o.C2572aic;
import o.C2573aid;
import o.C2579aij;
import o.C2580aik;
import o.C2587air;
import o.C8572dqo;
import o.C8576dqs;
import o.aEC;

/* renamed from: o.aEw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1534aEw implements InterfaceC5160btX {
    private final C2572aic a;
    private final C2576aig b;
    private final InterfaceC8554dpx c;
    private final C2579aij d;

    @Override // o.InterfaceC5160btX
    public boolean F() {
        return false;
    }

    @Override // o.InterfaceC5160btX
    public boolean G() {
        return false;
    }

    @Override // o.InterfaceC5160btX
    public boolean M() {
        return false;
    }

    @Override // o.InterfaceC5160btX
    public boolean aR_() {
        return false;
    }

    @Override // o.InterfaceC5176btn
    public boolean aY_() {
        return true;
    }

    public C1534aEw(C2579aij c2579aij, C2572aic c2572aic, C2576aig c2576aig) {
        InterfaceC8554dpx b;
        C8632dsu.c((Object) c2579aij, "");
        this.d = c2579aij;
        this.a = c2572aic;
        this.b = c2576aig;
        b = dpB.b(new drO<List<? extends C1537aEz>>() { // from class: com.netflix.mediaclient.graphqlrepo.transformers.GraphQLPlayerEpisodePlayable$advisoriesList$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final List<C1537aEz> invoke() {
                C2579aij c2579aij2;
                int d;
                List<C1537aEz> U;
                Object c1537aEz;
                C2579aij c2579aij3;
                c2579aij2 = C1534aEw.this.d;
                List<C2512ahV.a> a = c2579aij2.e().a();
                if (a != null) {
                    C1534aEw c1534aEw = C1534aEw.this;
                    d = C8572dqo.d(a, 10);
                    ArrayList arrayList = new ArrayList(d);
                    for (C2512ahV.a aVar : a) {
                        if (aVar.a().a() != null) {
                            C2570aia a2 = aVar.a();
                            c2579aij3 = c1534aEw.d;
                            c1537aEz = new aEC(a2, c2579aij3.e().b());
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
        });
        this.c = b;
    }

    private final List<Advisory> f() {
        return (List) this.c.getValue();
    }

    @Override // o.InterfaceC5176btn
    public String aH_() {
        return String.valueOf(this.d.b().e());
    }

    @Override // o.InterfaceC5176btn
    public boolean d() {
        Boolean f = this.d.b().f();
        Boolean bool = Boolean.TRUE;
        return C8632dsu.c(f, bool) && C8632dsu.c(this.d.d().i(), bool);
    }

    @Override // o.InterfaceC5176btn
    public boolean isPlayable() {
        return C8632dsu.c(this.d.b().g(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5160btX
    public String aI_() {
        String c = this.d.b().c();
        return c == null ? "" : c;
    }

    @Override // o.InterfaceC5160btX
    public boolean isAvailableToPlay() {
        return C8632dsu.c(this.d.d().i(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5160btX
    public int aJ_() {
        C2587air b;
        Integer c;
        C2580aik.d c2 = this.d.d().c();
        if (c2 == null || (b = c2.b()) == null || (c = b.c()) == null) {
            return -1;
        }
        return c.intValue();
    }

    @Override // o.InterfaceC5160btX
    public long aG_() {
        C2587air b;
        C2587air.b b2;
        Instant d;
        C2580aik.d c = this.d.d().c();
        if (c == null || (b = c.b()) == null || (b2 = b.b()) == null || (d = b2.d()) == null) {
            return -1L;
        }
        return d.d();
    }

    @Override // o.InterfaceC5160btX
    public long aF_() {
        return C8175dfS.b(aq_(), av_(), aJ_());
    }

    @Override // o.InterfaceC5160btX
    public long aq_() {
        C2587air b;
        C2587air.b b2;
        Double a;
        C2580aik.d c = this.d.d().c();
        if (c == null || (b = c.b()) == null || (b2 = b.b()) == null || (a = b2.a()) == null) {
            return -1L;
        }
        return TimeUnit.SECONDS.toMillis((long) a.doubleValue());
    }

    @Override // o.InterfaceC5160btX
    public int av_() {
        C2587air b;
        Integer e;
        C2580aik.d c = this.d.d().c();
        if (c == null || (b = c.b()) == null || (e = b.e()) == null) {
            return -1;
        }
        return e.intValue();
    }

    @Override // o.InterfaceC5160btX
    public Integer ay_() {
        C2587air b;
        C2587air.b b2;
        C2580aik.d c = this.d.d().c();
        if (c == null || (b = c.b()) == null || (b2 = b.b()) == null) {
            return null;
        }
        return b2.c();
    }

    @Override // o.InterfaceC5160btX
    public boolean bd_() {
        C2587air b;
        C2580aik.d c = this.d.d().c();
        return ((c == null || (b = c.b()) == null) ? null : b.b()) != null;
    }

    @Override // o.InterfaceC5160btX
    public InteractiveSummary az_() {
        return new GraphQLInteractiveSummary(this.d.d().b());
    }

    @Override // o.InterfaceC5160btX
    public boolean aS_() {
        C2573aid.a e;
        C2573aid a = this.d.d().a();
        if (a == null || (e = a.e()) == null) {
            return false;
        }
        return C8632dsu.c(e.d(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5160btX
    public boolean aX_() {
        C2573aid.a e;
        C2573aid a = this.d.d().a();
        if (a == null || (e = a.e()) == null) {
            return false;
        }
        return C8632dsu.c(e.c(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5160btX
    public boolean H() {
        C2573aid.a e;
        C2573aid a = this.d.d().a();
        if (a == null || (e = a.e()) == null) {
            return false;
        }
        return C8632dsu.c(e.a(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5160btX
    public int g() {
        C2587air b;
        Integer c;
        C2580aik.d c2 = this.d.d().c();
        if (c2 == null || (b = c2.b()) == null || (c = b.c()) == null) {
            return -1;
        }
        return c.intValue();
    }

    @Override // o.InterfaceC5160btX
    public String aC_() {
        String d;
        C2576aig c2576aig = this.b;
        if (c2576aig == null || (d = c2576aig.d()) == null) {
            String c = this.d.b().c();
            return c == null ? "" : c;
        }
        return d;
    }

    @Override // o.InterfaceC5160btX
    public String aO_() {
        C2572aic.b e;
        C2576aig d;
        C2572aic c2572aic = this.a;
        return String.valueOf((c2572aic == null || (e = c2572aic.e()) == null || (d = e.d()) == null) ? null : Integer.valueOf(d.a()));
    }

    @Override // o.InterfaceC5160btX
    public int aB_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5160btX
    public int aw_() {
        Integer c;
        C2572aic c2572aic = this.a;
        if (c2572aic == null || (c = c2572aic.c()) == null) {
            return -1;
        }
        return c.intValue();
    }

    @Override // o.InterfaceC5160btX
    public int x() {
        C2572aic.c d;
        C2572aic.d a;
        Integer a2;
        C2572aic c2572aic = this.a;
        if (c2572aic == null || (d = c2572aic.d()) == null || (a = d.a()) == null || (a2 = a.a()) == null) {
            return -1;
        }
        return a2.intValue();
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
        return f();
    }

    @Override // o.InterfaceC5160btX
    public String aK_() {
        C2572aic.c d;
        C2572aic.d a;
        C2572aic c2572aic = this.a;
        if (c2572aic == null || (d = c2572aic.d()) == null || (a = d.a()) == null) {
            return null;
        }
        return a.b();
    }

    @Override // o.InterfaceC5160btX
    public String aL_() {
        C2572aic.c d;
        C2572aic.d a;
        C2572aic c2572aic = this.a;
        String c = (c2572aic == null || (d = c2572aic.d()) == null || (a = d.a()) == null) ? null : a.c();
        return c == null ? "" : c;
    }

    @Override // o.InterfaceC5160btX
    public boolean aU_() {
        Boolean a;
        C2572aic c2572aic = this.a;
        if (c2572aic == null || (a = c2572aic.a()) == null) {
            return false;
        }
        return a.booleanValue();
    }

    @Override // o.InterfaceC5160btX
    public boolean N() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5160btX
    public CreditMarks ap_() {
        return new GraphQLTimeCodes(this.d.c(), this.d.b()).getTimeCodesData().creditMarks();
    }

    @Override // o.InterfaceC5160btX
    public VideoInfo.TimeCodes B() {
        return new GraphQLTimeCodes(this.d.c(), this.d.b());
    }
}
