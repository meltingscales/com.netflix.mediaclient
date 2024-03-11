package o;

import android.content.Context;
import android.content.Intent;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.HistogramBucket;
import com.netflix.cl.model.NetlixAppState;
import com.netflix.cl.model.SummaryStatistics;
import com.netflix.cl.model.context.PerformanceTrace;
import com.netflix.cl.model.event.discrete.PerformanceTraceReported;
import com.netflix.cl.model.event.discrete.SystemPerformanceTraceReported;
import com.netflix.cl.model.event.session.NavigationLevel;
import com.netflix.cl.model.event.session.Session;
import com.netflix.cl.model.event.session.SessionEnded;
import com.netflix.cl.util.NavigationLevelCollector;
import com.netflix.cl.util.SessionListener;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.performance.api.capture.CaptureType;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import o.C1665aJs;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import org.json.JSONObject;

/* renamed from: o.aJw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1669aJw implements InterfaceC1666aJt {
    private static final long b;
    private static final long d;
    public static final b e = new b(null);
    private final HashSet<CaptureType> a;
    private final d c;
    private final InterfaceC1270Vf f;
    private boolean g;
    private long h;
    private final Context i;
    private final Map<AppView, List<CaptureType>> j;
    private boolean k;
    private final Map<CaptureType, AbstractC1660aJn> l;
    private Long m;
    private final InterfaceC1662aJp n;

    /* renamed from: o  reason: collision with root package name */
    private NavigationLevel f13430o;
    private final a p;
    private final Map<CaptureType, AbstractC1660aJn> r;
    private final C1665aJs s;
    private long t;

    public C1669aJw(@ApplicationContext Context context, boolean z, boolean z2, long j, InterfaceC1662aJp interfaceC1662aJp, Map<CaptureType, AbstractC1660aJn> map) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) interfaceC1662aJp, "");
        C8632dsu.c((Object) map, "");
        this.i = context;
        this.k = z;
        this.g = z2;
        this.h = j;
        this.n = interfaceC1662aJp;
        this.l = map;
        InterfaceC1270Vf b2 = InterfaceC1270Vf.b.b(context);
        this.f = b2;
        this.t = b2.d();
        this.a = new HashSet<>();
        this.j = new LinkedHashMap();
        this.r = new LinkedHashMap();
        this.s = new C1665aJs(0L, null, false, null, 15, null);
        a aVar = new a();
        this.p = aVar;
        d dVar = new d();
        this.c = dVar;
        C1332Xp c1332Xp = C1332Xp.b;
        ((NC) C1332Xp.b(NC.class)).c(dVar);
        NavigationLevelCollector navigationLevelCollector = NavigationLevelCollector.INSTANCE;
        navigationLevelCollector.initListener();
        Logger.INSTANCE.addSessionListeners(aVar);
        if (this.f13430o == null) {
            this.f13430o = navigationLevelCollector.getCurrentNavigationLevel();
        }
        c();
        b();
    }

    public /* synthetic */ C1669aJw(Context context, boolean z, boolean z2, long j, InterfaceC1662aJp interfaceC1662aJp, Map map, int i, C8627dsp c8627dsp) {
        this(context, z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? 10000L : j, (i & 16) != 0 ? new C1672aJz() : interfaceC1662aJp, (i & 32) != 0 ? new LinkedHashMap() : map);
    }

    /* renamed from: o.aJw$b */
    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("PerformanceMetricsManager");
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        d = timeUnit.toNanos(1L);
        b = timeUnit.toMicros(1L);
    }

    /* renamed from: o.aJw$a */
    /* loaded from: classes3.dex */
    public static final class a implements SessionListener {
        a() {
        }

        @Override // com.netflix.cl.util.SessionListener
        public void onStartSession(Session session) {
            C8632dsu.c((Object) session, "");
            if (session instanceof NavigationLevel) {
                b bVar = C1669aJw.e;
                if (C1669aJw.this.f13430o == null) {
                    C1669aJw.this.f13430o = (NavigationLevel) session;
                }
                C1669aJw c1669aJw = C1669aJw.this;
                c1669aJw.b(c1669aJw.f13430o, C1669aJw.this.k);
                if (!C1669aJw.this.k) {
                    C1669aJw.this.a();
                    C1669aJw.this.k = true;
                }
                C1669aJw c1669aJw2 = C1669aJw.this;
                NavigationLevel navigationLevel = c1669aJw2.f13430o;
                NavigationLevel navigationLevel2 = (NavigationLevel) session;
                c1669aJw2.b(navigationLevel != null ? navigationLevel.getView() : null, navigationLevel2.getView());
                C1669aJw.this.f13430o = navigationLevel2;
            }
        }

        @Override // com.netflix.cl.util.SessionListener
        public void onEndSession(Session session, SessionEnded sessionEnded) {
            C8632dsu.c((Object) session, "");
            C8632dsu.c((Object) sessionEnded, "");
            if (session instanceof NavigationLevel) {
                b bVar = C1669aJw.e;
                C1669aJw c1669aJw = C1669aJw.this;
                NavigationLevel navigationLevel = (NavigationLevel) session;
                c1669aJw.b(navigationLevel, c1669aJw.k);
                C1669aJw.this.f13430o = NavigationLevelCollector.INSTANCE.getCurrentNavigationLevel();
                C1669aJw c1669aJw2 = C1669aJw.this;
                AppView view = navigationLevel.getView();
                NavigationLevel navigationLevel2 = C1669aJw.this.f13430o;
                c1669aJw2.b(view, navigationLevel2 != null ? navigationLevel2.getView() : null);
            }
        }
    }

    /* renamed from: o.aJw$d */
    /* loaded from: classes3.dex */
    public static final class d extends C1076Nu {
        d() {
        }

        @Override // o.C1076Nu, o.InterfaceC1072Nq
        public void c(NC nc, Intent intent) {
            C8632dsu.c((Object) nc, "");
            b bVar = C1669aJw.e;
        }

        @Override // o.C1076Nu, o.InterfaceC1072Nq
        public void a(NC nc, boolean z) {
            C8632dsu.c((Object) nc, "");
            b bVar = C1669aJw.e;
            C1669aJw.this.k = false;
            C1669aJw.this.e();
        }
    }

    @Override // o.InterfaceC1666aJt
    public void d(CaptureType captureType) {
        C8632dsu.c((Object) captureType, "");
        this.a.add(captureType);
    }

    @Override // o.InterfaceC1666aJt
    public void a(CaptureType captureType, AppView appView) {
        C8632dsu.c((Object) captureType, "");
        C8632dsu.c((Object) appView, "");
        if (this.j.get(appView) == null) {
            this.j.put(appView, new ArrayList());
        }
        List<CaptureType> list = this.j.get(appView);
        if (list != null) {
            list.add(captureType);
        }
    }

    @Override // o.InterfaceC1666aJt
    public void a() {
        if (this.k) {
            j();
        }
        for (Map.Entry<CaptureType, AbstractC1660aJn> entry : this.l.entrySet()) {
            if (!this.a.contains(entry.getValue().d())) {
                entry.getValue().f();
            }
        }
    }

    private final void c() {
        if (this.l.isEmpty()) {
            this.l.put(CaptureType.e, new aJC(this.n));
            this.l.put(CaptureType.b, new C1668aJv(this.i, this.n));
            this.l.put(CaptureType.c, new aJE(this.n, 0L, 2, null));
            this.l.put(CaptureType.a, new aJB(this.n));
            this.l.put(CaptureType.i, new aJD(this.n));
            this.l.put(CaptureType.d, new aJA(this.i, this.n));
        }
    }

    private final void b() {
        if (this.g) {
            this.r.put(CaptureType.c, new aJE(this.n, this.h));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(AppView appView, AppView appView2) {
        List<CaptureType> list;
        List<CaptureType> list2;
        if ((this.j.containsKey(appView) || this.j.containsKey(appView2) || !this.a.isEmpty()) && appView2 != null) {
            for (Map.Entry<CaptureType, AbstractC1660aJn> entry : this.l.entrySet()) {
                if (entry.getValue().b() && (((list2 = this.j.get(appView2)) != null && list2.contains(entry.getValue().d())) || this.a.contains(entry.getValue().d()))) {
                    entry.getValue().h();
                }
                if (!entry.getValue().b() && ((list = this.j.get(appView2)) == null || !list.contains(entry.getValue().d()))) {
                    if (!this.a.contains(entry.getValue().d())) {
                        entry.getValue().f();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(final NavigationLevel navigationLevel, final boolean z) {
        this.n.b().post(new Runnable() { // from class: o.aJy
            @Override // java.lang.Runnable
            public final void run() {
                C1669aJw.b(C1669aJw.this, navigationLevel, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C1669aJw c1669aJw, NavigationLevel navigationLevel, boolean z) {
        C8632dsu.c((Object) c1669aJw, "");
        if (c1669aJw.b(c1669aJw.s, navigationLevel, z)) {
            PerformanceTraceReported d2 = c1669aJw.s.d(new c());
            if (c1669aJw.e(d2)) {
                Logger.INSTANCE.logEvent(d2);
            }
        }
        c1669aJw.d();
        c1669aJw.j();
    }

    /* renamed from: o.aJw$c */
    /* loaded from: classes3.dex */
    public static final class c implements C1665aJs.d {
        c() {
        }

        @Override // o.C1665aJs.d
        /* renamed from: e */
        public SystemPerformanceTraceReported d(JSONObject jSONObject, Long l, long j) {
            C8632dsu.c((Object) jSONObject, "");
            return new SystemPerformanceTraceReported(jSONObject, l, Long.valueOf(j));
        }
    }

    private final boolean b(C1665aJs c1665aJs, NavigationLevel navigationLevel, boolean z) {
        if (!C8141del.a()) {
            C8166dfJ.e("PerformanceCapture");
        }
        if (this.f.d() - this.t < d) {
            d();
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        boolean z2 = false;
        for (Map.Entry<CaptureType, AbstractC1660aJn> entry : this.l.entrySet()) {
            AbstractC1660aJn value = entry.getValue();
            if (!z || (value instanceof aJI)) {
                value.j();
            }
            if (value.e()) {
                for (Map.Entry<String, SummaryStatistics> entry2 : value.i().entrySet()) {
                    SummaryStatistics value2 = entry2.getValue();
                    if (value2 != null) {
                        c1665aJs.a("performanceCapture", entry2.getKey(), value2);
                    }
                }
                if (value instanceof InterfaceC1661aJo) {
                    for (Map.Entry<String, List<HistogramBucket>> entry3 : ((InterfaceC1661aJo) value).b().entrySet()) {
                        List<HistogramBucket> value3 = entry3.getValue();
                        if (value3 != null) {
                            c1665aJs.c("performanceCapture", entry3.getKey(), value3);
                        }
                    }
                }
                JSONObject c2 = value.c();
                if (c2 != null) {
                    Iterator keys = c2.keys();
                    C8632dsu.a(keys, "");
                    while (keys.hasNext()) {
                        String str = (String) keys.next();
                        jSONObject.put(str, c2.get(str));
                    }
                }
                z2 = true;
            }
        }
        if (z2) {
            C1665aJs.b(c1665aJs, "performanceCapture", null, null, null, z ? NetlixAppState.foreground : NetlixAppState.background, null, null, null, null, navigationLevel != null ? navigationLevel.getView() : null, jSONObject, 494, null);
        }
        return z2;
    }

    private final boolean e(PerformanceTraceReported performanceTraceReported) {
        Map d2;
        Map k;
        Throwable th;
        try {
            Object obj = performanceTraceReported.getData().getJSONArray("traceEvents").get(0);
            C8632dsu.d(obj);
            return ((JSONObject) obj).getLong("dur") > b;
        } catch (Exception e2) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            ErrorType errorType = ErrorType.q;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd(null, e2, errorType, true, k, false, false, 96, null);
            ErrorType errorType2 = c1596aHd.a;
            if (errorType2 != null) {
                c1596aHd.e.put("errorType", errorType2.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c2 = errorType2.c();
                    c1596aHd.a(c2 + " " + b2);
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
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
                return false;
            }
            dVar.e().b(c1596aHd, th);
            return false;
        }
    }

    private final void j() {
        this.t = this.f.d();
        this.s.d();
        this.s.d("performanceCapture");
        Long l = this.m;
        if (l != null) {
            Logger.INSTANCE.removeContext(Long.valueOf(l.longValue()));
        }
        this.m = Long.valueOf(Logger.INSTANCE.addContext(new PerformanceTrace()));
    }

    public void e() {
        for (Map.Entry<CaptureType, AbstractC1660aJn> entry : this.l.entrySet()) {
            entry.getValue().h();
        }
    }

    private final void d() {
        for (Map.Entry<CaptureType, AbstractC1660aJn> entry : this.l.entrySet()) {
            AbstractC1660aJn value = entry.getValue();
            value.a();
            if ((value instanceof aJF) && value.b()) {
                value.j();
            }
        }
    }
}
