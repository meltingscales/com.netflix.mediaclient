package o;

import android.content.Context;
import android.util.Pair;
import com.google.gson.JsonObject;
import com.netflix.android.volley.Request;
import com.netflix.android.volley.VolleyError;
import com.netflix.cl.model.NetlixAppState;
import com.netflix.falkor.FalkorException;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.latencytracker.api.UiLatencyMarker;
import com.netflix.mediaclient.net.NetworkRequestType;
import com.netflix.mediaclient.service.webclient.ApiEndpointRegistry;
import com.netflix.mediaclient.service.webclient.volley.RequestAppStateContext;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C8143den;

/* loaded from: classes3.dex */
public abstract class IT implements Runnable {
    C0903Ha a;
    protected boolean b;
    protected final C0954Iz<?> d;
    protected final InterfaceC1757aNc e;
    private C1244Uf f;
    private boolean j;
    private InterfaceC0904Hb l;
    private final String n;
    private static final GW i = new GS("jsonGraph");
    private static boolean g = AbstractC0947Is.b;
    private static final InterfaceC0927Hy h = HB.b(true);
    protected final long c = -1;
    private final List<InterfaceC1242Ud> m = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    private final List<InterfaceC1242Ud> f13358o = new ArrayList();
    private boolean k = false;

    protected abstract void a(InterfaceC1757aNc interfaceC1757aNc, Status status);

    protected abstract void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf);

    protected boolean a() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Request.Priority b() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<C8143den.d> c() {
        return null;
    }

    protected Object d() {
        return null;
    }

    protected abstract void d(List<InterfaceC1242Ud> list);

    protected void e() {
    }

    protected void e(HZ hz) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
    }

    protected boolean g() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i() {
        this.k = true;
    }

    protected List<C8143den.d> l() {
        return null;
    }

    public int n() {
        return 0;
    }

    protected String o() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean q() {
        return this.j;
    }

    protected boolean u() {
        return false;
    }

    protected boolean v() {
        return true;
    }

    protected boolean x() {
        return false;
    }

    protected boolean y() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IT(String str, C0954Iz<?> c0954Iz, InterfaceC1757aNc interfaceC1757aNc) {
        this.n = str;
        this.d = c0954Iz;
        this.e = interfaceC1757aNc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8166dfJ.c();
        try {
            if (InterfaceC1659aJm.b.e().e()) {
                C8180dfX c8180dfX = C8180dfX.e;
                C0903Ha c0903Ha = new C0903Ha(c8180dfX.c(), c8180dfX.c());
                this.a = c0903Ha;
                this.l = new GZ(this.n, c0903Ha);
            }
            B();
        } catch (Exception e) {
            InterfaceC1597aHe.b(new C1596aHd().b(ErrorType.m).d(e).e(C1079Nx.a(e)).e("errorSource", "CmpTask.run").e("taskName", this.n));
            NetflixStatus netflixStatus = new NetflixStatus(StatusCode.INT_ERR_CMP);
            netflixStatus.c(false);
            netflixStatus.a(e.getMessage());
            d(b(this.e, h()), netflixStatus);
        }
    }

    String h() {
        return getClass().getName();
    }

    public String s() {
        return (this.m.size() == 1 ? this.m.get(0) : this.m).toString();
    }

    public String k() {
        if (this.f13358o.size() == 0) {
            return null;
        }
        String obj = (this.f13358o.size() == 1 ? this.f13358o.get(0) : this.f13358o).toString();
        if (A()) {
            return obj + " (ignoreCache)";
        }
        return obj;
    }

    private void B() {
        C0942In c0942In;
        InterfaceC0904Hb interfaceC0904Hb = this.l;
        if (interfaceC0904Hb != null) {
            interfaceC0904Hb.d();
        }
        e();
        InterfaceC0904Hb interfaceC0904Hb2 = this.l;
        if (interfaceC0904Hb2 != null) {
            interfaceC0904Hb2.f();
        }
        this.m.clear();
        this.f13358o.clear();
        this.j = false;
        InterfaceC0904Hb interfaceC0904Hb3 = this.l;
        if (interfaceC0904Hb3 != null) {
            interfaceC0904Hb3.c();
        }
        d(this.m);
        if (this.l != null) {
            this.l.a(IE.b((Collection<InterfaceC1242Ud>) this.m));
        }
        if (this.k) {
            d(b(this.e, h()), InterfaceC1078Nw.e);
        } else if (A()) {
            InterfaceC0904Hb interfaceC0904Hb4 = this.l;
            if (interfaceC0904Hb4 != null) {
                interfaceC0904Hb4.n();
            }
            C1244Uf c1244Uf = new C1244Uf(this.m);
            this.f = c1244Uf;
            c1244Uf.d.addAll(this.m);
            this.f13358o.addAll(this.m);
            e(c(this.m, this.l));
        } else {
            t();
            if (this.l != null) {
                int b = IE.b((Collection<InterfaceC1242Ud>) this.m);
                c0942In = new C0942In();
                this.l.e(b);
            } else {
                c0942In = null;
            }
            this.f = this.d.d(this.m, c0942In);
            InterfaceC0904Hb interfaceC0904Hb5 = this.l;
            if (interfaceC0904Hb5 != null) {
                interfaceC0904Hb5.a(c0942In);
            }
            if (this.f.b() && !y() && !g) {
                ArrayList arrayList = new ArrayList();
                if (!this.f.e()) {
                    arrayList.addAll(this.m);
                } else {
                    arrayList.addAll(this.f.d);
                    if (e(arrayList)) {
                        IE.c(arrayList);
                    }
                }
                this.f13358o.addAll(arrayList);
                e(Boolean.valueOf(this.j));
                e(c(arrayList, this.l));
                return;
            }
            this.j = true;
            e((Boolean) true);
            C();
        }
    }

    private boolean A() {
        return u() || a() || x() || z();
    }

    private boolean z() {
        if (C8206dfx.e()) {
            return C8157dfA.b(j(), "pref_debug_force_ignore_falkor_cache", false);
        }
        return false;
    }

    public void e(NetflixDataRequest netflixDataRequest) {
        C1735aMh.e.b(netflixDataRequest);
    }

    protected boolean e(List<InterfaceC1242Ud> list) {
        return list.size() > 20;
    }

    protected void t() {
        if (this.b) {
            m().b(UiLatencyMarker.Mark.PREPARE_END);
            m().b(UiLatencyMarker.Mark.CACHE_START);
        }
    }

    protected void e(Boolean bool) {
        if (this.b) {
            m().b(UiLatencyMarker.Mark.CACHE_END);
            if (bool.booleanValue()) {
                m().b(UiLatencyMarker.Mark.PROCESSING_START);
            }
        }
    }

    protected void p() {
        if (this.b) {
            m().b(UiLatencyMarker.Mark.NETWORK_START);
        }
    }

    protected void r() {
        if (this.b) {
            m().b(UiLatencyMarker.Mark.NETWORK_END);
            m().b(UiLatencyMarker.Mark.PROCESSING_START);
        }
    }

    protected void w() {
        if (this.b) {
            m().b(UiLatencyMarker.Mark.PROCESSING_END);
        }
    }

    private NetflixDataRequest c(List<InterfaceC1242Ud> list, InterfaceC0904Hb interfaceC0904Hb) {
        p();
        if (this.d.e()) {
            return e(list, interfaceC0904Hb);
        }
        return d(list, interfaceC0904Hb);
    }

    private static boolean c(HZ hz) {
        if (hz instanceof HL) {
            return ((HL) hz).e("errors");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, long j, InterfaceC0904Hb interfaceC0904Hb) {
        if (interfaceC0904Hb != null) {
            interfaceC0904Hb.j();
        }
        C8166dfJ.c();
        System.currentTimeMillis();
        b(str, interfaceC0904Hb);
        C();
    }

    private void b(String str, InterfaceC0904Hb interfaceC0904Hb) {
        if (interfaceC0904Hb != null) {
            try {
                interfaceC0904Hb.e();
            } catch (IOException e) {
                throw new FalkorException("error when parsing response: " + str, e);
            }
        }
        HL l = h.e(str).l();
        if (interfaceC0904Hb != null) {
            interfaceC0904Hb.h();
        }
        if (c(l)) {
            throw a(HA.e.a(l));
        }
        if (x()) {
            HZ b = l.b(i);
            if (b != null) {
                e(b);
                return;
            }
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC0947Is.c(currentTimeMillis);
        c(l, currentTimeMillis, interfaceC0904Hb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, List<InterfaceC1242Ud> list, InterfaceC0904Hb interfaceC0904Hb) {
        if (z) {
            f();
            if (interfaceC0904Hb != null) {
                interfaceC0904Hb.c(IE.b((Collection<InterfaceC1242Ud>) list));
            }
        }
    }

    private AbstractC2103aZz e(List<InterfaceC1242Ud> list, InterfaceC0904Hb interfaceC0904Hb) {
        return new AbstractC2103aZz<Void>(ApiEndpointRegistry.ResponsePathFormat.GRAPH, list, interfaceC0904Hb) { // from class: o.IT.2
            private final List<String> B;
            private final boolean C;
            private final String D;
            final /* synthetic */ List d;
            final /* synthetic */ InterfaceC0904Hb e;
            private final List<C8143den.d> v;
            private final List<C8143den.d> x;
            private final boolean z;
            private final boolean y = C8166dfJ.c();
            private final long A = -1;

            @Override // o.AbstractC2100aZw
            public List<String> J() {
                return this.B;
            }

            @Override // o.AbstractC2100aZw
            public String K() {
                return this.D;
            }

            @Override // o.AbstractC2100aZw
            public String M() {
                return this.C ? "call" : "get";
            }

            @Override // o.aZE
            public boolean Q() {
                return true;
            }

            @Override // o.AbstractC2100aZw
            public boolean S_() {
                return true;
            }

            {
                this.d = list;
                this.e = interfaceC0904Hb;
                this.B = C8143den.e(list);
                this.C = IT.this.a();
                this.z = IT.this.v();
                this.x = IT.this.c();
                this.v = IT.this.l();
                this.D = IT.this.o();
            }

            @Override // o.AbstractC2103aZz, o.aZE
            public void L() {
                k(((aZE) this).i.j().i().toExternalForm());
            }

            @Override // o.AbstractC2103aZz, com.netflix.android.volley.Request
            public Request.Priority s() {
                return IT.this.b() != null ? IT.this.b() : Request.Priority.HIGH;
            }

            @Override // o.AbstractC2103aZz, com.netflix.android.volley.Request
            public Object y() {
                return IT.this.d() != null ? IT.this.d() : NetworkRequestType.BROWSE;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // o.AbstractC2100aZw
            /* renamed from: g */
            public Void a(String str) {
                IT.this.r();
                IT.this.b(str, this.A, this.e);
                return null;
            }

            @Override // o.AbstractC2103aZz, o.AbstractC2100aZw, o.aZE, com.netflix.android.volley.Request
            public Map<String, String> o() {
                Map<String, String> o2 = super.o();
                C8166dfJ.c();
                List<C8143den.d> list2 = this.x;
                if (list2 != null && list2.size() != 0) {
                    for (C8143den.d dVar : this.x) {
                        o2.put((String) ((Pair) dVar).first, (String) ((Pair) dVar).second);
                    }
                }
                return o2;
            }

            @Override // o.aZE, com.netflix.android.volley.Request
            public Map<String, String> j() {
                Map<String, String> j = super.j();
                if (j == null) {
                    j = new HashMap<>();
                }
                if (C8168dfL.h(IT.this.n)) {
                    j.put("X-Netflix.Request.NqTracking", IT.this.n);
                }
                j.put("X-Netflix.Request.Client.Context", C5043brM.a.a().toString());
                C0903Ha c0903Ha = IT.this.a;
                if (c0903Ha != null) {
                    j.put("X-Netflix.tracing.cl.userActionId", c0903Ha.c());
                    j.put("X-Netflix.request.toplevel.uuid", IT.this.a.b());
                }
                if (C5041brK.a(IT.this.j())) {
                    j.put("x-netflix.tracing.client-sampled", "true");
                    C1044Mm.e("CmpTask", "Task: " + IT.this.n + " force sampled userActionId: " + IT.this.a.c());
                }
                List<C8143den.d> list2 = this.v;
                if (list2 != null && !list2.isEmpty()) {
                    for (C8143den.d dVar : this.v) {
                        j.put((String) ((Pair) dVar).first, (String) ((Pair) dVar).second);
                    }
                }
                return j;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // o.aZE
            /* renamed from: d */
            public void a(Void r1) {
                C8166dfJ.d();
            }

            @Override // o.aZE
            public void e(Status status) {
                C8166dfJ.d();
                IT it = IT.this;
                it.d(it.e, status);
            }

            @Override // com.netflix.android.volley.Request
            public void c(boolean z) {
                super.c(z);
                IT.this.a(z, this.d, this.e);
            }
        };
    }

    private AbstractC5039brI d(List<InterfaceC1242Ud> list, InterfaceC0904Hb interfaceC0904Hb) {
        return new AbstractC5039brI<Void>(j(), ApiEndpointRegistry.ResponsePathFormat.GRAPH, n(), list, interfaceC0904Hb) { // from class: o.IT.5
            final /* synthetic */ InterfaceC0904Hb a;
            final /* synthetic */ List d;
            private final List<C8143den.d> k;
            private final List<C8143den.d> l;
            private final List<String> m;

            /* renamed from: o  reason: collision with root package name */
            private final boolean f13359o = C8166dfJ.c();
            private final long p = -1;
            private final String r;
            private final boolean w;
            private final boolean y;

            @Override // o.AbstractC5039brI, o.AbstractC5042brL
            public String K() {
                return this.y ? "call" : "get";
            }

            @Override // o.AbstractC5042brL
            public boolean O() {
                return this.w;
            }

            @Override // o.AbstractC5039brI
            public boolean Q() {
                return true;
            }

            @Override // o.AbstractC5039brI
            public String R() {
                return this.r;
            }

            @Override // o.AbstractC5042brL
            public boolean S() {
                return true;
            }

            {
                this.d = list;
                this.a = interfaceC0904Hb;
                this.m = C8143den.e(list);
                this.y = IT.this.a();
                this.w = IT.this.v();
                this.k = IT.this.c();
                this.l = IT.this.l();
                this.r = IT.this.o();
            }

            @Override // o.AbstractC5039brI, o.AbstractC5042brL
            public void a(ApiEndpointRegistry apiEndpointRegistry) {
                ((AbstractC5039brI) this).h = apiEndpointRegistry;
                g(apiEndpointRegistry.i().toExternalForm());
            }

            @Override // o.AbstractC5042brL
            public boolean M() {
                return IT.this.g();
            }

            @Override // o.AbstractC5042brL, com.netflix.android.volley.Request
            public Request.Priority s() {
                return IT.this.b() != null ? IT.this.b() : super.s();
            }

            @Override // com.netflix.android.volley.Request
            public Object y() {
                return IT.this.d() != null ? IT.this.d() : NetworkRequestType.BROWSE;
            }

            @Override // com.netflix.android.volley.Request
            public int i() {
                return super.i();
            }

            @Override // o.AbstractC5039brI
            public List<String> L() {
                return !N() ? this.m : Collections.emptyList();
            }

            @Override // com.netflix.android.volley.Request
            public Map<String, String> o() {
                if (N()) {
                    C8190dfh c8190dfh = new C8190dfh();
                    for (String str : this.m) {
                        c8190dfh.put(V(), str);
                    }
                    List<C8143den.d> list2 = this.k;
                    if (list2 != null) {
                        for (C8143den.d dVar : list2) {
                            c8190dfh.put((String) ((Pair) dVar).first, (String) ((Pair) dVar).second);
                        }
                    }
                    return c8190dfh;
                }
                return null;
            }

            @Override // o.AbstractC5039brI, o.AbstractC5042brL, com.netflix.android.volley.Request
            public Map<String, String> j() {
                Map<String, String> j = super.j();
                if (j == null) {
                    j = new HashMap<>();
                }
                if (C8168dfL.h(IT.this.n)) {
                    j.put("X-Netflix.Request.NqTracking", IT.this.n);
                }
                j.put("X-Netflix.Request.Client.Context", C5043brM.a.a().toString());
                C0903Ha c0903Ha = IT.this.a;
                if (c0903Ha != null) {
                    j.put("X-Netflix.tracing.cl.userActionId", c0903Ha.c());
                    j.put("X-Netflix.request.toplevel.uuid", IT.this.a.b());
                }
                if (C5041brK.a(IT.this.j())) {
                    j.put("x-netflix.tracing.client-sampled", "true");
                    StringBuilder sb = new StringBuilder();
                    sb.append("Task: ");
                    sb.append(IT.this.n);
                    sb.append(" force sampled userActionId: ");
                    C0903Ha c0903Ha2 = IT.this.a;
                    sb.append(c0903Ha2 != null ? c0903Ha2.c() : null);
                    C1044Mm.e("CmpTask", sb.toString());
                }
                List<C8143den.d> list2 = this.l;
                if (list2 != null && !list2.isEmpty()) {
                    for (C8143den.d dVar : this.l) {
                        j.put((String) ((Pair) dVar).first, (String) ((Pair) dVar).second);
                    }
                }
                return j;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // o.AbstractC5039brI
            /* renamed from: a */
            public Void e(String str, String str2) {
                IT.this.b(str, this.p, this.a);
                return null;
            }

            @Override // o.AbstractC5039brI, o.AbstractC5042brL, com.netflix.android.volley.Request
            public C9864xy b(C9858xs c9858xs) {
                IT.this.r();
                return super.b(c9858xs);
            }

            @Override // o.AbstractC5042brL
            public String J() {
                if (N()) {
                    return null;
                }
                C8166dfJ.c();
                List<C8143den.d> list2 = this.k;
                if (list2 == null || list2.size() == 0) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                for (C8143den.d dVar : this.k) {
                    sb.append("&");
                    sb.append((String) ((Pair) dVar).first);
                    sb.append("=");
                    sb.append((String) ((Pair) dVar).second);
                }
                return sb.toString();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // o.AbstractC5042brL
            public void a(Void r1) {
                C8166dfJ.d();
            }

            @Override // o.AbstractC5042brL
            public void d(Status status) {
                C8166dfJ.d();
                IT it = IT.this;
                it.d(it.e, status);
            }

            @Override // com.netflix.android.volley.Request
            public void c(boolean z) {
                super.c(z);
                IT.this.a(z, this.d, this.a);
            }
        };
    }

    private void C() {
        InterfaceC0904Hb interfaceC0904Hb = this.l;
        if (interfaceC0904Hb != null) {
            interfaceC0904Hb.b();
        }
        C8166dfJ.c();
        InterfaceC1757aNc b = b(this.e, h());
        C1244Uf c1244Uf = this.f;
        if (c1244Uf == null) {
            C1044Mm.j("CmpTask", "GetResult is null - shouldn't happen - forcing failure");
            d(b, InterfaceC1078Nw.ai);
            InterfaceC1598aHf.a("CmpTask handleSuccess: GetResult is null - forcing failure");
            return;
        }
        try {
            a(b, c1244Uf);
        } catch (NullPointerException unused) {
            a(b, InterfaceC1078Nw.aC);
        }
        InterfaceC0904Hb interfaceC0904Hb2 = this.l;
        if (interfaceC0904Hb2 != null) {
            interfaceC0904Hb2.i();
            this.l.b(this.j, C5043brM.a.a() == RequestAppStateContext.e ? NetlixAppState.foreground : NetlixAppState.background);
        }
        w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        InterfaceC0904Hb interfaceC0904Hb = this.l;
        if (interfaceC0904Hb != null) {
            if (status == InterfaceC1078Nw.e) {
                interfaceC0904Hb.m();
            }
            this.l.c(status);
        }
        a(interfaceC1757aNc, status);
        InterfaceC0904Hb interfaceC0904Hb2 = this.l;
        if (interfaceC0904Hb2 != null) {
            interfaceC0904Hb2.d(status);
            this.l.b(this.j, C5043brM.a.a() == RequestAppStateContext.e ? NetlixAppState.foreground : NetlixAppState.background);
        }
        w();
    }

    protected VolleyError a(JsonObject jsonObject) {
        Map map;
        String d = C0946Ir.d(jsonObject, "CmpTask");
        if (d != null) {
            if (d.length() > 1024) {
                d = d.substring(0, 1024) + "<snip>";
            }
            InterfaceC1593aHa.b("json error: " + d);
            map = IW.b(new Map.Entry[]{new AbstractMap.SimpleEntry("jsonErrorMessage", d)});
        } else {
            map = null;
        }
        return new FalkorException("error found in json response for task " + this.n, this.n, jsonObject, map).b(false);
    }

    private void c(HL hl, long j, InterfaceC0904Hb interfaceC0904Hb) {
        HZ b = hl.b(i);
        if (b instanceof HL) {
            if (interfaceC0904Hb != null) {
                interfaceC0904Hb.a();
            }
            this.d.d(b.l(), j);
            if (interfaceC0904Hb != null) {
                interfaceC0904Hb.g();
                return;
            }
            return;
        }
        InterfaceC1598aHf.a(new C1596aHd("jsongraphobject value is not object: " + hl).b(false));
    }

    private InterfaceC1757aNc b(InterfaceC1757aNc interfaceC1757aNc, String str) {
        if (interfaceC1757aNc == null) {
            InterfaceC1598aHf.a("SPY-12760 : callback should not be null (" + str + ")");
            return AbstractC1761aNg.e();
        }
        return new C1759aNe(this.d.d(), interfaceC1757aNc);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Context j() {
        return (Context) C1332Xp.b(Context.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final UiLatencyMarker m() {
        return UiLatencyMarker.a(j());
    }
}
