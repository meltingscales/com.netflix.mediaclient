package o;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupProperties;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.commanderinfra.api.util.CommanderState;
import com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen;
import com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen;
import com.slack.circuit.runtime.screen.Screen;
import dagger.hilt.android.scopes.ActivityScoped;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import o.C1025Ls;
import o.C1294Wd;
import o.C1572aGg;
import o.C3562bCl;
import o.C8632dsu;
import o.InterfaceC1570aGe;
import o.InterfaceC1571aGf;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC9877yK;
import o.VJ;
import o.VK;
import o.bBF;
import o.bBM;
import o.dmA;
import o.dmE;
import o.dmG;
import o.dmH;
import o.dmN;
import o.dmQ;
import o.dmR;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;
import o.duO;
import o.duT;

@ActivityScoped
/* loaded from: classes4.dex */
public final class bBF implements InterfaceC3549bBz {
    public static final int a;
    public static final d e;
    private static byte e$ss2$2110 = 0;
    private static int h = 0;
    private static int k = 1;
    private final dmH b;
    private final VE c;
    private final ComponentActivity d;
    private final VL f;
    private final VK g;
    private final VJ i;
    private final InterfaceC1570aGe j;

    static {
        e();
        e = new d(null);
        a = 8;
    }

    static void e() {
        e$ss2$2110 = (byte) 24;
    }

    @Inject
    public bBF(Activity activity, InterfaceC1570aGe interfaceC1570aGe, VE ve, VK vk, VL vl, VJ vj) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) interfaceC1570aGe, "");
        C8632dsu.c((Object) ve, "");
        C8632dsu.c((Object) vk, "");
        C8632dsu.c((Object) vl, "");
        C8632dsu.c((Object) vj, "");
        this.j = interfaceC1570aGe;
        this.c = ve;
        this.g = vk;
        this.f = vl;
        this.i = vj;
        this.d = (ComponentActivity) C9737vz.e(activity, ComponentActivity.class);
        this.b = new dmH.d().e(new bBE(ve, vk, vl, vj)).d(new bBH()).c();
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("CommanderUiImpl");
        }
    }

    @Override // o.InterfaceC3549bBz
    public Pair<Integer, Integer> d() {
        return new Pair<>(Integer.valueOf(HawkinsIcon.C0393jx.c.i()), Integer.valueOf(HawkinsIcon.C0392jw.d.i()));
    }

    @Override // o.InterfaceC3549bBz
    public void e(final boolean z) {
        Map d2;
        Map k2;
        Throwable th;
        if (!C8054ddD.l(this.d)) {
            this.i.e().d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.CommanderUiImpl$showController$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: b */
                public final C1294Wd invoke(C1294Wd c1294Wd) {
                    C1294Wd c;
                    C8632dsu.c((Object) c1294Wd, "");
                    c = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : z, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                    return c;
                }
            });
            c(ControllerScreen.c);
            return;
        }
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        d2 = dqE.d();
        k2 = dqE.k(d2);
        C1596aHd c1596aHd = new C1596aHd("SPY-38439: controller sheet could not be added as activity was already destroyed", null, null, false, k2, false, false, 96, null);
        ErrorType errorType = c1596aHd.a;
        if (errorType != null) {
            c1596aHd.e.put("errorType", errorType.c());
            String b = c1596aHd.b();
            if (b != null) {
                String c = errorType.c();
                c1596aHd.a(c + " " + b);
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

    @Override // o.InterfaceC3549bBz
    public void a(final boolean z, final boolean z2) {
        Map d2;
        Map k2;
        Throwable th;
        if (!C8054ddD.l(this.d)) {
            this.i.e().d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.CommanderUiImpl$showDeviceSheet$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: d */
                public final C1294Wd invoke(C1294Wd c1294Wd) {
                    C1294Wd c;
                    C8632dsu.c((Object) c1294Wd, "");
                    c = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : true, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : z2, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : z, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                    return c;
                }
            });
            c(DeviceSheetScreen.e);
            return;
        }
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        d2 = dqE.d();
        k2 = dqE.k(d2);
        C1596aHd c1596aHd = new C1596aHd("SPY-38439: device sheet could not be added as activity was already destroyed", null, null, false, k2, false, false, 96, null);
        ErrorType errorType = c1596aHd.a;
        if (errorType != null) {
            c1596aHd.e.put("errorType", errorType.c());
            String b = c1596aHd.b();
            if (b != null) {
                String c = errorType.c();
                c1596aHd.a(c + " " + b);
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

    @Override // o.InterfaceC3549bBz
    public void b(String str) {
        C8632dsu.c((Object) str, "");
        this.c.b().e(str);
        this.i.e().d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.CommanderUiImpl$startPlaybackOnTargetDevice$1
            @Override // o.drM
            /* renamed from: c */
            public final C1294Wd invoke(C1294Wd c1294Wd) {
                C1294Wd c;
                C8632dsu.c((Object) c1294Wd, "");
                c = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : CommanderState.a, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                return c;
            }
        });
    }

    @Override // o.InterfaceC3549bBz
    public String b() {
        String string;
        int i = 2 % 2;
        int i2 = h + 29;
        k = i2 % 128;
        int i3 = i2 % 2;
        if (this.f.b().f()) {
            string = this.d.getResources().getString(bBM.c.ax);
            if (string.startsWith("'!#+")) {
                int i4 = h + 5;
                k = i4 % 128;
                if (i4 % 2 == 0) {
                    String substring = string.substring(4);
                    Object[] objArr = new Object[1];
                    l(substring, objArr);
                    ((String) objArr[0]).intern();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                String substring2 = string.substring(4);
                Object[] objArr2 = new Object[1];
                l(substring2, objArr2);
                string = ((String) objArr2[0]).intern();
            }
            C8632dsu.d((Object) string);
        } else {
            string = this.d.getResources().getString(bBM.c.X);
            if (string.startsWith("'!#+")) {
                int i5 = h + 19;
                k = i5 % 128;
                int i6 = i5 % 2;
                String substring3 = string.substring(4);
                Object[] objArr3 = new Object[1];
                l(substring3, objArr3);
                string = ((String) objArr3[0]).intern();
            }
            C8632dsu.d((Object) string);
        }
        return string;
    }

    @Override // o.InterfaceC3549bBz
    public boolean c() {
        return this.c.c().a();
    }

    @Override // o.InterfaceC3549bBz
    public boolean a(String str, String str2) {
        return this.c.c().e(str, str2);
    }

    @Override // o.InterfaceC3549bBz
    public boolean a() {
        return this.i.e().d().h();
    }

    @Override // o.InterfaceC3549bBz
    public void b(C9872yF c9872yF, View view) {
        C8632dsu.c((Object) c9872yF, "");
        C8632dsu.c((Object) view, "");
        if (a()) {
            this.i.e().d(new drM<C1294Wd, C1294Wd>() { // from class: com.netflix.mediaclient.ui.commander.impl.CommanderUiImpl$showManualPairingTooltip$1
                @Override // o.drM
                /* renamed from: d */
                public final C1294Wd invoke(C1294Wd c1294Wd) {
                    C1294Wd c2;
                    C8632dsu.c((Object) c1294Wd, "");
                    c2 = c1294Wd.c((r28 & 1) != 0 ? c1294Wd.c : false, (r28 & 2) != 0 ? c1294Wd.l : null, (r28 & 4) != 0 ? c1294Wd.d : false, (r28 & 8) != 0 ? c1294Wd.a : false, (r28 & 16) != 0 ? c1294Wd.g : false, (r28 & 32) != 0 ? c1294Wd.h : false, (r28 & 64) != 0 ? c1294Wd.e : null, (r28 & 128) != 0 ? c1294Wd.b : false, (r28 & JSONzip.end) != 0 ? c1294Wd.j : false, (r28 & 512) != 0 ? c1294Wd.i : false, (r28 & 1024) != 0 ? c1294Wd.n : false, (r28 & 2048) != 0 ? c1294Wd.m : false, (r28 & 4096) != 0 ? c1294Wd.f : false);
                    return c2;
                }
            });
            if (this.i.e().d().b()) {
                return;
            }
            if (view.isLaidOut()) {
                a(c9872yF, view);
            } else {
                view.getViewTreeObserver().addOnGlobalLayoutListener(new e(view, this, c9872yF));
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ View b;
        final /* synthetic */ bBF d;
        final /* synthetic */ C9872yF e;

        e(View view, bBF bbf, C9872yF c9872yF) {
            this.b = view;
            this.d = bbf;
            this.e = c9872yF;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.d.a(this.e, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C9872yF c9872yF, View view) {
        Theme theme = Theme.a;
        C1025Ls.b.e eVar = C1025Ls.b.e.b;
        float m2492constructorimpl = androidx.compose.ui.unit.Dp.m2492constructorimpl(4);
        float m2492constructorimpl2 = androidx.compose.ui.unit.Dp.m2492constructorimpl(0);
        C9876yJ.c(c9872yF, view, (r22 & 2) != 0 ? Modifier.Companion : null, (r22 & 4) != 0 ? null : new C1025Ls.c(theme, m2492constructorimpl, 0.0f, 0.0f, androidx.compose.ui.unit.Dp.m2492constructorimpl(10), androidx.compose.ui.unit.Dp.m2492constructorimpl(16), eVar, m2492constructorimpl2, duI.e(duI.d.e("PT5S")), 0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.Dp.m2492constructorimpl(22), 3596, null), (r22 & 8) != 0 ? new PopupProperties(true, false, false, null, false, false, 62, null) : null, (r22 & 16) != 0, (r22 & 32) != 0 ? null : new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.CommanderUiImpl$showTooltip$1
            public final void a(boolean z) {
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Boolean bool) {
                a(bool.booleanValue());
                return dpR.c;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1101010170, true, new InterfaceC8613dsb<BoxScope, InterfaceC9877yK, Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.CommanderUiImpl$showTooltip$2
            {
                super(4);
            }

            @Override // o.InterfaceC8613dsb
            public /* synthetic */ dpR invoke(BoxScope boxScope, InterfaceC9877yK interfaceC9877yK, Composer composer, Integer num) {
                e(boxScope, interfaceC9877yK, composer, num.intValue());
                return dpR.c;
            }

            public final void e(BoxScope boxScope, InterfaceC9877yK interfaceC9877yK, Composer composer, int i) {
                VJ vj;
                C8632dsu.c((Object) boxScope, "");
                C8632dsu.c((Object) interfaceC9877yK, "");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1101010170, i, -1, "com.netflix.mediaclient.ui.commander.impl.CommanderUiImpl.showTooltip.<anonymous> (CommanderUiImpl.kt:196)");
                }
                final bBF bbf = bBF.this;
                drO<dpR> dro = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.CommanderUiImpl$showTooltip$2.1
                    {
                        super(0);
                    }

                    @Override // o.drO
                    public /* synthetic */ dpR invoke() {
                        c();
                        return dpR.c;
                    }

                    public final void c() {
                        VK vk;
                        vk = bBF.this.g;
                        vk.a().j();
                    }
                };
                vj = bBF.this.i;
                C3562bCl.a(dro, null, vj.e().c(), composer, 0, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    private final void c(final Screen screen) {
        ViewGroup viewGroup = (ViewGroup) this.d.findViewById(16908290);
        if (viewGroup.findViewById(bBM.d.d) == null) {
            ComposeView composeView = new ComposeView(this.d, null, 0, 6, null);
            composeView.setId(bBM.d.d);
            composeView.setViewCompositionStrategy(new ViewCompositionStrategy.DisposeOnLifecycleDestroyed(this.d));
            ViewTreeLifecycleOwner.set(composeView, this.d);
            ViewTreeViewModelStoreOwner.set(composeView, this.d);
            ViewTreeSavedStateRegistryOwner.set(composeView, this.d);
            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(707333451, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.CommanderUiImpl$showSheet$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(Composer composer, int i) {
                    if ((i & 11) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(707333451, i, -1, "com.netflix.mediaclient.ui.commander.impl.CommanderUiImpl.showSheet.<anonymous>.<anonymous> (CommanderUiImpl.kt:215)");
                    }
                    bBF.this.a(screen, composer, 64);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return dpR.c;
                }
            }));
            CoordinatorLayout.LayoutParams layoutParams = new CoordinatorLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 80;
            C1332Xp c1332Xp = C1332Xp.b;
            composeView.setElevation((int) TypedValue.applyDimension(1, 8, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
            viewGroup.addView(composeView, layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final Screen screen, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1339063804);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1339063804, i, -1, "com.netflix.mediaclient.ui.commander.impl.CommanderUiImpl.CircuitContent (CommanderUiImpl.kt:232)");
        }
        CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr), ComposableLambdaKt.composableLambda(startRestartGroup, 958211396, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.CommanderUiImpl$CircuitContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                c(composer2, num.intValue());
                return dpR.c;
            }

            public final void c(Composer composer2, int i2) {
                InterfaceC1570aGe interfaceC1570aGe;
                if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(958211396, i2, -1, "com.netflix.mediaclient.ui.commander.impl.CommanderUiImpl.CircuitContent.<anonymous> (CommanderUiImpl.kt:236)");
                    }
                    interfaceC1570aGe = bBF.this.j;
                    InterfaceC1571aGf a2 = interfaceC1570aGe.a();
                    final bBF bbf = bBF.this;
                    final Screen screen2 = screen;
                    C1572aGg.b(a2, ComposableLambdaKt.composableLambda(composer2, 2015164757, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.CommanderUiImpl$CircuitContent$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // o.drX
                        public /* synthetic */ dpR invoke(Composer composer3, Integer num) {
                            c(composer3, num.intValue());
                            return dpR.c;
                        }

                        public final void c(Composer composer3, int i3) {
                            dmH dmh;
                            if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2015164757, i3, -1, "com.netflix.mediaclient.ui.commander.impl.CommanderUiImpl.CircuitContent.<anonymous>.<anonymous> (CommanderUiImpl.kt:237)");
                                }
                                dmh = bBF.this.b;
                                final Screen screen3 = screen2;
                                dmG.b(dmh, null, ComposableLambdaKt.composableLambda(composer3, -2019200211, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.CommanderUiImpl.CircuitContent.1.1.1
                                    {
                                        super(2);
                                    }

                                    @Override // o.drX
                                    public /* synthetic */ dpR invoke(Composer composer4, Integer num) {
                                        b(composer4, num.intValue());
                                        return dpR.c;
                                    }

                                    public final void b(Composer composer4, int i4) {
                                        if ((i4 & 11) != 2 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-2019200211, i4, -1, "com.netflix.mediaclient.ui.commander.impl.CommanderUiImpl.CircuitContent.<anonymous>.<anonymous>.<anonymous> (CommanderUiImpl.kt:238)");
                                            }
                                            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
                                            final Screen screen4 = Screen.this;
                                            dmR.c(fillMaxSize$default, null, ComposableLambdaKt.composableLambda(composer4, 394605794, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.CommanderUiImpl.CircuitContent.1.1.1.1
                                                {
                                                    super(2);
                                                }

                                                @Override // o.drX
                                                public /* synthetic */ dpR invoke(Composer composer5, Integer num) {
                                                    c(composer5, num.intValue());
                                                    return dpR.c;
                                                }

                                                public final void c(Composer composer5, int i5) {
                                                    if ((i5 & 11) != 2 || !composer5.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(394605794, i5, -1, "com.netflix.mediaclient.ui.commander.impl.CommanderUiImpl.CircuitContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommanderUiImpl.kt:239)");
                                                        }
                                                        final duT b = duO.b(Screen.this);
                                                        composer5.startReplaceableGroup(990814283);
                                                        boolean changed = composer5.changed(b);
                                                        Object rememberedValue = composer5.rememberedValue();
                                                        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                                                            rememberedValue = new drM<dmA, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.CommanderUiImpl$CircuitContent$1$1$1$1$backstack$1$1
                                                                /* JADX INFO: Access modifiers changed from: package-private */
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                /* JADX WARN: Multi-variable type inference failed */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // o.drM
                                                                public /* synthetic */ dpR invoke(dmA dma) {
                                                                    c(dma);
                                                                    return dpR.c;
                                                                }

                                                                public final void c(dmA dma) {
                                                                    C8632dsu.c((Object) dma, "");
                                                                    for (Screen screen5 : b) {
                                                                        dma.a(screen5);
                                                                    }
                                                                }
                                                            };
                                                            composer5.updateRememberedValue(rememberedValue);
                                                        }
                                                        composer5.endReplaceableGroup();
                                                        dmA a3 = dmE.a((drM) rememberedValue, composer5, 0);
                                                        dmN.e(dmQ.a(a3, false, composer5, 0, 2), a3, SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, null, null, null, composer5, 384, 120);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer5.skipToGroupEnd();
                                                }
                                            }), composer4, 390, 2);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer3, 384, 2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.CommanderUiImpl$CircuitContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(Composer composer2, int i2) {
                    bBF.this.a(screen, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    a(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    private void l(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$2110);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
