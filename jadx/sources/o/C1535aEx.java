package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.model.leafs.VideoInfo;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.blades.CreditMarks;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import j$.time.Instant;
import java.util.List;
import java.util.Map;
import kotlin.NotImplementedError;
import o.C2412afk;
import o.C2513ahW;
import o.C2514ahX;
import o.C2638ajp;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;

/* renamed from: o.aEx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1535aEx implements InterfaceC5160btX {
    private C2514ahX c;

    @Override // o.InterfaceC5160btX
    public boolean aR_() {
        return false;
    }

    public C1535aEx(C2514ahX c2514ahX) {
        C8632dsu.c((Object) c2514ahX, "");
        this.c = c2514ahX;
    }

    private final C2638ajp y() {
        C2514ahX.d d;
        C2514ahX.b d2;
        C2513ahW d3;
        C2513ahW d4;
        String c = this.c.c();
        if (C8632dsu.c((Object) c, (Object) C2988aqU.e.c().b())) {
            C2514ahX.c b = this.c.b();
            if (b != null) {
                return b.b();
            }
        } else if (C8632dsu.c((Object) c, (Object) C2879aoR.b.c().b())) {
            C2514ahX.a a = this.c.a();
            if (a != null && (d4 = a.d()) != null) {
                return d4.f();
            }
        } else if (C8632dsu.c((Object) c, (Object) C3226auv.e.e().b()) && (d = this.c.d()) != null && (d2 = d.d()) != null && (d3 = d2.d()) != null) {
            return d3.f();
        }
        return null;
    }

    private final C2630ajh i() {
        C2514ahX.d d;
        C2514ahX.b d2;
        C2513ahW d3;
        C2513ahW d4;
        String c = this.c.c();
        if (C8632dsu.c((Object) c, (Object) C2988aqU.e.c().b())) {
            C2514ahX.c b = this.c.b();
            if (b != null) {
                return b.a();
            }
        } else if (C8632dsu.c((Object) c, (Object) C2879aoR.b.c().b())) {
            C2514ahX.a a = this.c.a();
            if (a != null && (d4 = a.d()) != null) {
                return d4.h();
            }
        } else if (C8632dsu.c((Object) c, (Object) C3226auv.e.e().b()) && (d = this.c.d()) != null && (d2 = d.d()) != null && (d3 = d2.d()) != null) {
            return d3.h();
        }
        return null;
    }

    public final C2513ahW f() {
        C2514ahX.d d;
        C2514ahX.b d2;
        String c = this.c.c();
        if (C8632dsu.c((Object) c, (Object) C2879aoR.b.c().b())) {
            C2514ahX.a a = this.c.a();
            if (a != null) {
                return a.d();
            }
        } else if (C8632dsu.c((Object) c, (Object) C3226auv.e.e().b()) && (d = this.c.d()) != null && (d2 = d.d()) != null) {
            return d2.d();
        }
        return null;
    }

    @Override // o.InterfaceC5176btn
    public String aH_() {
        C2630ajh h;
        C2630ajh a;
        String c = this.c.c();
        if (C8632dsu.c((Object) c, (Object) C2988aqU.e.c().b())) {
            C2514ahX.c b = this.c.b();
            if (b != null && (a = b.a()) != null) {
                return Integer.valueOf(a.e()).toString();
            }
        } else if (C8632dsu.c((Object) c, (Object) C2879aoR.b.c().b()) || C8632dsu.c((Object) c, (Object) C3226auv.e.e().b())) {
            C2513ahW f = f();
            if (f != null && (h = f.h()) != null) {
                return Integer.valueOf(h.e()).toString();
            }
        } else {
            w();
        }
        return null;
    }

    @Override // o.InterfaceC5160btX
    public int g() {
        Integer d;
        C2638ajp y = y();
        if (y == null || (d = y.d()) == null) {
            return -1;
        }
        return d.intValue();
    }

    @Override // o.InterfaceC5160btX
    public int aJ_() {
        Integer c;
        C2638ajp y = y();
        if (y == null || (c = y.c()) == null) {
            return -1;
        }
        return c.intValue();
    }

    @Override // o.InterfaceC5160btX
    public long aq_() {
        C2638ajp.d b;
        Double b2;
        C2638ajp y = y();
        if (y == null || (b = y.b()) == null || (b2 = b.b()) == null) {
            return -1L;
        }
        return (long) (b2.doubleValue() * 1000);
    }

    @Override // o.InterfaceC5160btX
    public long aF_() {
        return C8175dfS.b(aq_(), av_(), aJ_());
    }

    @Override // o.InterfaceC5160btX
    public int av_() {
        Integer a;
        C2638ajp y = y();
        return (y == null || (a = y.a()) == null) ? aJ_() : a.intValue();
    }

    @Override // o.InterfaceC5176btn
    public boolean isPlayable() {
        C2630ajh i = i();
        if (i != null) {
            return C8632dsu.c(i.g(), Boolean.TRUE);
        }
        return false;
    }

    @Override // o.InterfaceC5176btn
    public boolean aY_() {
        return f() != null;
    }

    @Override // o.InterfaceC5160btX
    public boolean aU_() {
        C2513ahW f;
        Boolean b;
        String c = this.c.c();
        if (!(C8632dsu.c((Object) c, (Object) C2879aoR.b.c().b()) || C8632dsu.c((Object) c, (Object) C3226auv.e.e().b())) || (f = f()) == null || (b = f.b()) == null) {
            return false;
        }
        return b.booleanValue();
    }

    @Override // o.InterfaceC5160btX
    public int aw_() {
        C2513ahW f;
        Integer a;
        String c = this.c.c();
        if (!(C8632dsu.c((Object) c, (Object) C2879aoR.b.c().b()) || C8632dsu.c((Object) c, (Object) C3226auv.e.e().b())) || (f = f()) == null || (a = f.a()) == null) {
            return -1;
        }
        return a.intValue();
    }

    @Override // o.InterfaceC5176btn
    public boolean d() {
        C2630ajh i = i();
        if (i != null) {
            return C8632dsu.c(i.f(), Boolean.TRUE);
        }
        return false;
    }

    @Override // o.InterfaceC5160btX
    public String aI_() {
        C2630ajh i = i();
        if (i != null) {
            return i.c();
        }
        return null;
    }

    @Override // o.InterfaceC5160btX
    public boolean isAvailableToPlay() {
        C2630ajh i = i();
        if (i != null) {
            return C8632dsu.c(i.i(), Boolean.TRUE);
        }
        return false;
    }

    @Override // o.InterfaceC5160btX
    public boolean aS_() {
        C2638ajp.c e;
        C2638ajp y = y();
        if (y == null || (e = y.e()) == null) {
            return false;
        }
        return C8632dsu.c(e.d(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5160btX
    public boolean aX_() {
        C2638ajp.c e;
        C2638ajp y = y();
        if (y == null || (e = y.e()) == null) {
            return false;
        }
        return C8632dsu.c(e.c(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5160btX
    public boolean H() {
        C2638ajp.c e;
        C2638ajp y = y();
        if (y == null || (e = y.e()) == null) {
            return false;
        }
        return C8632dsu.c(e.b(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5160btX
    public String aL_() {
        C2513ahW.e c;
        C2513ahW f = f();
        String e = (f == null || (c = f.c()) == null) ? null : c.e();
        return e == null ? "" : e;
    }

    @Override // o.InterfaceC5160btX
    public String aK_() {
        C2513ahW.e c;
        C2513ahW f = f();
        if (f == null || (c = f.c()) == null) {
            return null;
        }
        return c.c();
    }

    @Override // o.InterfaceC5160btX
    public int x() {
        C2513ahW.e c;
        Integer d;
        C2513ahW f = f();
        if (f == null || (c = f.c()) == null || (d = c.d()) == null) {
            return -1;
        }
        return d.intValue();
    }

    @Override // o.InterfaceC5160btX
    public String aO_() {
        C2513ahW.d e;
        C2630ajh a;
        String c = this.c.c();
        if (C8632dsu.c((Object) c, (Object) C2988aqU.e.c().b())) {
            C2514ahX.c b = this.c.b();
            if (b != null && (a = b.a()) != null) {
                return Integer.valueOf(a.e()).toString();
            }
        } else if (C8632dsu.c((Object) c, (Object) C2879aoR.b.c().b())) {
            C2513ahW f = f();
            if (f != null && (e = f.e()) != null) {
                return Integer.valueOf(e.a()).toString();
            }
        } else if (C8632dsu.c((Object) c, (Object) C3226auv.e.e().b())) {
            C2514ahX.d d = this.c.d();
            if (d != null) {
                return Integer.valueOf(d.b()).toString();
            }
        } else {
            w();
        }
        return null;
    }

    @Override // o.InterfaceC5160btX
    public String aC_() {
        C2513ahW f;
        C2513ahW.d e;
        C2630ajh a;
        String c = this.c.c();
        if (C8632dsu.c((Object) c, (Object) C2988aqU.e.c().b())) {
            C2514ahX.c b = this.c.b();
            if (b != null && (a = b.a()) != null) {
                return a.c();
            }
        } else if ((C8632dsu.c((Object) c, (Object) C2879aoR.b.c().b()) || C8632dsu.c((Object) c, (Object) C3226auv.e.e().b())) && (f = f()) != null && (e = f.e()) != null) {
            return e.c();
        }
        return null;
    }

    @Override // o.InterfaceC5160btX
    public InteractiveSummary az_() {
        C2513ahW f;
        C2412afk d;
        C2412afk d2;
        String c = this.c.c();
        if (C8632dsu.c((Object) c, (Object) C2988aqU.e.c().b())) {
            C2514ahX.c b = this.c.b();
            if (b != null && (d2 = b.d()) != null) {
                return C1524aEm.a(d2);
            }
        } else if ((C8632dsu.c((Object) c, (Object) C2879aoR.b.c().b()) || C8632dsu.c((Object) c, (Object) C3226auv.e.e().b())) && (f = f()) != null && (d = f.d()) != null) {
            return C1524aEm.a(d);
        }
        return null;
    }

    @Override // o.InterfaceC5160btX
    public Integer ay_() {
        C2513ahW f;
        C2412afk d;
        C2412afk.b d2;
        C2412afk.d d3;
        String c = this.c.c();
        if (C8632dsu.c((Object) c, (Object) C2988aqU.e.c().b())) {
            C2514ahX.c b = this.c.b();
            if (b != null) {
                d = b.d();
            }
            d = null;
        } else {
            if ((C8632dsu.c((Object) c, (Object) C2879aoR.b.c().b()) || C8632dsu.c((Object) c, (Object) C3226auv.e.e().b())) && (f = f()) != null) {
                d = f.d();
            }
            d = null;
        }
        if (d == null || (d2 = d.d()) == null || (d3 = d2.d()) == null) {
            return null;
        }
        return d3.b();
    }

    @Override // o.InterfaceC5160btX
    public boolean bd_() {
        C2638ajp y = y();
        return (y != null ? y.b() : null) != null;
    }

    @Override // o.InterfaceC5160btX
    public long aG_() {
        C2638ajp.d b;
        Instant a;
        C2638ajp y = y();
        if (y == null || (b = y.b()) == null || (a = b.a()) == null) {
            return -1L;
        }
        return a.b();
    }

    private final void w() {
        Map i;
        Throwable th;
        InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
        ErrorType errorType = ErrorType.l;
        i = dqE.i(dpD.a("typeName", this.c.c()), dpD.a(SignupConstants.Field.VIDEO_ID, String.valueOf(this.c.e())), dpD.a("playableId", aH_()), dpD.a("topLevelId", aO_()));
        C1596aHd c1596aHd = new C1596aHd("GraphQLPlayable: Invalid data received", null, errorType, false, i, true, false, 66, null);
        ErrorType errorType2 = c1596aHd.a;
        if (errorType2 != null) {
            c1596aHd.e.put("errorType", errorType2.c());
            String b = c1596aHd.b();
            if (b != null) {
                String c = errorType2.c();
                c1596aHd.a(c + " " + b);
            }
        }
        if (c1596aHd.b() != null && c1596aHd.i != null) {
            th = new Throwable(c1596aHd.b(), c1596aHd.i);
        } else if (c1596aHd.b() != null) {
            th = new Throwable(c1596aHd.b());
        } else {
            th = c1596aHd.i;
            if (th == null) {
                th = new Throwable("Handled exception with no message");
            } else if (th == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
        InterfaceC1597aHe c2 = dVar2.c();
        if (c2 != null) {
            c2.d(c1596aHd, th);
        } else {
            dVar2.e().b(c1596aHd, th);
        }
    }

    @Override // o.InterfaceC5160btX
    public int aB_() {
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
