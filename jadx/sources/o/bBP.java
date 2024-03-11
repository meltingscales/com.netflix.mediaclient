package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.commanderinfra.api.util.CommanderState;
import com.netflix.mediaclient.commanderinfra.api.util.ConnectionState;
import com.netflix.mediaclient.commanderinfra.api.util.TargetDeviceUiState;
import com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen;
import com.netflix.mediaclient.ui.commander.impl.presenter.ControllerSheetPresenterKt$controllerSheetPresenter$state$3;
import kotlin.NoWhenBranchMatchedException;
import o.C1294Wd;
import o.C8632dsu;
import o.bBP;
import o.bBR;
import o.dpR;

/* loaded from: classes4.dex */
public final class bBP {

    /* loaded from: classes4.dex */
    public final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CommanderState.values().length];
            try {
                iArr[CommanderState.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommanderState.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommanderState.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final ControllerScreen.c d(final InterfaceC8499dnw interfaceC8499dnw, final bBR bbr, Composer composer, int i) {
        Object c0057c;
        C8632dsu.c((Object) interfaceC8499dnw, "");
        C8632dsu.c((Object) bbr, "");
        composer.startReplaceableGroup(-1323313598);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1323313598, i, -1, "com.netflix.mediaclient.ui.commander.impl.presenter.controllerSheetPresenter (ControllerSheetPresenter.kt:47)");
        }
        ConnectionState b2 = bbr.f().b();
        VX a = bbr.f().a();
        if (bbr.f().f() && a != null) {
            if (a.a() == TargetDeviceUiState.a) {
                bBW.a.e(bbr.j());
            }
            c0057c = c(b2, a, bbr, interfaceC8499dnw);
        } else {
            c0057c = new ControllerScreen.c.C0057c(b2, bbr.j().d(), new drM<ControllerScreen.e, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.ControllerSheetPresenterKt$controllerSheetPresenter$state$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(ControllerScreen.e eVar) {
                    b(eVar);
                    return dpR.c;
                }

                public final void b(ControllerScreen.e eVar) {
                    C8632dsu.c((Object) eVar, "");
                    bBP.a(eVar, bBR.this, interfaceC8499dnw);
                }
            });
        }
        ControllerScreen.c e = e(C8486dnj.a(c0057c, new ControllerSheetPresenterKt$controllerSheetPresenter$state$3(bbr, interfaceC8499dnw, null), composer, 64));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ControllerScreen.c.e c(ConnectionState connectionState, VX vx, final bBR bbr, final InterfaceC8499dnw interfaceC8499dnw) {
        e(bbr);
        return new ControllerScreen.c.e(connectionState, vx, bbr.j().d(), bbr.e().b(), new drM<ControllerScreen.e, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.ControllerSheetPresenterKt$handleSuccess$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(ControllerScreen.e eVar) {
                b(eVar);
                return dpR.c;
            }

            public final void b(ControllerScreen.e eVar) {
                C8632dsu.c((Object) eVar, "");
                bBP.a(eVar, bBR.this, interfaceC8499dnw);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ControllerScreen.e eVar, bBR bbr, InterfaceC8499dnw interfaceC8499dnw) {
        if (C8632dsu.c(eVar, ControllerScreen.e.C0058e.e) || C8632dsu.c(eVar, ControllerScreen.e.C0715a.a) || C8632dsu.c(eVar, ControllerScreen.e.h.a) || C8632dsu.c(eVar, ControllerScreen.e.l.d)) {
            d(bbr, eVar);
        } else if ((eVar instanceof ControllerScreen.e.t) || (eVar instanceof ControllerScreen.e.w) || (eVar instanceof ControllerScreen.e.y) || (eVar instanceof ControllerScreen.e.D) || (eVar instanceof ControllerScreen.e.C) || (eVar instanceof ControllerScreen.e.x)) {
            d(eVar, bbr);
        } else if (C8632dsu.c(eVar, ControllerScreen.e.g.a) || (eVar instanceof ControllerScreen.e.m) || (eVar instanceof ControllerScreen.e.r) || (eVar instanceof ControllerScreen.e.p) || (eVar instanceof ControllerScreen.e.s)) {
            bBW.a.a(eVar, bbr.i(), bbr.d(), bbr.c());
        } else if (eVar instanceof ControllerScreen.e.q) {
            bbr.c().b(((ControllerScreen.e.q) eVar).c());
        } else if ((eVar instanceof ControllerScreen.e.C0716c) || C8632dsu.c(eVar, ControllerScreen.e.C0717d.b) || C8632dsu.c(eVar, ControllerScreen.e.o.c) || C8632dsu.c(eVar, ControllerScreen.e.i.d)) {
            bBV.d.a(eVar, bbr.a());
        } else {
            b(eVar, bbr, interfaceC8499dnw);
        }
    }

    private static final void b(ControllerScreen.e eVar, bBR bbr, InterfaceC8499dnw interfaceC8499dnw) {
        if (C8632dsu.c(eVar, ControllerScreen.e.u.b) || C8632dsu.c(eVar, ControllerScreen.e.f.b) || C8632dsu.c(eVar, ControllerScreen.e.v.c) || C8632dsu.c(eVar, ControllerScreen.e.j.e) || C8632dsu.c(eVar, ControllerScreen.e.A.d) || C8632dsu.c(eVar, ControllerScreen.e.n.e) || C8632dsu.c(eVar, ControllerScreen.e.z.d) || C8632dsu.c(eVar, ControllerScreen.e.k.b)) {
            a(eVar, bbr);
        } else if (C8632dsu.c(eVar, ControllerScreen.e.b.c)) {
            bBW.a.a(bbr, interfaceC8499dnw);
        }
    }

    private static final void d(ControllerScreen.e eVar, bBR bbr) {
        if (eVar instanceof ControllerScreen.e.t) {
            bBW.a.b(bbr.j());
            ControllerScreen.e.t tVar = (ControllerScreen.e.t) eVar;
            bbr.c().d(tVar.a(), tVar.e());
        } else if (eVar instanceof ControllerScreen.e.w) {
            bbr.j().d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.ControllerSheetPresenterKt$handlePlaybackEvents$1
                @Override // o.drM
                /* renamed from: e */
                public final C1294Wd invoke(C1294Wd c1294Wd) {
                    C1294Wd c;
                    C8632dsu.c((Object) c1294Wd, "");
                    c = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : true, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                    return c;
                }
            });
            bbr.e().d(bbr.c().c(((ControllerScreen.e.w) eVar).b()));
        } else if (eVar instanceof ControllerScreen.e.y) {
            bbr.j().d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.ControllerSheetPresenterKt$handlePlaybackEvents$2
                @Override // o.drM
                /* renamed from: b */
                public final C1294Wd invoke(C1294Wd c1294Wd) {
                    C1294Wd c;
                    C8632dsu.c((Object) c1294Wd, "");
                    c = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                    return c;
                }
            });
            bbr.e().e();
            bbr.c().b(((ControllerScreen.e.y) eVar).c());
        } else if ((eVar instanceof ControllerScreen.e.D) || (eVar instanceof ControllerScreen.e.C)) {
            d(eVar, bbr.d());
        } else if (eVar instanceof ControllerScreen.e.x) {
            bbr.j().d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.ControllerSheetPresenterKt$handlePlaybackEvents$3
                @Override // o.drM
                /* renamed from: d */
                public final C1294Wd invoke(C1294Wd c1294Wd) {
                    C1294Wd c;
                    C8632dsu.c((Object) c1294Wd, "");
                    c = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                    return c;
                }
            });
            bbr.c().c(((ControllerScreen.e.x) eVar).a());
        }
    }

    private static final void d(ControllerScreen.e eVar, InterfaceC1288Vx interfaceC1288Vx) {
        if (eVar instanceof ControllerScreen.e.D) {
            ControllerScreen.e.D d = (ControllerScreen.e.D) eVar;
            interfaceC1288Vx.a(d.c().e(), d.c().a());
        } else if (eVar instanceof ControllerScreen.e.C) {
            ControllerScreen.e.C c = (ControllerScreen.e.C) eVar;
            interfaceC1288Vx.b(c.c().e(), c.c().a());
        }
    }

    private static final void a(ControllerScreen.e eVar, bBR bbr) {
        if (C8632dsu.c(eVar, ControllerScreen.e.u.b)) {
            bbr.j().d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.ControllerSheetPresenterKt$handleOverlayEvents$1
                @Override // o.drM
                /* renamed from: e */
                public final C1294Wd invoke(C1294Wd c1294Wd) {
                    C1294Wd c;
                    C8632dsu.c((Object) c1294Wd, "");
                    c = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : true, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                    return c;
                }
            });
        } else if (C8632dsu.c(eVar, ControllerScreen.e.f.b)) {
            bbr.j().d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.ControllerSheetPresenterKt$handleOverlayEvents$2
                @Override // o.drM
                /* renamed from: d */
                public final C1294Wd invoke(C1294Wd c1294Wd) {
                    C1294Wd c;
                    C8632dsu.c((Object) c1294Wd, "");
                    c = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                    return c;
                }
            });
        } else if (C8632dsu.c(eVar, ControllerScreen.e.v.c)) {
            bbr.a().d();
            bbr.j().d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.ControllerSheetPresenterKt$handleOverlayEvents$3
                @Override // o.drM
                /* renamed from: c */
                public final C1294Wd invoke(C1294Wd c1294Wd) {
                    C1294Wd c;
                    C8632dsu.c((Object) c1294Wd, "");
                    c = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : true, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                    return c;
                }
            });
        } else if (C8632dsu.c(eVar, ControllerScreen.e.j.e)) {
            bbr.j().d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.ControllerSheetPresenterKt$handleOverlayEvents$4
                @Override // o.drM
                /* renamed from: b */
                public final C1294Wd invoke(C1294Wd c1294Wd) {
                    C1294Wd c;
                    C8632dsu.c((Object) c1294Wd, "");
                    c = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                    return c;
                }
            });
        } else if (C8632dsu.c(eVar, ControllerScreen.e.A.d)) {
            bbr.j().d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.ControllerSheetPresenterKt$handleOverlayEvents$5
                @Override // o.drM
                /* renamed from: b */
                public final C1294Wd invoke(C1294Wd c1294Wd) {
                    C1294Wd c;
                    C8632dsu.c((Object) c1294Wd, "");
                    c = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : true, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                    return c;
                }
            });
        } else if (C8632dsu.c(eVar, ControllerScreen.e.n.e)) {
            bbr.j().d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.ControllerSheetPresenterKt$handleOverlayEvents$6
                @Override // o.drM
                /* renamed from: a */
                public final C1294Wd invoke(C1294Wd c1294Wd) {
                    C1294Wd c;
                    C8632dsu.c((Object) c1294Wd, "");
                    c = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                    return c;
                }
            });
        } else if (C8632dsu.c(eVar, ControllerScreen.e.z.d)) {
            bbr.a().f();
            bbr.j().d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.ControllerSheetPresenterKt$handleOverlayEvents$7
                @Override // o.drM
                /* renamed from: a */
                public final C1294Wd invoke(C1294Wd c1294Wd) {
                    C1294Wd c;
                    C8632dsu.c((Object) c1294Wd, "");
                    c = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : true, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                    return c;
                }
            });
        } else if (C8632dsu.c(eVar, ControllerScreen.e.k.b)) {
            bbr.j().d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.ControllerSheetPresenterKt$handleOverlayEvents$8
                @Override // o.drM
                /* renamed from: a */
                public final C1294Wd invoke(C1294Wd c1294Wd) {
                    C1294Wd c2;
                    C8632dsu.c((Object) c1294Wd, "");
                    c2 = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                    return c2;
                }
            });
        }
    }

    private static final void d(bBR bbr, ControllerScreen.e eVar) {
        if (C8632dsu.c(eVar, ControllerScreen.e.C0058e.e)) {
            b(bbr, CommanderState.b);
        } else if (C8632dsu.c(eVar, ControllerScreen.e.C0715a.a)) {
            b(bbr, CommanderState.d);
        } else if (C8632dsu.c(eVar, ControllerScreen.e.h.a)) {
            b(bbr, CommanderState.a);
        } else if (C8632dsu.c(eVar, ControllerScreen.e.l.d)) {
            bbr.j().d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.presenter.ControllerSheetPresenterKt$handleControllerUiEvents$1
                @Override // o.drM
                /* renamed from: a */
                public final C1294Wd invoke(C1294Wd c1294Wd) {
                    C1294Wd c;
                    C8632dsu.c((Object) c1294Wd, "");
                    c = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                    return c;
                }
            });
        }
    }

    private static final void b(bBR bbr, CommanderState commanderState) {
        bbr.c().a();
        bbr.j().a(commanderState);
    }

    private static final void e(bBR bbr) {
        int i = b.a[bbr.j().d().m().ordinal()];
        boolean z = true;
        if (i == 1 || i == 2) {
            z = false;
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        bbr.b().c(z);
    }

    private static final ControllerScreen.c e(State<? extends ControllerScreen.c> state) {
        return state.getValue();
    }
}
