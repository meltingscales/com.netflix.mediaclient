package o;

import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.cl.Logger;
import com.netflix.cl.model.NetflixTraceCategory;
import com.netflix.cl.model.NetflixTraceEventTypeDataAccess;
import com.netflix.cl.model.NetflixTraceStatus;
import com.netflix.cl.model.NetlixAppState;
import com.netflix.cl.model.event.discrete.DataPerformanceTraceReported;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import o.C1665aJs;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class GZ implements InterfaceC0904Hb {
    private boolean a;
    private NetflixTraceStatus b;
    private final C1665aJs c;
    private boolean d;
    private final String e;
    private String f;
    private final C0903Ha j;

    @Override // o.InterfaceC0904Hb
    public InterfaceC0904Hb n() {
        this.d = true;
        return this;
    }

    public GZ(String str, C0903Ha c0903Ha) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c0903Ha, "");
        this.e = str;
        this.j = c0903Ha;
        C1665aJs c1665aJs = new C1665aJs(0L, null, false, null, 10, null);
        this.c = c1665aJs;
        this.b = NetflixTraceStatus.success;
        ConfigFastPropertyFeatureControlConfig.b bVar = ConfigFastPropertyFeatureControlConfig.Companion;
        if (bVar.n().getSendLegacyNetworkPerfTrace()) {
            c1665aJs.d("FalcorTask");
        }
        if (bVar.n().getSendDataAccessPerfTrace()) {
            c1665aJs.d(str);
        }
    }

    @Override // o.InterfaceC0904Hb
    public void d() {
        this.c.d("beforeFetch");
    }

    @Override // o.InterfaceC0904Hb
    public void f() {
        this.c.e("beforeFetch", (r17 & 2) != 0 ? NetflixTraceCategory.device : null, (r17 & 4) != 0 ? NetflixTraceStatus.success : null, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null, (r17 & 128) == 0 ? null : null);
    }

    @Override // o.InterfaceC0904Hb
    public void c() {
        this.c.d("buildPqls");
    }

    @Override // o.InterfaceC0904Hb
    public void a(int i) {
        this.c.b("buildPqls", "requestedLeafs", Integer.valueOf(i));
        this.c.d("buildPqls", (r23 & 2) != 0 ? null : null, (r23 & 4) != 0 ? null : null, (r23 & 8) != 0 ? null : null, (r23 & 16) != 0 ? NetlixAppState.foreground : null, (r23 & 32) != 0 ? NetflixTraceCategory.device : null, (r23 & 64) != 0 ? NetflixTraceStatus.success : null, (r23 & 128) != 0 ? null : null, (r23 & JSONzip.end) != 0 ? null : null, (r23 & 512) != 0 ? null : null, (r23 & 1024) == 0 ? null : null);
    }

    @Override // o.InterfaceC0904Hb
    public void e(int i) {
        this.c.d("cacheGet");
        this.c.b("cacheGet", "requestedLeafs", Integer.valueOf(i));
    }

    @Override // o.InterfaceC0904Hb
    public void a(C0942In c0942In) {
        JSONObject jSONObject;
        this.a = c0942In != null ? c0942In.b() : false;
        if (c0942In != null) {
            JSONObject j = c0942In.j();
            C8632dsu.a(j, "");
            jSONObject = GX.a("cacheStats", j);
        } else {
            jSONObject = null;
        }
        this.c.d("cacheGet", (r23 & 2) != 0 ? null : null, (r23 & 4) != 0 ? null : null, (r23 & 8) != 0 ? null : null, (r23 & 16) != 0 ? NetlixAppState.foreground : null, (r23 & 32) != 0 ? NetflixTraceCategory.device : null, (r23 & 64) != 0 ? NetflixTraceStatus.success : null, (r23 & 128) != 0 ? null : null, (r23 & JSONzip.end) != 0 ? null : null, (r23 & 512) != 0 ? null : null, (r23 & 1024) == 0 ? jSONObject : null);
    }

    @Override // o.InterfaceC0904Hb
    public void c(int i) {
        ConfigFastPropertyFeatureControlConfig.b bVar = ConfigFastPropertyFeatureControlConfig.Companion;
        if (bVar.n().getSendLegacyNetworkPerfTrace()) {
            this.c.d("networkGet");
        }
        if (bVar.n().getSendDataAccessPerfTrace()) {
            C1665aJs c1665aJs = this.c;
            String str = this.e;
            c1665aJs.d("network" + str);
        }
        this.c.b("networkGet", "requestedLeafs", Integer.valueOf(i));
    }

    @Override // o.InterfaceC0904Hb
    public void j() {
        JSONObject a2;
        ConfigFastPropertyFeatureControlConfig.b bVar = ConfigFastPropertyFeatureControlConfig.Companion;
        if (bVar.n().getSendLegacyNetworkPerfTrace()) {
            a2 = GX.a("request_id", this.j.b());
            this.c.d("networkGet", (r23 & 2) != 0 ? null : null, (r23 & 4) != 0 ? null : null, (r23 & 8) != 0 ? null : null, (r23 & 16) != 0 ? NetlixAppState.foreground : null, (r23 & 32) != 0 ? NetflixTraceCategory.device : null, (r23 & 64) != 0 ? NetflixTraceStatus.success : null, (r23 & 128) != 0 ? null : null, (r23 & JSONzip.end) != 0 ? null : null, (r23 & 512) != 0 ? null : null, (r23 & 1024) == 0 ? a2 : null);
        }
        if (bVar.n().getSendDataAccessPerfTrace()) {
            C1665aJs c1665aJs = this.c;
            String str = this.e;
            c1665aJs.c("network" + str, this.j.b());
        }
    }

    @Override // o.InterfaceC0904Hb
    public void e() {
        this.c.d("parseResponse");
    }

    @Override // o.InterfaceC0904Hb
    public void h() {
        this.c.e("parseResponse", (r17 & 2) != 0 ? NetflixTraceCategory.device : null, (r17 & 4) != 0 ? NetflixTraceStatus.success : null, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null, (r17 & 128) == 0 ? null : null);
    }

    @Override // o.InterfaceC0904Hb
    public void a() {
        this.c.d("mergeResponse");
    }

    @Override // o.InterfaceC0904Hb
    public void g() {
        this.c.e("mergeResponse", (r17 & 2) != 0 ? NetflixTraceCategory.device : null, (r17 & 4) != 0 ? NetflixTraceStatus.success : null, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null, (r17 & 128) == 0 ? null : null);
    }

    @Override // o.InterfaceC0904Hb
    public void b() {
        this.c.d("handleSuccess");
    }

    @Override // o.InterfaceC0904Hb
    public void i() {
        this.c.e("handleSuccess", (r17 & 2) != 0 ? NetflixTraceCategory.device : null, (r17 & 4) != 0 ? NetflixTraceStatus.success : null, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null, (r17 & 128) == 0 ? null : null);
    }

    @Override // o.InterfaceC0904Hb
    public void c(Status status) {
        C8632dsu.c((Object) status, "");
        this.c.d("handleFailure");
    }

    @Override // o.InterfaceC0904Hb
    public void d(Status status) {
        C8632dsu.c((Object) status, "");
        this.b = NetflixTraceStatus.fail;
        String name = status.c().name();
        String l = status.l();
        this.f = name + " " + l;
        this.c.e("handleFailure", (r17 & 2) != 0 ? NetflixTraceCategory.device : null, (r17 & 4) != 0 ? NetflixTraceStatus.success : null, (r17 & 8) != 0 ? null : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null, (r17 & 128) == 0 ? null : null);
    }

    @Override // o.InterfaceC0904Hb
    public InterfaceC0904Hb m() {
        this.b = NetflixTraceStatus.cancel;
        return this;
    }

    @Override // o.InterfaceC0904Hb
    public void b(boolean z, NetlixAppState netlixAppState) {
        JSONObject a2;
        C8632dsu.c((Object) netlixAppState, "");
        a2 = GX.a("cl.user_action_id", this.j.c());
        a2.put("taskName", this.e);
        a2.put("cacheSkipped", this.d);
        a2.put("hasExpired", this.a);
        ConfigFastPropertyFeatureControlConfig.b bVar = ConfigFastPropertyFeatureControlConfig.Companion;
        if (bVar.n().getSendLegacyNetworkPerfTrace()) {
            this.c.d("FalcorTask", (r23 & 2) != 0 ? null : null, (r23 & 4) != 0 ? null : null, (r23 & 8) != 0 ? null : null, (r23 & 16) != 0 ? NetlixAppState.foreground : netlixAppState, (r23 & 32) != 0 ? NetflixTraceCategory.device : null, (r23 & 64) != 0 ? NetflixTraceStatus.success : this.b, (r23 & 128) != 0 ? null : this.f, (r23 & JSONzip.end) != 0 ? null : Boolean.valueOf(z), (r23 & 512) != 0 ? null : null, (r23 & 1024) == 0 ? a2 : null);
            Logger.INSTANCE.logEvent(this.c.c());
        }
        if (bVar.n().getSendDataAccessPerfTrace()) {
            C1665aJs c1665aJs = this.c;
            String str = this.e;
            NetflixTraceEventTypeDataAccess netflixTraceEventTypeDataAccess = NetflixTraceEventTypeDataAccess.falcor;
            c1665aJs.a(str, netflixTraceEventTypeDataAccess, (r23 & 4) != 0 ? null : c1665aJs.a("network" + str), (r23 & 8) != 0 ? NetflixTraceCategory.device : null, (r23 & 16) != 0 ? NetflixTraceStatus.success : this.b, (r23 & 32) != 0 ? null : netlixAppState, (r23 & 64) != 0 ? null : this.f, (r23 & 128) != 0 ? null : Boolean.valueOf(z), (r23 & JSONzip.end) != 0 ? null : null);
            Logger.INSTANCE.logEvent(this.c.d(new a()));
        }
    }

    /* loaded from: classes3.dex */
    public static final class a implements C1665aJs.d {
        a() {
        }

        @Override // o.C1665aJs.d
        /* renamed from: e */
        public DataPerformanceTraceReported d(JSONObject jSONObject, Long l, long j) {
            C8632dsu.c((Object) jSONObject, "");
            return new DataPerformanceTraceReported(GZ.this.j.c(), jSONObject, null, Long.valueOf(j));
        }
    }
}
