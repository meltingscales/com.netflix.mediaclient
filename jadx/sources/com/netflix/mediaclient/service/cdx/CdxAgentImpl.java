package com.netflix.mediaclient.service.cdx;

import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.cdx.api.DeviceType;
import com.netflix.mediaclient.cdx.api.NavigationCommand;
import com.netflix.mediaclient.cdx.api.PairingType;
import com.netflix.mediaclient.cdx.api.Route;
import com.netflix.mediaclient.service.cdx.CdxAgentImpl;
import com.netflix.mediaclient.service.cdx.log.MessageFailureCause;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.ZuulAgent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import o.AbstractC1769aNo;
import o.C1044Mm;
import o.C1045Mp;
import o.C1255Uq;
import o.C1596aHd;
import o.C1763aNi;
import o.C1768aNn;
import o.C1771aNq;
import o.C1772aNr;
import o.C1774aNt;
import o.C1775aNu;
import o.C1777aNw;
import o.C1782aOa;
import o.C1798aOq;
import o.C1799aOr;
import o.C1800aOs;
import o.C1805aOx;
import o.C1807aOz;
import o.C1812aPd;
import o.C8153dex;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1078Nw;
import o.InterfaceC1251Um;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC1773aNs;
import o.InterfaceC5171bti;
import o.UA;
import o.UC;
import o.UD;
import o.UF;
import o.UG;
import o.UH;
import o.UJ;
import o.UK;
import o.UL;
import o.UM;
import o.UN;
import o.UO;
import o.UP;
import o.UQ;
import o.UR;
import o.US;
import o.UT;
import o.aGT;
import o.aNA;
import o.aNM;
import o.aNN;
import o.aNW;
import o.aOC;
import o.aOV;
import o.dpR;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class CdxAgentImpl extends AbstractC1769aNo implements InterfaceC1251Um {
    private static final d b = new d(null);
    private aNA a;
    private boolean f;
    private C1777aNw h;
    @Inject
    public aGT localDiscovery;

    /* renamed from: o  reason: collision with root package name */
    private C1255Uq f13195o;
    @Inject
    public UserAgentEventsReceiver userAgentEventHandler;
    private Map<String, C1255Uq> e = new LinkedHashMap();
    private final e l = new e();
    private final C1763aNi d = new C1763aNi(this);
    private final aNM j = new aNM(this);
    private final C1771aNq i = new C1771aNq(this);
    private final C1799aOr g = new C1799aOr(this);
    private final C1775aNu n = new C1775aNu(this);

    @Override // o.InterfaceC1251Um
    public boolean a() {
        return this.f;
    }

    public final C1763aNi i() {
        return this.d;
    }

    public final C1777aNw k() {
        return this.h;
    }

    public final C1255Uq m() {
        return this.f13195o;
    }

    public final C1775aNu n() {
        return this.n;
    }

    @Inject
    public CdxAgentImpl() {
        UserAgentEventsReceiver.d.c(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("nf_cdx");
        }
    }

    public final aGT l() {
        aGT agt = this.localDiscovery;
        if (agt != null) {
            return agt;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.aMF
    public void doInit() {
        Context context = getContext();
        C8632dsu.a(context, "");
        d(context, h());
        l().b(this.i);
        C1800aOs d2 = this.g.d();
        Context context2 = getContext();
        C8632dsu.a(context2, "");
        d2.c(context2);
        t();
        initCompleted(InterfaceC1078Nw.aJ);
    }

    public final String h() {
        aOV configurationAgent = getConfigurationAgent();
        if (configurationAgent != null) {
            String m = configurationAgent.w().m();
            C8632dsu.a(m, "");
            return m;
        }
        return "";
    }

    @Override // o.aMF
    public void destroy() {
        super.destroy();
        l().e(this.i);
    }

    public final void d(Context context, String str) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        this.a = new aNA(new c(this, context, str));
    }

    public final void t() {
        synchronized (this) {
            if (!C8153dex.l()) {
                s();
            } else if (this.f) {
            } else {
                UserAgent userAgent = getUserAgent();
                if (userAgent != null && userAgent.v()) {
                    u();
                }
            }
        }
    }

    private final void s() {
        aOV configurationAgent = getConfigurationAgent();
        if (configurationAgent instanceof C1812aPd) {
            ((C1812aPd) configurationAgent).a(new C1812aPd.d() { // from class: o.aNk
                @Override // o.C1812aPd.d
                public final void d(Status status) {
                    CdxAgentImpl.b(CdxAgentImpl.this, status);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final CdxAgentImpl cdxAgentImpl, Status status) {
        C8632dsu.c((Object) cdxAgentImpl, "");
        cdxAgentImpl.getMainHandler().post(new Runnable() { // from class: o.aNl
            @Override // java.lang.Runnable
            public final void run() {
                CdxAgentImpl.a(CdxAgentImpl.this);
            }
        });
    }

    private final void u() {
        if (!l().d() || l().c()) {
            d dVar = b;
            dVar.getLogTag();
            dVar.getLogTag();
            dVar.getLogTag();
            r();
        }
    }

    public final void p() {
        synchronized (this) {
            C1800aOs d2 = this.g.d();
            Context context = getContext();
            C8632dsu.a(context, "");
            d2.b(context);
            if (this.f) {
                b.getLogTag();
                this.f = false;
                ZuulAgent zuulAgent = getZuulAgent();
                if (zuulAgent != null) {
                    zuulAgent.c(this.l);
                }
            }
        }
    }

    public final String j() {
        UserAgent userAgent = getUserAgent();
        if (userAgent != null) {
            return userAgent.g();
        }
        return null;
    }

    public final boolean o() {
        UserAgent userAgent = getUserAgent();
        Boolean t = userAgent != null ? userAgent.t() : null;
        if (t == null) {
            return false;
        }
        return t.booleanValue();
    }

    public String f() {
        return C1768aNn.d.e(getUserAgent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        ZuulAgent zuulAgent = getZuulAgent();
        if (zuulAgent != null) {
            zuulAgent.b(new C1782aOa(zuulAgent.b()).a());
        }
    }

    @Override // o.InterfaceC1251Um
    public void d(UH uh) {
        this.d.c(uh);
    }

    @Override // o.InterfaceC1251Um
    public void c(UL ul) {
        this.d.a(ul);
    }

    @Override // o.InterfaceC1251Um
    public void d(UJ uj) {
        this.d.e(uj);
    }

    @Override // o.InterfaceC1251Um
    public void a(UG ug) {
        this.d.d(ug);
    }

    @Override // o.InterfaceC1251Um
    public void c(UM um) {
        this.d.b(um);
    }

    @Override // o.InterfaceC1251Um
    public void e(UO uo) {
        this.d.e(uo);
    }

    @Override // o.InterfaceC1251Um
    public void c(UP up) {
        this.d.b(up);
    }

    @Override // o.InterfaceC1251Um
    public void c(US us) {
        C1044Mm.e(b.getLogTag(), "setTrackListEventListener");
        this.d.b(us);
    }

    @Override // o.InterfaceC1251Um
    public void c(UN un) {
        C1044Mm.e(b.getLogTag(), "setPlayerSubscriptionResponseListener");
        this.d.e(un);
    }

    @Override // o.InterfaceC1251Um
    public void b(UA ua) {
        C1044Mm.e(b.getLogTag(), "setConnectionOfferEventListener");
        this.d.c(ua);
    }

    @Override // o.InterfaceC1251Um
    public void a(UF uf) {
        C8632dsu.c((Object) uf, "");
        this.d.e(uf);
        ZuulAgent zuulAgent = getZuulAgent();
        if (zuulAgent != null) {
            zuulAgent.b(new aNW(zuulAgent.b()).a());
            String logTag = b.getLogTag();
            C1044Mm.e(logTag, "sent DeviceListRequest message: callback = " + uf);
        }
    }

    public final Integer b(C1255Uq c1255Uq) {
        C8632dsu.c((Object) c1255Uq, "");
        ZuulAgent zuulAgent = getZuulAgent();
        if (zuulAgent != null) {
            int b2 = zuulAgent.b();
            aNA ana = this.a;
            if (ana == null) {
                C8632dsu.d("");
                ana = null;
            }
            ana.d(b2, c1255Uq.a());
            if (zuulAgent.b(C1774aNt.c.i(new C1772aNr(b2, c1255Uq, f(), this.h)).e())) {
                return Integer.valueOf(b2);
            }
            return null;
        }
        return null;
    }

    @Override // o.InterfaceC1251Um
    public void d(C1255Uq c1255Uq, NavigationCommand navigationCommand) {
        C8632dsu.c((Object) c1255Uq, "");
        C8632dsu.c((Object) navigationCommand, "");
        ZuulAgent zuulAgent = getZuulAgent();
        if (zuulAgent != null) {
            int b2 = zuulAgent.b();
            aNA ana = this.a;
            if (ana == null) {
                C8632dsu.d("");
                ana = null;
            }
            ana.d(b2, c1255Uq.a());
            zuulAgent.b(C1774aNt.c.b(new C1772aNr(b2, c1255Uq, f(), this.h), navigationCommand).a());
        }
    }

    @Override // o.InterfaceC1251Um
    public void c(C1255Uq c1255Uq, Route route) {
        C8632dsu.c((Object) c1255Uq, "");
        C8632dsu.c((Object) route, "");
        ZuulAgent zuulAgent = getZuulAgent();
        if (zuulAgent != null) {
            int b2 = zuulAgent.b();
            aNA ana = this.a;
            if (ana == null) {
                C8632dsu.d("");
                ana = null;
            }
            ana.d(b2, c1255Uq.a());
            zuulAgent.b(C1774aNt.c.c(new C1772aNr(b2, c1255Uq, f(), this.h), route).a());
        }
    }

    @Override // o.InterfaceC1251Um
    public void b(C1255Uq c1255Uq, String str) {
        C8632dsu.c((Object) c1255Uq, "");
        C8632dsu.c((Object) str, "");
        ZuulAgent zuulAgent = getZuulAgent();
        if (zuulAgent != null) {
            int b2 = zuulAgent.b();
            aNA ana = this.a;
            if (ana == null) {
                C8632dsu.d("");
                ana = null;
            }
            ana.d(b2, c1255Uq.a());
            zuulAgent.b(C1774aNt.c.b(new C1772aNr(b2, c1255Uq, f(), this.h), str).d());
        }
    }

    @Override // o.InterfaceC1251Um
    public void d(C1255Uq c1255Uq, String str) {
        C8632dsu.c((Object) c1255Uq, "");
        C8632dsu.c((Object) str, "");
        ZuulAgent zuulAgent = getZuulAgent();
        if (zuulAgent != null) {
            int b2 = zuulAgent.b();
            aNA ana = this.a;
            if (ana == null) {
                C8632dsu.d("");
                ana = null;
            }
            ana.d(b2, c1255Uq.a());
            zuulAgent.b(C1774aNt.c.c(new C1772aNr(b2, c1255Uq, f(), this.h), str).d());
        }
    }

    @Override // o.InterfaceC1251Um
    public void d(C1255Uq c1255Uq, UD ud) {
        C8632dsu.c((Object) c1255Uq, "");
        C8632dsu.c((Object) ud, "");
        ZuulAgent zuulAgent = getZuulAgent();
        if (zuulAgent != null) {
            int b2 = zuulAgent.b();
            aNA ana = this.a;
            if (ana == null) {
                C8632dsu.d("");
                ana = null;
            }
            ana.d(b2, c1255Uq.a());
            zuulAgent.b(C1774aNt.c.a(new C1772aNr(b2, c1255Uq, f(), this.h), ud).b());
        }
    }

    @Override // o.InterfaceC1251Um
    public void c(C1255Uq c1255Uq) {
        C8632dsu.c((Object) c1255Uq, "");
        ZuulAgent zuulAgent = getZuulAgent();
        if (zuulAgent != null) {
            int b2 = zuulAgent.b();
            aNA ana = this.a;
            if (ana == null) {
                C8632dsu.d("");
                ana = null;
            }
            ana.d(b2, c1255Uq.a());
            zuulAgent.b(C1774aNt.c.f(new C1772aNr(b2, c1255Uq, f(), this.h)).b());
        }
    }

    @Override // o.InterfaceC1251Um
    public void d(C1255Uq c1255Uq) {
        dpR dpr;
        C8632dsu.c((Object) c1255Uq, "");
        ZuulAgent zuulAgent = getZuulAgent();
        if (zuulAgent != null) {
            int b2 = zuulAgent.b();
            aNA ana = this.a;
            if (ana == null) {
                C8632dsu.d("");
                ana = null;
            }
            ana.d(b2, c1255Uq.a());
            this.g.b(null);
            this.g.d(new aOC(c1255Uq, b2));
            zuulAgent.b(C1774aNt.c.c(new C1772aNr(b2, c1255Uq, f(), this.h)).e());
            this.n.d(c1255Uq);
            dpr = dpR.c;
        } else {
            dpr = null;
        }
        if (dpr == null) {
            C1798aOq c1798aOq = C1798aOq.a;
            C1777aNw c1777aNw = this.h;
            c1798aOq.c(c1255Uq, c1777aNw != null ? c1777aNw.c() : null, MessageFailureCause.c);
        }
    }

    @Override // o.InterfaceC1251Um
    public void a(C1255Uq c1255Uq, String str) {
        C8632dsu.c((Object) c1255Uq, "");
        C8632dsu.c((Object) str, "");
        String logTag = b.getLogTag();
        C1044Mm.e(logTag, "requestTrackList: videoId = " + str);
        ZuulAgent zuulAgent = getZuulAgent();
        if (zuulAgent != null) {
            int b2 = zuulAgent.b();
            aNA ana = this.a;
            if (ana == null) {
                C8632dsu.d("");
                ana = null;
            }
            ana.d(b2, c1255Uq.a());
            zuulAgent.b(C1774aNt.c.e(new C1772aNr(b2, c1255Uq, f(), this.h), str).a());
        }
    }

    @Override // o.InterfaceC1251Um
    public void d(C1255Uq c1255Uq, boolean z) {
        C8632dsu.c((Object) c1255Uq, "");
        ZuulAgent zuulAgent = getZuulAgent();
        if (zuulAgent != null) {
            int b2 = zuulAgent.b();
            aNA ana = this.a;
            if (ana == null) {
                C8632dsu.d("");
                ana = null;
            }
            ana.d(b2, c1255Uq.a());
            zuulAgent.b(C1774aNt.c.b(new C1772aNr(b2, c1255Uq, f(), this.h), z).a());
        }
    }

    @Override // o.InterfaceC1251Um
    public void e(C1255Uq c1255Uq) {
        C8632dsu.c((Object) c1255Uq, "");
        ZuulAgent zuulAgent = getZuulAgent();
        if (zuulAgent != null) {
            int b2 = zuulAgent.b();
            aNA ana = this.a;
            if (ana == null) {
                C8632dsu.d("");
                ana = null;
            }
            ana.d(b2, c1255Uq.a());
            zuulAgent.b(C1774aNt.c.d(new C1772aNr(b2, c1255Uq, f(), this.h)).c());
        }
    }

    @Override // o.InterfaceC1251Um
    public void a(C1255Uq c1255Uq) {
        C8632dsu.c((Object) c1255Uq, "");
        ZuulAgent zuulAgent = getZuulAgent();
        if (zuulAgent != null) {
            int b2 = zuulAgent.b();
            aNA ana = this.a;
            if (ana == null) {
                C8632dsu.d("");
                ana = null;
            }
            ana.d(b2, c1255Uq.a());
            zuulAgent.b(C1774aNt.c.h(new C1772aNr(b2, c1255Uq, f(), this.h)).b());
        }
    }

    @Override // o.InterfaceC1251Um
    public void c(C1255Uq c1255Uq, String str, String str2) {
        C8632dsu.c((Object) c1255Uq, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        ZuulAgent zuulAgent = getZuulAgent();
        if (zuulAgent != null) {
            int b2 = zuulAgent.b();
            aNA ana = this.a;
            if (ana == null) {
                C8632dsu.d("");
                ana = null;
            }
            ana.d(b2, c1255Uq.a());
            zuulAgent.b(C1774aNt.c.a(new C1772aNr(b2, c1255Uq, f(), this.h), str, str2).b());
        }
    }

    @Override // o.InterfaceC1251Um
    public void c(Intent intent) {
        UC e2;
        C8632dsu.c((Object) intent, "");
        String action = intent.getAction();
        b.getLogTag();
        if (action == null || (e2 = this.d.e()) == null) {
            return;
        }
        e2.d(action);
    }

    @Override // o.InterfaceC1251Um
    public String c() {
        C1777aNw c1777aNw = new C1777aNw();
        this.h = c1777aNw;
        return c1777aNw.c();
    }

    private final void q() {
        C1777aNw c1777aNw = this.h;
        if (c1777aNw != null) {
            this.d.b(c1777aNw.c());
            e();
        }
    }

    @Override // o.InterfaceC1251Um
    public void e() {
        this.h = null;
        this.g.b(null);
    }

    @Override // o.InterfaceC1251Um
    public void e(C1255Uq c1255Uq, String str) {
        C8632dsu.c((Object) c1255Uq, "");
        C8632dsu.c((Object) str, "");
        ZuulAgent zuulAgent = getZuulAgent();
        if (zuulAgent != null) {
            int b2 = zuulAgent.b();
            aNA ana = this.a;
            if (ana == null) {
                C8632dsu.d("");
                ana = null;
            }
            ana.d(b2, c1255Uq.a());
            zuulAgent.b(C1774aNt.c.a(new C1772aNr(b2, c1255Uq, f(), this.h), str).b());
        }
    }

    public final void b(List<C1255Uq> list) {
        C8632dsu.c((Object) list, "");
        C1768aNn c1768aNn = C1768aNn.d;
        C1255Uq b2 = c1768aNn.b(list, h());
        this.f13195o = b2;
        List<C1255Uq> b3 = c1768aNn.b(b2, list);
        a(b3);
        Map<String, C1255Uq> map = this.e;
        ArrayList arrayList = new ArrayList();
        ArrayList<C1255Uq> arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C1255Uq c1255Uq : b3) {
            if (map.remove(c1255Uq.a()) == null) {
                b.getLogTag();
                arrayList.add(c1255Uq);
            } else {
                b.getLogTag();
            }
            linkedHashMap.put(c1255Uq.a(), c1255Uq);
        }
        this.e = linkedHashMap;
        for (C1255Uq c1255Uq2 : map.values()) {
            arrayList2.add(c1255Uq2);
        }
        this.d.d(arrayList);
        this.d.c(arrayList2);
        C1777aNw c1777aNw = this.h;
        if (c1777aNw != null) {
            for (C1255Uq c1255Uq3 : arrayList2) {
                C1255Uq a = c1777aNw.a();
                if (a != null && C8632dsu.c((Object) a.a(), (Object) c1255Uq3.a())) {
                    b.getLogTag();
                    q();
                }
            }
        }
    }

    private final void a(List<C1255Uq> list) {
        this.g.c(list);
        for (C1255Uq c1255Uq : list) {
            if (!C8632dsu.c(this.f13195o, c1255Uq)) {
                this.g.c().e(c1255Uq);
            }
        }
    }

    public final boolean a(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        aNN a = this.j.a(jSONObject);
        if (a != null) {
            b.getLogTag();
            a.c();
            return true;
        }
        b.getLogTag();
        return false;
    }

    public final void c(int i, String str) {
        C8632dsu.c((Object) str, "");
        this.g.c().d(str, i);
        e(i, str);
        a(i);
        aNA ana = this.a;
        if (ana == null) {
            C8632dsu.d("");
            ana = null;
        }
        ana.c(i, str);
    }

    private final void e(int i, String str) {
        Throwable th;
        C1805aOx a = this.g.a();
        if (a != null) {
            if (!a.a()) {
                a.b(i);
                if (a.a()) {
                    C1798aOq c1798aOq = C1798aOq.a;
                    C1255Uq e2 = a.e();
                    C1777aNw c1777aNw = this.h;
                    c1798aOq.b(e2, c1777aNw != null ? c1777aNw.c() : null, a.d());
                    this.n.e(false);
                    this.g.e(str);
                    C1777aNw c1777aNw2 = this.h;
                    if (c1777aNw2 != null) {
                        b.getLogTag();
                        if (c1777aNw2.a() != null) {
                            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                            C1596aHd b2 = new C1596aHd("SPY-37608: Session had device set before, this should NOT happen", null, null, false, null, false, false, 126, null).b(true).b(ErrorType.a);
                            ErrorType errorType = b2.a;
                            if (errorType != null) {
                                b2.e.put("errorType", errorType.c());
                                String b3 = b2.b();
                                if (b3 != null) {
                                    String c2 = errorType.c();
                                    b2.a(c2 + " " + b3);
                                }
                            }
                            if (b2.b() != null && b2.i != null) {
                                th = new Throwable(b2.b(), b2.i);
                            } else if (b2.b() != null) {
                                th = new Throwable(b2.b());
                            } else {
                                th = b2.i;
                                if (th == null) {
                                    th = new Throwable("Handled exception with no message");
                                } else if (th == null) {
                                    throw new IllegalArgumentException("Required value was null.".toString());
                                }
                            }
                            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                            InterfaceC1598aHf a2 = dVar.a();
                            if (a2 != null) {
                                a2.e(b2, th);
                            } else {
                                dVar.e().b(b2, th);
                            }
                        }
                        c1777aNw2.a(new C1255Uq(str, null, null, null, DeviceType.a, null, null, false, 224, null));
                        dpR dpr = dpR.c;
                        return;
                    }
                    return;
                }
                return;
            }
            b.getLogTag();
        }
    }

    private final void a(int i) {
        aOC b2 = this.g.b();
        if (b2 != null) {
            b2.e(i);
            if (b2.e()) {
                C1798aOq c1798aOq = C1798aOq.a;
                C1255Uq a = b2.a();
                C1777aNw c1777aNw = this.h;
                c1798aOq.e(a, c1777aNw != null ? c1777aNw.c() : null);
                this.n.a(false);
                this.g.d(null);
            }
        }
    }

    @Override // o.InterfaceC1251Um
    public void b() {
        C1800aOs d2 = this.g.d();
        Context context = getContext();
        C8632dsu.a(context, "");
        C1777aNw c1777aNw = this.h;
        d2.b(context, c1777aNw != null ? c1777aNw.c() : null, j());
    }

    /* loaded from: classes3.dex */
    public final class e implements InterfaceC5171bti {
        public e() {
        }

        @Override // o.InterfaceC5171bti
        public boolean e(String str) {
            C8632dsu.c((Object) str, "");
            try {
                return CdxAgentImpl.this.a(new JSONObject(str));
            } catch (Throwable unused) {
                d unused2 = CdxAgentImpl.b;
                return false;
            }
        }

        @Override // o.InterfaceC5171bti
        public void b(ZuulAgent.e eVar) {
            synchronized (this) {
                C8632dsu.c((Object) eVar, "");
                CdxAgentImpl.this.w();
            }
        }

        @Override // o.InterfaceC5171bti
        public void b() {
            synchronized (this) {
                UH d = CdxAgentImpl.this.i().d();
                if (d != null) {
                    for (Map.Entry entry : CdxAgentImpl.this.e.entrySet()) {
                        d.c((C1255Uq) entry.getValue());
                    }
                }
                CdxAgentImpl.this.e.clear();
            }
        }

        @Override // o.InterfaceC5171bti
        public boolean a() {
            return CdxAgentImpl.this.g.e();
        }
    }

    /* loaded from: classes3.dex */
    public final class c implements InterfaceC1773aNs {
        final /* synthetic */ CdxAgentImpl a;
        private final String b;
        private final Context e;

        @Override // o.InterfaceC1773aNs
        public Context b() {
            return this.e;
        }

        @Override // o.InterfaceC1773aNs
        public String e() {
            return this.b;
        }

        public c(CdxAgentImpl cdxAgentImpl, Context context, String str) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) str, "");
            this.a = cdxAgentImpl;
            this.e = context;
            this.b = str;
        }

        @Override // o.InterfaceC1773aNs
        public String c() {
            C1777aNw k = this.a.k();
            if (k != null) {
                return k.c();
            }
            return null;
        }
    }

    private final void r() {
        dpR dpr;
        Throwable th;
        d dVar = b;
        dVar.getLogTag();
        this.f = true;
        ZuulAgent zuulAgent = getZuulAgent();
        if (zuulAgent != null) {
            zuulAgent.d(this.l);
            if (zuulAgent.e() == ZuulAgent.ConnectionStatus.b) {
                dVar.getLogTag();
                w();
            }
            dpr = dpR.c;
        } else {
            dpr = null;
        }
        if (dpr == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            C1596aHd b2 = new C1596aHd("CDX is disabled when it should NOT be, ZuulAgent is null", null, null, false, null, false, false, 126, null).b(false).b(ErrorType.v);
            ErrorType errorType = b2.a;
            if (errorType != null) {
                b2.e.put("errorType", errorType.c());
                String b3 = b2.b();
                if (b3 != null) {
                    String c2 = errorType.c();
                    b2.a(c2 + " " + b3);
                }
            }
            if (b2.b() != null && b2.i != null) {
                th = new Throwable(b2.b(), b2.i);
            } else if (b2.b() != null) {
                th = new Throwable(b2.b());
            } else {
                th = b2.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar2.a();
            if (a != null) {
                a.e(b2, th);
            } else {
                dVar2.e().b(b2, th);
            }
        }
    }

    @Override // o.InterfaceC1251Um
    public void d(C1255Uq c1255Uq, PairingType pairingType) {
        dpR dpr;
        C8632dsu.c((Object) c1255Uq, "");
        C8632dsu.c((Object) pairingType, "");
        d dVar = b;
        dVar.getLogTag();
        ZuulAgent zuulAgent = getZuulAgent();
        if (zuulAgent != null) {
            int b2 = zuulAgent.b();
            C1255Uq c2 = C1768aNn.d.c(c1255Uq, this.e);
            this.g.b(new C1805aOx(c2, b2, pairingType));
            aNA ana = this.a;
            if (ana == null) {
                C8632dsu.d("");
                ana = null;
            }
            ana.d(b2, c1255Uq.a());
            zuulAgent.b(C1774aNt.c.b(new C1772aNr(b2, c1255Uq, f(), this.h)).b());
            if (C1807aOz.a.b(pairingType)) {
                dVar.getLogTag();
            } else {
                dVar.getLogTag();
                C1800aOs d2 = this.g.d();
                Context context = getContext();
                C8632dsu.a(context, "");
                d2.c(context, j());
            }
            this.n.e(c2, pairingType);
            dpr = dpR.c;
        } else {
            dpr = null;
        }
        if (dpr == null) {
            C1798aOq c1798aOq = C1798aOq.a;
            C1777aNw c1777aNw = this.h;
            c1798aOq.c(c1255Uq, c1777aNw != null ? c1777aNw.c() : null, pairingType, MessageFailureCause.c);
        }
    }

    @Override // o.InterfaceC1251Um
    public void d() {
        b.getLogTag();
        this.d.b();
    }

    @Override // o.InterfaceC1251Um
    public void b(UC uc) {
        b.getLogTag();
        this.d.c(uc);
    }

    @Override // o.InterfaceC1251Um
    public void a(UT ut) {
        b.getLogTag();
        this.d.d(ut);
    }

    @Override // o.InterfaceC1251Um
    public void b(UK uk) {
        b.getLogTag();
        this.d.d(uk);
    }

    @Override // o.InterfaceC1251Um
    public void a(UR ur) {
        b.getLogTag();
        this.d.c(ur);
    }

    @Override // o.InterfaceC1251Um
    public void c(UQ uq) {
        b.getLogTag();
        this.d.d(uq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CdxAgentImpl cdxAgentImpl) {
        C8632dsu.c((Object) cdxAgentImpl, "");
        b.getLogTag();
        cdxAgentImpl.t();
    }
}
