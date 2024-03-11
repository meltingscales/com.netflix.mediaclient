package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.commanderinfra.api.util.CommanderState;
import com.netflix.mediaclient.commanderinfra.api.util.ConnectionState;
import com.netflix.mediaclient.commanderinfra.api.util.TargetDeviceUiState;
import com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen;
import com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetPresenterKt$deviceSheetPresenter$state$3;
import com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen;
import o.C1294Wd;
import o.C8632dsu;
import o.VH;
import o.bBQ;
import o.bBS;
import o.dpR;

/* loaded from: classes4.dex */
public final class bBQ {

    /* loaded from: classes4.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ConnectionState.values().length];
            try {
                iArr[ConnectionState.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConnectionState.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConnectionState.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            b = iArr;
        }
    }

    public static final DeviceSheetScreen.a b(final InterfaceC8499dnw interfaceC8499dnw, final bBS bbs, bMT bmt, Composer composer, int i) {
        C8632dsu.c((Object) interfaceC8499dnw, "");
        C8632dsu.c((Object) bbs, "");
        C8632dsu.c((Object) bmt, "");
        composer.startReplaceableGroup(-1705067277);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1705067277, i, -1, "com.netflix.mediaclient.ui.commander.impl.presenter.deviceSheetPresenter (DeviceSheetPresenter.kt:38)");
        }
        boolean f = bbs.j().d().f();
        boolean b = bbs.j().d().b();
        boolean c2 = bbs.j().c();
        DeviceSheetScreen.a a = a(C8486dnj.a(new DeviceSheetScreen.a.c(bbs.f().b(), f, b, null, c2, bmt, bbs.e().b(), bbs.e().e(), new drM<DeviceSheetScreen.e, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetPresenterKt$deviceSheetPresenter$state$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(DeviceSheetScreen.e eVar) {
                d(eVar);
                return dpR.c;
            }

            public final void d(DeviceSheetScreen.e eVar) {
                C8632dsu.c((Object) eVar, "");
                bBQ.d(eVar, bBS.this, interfaceC8499dnw);
            }
        }, 8, null), new DeviceSheetPresenterKt$deviceSheetPresenter$state$3(bbs, interfaceC8499dnw, f, c2, bmt, null), composer, 64));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(bBS bbs) {
        if (bbs.j().d().b()) {
            bbs.e().c(true);
        } else {
            bbs.e().c(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(DeviceSheetScreen.e eVar, bBS bbs, InterfaceC8499dnw interfaceC8499dnw) {
        if ((eVar instanceof DeviceSheetScreen.e.j) || C8632dsu.c(eVar, DeviceSheetScreen.e.i.e) || (eVar instanceof DeviceSheetScreen.e.s)) {
            a(eVar, interfaceC8499dnw, bbs);
        } else if (C8632dsu.c(eVar, DeviceSheetScreen.e.c.d) || C8632dsu.c(eVar, DeviceSheetScreen.e.h.d) || C8632dsu.c(eVar, DeviceSheetScreen.e.C0060e.d) || C8632dsu.c(eVar, DeviceSheetScreen.e.b.d) || C8632dsu.c(eVar, DeviceSheetScreen.e.a.d) || C8632dsu.c(eVar, DeviceSheetScreen.e.d.e)) {
            a(eVar, bbs, interfaceC8499dnw);
        } else if (C8632dsu.c(eVar, DeviceSheetScreen.e.n.c)) {
            bbs.f().a(ConnectionState.i);
        } else if (C8632dsu.c(eVar, DeviceSheetScreen.e.k.e)) {
            bbs.j().d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetPresenterKt$handleEvents$1
                @Override // o.drM
                /* renamed from: d */
                public final C1294Wd invoke(C1294Wd c1294Wd) {
                    C1294Wd c2;
                    C8632dsu.c((Object) c1294Wd, "");
                    c2 = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                    return c2;
                }
            });
            bbs.e().d();
        } else if (C8632dsu.c(eVar, DeviceSheetScreen.e.l.a)) {
            bbs.e().c();
        } else {
            c(eVar, bbs.d());
        }
    }

    private static final void a(DeviceSheetScreen.e eVar, InterfaceC8499dnw interfaceC8499dnw, bBS bbs) {
        if (eVar instanceof DeviceSheetScreen.e.j) {
            c((DeviceSheetScreen.e.j) eVar, interfaceC8499dnw, bbs);
        } else if (C8632dsu.c(eVar, DeviceSheetScreen.e.i.e)) {
            bbs.j().a(CommanderState.d);
            bbs.j().d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetPresenterKt$handleConnectionEvents$1
                @Override // o.drM
                /* renamed from: c */
                public final C1294Wd invoke(C1294Wd c1294Wd) {
                    C1294Wd c2;
                    C8632dsu.c((Object) c1294Wd, "");
                    c2 = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                    return c2;
                }
            });
            bbs.f().c();
        } else if (eVar instanceof DeviceSheetScreen.e.s) {
            b((DeviceSheetScreen.e.s) eVar, bbs, interfaceC8499dnw);
        }
    }

    private static final void a(DeviceSheetScreen.e eVar, bBS bbs, InterfaceC8499dnw interfaceC8499dnw) {
        if (C8632dsu.c(eVar, DeviceSheetScreen.e.c.d)) {
            bbs.d().c();
            bbs.j().d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetPresenterKt$handleCloseEvents$1
                @Override // o.drM
                /* renamed from: a */
                public final C1294Wd invoke(C1294Wd c1294Wd) {
                    C1294Wd c2;
                    C8632dsu.c((Object) c1294Wd, "");
                    c2 = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                    return c2;
                }
            });
            bbs.f().a(ConnectionState.i);
        } else if (C8632dsu.c(eVar, DeviceSheetScreen.e.h.d)) {
            bbs.j().d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetPresenterKt$handleCloseEvents$2
                @Override // o.drM
                /* renamed from: c */
                public final C1294Wd invoke(C1294Wd c1294Wd) {
                    C1294Wd c2;
                    C8632dsu.c((Object) c1294Wd, "");
                    c2 = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                    return c2;
                }
            });
            interfaceC8499dnw.c(ControllerScreen.c);
        } else if (C8632dsu.c(eVar, DeviceSheetScreen.e.C0060e.d)) {
            bbs.d().c();
            bbs.j().d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetPresenterKt$handleCloseEvents$3
                @Override // o.drM
                /* renamed from: d */
                public final C1294Wd invoke(C1294Wd c1294Wd) {
                    C1294Wd c2;
                    C8632dsu.c((Object) c1294Wd, "");
                    c2 = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                    return c2;
                }
            });
            bbs.f().a(ConnectionState.i);
        } else if (C8632dsu.c(eVar, DeviceSheetScreen.e.b.d)) {
            c(interfaceC8499dnw, bbs);
        } else if (C8632dsu.c(eVar, DeviceSheetScreen.e.a.d)) {
            e(bbs);
        } else if (C8632dsu.c(eVar, DeviceSheetScreen.e.d.e)) {
            e(bbs);
        }
    }

    private static final void c(DeviceSheetScreen.e eVar, InterfaceC1284Vt interfaceC1284Vt) {
        if (C8632dsu.c(eVar, DeviceSheetScreen.e.f.c)) {
            interfaceC1284Vt.b();
        } else if (C8632dsu.c(eVar, DeviceSheetScreen.e.g.c)) {
            interfaceC1284Vt.e();
        } else if (C8632dsu.c(eVar, DeviceSheetScreen.e.q.b)) {
            interfaceC1284Vt.k();
        } else if (eVar instanceof DeviceSheetScreen.e.p) {
            interfaceC1284Vt.e(((DeviceSheetScreen.e.p) eVar).b());
        } else if (C8632dsu.c(eVar, DeviceSheetScreen.e.o.e)) {
            interfaceC1284Vt.a();
        } else if (eVar instanceof DeviceSheetScreen.e.t) {
            interfaceC1284Vt.e(((DeviceSheetScreen.e.t) eVar).d());
        } else if (C8632dsu.c(eVar, DeviceSheetScreen.e.m.d)) {
            interfaceC1284Vt.h();
        }
    }

    private static final void e(bBS bbs) {
        bbs.c().b();
        bbs.d().c();
        bbs.j().d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetPresenterKt$closePromptSheet$1
            @Override // o.drM
            /* renamed from: c */
            public final C1294Wd invoke(C1294Wd c1294Wd) {
                C1294Wd c2;
                C8632dsu.c((Object) c1294Wd, "");
                c2 = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                return c2;
            }
        });
        bbs.f().a(ConnectionState.i);
    }

    private static final void c(InterfaceC8499dnw interfaceC8499dnw, bBS bbs) {
        bbs.j().d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetPresenterKt$closeFeatureEducationSheet$1
            @Override // o.drM
            /* renamed from: b */
            public final C1294Wd invoke(C1294Wd c1294Wd) {
                C1294Wd c2;
                C8632dsu.c((Object) c1294Wd, "");
                c2 = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                return c2;
            }
        });
        bbs.f().a(ConnectionState.i);
        int i = c.b[bbs.b().e().ordinal()];
        if (i == 1 || i == 2) {
            bbs.j().d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetPresenterKt$closeFeatureEducationSheet$2
                @Override // o.drM
                /* renamed from: b */
                public final C1294Wd invoke(C1294Wd c1294Wd) {
                    C1294Wd c2;
                    C8632dsu.c((Object) c1294Wd, "");
                    c2 = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : true, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                    return c2;
                }
            });
        } else if (i == 3) {
            interfaceC8499dnw.c(ControllerScreen.c);
        } else if (!bbs.j().d().h()) {
            bbs.d().c();
        } else {
            for (VQ vq : bbs.h().a()) {
                vq.b();
            }
        }
    }

    private static final void b(DeviceSheetScreen.e.s sVar, bBS bbs, InterfaceC8499dnw interfaceC8499dnw) {
        bbs.j().d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetPresenterKt$resolveProfileMismatch$1
            @Override // o.drM
            /* renamed from: c */
            public final C1294Wd invoke(C1294Wd c1294Wd) {
                C1294Wd c2;
                C8632dsu.c((Object) c1294Wd, "");
                c2 = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                return c2;
            }
        });
        if (sVar.d().g()) {
            VH.d.e(bbs.f(), new VX(sVar.b(), TargetDeviceUiState.c, null, null, null, null, null, 124, null), false, sVar.d().j(), 2, null);
            bbs.j().a(CommanderState.a);
            interfaceC8499dnw.c(ControllerScreen.c);
            return;
        }
        bbs.a().b(sVar.d().j());
    }

    private static final void c(DeviceSheetScreen.e.j jVar, InterfaceC8499dnw interfaceC8499dnw, bBS bbs) {
        if (!bbs.a().d(jVar.b())) {
            bbs.j().d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetPresenterKt$connectTarget$1
                @Override // o.drM
                /* renamed from: b */
                public final C1294Wd invoke(C1294Wd c1294Wd) {
                    C1294Wd c2;
                    C8632dsu.c((Object) c1294Wd, "");
                    c2 = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                    return c2;
                }
            });
            bbs.j().a(CommanderState.a);
            VH.d.e(bbs.f(), new VX(jVar.b(), TargetDeviceUiState.c, null, null, null, null, null, 124, null), false, jVar.b().g(), 2, null);
            interfaceC8499dnw.c(ControllerScreen.c);
            return;
        }
        bbs.f().a(ConnectionState.f);
    }

    private static final DeviceSheetScreen.a a(State<? extends DeviceSheetScreen.a> state) {
        return state.getValue();
    }
}
