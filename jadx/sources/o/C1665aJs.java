package o;

import android.os.Build;
import android.os.Trace;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.BaseTraceEventArgs;
import com.netflix.cl.model.Data;
import com.netflix.cl.model.DataAccessEvent;
import com.netflix.cl.model.DataAccessEventArgs;
import com.netflix.cl.model.HistogramBucket;
import com.netflix.cl.model.MarkEvent;
import com.netflix.cl.model.MetadataEvent;
import com.netflix.cl.model.NetflixTraceCategory;
import com.netflix.cl.model.NetflixTraceEventTypeDataAccess;
import com.netflix.cl.model.NetflixTraceEventTypeSample;
import com.netflix.cl.model.NetflixTraceEventTypeTiming;
import com.netflix.cl.model.NetflixTraceStatus;
import com.netflix.cl.model.NetlixAppState;
import com.netflix.cl.model.NetworkCallEvent;
import com.netflix.cl.model.SampleEvent;
import com.netflix.cl.model.SampleEventArgs;
import com.netflix.cl.model.SummaryStatistics;
import com.netflix.cl.model.TimingEvent;
import com.netflix.cl.model.TimingEventArgs;
import com.netflix.cl.model.TraceEventFormatTypeM;
import com.netflix.cl.model.TraceEventFormatTypeR;
import com.netflix.cl.model.TraceEventFormatTypeX;
import com.netflix.cl.model.event.discrete.PerformanceTraceReported;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o.aJs */
/* loaded from: classes.dex */
public final class C1665aJs {
    public static final b e = new b(null);
    private final ConcurrentHashMap<String, Long> a;
    private final boolean b;
    private final InterfaceC8554dpx c;
    private final InterfaceC1270Vf d;
    private final Long f;
    private final ConcurrentLinkedQueue<Data> g;
    private final InterfaceC8554dpx h;
    private final InterfaceC8554dpx i;
    private final long j;
    private final InterfaceC8554dpx m;

    /* renamed from: o */
    private final AtomicBoolean f13429o;

    /* renamed from: o.aJs$d */
    /* loaded from: classes3.dex */
    public interface d {
        PerformanceTraceReported d(JSONObject jSONObject, Long l, long j);
    }

    public C1665aJs() {
        this(0L, null, false, null, 15, null);
    }

    private final void d(JSONObject jSONObject) {
    }

    public C1665aJs(long j, Long l, boolean z, InterfaceC1270Vf interfaceC1270Vf) {
        InterfaceC8554dpx b2;
        InterfaceC8554dpx b3;
        InterfaceC8554dpx b4;
        InterfaceC8554dpx b5;
        C8632dsu.c((Object) interfaceC1270Vf, "");
        this.j = j;
        this.f = l;
        this.b = z;
        this.d = interfaceC1270Vf;
        this.g = new ConcurrentLinkedQueue<>();
        this.a = new ConcurrentHashMap<>();
        b2 = dpB.b(new drO<ConcurrentHashMap<String, List<NetworkCallEvent>>>() { // from class: com.netflix.mediaclient.performance.api.util.PerformanceTraceReportedBuilder$networkCallsByEvent$2
            @Override // o.drO
            /* renamed from: e */
            public final ConcurrentHashMap<String, List<NetworkCallEvent>> invoke() {
                return new ConcurrentHashMap<>();
            }
        });
        this.i = b2;
        b3 = dpB.b(new drO<ConcurrentHashMap<String, JSONObject>>() { // from class: com.netflix.mediaclient.performance.api.util.PerformanceTraceReportedBuilder$samplesByEvent$2
            @Override // o.drO
            /* renamed from: a */
            public final ConcurrentHashMap<String, JSONObject> invoke() {
                return new ConcurrentHashMap<>();
            }
        });
        this.h = b3;
        b4 = dpB.b(new drO<ConcurrentHashMap<String, Map<String, SummaryStatistics>>>() { // from class: com.netflix.mediaclient.performance.api.util.PerformanceTraceReportedBuilder$summaryStatisticsByEvent$2
            @Override // o.drO
            /* renamed from: a */
            public final ConcurrentHashMap<String, Map<String, SummaryStatistics>> invoke() {
                return new ConcurrentHashMap<>();
            }
        });
        this.m = b4;
        b5 = dpB.b(new drO<ConcurrentHashMap<String, Map<String, List<? extends HistogramBucket>>>>() { // from class: com.netflix.mediaclient.performance.api.util.PerformanceTraceReportedBuilder$histogramBucketsByEvent$2
            @Override // o.drO
            /* renamed from: c */
            public final ConcurrentHashMap<String, Map<String, List<HistogramBucket>>> invoke() {
                return new ConcurrentHashMap<>();
            }
        });
        this.c = b5;
        this.f13429o = new AtomicBoolean(false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C1665aJs(long r7, java.lang.Long r9, boolean r10, o.InterfaceC1270Vf r11, int r12, o.C8627dsp r13) {
        /*
            r6 = this;
            r13 = r12 & 1
            if (r13 == 0) goto L6
            r7 = 0
        L6:
            r1 = r7
            r7 = r12 & 2
            if (r7 == 0) goto Lc
            r9 = 0
        Lc:
            r3 = r9
            r7 = r12 & 4
            if (r7 == 0) goto L12
            r10 = 1
        L12:
            r4 = r10
            r7 = r12 & 8
            if (r7 == 0) goto L27
            o.Vf$a r7 = o.InterfaceC1270Vf.b
            o.Xp r8 = o.C1332Xp.b
            java.lang.Class<android.content.Context> r8 = android.content.Context.class
            java.lang.Object r8 = o.C1332Xp.b(r8)
            android.content.Context r8 = (android.content.Context) r8
            o.Vf r11 = r7.b(r8)
        L27:
            r5 = r11
            r0 = r6
            r0.<init>(r1, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1665aJs.<init>(long, java.lang.Long, boolean, o.Vf, int, o.dsp):void");
    }

    /* renamed from: o.aJs$b */
    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("PerformanceTraceReportedBuilderV2");
        }
    }

    private final ConcurrentHashMap<String, List<NetworkCallEvent>> g() {
        return (ConcurrentHashMap) this.i.getValue();
    }

    private final ConcurrentHashMap<String, JSONObject> h() {
        return (ConcurrentHashMap) this.h.getValue();
    }

    private final ConcurrentHashMap<String, Map<String, SummaryStatistics>> i() {
        return (ConcurrentHashMap) this.m.getValue();
    }

    private final ConcurrentHashMap<String, Map<String, List<HistogramBucket>>> e() {
        return (ConcurrentHashMap) this.c.getValue();
    }

    private final boolean f() {
        boolean isEnabled;
        if (Build.VERSION.SDK_INT >= 29) {
            isEnabled = Trace.isEnabled();
            if (isEnabled) {
                return true;
            }
        }
        return false;
    }

    public final void d() {
        this.g.clear();
        this.a.clear();
        g().clear();
        h().clear();
        i().clear();
        e().clear();
        this.f13429o.set(false);
    }

    public final boolean b() {
        return this.f13429o.get();
    }

    public final C1665aJs d(String str) {
        Long l;
        C8632dsu.c((Object) str, "");
        this.a.put(str, Long.valueOf(a()));
        if (f() && (l = this.a.get(str)) != null) {
            Trace.beginAsyncSection(str, (int) l.longValue());
        }
        return this;
    }

    public final void e(String str, NetflixTraceCategory netflixTraceCategory, NetflixTraceStatus netflixTraceStatus, NetlixAppState netlixAppState, String str2, Boolean bool, AppView appView, JSONObject jSONObject) {
        Map d2;
        Map k;
        Throwable th;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) netflixTraceCategory, "");
        C8632dsu.c((Object) netflixTraceStatus, "");
        Long l = this.a.get(str);
        if (l != null) {
            if (f()) {
                Trace.endAsyncSection(str, (int) l.longValue());
            }
            e(str, l.longValue(), a() - l.longValue(), netflixTraceCategory, netflixTraceStatus, netlixAppState, str2, bool, appView, jSONObject);
            return;
        }
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        ErrorType errorType = ErrorType.q;
        d2 = dqE.d();
        k = dqE.k(d2);
        C1596aHd c1596aHd = new C1596aHd("endTimingEvent was called but there was no start for " + str, null, errorType, true, k, false, false, 96, null);
        ErrorType errorType2 = c1596aHd.a;
        if (errorType2 != null) {
            c1596aHd.e.put("errorType", errorType2.c());
            String b2 = c1596aHd.b();
            if (b2 != null) {
                c1596aHd.a(errorType2.c() + " " + b2);
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
        } else {
            dVar.e().b(c1596aHd, th);
        }
    }

    public final C1665aJs e(String str, long j, long j2, NetflixTraceCategory netflixTraceCategory, NetflixTraceStatus netflixTraceStatus, NetlixAppState netlixAppState, String str2, Boolean bool, AppView appView, JSONObject jSONObject) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) netflixTraceCategory, "");
        C8632dsu.c((Object) netflixTraceStatus, "");
        d(new TimingEvent(new TimingEventArgs(netlixAppState, str2, bool, appView, netflixTraceStatus, jSONObject), Long.valueOf(j2), netflixTraceCategory, str, TraceEventFormatTypeX.X, NetflixTraceEventTypeTiming.timing, Long.valueOf(j)));
        return this;
    }

    public final C1665aJs c(String str, String str2) {
        Map d2;
        Map k;
        Throwable th;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        Long l = this.a.get(str);
        if (l != null) {
            if (g().get(str) == null) {
                g().put(str, new ArrayList());
            }
            List<NetworkCallEvent> list = g().get(str);
            if (list != null) {
                list.add(new NetworkCallEvent(Long.valueOf(a() - l.longValue()), str2, l));
            }
        } else {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            ErrorType errorType = ErrorType.q;
            String str3 = "endNetworkCallEvent was called but there was no start for " + str;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd(str3, null, errorType, true, k, false, false, 96, null);
            ErrorType errorType2 = c1596aHd.a;
            if (errorType2 != null) {
                c1596aHd.e.put("errorType", errorType2.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    c1596aHd.a(errorType2.c() + " " + b2);
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
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
        return this;
    }

    public final List<NetworkCallEvent> a(String str) {
        C8632dsu.c((Object) str, "");
        return g().get(str);
    }

    public final void a(String str, NetflixTraceEventTypeDataAccess netflixTraceEventTypeDataAccess, List<? extends NetworkCallEvent> list, NetflixTraceCategory netflixTraceCategory, NetflixTraceStatus netflixTraceStatus, NetlixAppState netlixAppState, String str2, Boolean bool, AppView appView) {
        Map d2;
        Map k;
        Throwable th;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) netflixTraceEventTypeDataAccess, "");
        C8632dsu.c((Object) netflixTraceCategory, "");
        C8632dsu.c((Object) netflixTraceStatus, "");
        Long l = this.a.get(str);
        if (l != null) {
            if (f()) {
                Trace.endAsyncSection(str, (int) l.longValue());
            }
            c(str, l.longValue(), a() - l.longValue(), netflixTraceEventTypeDataAccess, list, netflixTraceCategory, netflixTraceStatus, netlixAppState, str2, bool, appView);
            return;
        }
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        ErrorType errorType = ErrorType.q;
        d2 = dqE.d();
        k = dqE.k(d2);
        C1596aHd c1596aHd = new C1596aHd("endTimingEvent was called but there was no start for " + str, null, errorType, true, k, false, false, 96, null);
        ErrorType errorType2 = c1596aHd.a;
        if (errorType2 != null) {
            c1596aHd.e.put("errorType", errorType2.c());
            String b2 = c1596aHd.b();
            if (b2 != null) {
                c1596aHd.a(errorType2.c() + " " + b2);
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
        } else {
            dVar.e().b(c1596aHd, th);
        }
    }

    public final C1665aJs c(String str, long j, long j2, NetflixTraceEventTypeDataAccess netflixTraceEventTypeDataAccess, List<? extends NetworkCallEvent> list, NetflixTraceCategory netflixTraceCategory, NetflixTraceStatus netflixTraceStatus, NetlixAppState netlixAppState, String str2, Boolean bool, AppView appView) {
        NetworkCallEvent[] networkCallEventArr;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) netflixTraceEventTypeDataAccess, "");
        C8632dsu.c((Object) netflixTraceCategory, "");
        C8632dsu.c((Object) netflixTraceStatus, "");
        if (list == null || (networkCallEventArr = (NetworkCallEvent[]) list.toArray(new NetworkCallEvent[0])) == null) {
            networkCallEventArr = new NetworkCallEvent[0];
        }
        d(new DataAccessEvent(new DataAccessEventArgs(netlixAppState, networkCallEventArr, str2, bool, appView, netflixTraceStatus), Long.valueOf(j2), netflixTraceCategory, str, TraceEventFormatTypeX.X, netflixTraceEventTypeDataAccess, Long.valueOf(j)));
        return this;
    }

    public final C1665aJs a(String str, String str2, SummaryStatistics summaryStatistics) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) summaryStatistics, "");
        Map<String, SummaryStatistics> map = i().get(str);
        if (map == null) {
            map = new LinkedHashMap<>();
            i().put(str, map);
        }
        map.put(str2, summaryStatistics);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C1665aJs c(String str, String str2, List<? extends HistogramBucket> list) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) list, "");
        Map<String, List<HistogramBucket>> map = e().get(str);
        if (map == null) {
            map = new LinkedHashMap<>();
            e().put(str, map);
        }
        map.put(str2, list);
        return this;
    }

    public final C1665aJs b(String str, String str2, Number number) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) number, "");
        JSONObject jSONObject = h().get(str);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            h().put(str, jSONObject);
        }
        jSONObject.put(str2, number);
        return this;
    }

    public static /* synthetic */ void b(C1665aJs c1665aJs, String str, JSONObject jSONObject, Map map, Map map2, NetlixAppState netlixAppState, NetflixTraceCategory netflixTraceCategory, NetflixTraceStatus netflixTraceStatus, String str2, Boolean bool, AppView appView, JSONObject jSONObject2, int i, Object obj) {
        c1665aJs.d(str, (i & 2) != 0 ? null : jSONObject, (i & 4) != 0 ? null : map, (i & 8) != 0 ? null : map2, (i & 16) != 0 ? NetlixAppState.foreground : netlixAppState, (i & 32) != 0 ? NetflixTraceCategory.device : netflixTraceCategory, (i & 64) != 0 ? NetflixTraceStatus.success : netflixTraceStatus, (i & 128) != 0 ? null : str2, (i & JSONzip.end) != 0 ? null : bool, (i & 512) != 0 ? null : appView, (i & 1024) == 0 ? jSONObject2 : null);
    }

    public final void d(String str, JSONObject jSONObject, Map<String, ? extends SummaryStatistics> map, Map<String, ? extends List<? extends HistogramBucket>> map2, NetlixAppState netlixAppState, NetflixTraceCategory netflixTraceCategory, NetflixTraceStatus netflixTraceStatus, String str2, Boolean bool, AppView appView, JSONObject jSONObject2) {
        Map d2;
        Map k;
        Throwable th;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) netlixAppState, "");
        C8632dsu.c((Object) netflixTraceCategory, "");
        C8632dsu.c((Object) netflixTraceStatus, "");
        Long l = this.a.get(str);
        if (l != null) {
            if (f()) {
                Trace.endAsyncSection(str, (int) l.longValue());
            }
            b(str, l.longValue(), a() - l.longValue(), jSONObject, map, map2, netlixAppState, netflixTraceCategory, netflixTraceStatus, str2, bool, appView, jSONObject2);
            return;
        }
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        ErrorType errorType = ErrorType.q;
        d2 = dqE.d();
        k = dqE.k(d2);
        C1596aHd c1596aHd = new C1596aHd("endSampleEvent was called but there was no start for " + str, null, errorType, true, k, false, false, 96, null);
        ErrorType errorType2 = c1596aHd.a;
        if (errorType2 != null) {
            c1596aHd.e.put("errorType", errorType2.c());
            String b2 = c1596aHd.b();
            if (b2 != null) {
                c1596aHd.a(errorType2.c() + " " + b2);
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
        } else {
            dVar.e().b(c1596aHd, th);
        }
    }

    public static /* synthetic */ C1665aJs a(C1665aJs c1665aJs, String str, long j, long j2, JSONObject jSONObject, Map map, Map map2, NetlixAppState netlixAppState, NetflixTraceCategory netflixTraceCategory, NetflixTraceStatus netflixTraceStatus, String str2, Boolean bool, AppView appView, JSONObject jSONObject2, int i, Object obj) {
        return c1665aJs.b(str, j, j2, (i & 8) != 0 ? null : jSONObject, (i & 16) != 0 ? null : map, (i & 32) != 0 ? null : map2, (i & 64) != 0 ? NetlixAppState.foreground : netlixAppState, (i & 128) != 0 ? NetflixTraceCategory.device : netflixTraceCategory, (i & JSONzip.end) != 0 ? NetflixTraceStatus.success : netflixTraceStatus, (i & 512) != 0 ? null : str2, (i & 1024) != 0 ? null : bool, (i & 2048) != 0 ? null : appView, (i & 4096) != 0 ? null : jSONObject2);
    }

    public final C1665aJs b(String str, long j, long j2, JSONObject jSONObject, Map<String, ? extends SummaryStatistics> map, Map<String, ? extends List<? extends HistogramBucket>> map2, NetlixAppState netlixAppState, NetflixTraceCategory netflixTraceCategory, NetflixTraceStatus netflixTraceStatus, String str2, Boolean bool, AppView appView, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) netlixAppState, "");
        C8632dsu.c((Object) netflixTraceCategory, "");
        C8632dsu.c((Object) netflixTraceStatus, "");
        d(jSONObject == null ? h().get(str) : jSONObject);
        JSONObject c = c(map2 == null ? e().get(str) : map2);
        JSONObject e2 = e(map == null ? i().get(str) : map);
        if (jSONObject == null) {
            JSONObject jSONObject4 = h().get(str);
            if (jSONObject4 == null) {
                jSONObject4 = new JSONObject();
            }
            jSONObject3 = jSONObject4;
        } else {
            jSONObject3 = jSONObject;
        }
        this.g.add(new SampleEvent(new SampleEventArgs(netlixAppState, c, str2, e2, bool, jSONObject3, appView, netflixTraceStatus, jSONObject2), Long.valueOf(j2), netflixTraceCategory, str, TraceEventFormatTypeX.X, NetflixTraceEventTypeSample.sample, Long.valueOf(j)));
        return this;
    }

    public final C1665aJs e(String str, double d2, NetflixTraceCategory netflixTraceCategory, Long l, AppView appView, JSONObject jSONObject) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) netflixTraceCategory, "");
        this.g.add(new MarkEvent(new BaseTraceEventArgs(appView, jSONObject), netflixTraceCategory, str, TraceEventFormatTypeR.R, "mark", Double.valueOf(d2), Long.valueOf(l != null ? l.longValue() : a())));
        return this;
    }

    public static /* synthetic */ C1665aJs e(C1665aJs c1665aJs, String str, JSONObject jSONObject, NetflixTraceCategory netflixTraceCategory, Long l, AppView appView, int i, Object obj) {
        if ((i & 4) != 0) {
            netflixTraceCategory = NetflixTraceCategory.device;
        }
        return c1665aJs.e(str, jSONObject, netflixTraceCategory, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : appView);
    }

    public final C1665aJs e(String str, JSONObject jSONObject, NetflixTraceCategory netflixTraceCategory, Long l, AppView appView) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) jSONObject, "");
        C8632dsu.c((Object) netflixTraceCategory, "");
        this.g.add(new MetadataEvent(new BaseTraceEventArgs(appView, jSONObject), netflixTraceCategory, str, TraceEventFormatTypeM.M, "metadata", Long.valueOf(l != null ? l.longValue() : a())));
        return this;
    }

    public final C1665aJs d(Data data) {
        C8632dsu.c((Object) data, "");
        this.g.add(data);
        return this;
    }

    public final long a() {
        return TimeUnit.MILLISECONDS.toMicros(this.d.c());
    }

    /* renamed from: o.aJs$a */
    /* loaded from: classes.dex */
    public static final class a implements d {
        a() {
        }

        @Override // o.C1665aJs.d
        public PerformanceTraceReported d(JSONObject jSONObject, Long l, long j) {
            C8632dsu.c((Object) jSONObject, "");
            return new PerformanceTraceReported(jSONObject, l, Long.valueOf(j));
        }
    }

    public final PerformanceTraceReported c() {
        return d(new a());
    }

    public final PerformanceTraceReported d(d dVar) {
        Map d2;
        Map k;
        Throwable th;
        C8632dsu.c((Object) dVar, "");
        if (this.g.isEmpty()) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("The PerformanceTrace was empty in buildWithFactory", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b2);
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
            InterfaceC1598aHf a2 = dVar2.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
            } else {
                dVar2.e().b(c1596aHd, th);
            }
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<Data> it = this.g.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().toJSONObject());
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("traceEvents", jSONArray);
        return dVar.d(jSONObject, this.f, this.j);
    }

    private final JSONObject e(Map<String, ? extends SummaryStatistics> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends SummaryStatistics> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue().toJSONObject());
        }
        return jSONObject;
    }

    private final JSONObject c(Map<String, ? extends List<? extends HistogramBucket>> map) {
        int d2;
        if (map == null || map.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends List<? extends HistogramBucket>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<? extends HistogramBucket> value = entry.getValue();
            d2 = C8572dqo.d(value, 10);
            ArrayList arrayList = new ArrayList(d2);
            for (HistogramBucket histogramBucket : value) {
                arrayList.add(histogramBucket.toJSONObject());
            }
            jSONObject.put(key, new JSONArray((Collection) arrayList));
        }
        return jSONObject;
    }

    public String toString() {
        JSONArray jSONArray = new JSONArray();
        Iterator<Data> it = this.g.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().toJSONObject());
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("traceEvents", jSONArray);
        String jSONObject2 = new PerformanceTraceReported(jSONObject, this.f, Long.valueOf(this.j)).toJSONObject().toString();
        C8632dsu.a(jSONObject2, "");
        return jSONObject2;
    }
}
