package o;

import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.commanderinfra.api.util.ConnectionState;
import com.netflix.mediaclient.commanderinfra.api.util.TargetDeviceUiState;
import dagger.hilt.android.scopes.ActivityScoped;
import java.util.List;
import javax.inject.Inject;
import o.C1294Wd;
import o.C8632dsu;

@ActivityScoped
/* renamed from: o.Wf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1296Wf implements InterfaceC1286Vv {
    public static final e b = new e(null);
    private final VH a;
    private final VD d;

    @Inject
    public C1296Wf(VD vd, VH vh) {
        C8632dsu.c((Object) vd, "");
        C8632dsu.c((Object) vh, "");
        this.d = vd;
        this.a = vh;
    }

    /* renamed from: o.Wf$e */
    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("AutoPairingInfraImpl");
        }
    }

    @Override // o.InterfaceC1286Vv
    public InterfaceC8822dzv<List<VY>> b() {
        return C1326Xj.e.e();
    }

    @Override // o.InterfaceC1286Vv
    public ConnectionState e() {
        C1326Xj c1326Xj = C1326Xj.e;
        if (c1326Xj.c() != null) {
            VS c = c1326Xj.c();
            if (c != null) {
                C1329Xm.c.b();
                this.a.e(new VX(c.d(), TargetDeviceUiState.c, null, null, null, null, null, 124, null), true, c.d().g());
            }
            c1326Xj.d(null);
        } else if (c1326Xj.b() != null) {
            c1326Xj.e().d(c1326Xj.b());
            List<VY> b2 = c1326Xj.b();
            if (b2 != null && b2.size() == 1) {
                this.a.a(ConnectionState.g);
            } else {
                this.a.a(ConnectionState.b);
            }
            c1326Xj.e(null);
        } else if (!C1324Xh.a.c().b().isEmpty()) {
            this.d.d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.commanderinfra.impl.AutoPairingInfraImpl$attemptPairing$2
                @Override // o.drM
                /* renamed from: c */
                public final C1294Wd invoke(C1294Wd c1294Wd) {
                    C1294Wd c2;
                    C8632dsu.c((Object) c1294Wd, "");
                    c2 = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : true);
                    return c2;
                }
            });
        }
        return C1317Xa.e.c().b();
    }

    @Override // o.InterfaceC1286Vv
    public void e(ConnectionState connectionState, List<VY> list) {
        C8632dsu.c((Object) connectionState, "");
        C1326Xj.e.e().d(list);
        C1317Xa.e.c().d(connectionState);
    }
}
