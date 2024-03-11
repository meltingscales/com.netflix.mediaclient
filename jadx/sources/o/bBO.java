package o;

import android.app.Activity;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.commanderinfra.api.util.ConnectionState;
import com.netflix.mediaclient.ui.commander.api.TargetsDiscovery;
import dagger.hilt.android.scopes.ActivityScoped;
import javax.inject.Inject;
import o.C1294Wd;
import o.C8632dsu;
import o.VF;
import o.bBM;
import o.bBO;

@ActivityScoped
/* loaded from: classes4.dex */
public final class bBO implements TargetsDiscovery {
    public static final e a = new e(null);
    public static final int c = 8;
    private final d b;
    private final InterfaceC1286Vv d;
    private final ComponentActivity e;
    private final VH f;
    private final VD h;
    private TargetsDiscovery.d i;
    private final VF j;

    /* loaded from: classes4.dex */
    public final /* synthetic */ class b {
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[ConnectionState.values().length];
            try {
                iArr[ConnectionState.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConnectionState.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConnectionState.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            e = iArr;
        }
    }

    @Override // com.netflix.mediaclient.ui.commander.api.TargetsDiscovery
    public void b(TargetsDiscovery.d dVar) {
        C8632dsu.c((Object) dVar, "");
        this.i = dVar;
    }

    @Override // com.netflix.mediaclient.ui.commander.api.TargetsDiscovery
    public void c() {
        this.i = null;
    }

    @Inject
    public bBO(Activity activity, VF vf, VH vh, InterfaceC1286Vv interfaceC1286Vv, VD vd) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) vf, "");
        C8632dsu.c((Object) vh, "");
        C8632dsu.c((Object) interfaceC1286Vv, "");
        C8632dsu.c((Object) vd, "");
        this.j = vf;
        this.f = vh;
        this.d = interfaceC1286Vv;
        this.h = vd;
        ComponentActivity componentActivity = (ComponentActivity) C9737vz.e(activity, ComponentActivity.class);
        this.e = componentActivity;
        this.b = new d();
        a.getLogTag();
        componentActivity.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.ui.commander.impl.TargetDiscoveryImpl$2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onCreate(LifecycleOwner lifecycleOwner) {
                VF vf2;
                bBO.d dVar;
                C8632dsu.c((Object) lifecycleOwner, "");
                bBO.a.getLogTag();
                vf2 = bBO.this.j;
                dVar = bBO.this.b;
                vf2.c(dVar);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner lifecycleOwner) {
                VF vf2;
                bBO.d dVar;
                C8632dsu.c((Object) lifecycleOwner, "");
                bBO.a.getLogTag();
                vf2 = bBO.this.j;
                dVar = bBO.this.b;
                vf2.a(dVar);
                lifecycleOwner.getLifecycle().removeObserver(this);
            }
        });
    }

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("TargetDiscoveryImpl");
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements VQ {
        d() {
        }

        @Override // o.VQ
        public void e() {
            if (C8054ddD.l(bBO.this.e)) {
                return;
            }
            bBO.a.getLogTag();
            TargetsDiscovery.d dVar = bBO.this.i;
            if (dVar != null) {
                dVar.e();
            }
        }

        @Override // o.VQ
        public void a() {
            TargetsDiscovery.d dVar;
            if (C8054ddD.l(bBO.this.e) || (dVar = bBO.this.i) == null) {
                return;
            }
            dVar.b();
        }

        @Override // o.VQ
        public void c(InterfaceC5283bvo interfaceC5283bvo) {
            TargetsDiscovery.d dVar;
            C8632dsu.c((Object) interfaceC5283bvo, "");
            if (C8054ddD.l(bBO.this.e) || (dVar = bBO.this.i) == null) {
                return;
            }
            dVar.c(interfaceC5283bvo);
        }

        @Override // o.VQ
        public void b() {
            TargetsDiscovery.d dVar;
            if (C8054ddD.l(bBO.this.e) || (dVar = bBO.this.i) == null) {
                return;
            }
            dVar.a();
        }

        @Override // o.VQ
        public void d(boolean z) {
            TargetsDiscovery.d dVar;
            if (C8054ddD.l(bBO.this.e) || (dVar = bBO.this.i) == null) {
                return;
            }
            dVar.a(z, bBM.d.d);
        }
    }

    @Override // com.netflix.mediaclient.ui.commander.api.TargetsDiscovery
    public boolean a() {
        return this.f.f();
    }

    @Override // com.netflix.mediaclient.ui.commander.api.TargetsDiscovery
    public void e() {
        if (a()) {
            this.f.c();
        }
    }

    @Override // com.netflix.mediaclient.ui.commander.api.TargetsDiscovery
    public TargetsDiscovery.NextAction d() {
        int i = b.e[this.d.e().ordinal()];
        if (i == 1) {
            this.h.d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.TargetDiscoveryImpl$attemptPairing$1
                @Override // o.drM
                /* renamed from: d */
                public final C1294Wd invoke(C1294Wd c1294Wd) {
                    C1294Wd c2;
                    C8632dsu.c((Object) c1294Wd, "");
                    c2 = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : true, (r28 & 4096) != 0 ? c1294Wd.f : false);
                    return c2;
                }
            });
            return TargetsDiscovery.NextAction.c;
        } else if (i == 2 || i == 3) {
            return TargetsDiscovery.NextAction.b;
        } else {
            return TargetsDiscovery.NextAction.a;
        }
    }

    @Override // com.netflix.mediaclient.ui.commander.api.TargetsDiscovery
    public void b() {
        a.getLogTag();
        this.j.c();
    }
}
