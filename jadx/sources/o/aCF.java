package o;

import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.NetflixTraceCategory;
import com.netflix.cl.model.NetflixTraceEventTypeDataAccess;
import com.netflix.cl.model.NetflixTraceStatus;
import com.netflix.cl.model.NetlixAppState;
import com.netflix.cl.model.event.discrete.DataPerformanceTraceReported;
import com.netflix.mediaclient.latencytracker.api.UiLatencyMarker;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.service.webclient.volley.RequestAppStateContext;
import java.util.concurrent.ConcurrentHashMap;
import o.C1665aJs;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aCF {
    public static final aCF c = new aCF();
    private static final ConcurrentHashMap<String, C1665aJs> e = new ConcurrentHashMap<>();

    private aCF() {
    }

    public final C1665aJs d() {
        if (InterfaceC1659aJm.b.e().e()) {
            return new C1665aJs(0L, null, false, null, 11, null);
        }
        return null;
    }

    public final String a(C1665aJs c1665aJs) {
        if (c1665aJs != null) {
            String c2 = C8180dfX.e.c();
            c.d(c2, c1665aJs);
            return c2;
        }
        return null;
    }

    public static /* synthetic */ void d(aCF acf, String str, String str2, boolean z, boolean z2, boolean z3, String str3, int i, Object obj) {
        if ((i & 32) != 0) {
            str3 = null;
        }
        acf.e(str, str2, z, z2, z3, str3);
    }

    public final void e(String str, String str2, boolean z, boolean z2, boolean z3, String str3) {
        NetflixTraceStatus netflixTraceStatus;
        C1665aJs c1665aJs;
        C8632dsu.c((Object) str2, "");
        if (str == null) {
            return;
        }
        C1665aJs c1665aJs2 = e.get(str);
        if (c1665aJs2 == null || c1665aJs2.b()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cl.user_action_id", str);
        jSONObject.put("taskName", str2);
        if (z3) {
            netflixTraceStatus = NetflixTraceStatus.fail;
        } else if (z2 && !z3) {
            netflixTraceStatus = NetflixTraceStatus.partialFail;
        } else {
            netflixTraceStatus = NetflixTraceStatus.success;
        }
        NetflixTraceStatus netflixTraceStatus2 = netflixTraceStatus;
        ConfigFastPropertyFeatureControlConfig.b bVar = ConfigFastPropertyFeatureControlConfig.Companion;
        if (bVar.n().getSendLegacyNetworkPerfTrace()) {
            c1665aJs2.d("GraphQLQuery", (r23 & 2) != 0 ? null : null, (r23 & 4) != 0 ? null : null, (r23 & 8) != 0 ? null : null, (r23 & 16) != 0 ? NetlixAppState.foreground : C5043brM.a.a() == RequestAppStateContext.e ? NetlixAppState.foreground : NetlixAppState.background, (r23 & 32) != 0 ? NetflixTraceCategory.device : null, (r23 & 64) != 0 ? NetflixTraceStatus.success : netflixTraceStatus2, (r23 & 128) != 0 ? null : str3, (r23 & JSONzip.end) != 0 ? null : Boolean.valueOf(z), (r23 & 512) != 0 ? null : null, (r23 & 1024) == 0 ? jSONObject : null);
            Logger.INSTANCE.logEvent(c1665aJs2.c());
        }
        if (bVar.n().getSendDataAccessPerfTrace()) {
            NetflixTraceEventTypeDataAccess netflixTraceEventTypeDataAccess = NetflixTraceEventTypeDataAccess.graphql;
            c1665aJs = c1665aJs2;
            c1665aJs2.a(str2, netflixTraceEventTypeDataAccess, (r23 & 4) != 0 ? null : c1665aJs2.a("network" + str2), (r23 & 8) != 0 ? NetflixTraceCategory.device : null, (r23 & 16) != 0 ? NetflixTraceStatus.success : netflixTraceStatus2, (r23 & 32) != 0 ? null : C5043brM.a.a() == RequestAppStateContext.e ? NetlixAppState.foreground : NetlixAppState.background, (r23 & 64) != 0 ? null : str3, (r23 & 128) != 0 ? null : Boolean.valueOf(z), (r23 & JSONzip.end) != 0 ? null : null);
            Logger.INSTANCE.logEvent(c1665aJs.d(new c(str)));
        } else {
            c1665aJs = c1665aJs2;
        }
        e(c1665aJs);
    }

    /* loaded from: classes3.dex */
    public static final class c implements C1665aJs.d {
        final /* synthetic */ String b;

        c(String str) {
            this.b = str;
        }

        @Override // o.C1665aJs.d
        /* renamed from: c */
        public DataPerformanceTraceReported d(JSONObject jSONObject, Long l, long j) {
            C8632dsu.c((Object) jSONObject, "");
            return new DataPerformanceTraceReported(this.b, jSONObject, null, Long.valueOf(j));
        }
    }

    public final void a(String str, String str2) {
        C1665aJs c1665aJs;
        C8632dsu.c((Object) str2, "");
        if (str == null || (c1665aJs = e.get(str)) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("queryMode", str2);
        dpR dpr = dpR.c;
        C1665aJs.e(c1665aJs, "queryMode", jSONObject, (NetflixTraceCategory) null, (Long) null, (AppView) null, 28, (Object) null);
    }

    public final void c(String str) {
        C1665aJs c1665aJs;
        if (str == null || (c1665aJs = e.get(str)) == null) {
            return;
        }
        c1665aJs.e("beforeQuery", (r17 & 2) != 0 ? NetflixTraceCategory.device : null, (r17 & 4) != 0 ? NetflixTraceStatus.success : null, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null, (r17 & 128) == 0 ? null : null);
    }

    public final void g(String str) {
        C1665aJs c1665aJs;
        if (str == null || (c1665aJs = e.get(str)) == null) {
            return;
        }
        c1665aJs.d("query");
    }

    public final void a(String str) {
        C1665aJs c1665aJs;
        if (str == null || (c1665aJs = e.get(str)) == null) {
            return;
        }
        c1665aJs.e("query", (r17 & 2) != 0 ? NetflixTraceCategory.device : null, (r17 & 4) != 0 ? NetflixTraceStatus.success : null, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null, (r17 & 128) == 0 ? null : null);
    }

    public final void a(String str, UiLatencyMarker uiLatencyMarker) {
        C1665aJs c1665aJs;
        C8632dsu.c((Object) uiLatencyMarker, "");
        uiLatencyMarker.b(UiLatencyMarker.Mark.CACHE_START);
        if (str == null || (c1665aJs = e.get(str)) == null) {
            return;
        }
        c1665aJs.d("cacheResponse");
    }

    public final void d(String str, UiLatencyMarker uiLatencyMarker) {
        C1665aJs c1665aJs;
        C8632dsu.c((Object) uiLatencyMarker, "");
        uiLatencyMarker.b(UiLatencyMarker.Mark.CACHE_END);
        if (str == null || (c1665aJs = e.get(str)) == null) {
            return;
        }
        c1665aJs.e("cacheResponse", (r17 & 2) != 0 ? NetflixTraceCategory.device : null, (r17 & 4) != 0 ? NetflixTraceStatus.success : null, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null, (r17 & 128) == 0 ? null : null);
    }

    public final void d(String str) {
        C1665aJs c1665aJs;
        if (str == null || (c1665aJs = e.get(str)) == null) {
            return;
        }
        c1665aJs.d("networkGet");
    }

    public final void b(String str) {
        C1665aJs c1665aJs;
        if (str == null || (c1665aJs = e.get(str)) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("request_id", str);
        dpR dpr = dpR.c;
        c1665aJs.e("networkGet", (r17 & 2) != 0 ? NetflixTraceCategory.device : null, (r17 & 4) != 0 ? NetflixTraceStatus.success : null, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null, (r17 & 128) == 0 ? jSONObject : null);
    }

    public final void d(String str, String str2, UiLatencyMarker uiLatencyMarker) {
        C1665aJs c1665aJs;
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) uiLatencyMarker, "");
        uiLatencyMarker.b(UiLatencyMarker.Mark.NETWORK_START);
        if (str != null) {
            ConcurrentHashMap<String, C1665aJs> concurrentHashMap = e;
            C1665aJs c1665aJs2 = concurrentHashMap.get(str);
            if (c1665aJs2 != null) {
                c1665aJs2.d("networkResponse");
            }
            if (!ConfigFastPropertyFeatureControlConfig.Companion.n().getSendDataAccessPerfTrace() || (c1665aJs = concurrentHashMap.get(str)) == null) {
                return;
            }
            c1665aJs.d("network" + str2);
        }
    }

    public final void a(String str, String str2, UiLatencyMarker uiLatencyMarker) {
        C1665aJs c1665aJs;
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) uiLatencyMarker, "");
        j(str);
        uiLatencyMarker.b(UiLatencyMarker.Mark.PROCESSING_END);
        uiLatencyMarker.b(UiLatencyMarker.Mark.NETWORK_END);
        if (str != null) {
            ConcurrentHashMap<String, C1665aJs> concurrentHashMap = e;
            C1665aJs c1665aJs2 = concurrentHashMap.get(str);
            if (c1665aJs2 != null) {
                c1665aJs2.e("networkResponse", (r17 & 2) != 0 ? NetflixTraceCategory.device : null, (r17 & 4) != 0 ? NetflixTraceStatus.success : null, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null, (r17 & 128) == 0 ? null : null);
            }
            if (!ConfigFastPropertyFeatureControlConfig.Companion.n().getSendDataAccessPerfTrace() || (c1665aJs = concurrentHashMap.get(str)) == null) {
                return;
            }
            c1665aJs.c("network" + str2, str);
        }
    }

    public final void h(String str) {
        C1665aJs c1665aJs;
        if (str == null || (c1665aJs = e.get(str)) == null) {
            return;
        }
        c1665aJs.d("parseResponse");
    }

    private final void j(String str) {
        C1665aJs c1665aJs;
        if (str == null || (c1665aJs = e.get(str)) == null) {
            return;
        }
        c1665aJs.e("parseResponse", (r17 & 2) != 0 ? NetflixTraceCategory.device : null, (r17 & 4) != 0 ? NetflixTraceStatus.success : null, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null, (r17 & 128) == 0 ? null : null);
    }

    public final void e(String str) {
        C1665aJs c1665aJs;
        if (str == null || (c1665aJs = e.get(str)) == null) {
            return;
        }
        c1665aJs.e("expired", 1.0d, (r17 & 4) != 0 ? NetflixTraceCategory.device : null, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : null);
    }

    private final void d(String str, C1665aJs c1665aJs) {
        e.put(str, c1665aJs);
    }

    private final void e(C1665aJs c1665aJs) {
        e.values().remove(c1665aJs);
    }
}
