package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import com.netflix.hawkins.consumer.tokens.Token;
import com.netflix.mediaclient.commanderinfra.api.util.ConnectionState;
import com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen;
import java.util.ArrayList;
import java.util.List;
import o.C3589bDl;
import o.C3592bDo;
import o.C3597bDt;
import o.C3598bDu;
import o.C8566dqi;
import o.C8632dsu;
import o.VY;
import o.VZ;
import o.bBM;
import o.dpR;
import o.drM;

/* renamed from: o.bDj  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3587bDj {
    public static final C3587bDj a = new C3587bDj();
    public static drX<Composer, Integer, dpR> c = ComposableLambdaKt.composableLambdaInstance(-434724102, false, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.screens.ComposableSingletons$SlidingBottomSheetKt$lambda-1$1
        public final void d(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-434724102, i, -1, "com.netflix.mediaclient.ui.commander.impl.ui.screens.ComposableSingletons$SlidingBottomSheetKt.lambda-1.<anonymous> (SlidingBottomSheet.kt:109)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // o.drX
        public /* synthetic */ dpR invoke(Composer composer, Integer num) {
            d(composer, num.intValue());
            return dpR.c;
        }
    });
    public static drX<Composer, Integer, dpR> b = ComposableLambdaKt.composableLambdaInstance(1697370491, false, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.screens.ComposableSingletons$SlidingBottomSheetKt$lambda-2$1
        @Override // o.drX
        public /* synthetic */ dpR invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return dpR.c;
        }

        public final void a(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1697370491, i, -1, "com.netflix.mediaclient.ui.commander.impl.ui.screens.ComposableSingletons$SlidingBottomSheetKt.lambda-2.<anonymous> (SlidingBottomSheet.kt:213)");
            }
            ConnectionState connectionState = ConnectionState.e;
            composer.startReplaceableGroup(1234622899);
            ArrayList arrayList = new ArrayList(10);
            for (int i2 = 0; i2 < 10; i2++) {
                arrayList.add(new VZ(StringResources_androidKt.stringResource(bBM.c.g, composer, 0), StringResources_androidKt.stringResource(bBM.c.g, composer, 0), null, null, null, null, 60, null));
            }
            composer.endReplaceableGroup();
            C3592bDo.e(new DeviceSheetScreen.a.C0059a(connectionState, arrayList, null, null, false, false, true, false, null, null, null, null, new drM<DeviceSheetScreen.e, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.screens.ComposableSingletons$SlidingBottomSheetKt$lambda-2$1.2
                public final void d(DeviceSheetScreen.e eVar) {
                    C8632dsu.c((Object) eVar, "");
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(DeviceSheetScreen.e eVar) {
                    d(eVar);
                    return dpR.c;
                }
            }, 4012, null), StringResources_androidKt.stringResource(bBM.c.T, composer, 0), Token.Color.cU.c, Token.Typography.C0692e.e, StringResources_androidKt.stringResource(bBM.c.e, composer, 0), (Modifier) null, composer, 3456, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    public static drX<Composer, Integer, dpR> e = ComposableLambdaKt.composableLambdaInstance(-1323145918, false, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.screens.ComposableSingletons$SlidingBottomSheetKt$lambda-3$1
        @Override // o.drX
        public /* synthetic */ dpR invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return dpR.c;
        }

        public final void c(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1323145918, i, -1, "com.netflix.mediaclient.ui.commander.impl.ui.screens.ComposableSingletons$SlidingBottomSheetKt.lambda-3.<anonymous> (SlidingBottomSheet.kt:255)");
                }
                C3597bDt.d(StringResources_androidKt.stringResource(bBM.c.ar, composer, 0), new DeviceSheetScreen.a.C0059a(ConnectionState.e, null, null, null, false, false, true, false, null, null, null, null, new drM<DeviceSheetScreen.e, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.screens.ComposableSingletons$SlidingBottomSheetKt$lambda-3$1.1
                    public final void c(DeviceSheetScreen.e eVar) {
                        C8632dsu.c((Object) eVar, "");
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(DeviceSheetScreen.e eVar) {
                        c(eVar);
                        return dpR.c;
                    }
                }, 4030, null), StringResources_androidKt.stringResource(bBM.c.az, composer, 0), StringResources_androidKt.stringResource(bBM.c.f13495o, composer, 0), null, null, composer, 0, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });
    public static drX<Composer, Integer, dpR> d = ComposableLambdaKt.composableLambdaInstance(-1094736589, false, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.screens.ComposableSingletons$SlidingBottomSheetKt$lambda-4$1
        @Override // o.drX
        public /* synthetic */ dpR invoke(Composer composer, Integer num) {
            d(composer, num.intValue());
            return dpR.c;
        }

        public final void d(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1094736589, i, -1, "com.netflix.mediaclient.ui.commander.impl.ui.screens.ComposableSingletons$SlidingBottomSheetKt.lambda-4.<anonymous> (SlidingBottomSheet.kt:282)");
            }
            C3589bDl.a(new DeviceSheetScreen.a.C0059a(ConnectionState.c, null, null, null, false, false, true, false, null, null, null, null, new drM<DeviceSheetScreen.e, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.screens.ComposableSingletons$SlidingBottomSheetKt$lambda-4$1.1
                public final void e(DeviceSheetScreen.e eVar) {
                    C8632dsu.c((Object) eVar, "");
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(DeviceSheetScreen.e eVar) {
                    e(eVar);
                    return dpR.c;
                }
            }, 4030, null), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    public static drX<Composer, Integer, dpR> j = ComposableLambdaKt.composableLambdaInstance(-478591083, false, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.screens.ComposableSingletons$SlidingBottomSheetKt$lambda-5$1
        @Override // o.drX
        public /* synthetic */ dpR invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return dpR.c;
        }

        public final void c(Composer composer, int i) {
            List e2;
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-478591083, i, -1, "com.netflix.mediaclient.ui.commander.impl.ui.screens.ComposableSingletons$SlidingBottomSheetKt.lambda-5.<anonymous> (SlidingBottomSheet.kt:314)");
            }
            ConnectionState connectionState = ConnectionState.g;
            e2 = C8566dqi.e(new VY(new VZ(StringResources_androidKt.stringResource(bBM.c.g, composer, 0), StringResources_androidKt.stringResource(bBM.c.g, composer, 0), null, null, null, null, 60, null)));
            C3598bDu.e(new DeviceSheetScreen.a.C0059a(connectionState, null, null, e2, false, false, true, false, null, null, null, null, new drM<DeviceSheetScreen.e, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.screens.ComposableSingletons$SlidingBottomSheetKt$lambda-5$1.1
                public final void d(DeviceSheetScreen.e eVar) {
                    C8632dsu.c((Object) eVar, "");
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(DeviceSheetScreen.e eVar) {
                    d(eVar);
                    return dpR.c;
                }
            }, 4022, null), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    public static drX<Composer, Integer, dpR> g = ComposableLambdaKt.composableLambdaInstance(-906266674, false, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.screens.ComposableSingletons$SlidingBottomSheetKt$lambda-6$1
        @Override // o.drX
        public /* synthetic */ dpR invoke(Composer composer, Integer num) {
            d(composer, num.intValue());
            return dpR.c;
        }

        public final void d(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-906266674, i, -1, "com.netflix.mediaclient.ui.commander.impl.ui.screens.ComposableSingletons$SlidingBottomSheetKt.lambda-6.<anonymous> (SlidingBottomSheet.kt:346)");
            }
            C3598bDu.e(new DeviceSheetScreen.a.C0059a(ConnectionState.b, null, null, null, false, false, true, false, null, null, null, null, new drM<DeviceSheetScreen.e, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.screens.ComposableSingletons$SlidingBottomSheetKt$lambda-6$1.1
                public final void e(DeviceSheetScreen.e eVar) {
                    C8632dsu.c((Object) eVar, "");
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(DeviceSheetScreen.e eVar) {
                    e(eVar);
                    return dpR.c;
                }
            }, 4030, null), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final drX<Composer, Integer, dpR> e() {
        return c;
    }
}
