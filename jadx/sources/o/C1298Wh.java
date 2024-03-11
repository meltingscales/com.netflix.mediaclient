package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.commanderinfra.api.util.TargetDeviceUiState;
import com.netflix.mediaclient.commanderinfra.impl.logging.CommanderFlexEventType;
import dagger.hilt.android.scopes.ActivityScoped;
import java.util.LinkedHashMap;

@ActivityScoped
/* renamed from: o.Wh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1298Wh implements InterfaceC1284Vt {
    public static final e b = new e(null);

    /* renamed from: o.Wh$e */
    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("CLEventHandlerInfraImpl");
        }
    }

    @Override // o.InterfaceC1284Vt
    public String g() {
        return C1322Xf.e.b();
    }

    @Override // o.InterfaceC1284Vt
    public void b() {
        b.getLogTag();
        C1329Xm.c.b();
        WL.d(WL.d, C1322Xf.e.b(), CommanderFlexEventType.n, null, 4, null);
    }

    @Override // o.InterfaceC1284Vt
    public void e() {
        b.getLogTag();
        WL.d(WL.d, C1322Xf.e.b(), CommanderFlexEventType.f13170o, null, 4, null);
    }

    @Override // o.InterfaceC1284Vt
    public void k() {
        b.getLogTag();
        C1329Xm.c.b();
        WL.d(WL.d, C1322Xf.e.b(), CommanderFlexEventType.M, null, 4, null);
    }

    @Override // o.InterfaceC1284Vt
    public void e(VT vt) {
        VN d;
        String d2;
        VN a;
        VN d3;
        VN a2;
        b.getLogTag();
        C1329Xm.c.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = "";
        linkedHashMap.put("targetProfileId", (vt == null || (a2 = vt.a()) == null || (r2 = a2.j()) == null) ? "" : "");
        linkedHashMap.put("controllerProfileId", (vt == null || (d3 = vt.d()) == null || (r2 = d3.j()) == null) ? "" : "");
        linkedHashMap.put("targetDeviceNetworkId", (vt == null || (a = vt.a()) == null || (r2 = a.d()) == null) ? "" : "");
        if (vt != null && (d = vt.d()) != null && (d2 = d.d()) != null) {
            str = d2;
        }
        linkedHashMap.put("controllerDeviceNetworkId", str);
        WL.d.e(C1322Xf.e.b(), CommanderFlexEventType.z, linkedHashMap);
    }

    @Override // o.InterfaceC1284Vt
    public void a() {
        b.getLogTag();
        C1330Xn.c.c(true);
        C1329Xm.c.b();
        WL.d.e(C1322Xf.e.b(), CommanderFlexEventType.r, new LinkedHashMap());
    }

    @Override // o.InterfaceC1284Vt
    public void e(VY vy) {
        C8632dsu.c((Object) vy, "");
        b.getLogTag();
        C1322Xf c1322Xf = C1322Xf.e;
        if (c1322Xf.b() == null) {
            C1329Xm.c.b();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("targetProfileId", vy.a().g());
        linkedHashMap.put("targetDeviceNetworkId", vy.a().j());
        WL.d.e(c1322Xf.b(), CommanderFlexEventType.f13169J, linkedHashMap);
    }

    @Override // o.InterfaceC1284Vt
    public void h() {
        b.getLogTag();
        C1322Xf c1322Xf = C1322Xf.e;
        if (c1322Xf.b() == null) {
            C1329Xm.c.b();
        }
        WL.d.e(c1322Xf.b(), CommanderFlexEventType.x, new LinkedHashMap());
    }

    @Override // o.InterfaceC1284Vt
    public void b(boolean z, TargetDeviceUiState targetDeviceUiState, boolean z2) {
        String str;
        VU c;
        String b2;
        VU c2;
        str = "";
        C8632dsu.c((Object) targetDeviceUiState, "");
        b.getLogTag();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (targetDeviceUiState == TargetDeviceUiState.d) {
            VX b3 = C1317Xa.e.d().b();
            linkedHashMap.put(SignupConstants.Field.VIDEO_ID, (b3 == null || (c2 = b3.c()) == null || (r2 = c2.b()) == null) ? "" : "");
            String d = C1331Xo.b.d();
            linkedHashMap.put("videoType", d != null ? d : "");
        } else if (targetDeviceUiState == TargetDeviceUiState.e) {
            VX b4 = C1317Xa.e.d().b();
            if (b4 != null && (c = b4.c()) != null && (b2 = c.b()) != null) {
                str = b2;
            }
            linkedHashMap.put(SignupConstants.Field.VIDEO_ID, str);
            linkedHashMap.put("videoType", "PostPlay");
        }
        WL.d.e(C1322Xf.e.b(), C1331Xo.b.e(z, targetDeviceUiState), linkedHashMap);
        if (z2) {
            m();
        }
    }

    @Override // o.InterfaceC1284Vt
    public void c() {
        b.getLogTag();
        C1329Xm.c.d();
        C1322Xf.e.c(null);
    }

    @Override // o.InterfaceC1284Vt
    public void i() {
        b.getLogTag();
        WL.d(WL.d, C1322Xf.e.b(), CommanderFlexEventType.C, null, 4, null);
    }

    @Override // o.InterfaceC1284Vt
    public void f() {
        b.getLogTag();
        WL.d(WL.d, C1322Xf.e.b(), CommanderFlexEventType.w, null, 4, null);
    }

    @Override // o.InterfaceC1284Vt
    public void d() {
        b.getLogTag();
        WL.d(WL.d, C1322Xf.e.b(), CommanderFlexEventType.t, null, 4, null);
    }

    @Override // o.InterfaceC1284Vt
    public void j() {
        b.getLogTag();
        if (g() == null) {
            C1329Xm.c.b();
        }
        WL.d(WL.d, C1322Xf.e.b(), CommanderFlexEventType.e, null, 4, null);
        c();
    }

    private final void m() {
        TargetDeviceUiState a;
        b.getLogTag();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        VX b2 = C1317Xa.e.d().b();
        linkedHashMap.put("mode", (b2 == null || (a = b2.a()) == null || (r1 = a.name()) == null) ? "" : "");
        WL.d.e(C1322Xf.e.b(), CommanderFlexEventType.v, linkedHashMap);
    }
}
