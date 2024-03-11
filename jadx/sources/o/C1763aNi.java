package o;

import com.netflix.mediaclient.service.cdx.CdxAgentImpl;
import java.util.List;
import org.json.JSONObject;

/* renamed from: o.aNi  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1763aNi {
    private static final e c = new e(null);
    private UI a;
    private UC b;
    private UF d;
    private UA e;
    private UL f;
    private final CdxAgentImpl g;
    private UH h;
    private UJ i;
    private UG j;
    private UN k;
    private UM l;
    private UO m;
    private UK n;

    /* renamed from: o  reason: collision with root package name */
    private AbstractC1793aOl f13434o;
    private UR p;
    private UP q;
    private US r;
    private UQ s;
    private UT t;

    public final void a(UL ul) {
        this.f = ul;
    }

    public final void b() {
        this.i = null;
        this.l = null;
        this.m = null;
        this.r = null;
        this.k = null;
        this.q = null;
        this.e = null;
        this.j = null;
        this.p = null;
        this.s = null;
    }

    public final void b(UM um) {
        this.l = um;
    }

    public final void b(UP up) {
        this.q = up;
    }

    public final void b(US us) {
        this.r = us;
    }

    public final void c(UA ua) {
        this.e = ua;
    }

    public final void c(UC uc) {
        this.b = uc;
    }

    public final void c(UH uh) {
        this.h = uh;
    }

    public final void c(UR ur) {
        this.p = ur;
    }

    public final UH d() {
        return this.h;
    }

    public final void d(UG ug) {
        this.j = ug;
    }

    public final void d(UQ uq) {
        this.s = uq;
    }

    public final void d(UT ut) {
        this.t = ut;
    }

    public final UC e() {
        return this.b;
    }

    public final void e(UF uf) {
        this.d = uf;
    }

    public final void e(UJ uj) {
        this.i = uj;
    }

    public final void e(UN un) {
        this.k = un;
    }

    public final void e(UO uo) {
        this.m = uo;
    }

    public C1763aNi(CdxAgentImpl cdxAgentImpl) {
        C8632dsu.c((Object) cdxAgentImpl, "");
        this.g = cdxAgentImpl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aNi$e */
    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("nf_cdx");
        }
    }

    public final void d(UK uk) {
        this.n = uk;
        c();
    }

    private final void c() {
        UK uk = this.n;
        if (uk != null) {
            AbstractC1793aOl abstractC1793aOl = this.f13434o;
            if (abstractC1793aOl != null) {
                if (!(abstractC1793aOl instanceof C1797aOp)) {
                    if (abstractC1793aOl instanceof aOB) {
                        c.getLogTag();
                        uk.d(((aOB) abstractC1793aOl).d());
                    }
                } else {
                    c.getLogTag();
                    uk.e(((C1797aOp) abstractC1793aOl).e());
                }
            }
            this.f13434o = null;
        }
    }

    public final void d(List<C1255Uq> list) {
        C8632dsu.c((Object) list, "");
        UI ui = this.a;
        if (ui != null) {
            for (C1255Uq c1255Uq : list) {
                c.getLogTag();
                ui.a(c1255Uq);
            }
        }
    }

    public final void c(List<C1255Uq> list) {
        C8632dsu.c((Object) list, "");
        UH uh = this.h;
        if (uh != null) {
            for (C1255Uq c1255Uq : list) {
                c.getLogTag();
                uh.c(c1255Uq);
            }
        }
    }

    public final void a(JSONObject jSONObject) {
        UL ul;
        C8632dsu.c((Object) jSONObject, "");
        c.getLogTag();
        if (jSONObject.has("payload") && (ul = this.f) != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("payload");
            C8632dsu.a(jSONObject2, "");
            ul.d(jSONObject2);
        }
    }

    public final void c(UY uy) {
        C8632dsu.c((Object) uy, "");
        e eVar = c;
        eVar.getLogTag();
        UJ uj = this.i;
        if (uj != null) {
            eVar.getLogTag();
            uj.d(uy);
            dpR dpr = dpR.c;
        }
    }

    public final void c(UU uu) {
        C8632dsu.c((Object) uu, "");
        e eVar = c;
        eVar.getLogTag();
        UO uo = this.m;
        if (uo != null) {
            eVar.getLogTag();
            uo.d(uu);
            dpR dpr = dpR.c;
        }
    }

    public final void a(InterfaceC1268Vd interfaceC1268Vd) {
        C8632dsu.c((Object) interfaceC1268Vd, "");
        e eVar = c;
        eVar.getLogTag();
        UP up = this.q;
        if (up != null) {
            eVar.getLogTag();
            up.d(interfaceC1268Vd);
            dpR dpr = dpR.c;
        }
    }

    public final void e(UW uw) {
        C8632dsu.c((Object) uw, "");
        e eVar = c;
        eVar.getLogTag();
        UN un = this.k;
        if (un != null) {
            eVar.getLogTag();
            un.b(uw);
            dpR dpr = dpR.c;
        }
    }

    public final void e(List<C1258Ut> list) {
        C8632dsu.c((Object) list, "");
        e eVar = c;
        eVar.getLogTag();
        UG ug = this.j;
        if (ug != null) {
            eVar.getLogTag();
            ug.b(list);
            dpR dpr = dpR.c;
        }
    }

    public final void a(UZ uz) {
        C8632dsu.c((Object) uz, "");
        e eVar = c;
        eVar.getLogTag();
        US us = this.r;
        if (us != null) {
            eVar.getLogTag();
            us.c(uz);
            dpR dpr = dpR.c;
        }
    }

    public final void d(UV uv) {
        C8632dsu.c((Object) uv, "");
        e eVar = c;
        eVar.getLogTag();
        UM um = this.l;
        if (um != null) {
            eVar.getLogTag();
            um.c(uv);
            dpR dpr = dpR.c;
        }
    }

    public final void a() {
        e eVar = c;
        eVar.getLogTag();
        UA ua = this.e;
        if (ua != null) {
            eVar.getLogTag();
            ua.c();
            dpR dpr = dpR.c;
        }
    }

    public final void b(String str) {
        C8632dsu.c((Object) str, "");
        e eVar = c;
        eVar.getLogTag();
        UT ut = this.t;
        if (ut != null) {
            eVar.getLogTag();
            ut.c(str);
            dpR dpr = dpR.c;
        }
    }

    public final void b(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        e eVar = c;
        eVar.getLogTag();
        C1768aNn c1768aNn = C1768aNn.d;
        List<C1255Uq> e2 = C1768aNn.e(c1768aNn, jSONObject, false, 2, null);
        eVar.getLogTag();
        this.g.b(e2);
        UF uf = this.d;
        if (uf != null) {
            eVar.getLogTag();
            List<C1255Uq> b = c1768aNn.b(this.g.m(), e2);
            eVar.getLogTag();
            uf.e(b);
            dpR dpr = dpR.c;
        }
    }

    public final void c(UX ux) {
        C8632dsu.c((Object) ux, "");
        e eVar = c;
        eVar.getLogTag();
        UR ur = this.p;
        if (ur != null) {
            eVar.getLogTag();
            ur.d(ux);
            dpR dpr = dpR.c;
        }
    }

    public final void b(InterfaceC1265Va interfaceC1265Va) {
        C8632dsu.c((Object) interfaceC1265Va, "");
        e eVar = c;
        eVar.getLogTag();
        UQ uq = this.s;
        if (uq != null) {
            eVar.getLogTag();
            uq.c(interfaceC1265Va);
            dpR dpr = dpR.c;
        }
    }

    public final void c(aOB aob) {
        dpR dpr;
        C8632dsu.c((Object) aob, "");
        e eVar = c;
        eVar.getLogTag();
        UK uk = this.n;
        if (uk != null) {
            eVar.getLogTag();
            uk.d(aob.d());
            dpr = dpR.c;
        } else {
            dpr = null;
        }
        if (dpr == null) {
            this.f13434o = aob;
        }
    }

    public final void a(C1797aOp c1797aOp) {
        dpR dpr;
        C8632dsu.c((Object) c1797aOp, "");
        e eVar = c;
        eVar.getLogTag();
        UK uk = this.n;
        if (uk != null) {
            eVar.getLogTag();
            uk.e(c1797aOp.e());
            dpr = dpR.c;
        } else {
            dpr = null;
        }
        if (dpr == null) {
            this.f13434o = c1797aOp;
        }
    }
}
