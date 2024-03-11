package o;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.util.Base64;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.material.TextFieldKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavGraphBuilderKt;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import com.airbnb.android.showkase.models.ShowkaseCategory;
import com.airbnb.android.showkase.models.ShowkaseCurrentScreen;
import com.netflix.android.org.json.zip.JSONzip;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import o.A;
import o.C;
import o.C8632dsu;
import o.D;
import o.F;
import o.InterfaceC8612dsa;
import o.J;
import o.N;
import o.O;
import o.P;
import o.Q;
import o.R;
import o.S;
import o.T;
import o.U;
import o.V;
import o.Y;
import o.dpR;
import o.drO;
import o.drX;
import org.linphone.core.Privacy;

/* loaded from: classes5.dex */
public final class P {
    private static int a = 0;
    private static int c = 1;
    private static final float e;
    private static byte e$ss2$192;

    static void b() {
        e$ss2$192 = (byte) 24;
    }

    @SuppressLint({"UnusedMaterialScaffoldPaddingParameter"})
    public static final void b(final Map<String, ? extends List<C>> map, final Map<String, ? extends List<A>> map2, final Map<String, ? extends List<F>> map3, final MutableState<D> mutableState, Composer composer, final int i) {
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) map2, "");
        C8632dsu.c((Object) map3, "");
        C8632dsu.c((Object) mutableState, "");
        Composer startRestartGroup = composer.startRestartGroup(-2126429196);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2126429196, i, -1, "com.airbnb.android.showkase.ui.ShowkaseBrowserApp (ShowkaseBrowserApp.kt:67)");
        }
        Configuration configuration = new Configuration((Configuration) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration()));
        configuration.uiMode = 16;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new d(lifecycleOwner);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{AndroidCompositionLocals_androidKt.getLocalConfiguration().provides(configuration), InspectionModeKt.getLocalInspectionMode().provides(Boolean.TRUE), LocalOnBackPressedDispatcherOwner.INSTANCE.provides((d) rememberedValue)}, ComposableLambdaKt.composableLambda(startRestartGroup, -291100876, true, new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseBrowserApp$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                e(composer2, num.intValue());
                return dpR.c;
            }

            public final void e(Composer composer2, int i2) {
                if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-291100876, i2, -1, "com.airbnb.android.showkase.ui.ShowkaseBrowserApp.<anonymous> (ShowkaseBrowserApp.kt:90)");
                    }
                    final NavHostController rememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], composer2, 8);
                    final MutableState<D> mutableState2 = mutableState;
                    final int i3 = i;
                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, 1795087183, true, new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseBrowserApp$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // o.drX
                        public /* synthetic */ dpR invoke(Composer composer3, Integer num) {
                            a(composer3, num.intValue());
                            return dpR.c;
                        }

                        public final void a(Composer composer3, int i4) {
                            if ((i4 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1795087183, i4, -1, "com.airbnb.android.showkase.ui.ShowkaseBrowserApp.<anonymous>.<anonymous> (ShowkaseBrowserApp.kt:94)");
                            }
                            P.b(NavHostController.this, mutableState2, composer3, ((i3 >> 6) & 112) | 8);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    final Map<String, List<C>> map4 = map;
                    final Map<String, List<A>> map5 = map2;
                    final Map<String, List<F>> map6 = map3;
                    final MutableState<D> mutableState3 = mutableState;
                    final int i4 = i;
                    ScaffoldKt.m628Scaffold27mzLpw(null, null, composableLambda, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composer2, 1649952694, true, new InterfaceC8612dsa<PaddingValues, Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseBrowserApp$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // o.InterfaceC8612dsa
                        public /* synthetic */ dpR invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            e(paddingValues, composer3, num.intValue());
                            return dpR.c;
                        }

                        public final void e(PaddingValues paddingValues, Composer composer3, int i5) {
                            C8632dsu.c((Object) paddingValues, "");
                            if ((i5 & 81) != 16 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1649952694, i5, -1, "com.airbnb.android.showkase.ui.ShowkaseBrowserApp.<anonymous>.<anonymous> (ShowkaseBrowserApp.kt:97)");
                                }
                                Modifier m110backgroundbw27NRU$default = BackgroundKt.m110backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), N.d(), null, 2, null);
                                NavHostController navHostController = NavHostController.this;
                                Map<String, List<C>> map7 = map4;
                                Map<String, List<A>> map8 = map5;
                                Map<String, List<F>> map9 = map6;
                                MutableState<D> mutableState4 = mutableState3;
                                int i6 = i4;
                                composer3.startReplaceableGroup(-483455358);
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer3, 0);
                                composer3.startReplaceableGroup(-1323940314);
                                Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                                drO<ComposeUiNode> constructor = companion.getConstructor();
                                InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> materializerOf = LayoutKt.materializerOf(m110backgroundbw27NRU$default);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                Composer m1009constructorimpl = Updater.m1009constructorimpl(composer3);
                                Updater.m1013setimpl(m1009constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m1013setimpl(m1009constructorimpl, density, companion.getSetDensity());
                                Updater.m1013setimpl(m1009constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                Updater.m1013setimpl(m1009constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                composer3.enableReusing();
                                materializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(-1163856341);
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                P.a(navHostController, map7, map8, map9, mutableState4, composer3, ((i6 << 3) & 57344) | 4680);
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 100663680, 12582912, 130811);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseBrowserApp$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void c(Composer composer2, int i2) {
                P.b(map, map2, map3, mutableState, composer2, i | 1);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                c(composer2, num.intValue());
                return dpR.c;
            }
        });
    }

    /* loaded from: classes5.dex */
    public static final class d implements OnBackPressedDispatcherOwner {
        final /* synthetic */ LifecycleOwner b;

        d(LifecycleOwner lifecycleOwner) {
            this.b = lifecycleOwner;
        }

        @Override // androidx.lifecycle.LifecycleOwner
        public Lifecycle getLifecycle() {
            Lifecycle lifecycle = this.b.getLifecycle();
            C8632dsu.a(lifecycle, "");
            return lifecycle;
        }

        @Override // androidx.activity.OnBackPressedDispatcherOwner
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return new OnBackPressedDispatcher();
        }
    }

    public static final void b(final NavHostController navHostController, final MutableState<D> mutableState, Composer composer, final int i) {
        Modifier m1347graphicsLayerpANQ8Wg;
        NavDestination destination;
        C8632dsu.c((Object) navHostController, "");
        C8632dsu.c((Object) mutableState, "");
        Composer startRestartGroup = composer.startRestartGroup(990989688);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(990989688, i, -1, "com.airbnb.android.showkase.ui.ShowkaseAppBar (ShowkaseBrowserApp.kt:117)");
        }
        NavBackStackEntry c2 = c(NavHostControllerKt.currentBackStackEntryAsState(navHostController, startRestartGroup, 8));
        String route = (c2 == null || (destination = c2.getDestination()) == null) ? null : destination.getRoute();
        Modifier.Companion companion = Modifier.Companion;
        m1347graphicsLayerpANQ8Wg = GraphicsLayerModifierKt.m1347graphicsLayerpANQ8Wg(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), (r39 & 1) != 0 ? 1.0f : 0.0f, (r39 & 2) != 0 ? 1.0f : 0.0f, (r39 & 4) == 0 ? 0.0f : 1.0f, (r39 & 8) != 0 ? 0.0f : 0.0f, (r39 & 16) != 0 ? 0.0f : 0.0f, (r39 & 32) != 0 ? 0.0f : 4.0f, (r39 & 64) != 0 ? 0.0f : 0.0f, (r39 & 128) != 0 ? 0.0f : 0.0f, (r39 & JSONzip.end) == 0 ? 0.0f : 0.0f, (r39 & 512) != 0 ? 8.0f : 0.0f, (r39 & 1024) != 0 ? TransformOrigin.Companion.m1480getCenterSzJe1aQ() : 0L, (r39 & 2048) != 0 ? RectangleShapeKt.getRectangleShape() : null, (r39 & 4096) != 0 ? false : false, (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : 0L, (r39 & Privacy.DEFAULT) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : 0L);
        Modifier m273padding3ABfNKs = PaddingKt.m273padding3ABfNKs(m1347graphicsLayerpANQ8Wg, M.a());
        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
        startRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        drO<ComposeUiNode> constructor = companion2.getConstructor();
        InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> materializerOf = LayoutKt.materializerOf(m273padding3ABfNKs);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        startRestartGroup.disableReusing();
        Composer m1009constructorimpl = Updater.m1009constructorimpl(startRestartGroup);
        Updater.m1013setimpl(m1009constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m1013setimpl(m1009constructorimpl, density, companion2.getSetDensity());
        Updater.m1013setimpl(m1009constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
        Updater.m1013setimpl(m1009constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-678309503);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        boolean h = mutableState.getValue().h();
        String c3 = mutableState.getValue().c();
        String b = mutableState.getValue().b();
        String a2 = mutableState.getValue().a();
        String e2 = mutableState.getValue().e();
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed = startRestartGroup.changed(mutableState);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new drM<String, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseAppBar$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(String str) {
                    a(str);
                    return dpR.c;
                }

                public final void a(String str) {
                    C8632dsu.c((Object) str, "");
                    MutableState<D> mutableState2 = mutableState;
                    mutableState2.setValue(D.e(mutableState2.getValue(), null, null, null, null, false, str, 31, null));
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        drM drm = (drM) rememberedValue;
        Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 0.75f);
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed2 = startRestartGroup.changed(mutableState);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new drO<dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseAppBar$1$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    e();
                    return dpR.c;
                }

                public final void e() {
                    MutableState<D> mutableState2 = mutableState;
                    mutableState2.setValue(D.e(mutableState2.getValue(), null, null, null, null, false, null, 47, null));
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        drO dro = (drO) rememberedValue2;
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed3 = startRestartGroup.changed(mutableState);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = new drO<dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseAppBar$1$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    e();
                    return dpR.c;
                }

                public final void e() {
                    MutableState<D> mutableState2 = mutableState;
                    mutableState2.setValue(D.e(mutableState2.getValue(), null, null, null, null, false, "", 31, null));
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceableGroup();
        b(h, c3, b, a2, route, e2, drm, fillMaxWidth, dro, (drO) rememberedValue3, startRestartGroup, 12582912, 0);
        a(mutableState, route, SizeKt.fillMaxWidth(companion, 0.25f), startRestartGroup, ((i >> 3) & 14) | 384, 0);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseAppBar$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void c(Composer composer2, int i2) {
                P.b(NavHostController.this, mutableState, composer2, i | 1);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                c(composer2, num.intValue());
                return dpR.c;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final boolean r23, final java.lang.String r24, final java.lang.String r25, final java.lang.String r26, final java.lang.String r27, final java.lang.String r28, final o.drM<? super java.lang.String, o.dpR> r29, androidx.compose.ui.Modifier r30, final o.drO<o.dpR> r31, final o.drO<o.dpR> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.P.b(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, o.drM, androidx.compose.ui.Modifier, o.drO, o.drO, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01de, code lost:
        if (r18 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01e4, code lost:
        if (r18 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01e6, code lost:
        r7 = "currentGroup";
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e9, code lost:
        r7 = r18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final androidx.compose.ui.Modifier r16, final java.lang.String r17, final java.lang.String r18, final java.lang.String r19, final java.lang.String r20, androidx.compose.runtime.Composer r21, final int r22) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.P.c(androidx.compose.ui.Modifier, java.lang.String, java.lang.String, java.lang.String, java.lang.String, androidx.compose.runtime.Composer, int):void");
    }

    public static final void a(final String str, final Modifier modifier, Composer composer, final int i) {
        int i2;
        Composer composer2;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) modifier, "");
        Composer startRestartGroup = composer.startRestartGroup(437228438);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(437228438, i3, -1, "com.airbnb.android.showkase.ui.ToolbarTitle (ShowkaseBrowserApp.kt:266)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            final MutableState mutableState = (MutableState) rememberedValue;
            Modifier m275paddingVpY3zN4$default = PaddingKt.m275paddingVpY3zN4$default(Modifier.Companion, 0.0f, e, 1, null);
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(mutableState);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new drM<SemanticsPropertyReceiver, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ToolbarTitle$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        a(semanticsPropertyReceiver);
                        return dpR.c;
                    }

                    public final void a(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        C8632dsu.c((Object) semanticsPropertyReceiver, "");
                        Q.d.e(semanticsPropertyReceiver, mutableState.getValue().intValue());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then = modifier.then(SemanticsModifierKt.semantics$default(m275paddingVpY3zN4$default, false, (drM) rememberedValue2, 1, null));
            TextStyle textStyle = new TextStyle(0L, TextUnitKt.getSp(20), FontWeight.Companion.getBold(), null, null, FontFamily.Companion.getMonospace(), null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262105, null);
            int m2458getEllipsisgIe3tQ8 = TextOverflow.Companion.m2458getEllipsisgIe3tQ8();
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed2 = startRestartGroup.changed(mutableState);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new drM<TextLayoutResult, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ToolbarTitle$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(TextLayoutResult textLayoutResult) {
                        a(textLayoutResult);
                        return dpR.c;
                    }

                    public final void a(TextLayoutResult textLayoutResult) {
                        C8632dsu.c((Object) textLayoutResult, "");
                        mutableState.setValue(Integer.valueOf(textLayoutResult.getLineCount()));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            TextKt.m698TextfLXpl1I(str, then, 0L, 0L, null, null, null, 0L, null, null, 0L, m2458getEllipsisgIe3tQ8, false, 3, (drM) rememberedValue3, textStyle, composer2, i3 & 14, 3120, 6140);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ToolbarTitle$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void d(Composer composer3, int i4) {
                P.a(str, modifier, composer3, i | 1);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer3, Integer num) {
                d(composer3, num.intValue());
                return dpR.c;
            }
        });
    }

    public static final void e(final String str, final drM<? super String, dpR> drm, final drO<dpR> dro, final drO<dpR> dro2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) dro2, "");
        Composer startRestartGroup = composer.startRestartGroup(-1908680628);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(drm) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(dro) ? JSONzip.end : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(dro2) ? 2048 : 1024;
        }
        final int i3 = i2;
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1908680628, i3, -1, "com.airbnb.android.showkase.ui.ShowkaseSearchField (ShowkaseBrowserApp.kt:295)");
            }
            String str2 = str == null ? "" : str;
            composer2 = startRestartGroup;
            String str3 = str2;
            TextFieldKt.TextField(str3, drm, SizeKt.fillMaxWidth$default(TestTagKt.testTag(Modifier.Companion, "SearchTextField"), 0.0f, 1, null), false, false, new TextStyle(Color.Companion.m1303getBlack0d7_KjU(), TextUnitKt.getSp(18), FontWeight.Companion.getW500(), null, null, FontFamily.Companion.getDefault(), null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262104, null), J.d.a(), null, ComposableLambdaKt.composableLambda(startRestartGroup, 2000616166, true, new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseSearchField$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer3, Integer num) {
                    a(composer3, num.intValue());
                    return dpR.c;
                }

                public final void a(Composer composer3, int i4) {
                    if ((i4 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2000616166, i4, -1, "com.airbnb.android.showkase.ui.ShowkaseSearchField.<anonymous> (ShowkaseBrowserApp.kt:317)");
                        }
                        IconButtonKt.IconButton(dro, TestTagKt.testTag(Modifier.Companion, "close_search_bar_tag"), false, null, J.d.e(), composer3, ((i3 >> 6) & 14) | 24624, 12);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), ComposableLambdaKt.composableLambda(startRestartGroup, -2125207355, true, new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseSearchField$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer3, Integer num) {
                    e(composer3, num.intValue());
                    return dpR.c;
                }

                public final void e(Composer composer3, int i4) {
                    if ((i4 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2125207355, i4, -1, "com.airbnb.android.showkase.ui.ShowkaseSearchField.<anonymous> (ShowkaseBrowserApp.kt:326)");
                        }
                        drO<dpR> dro3 = dro2;
                        Modifier testTag = TestTagKt.testTag(Modifier.Companion, "clear_search_field");
                        String str4 = str;
                        IconButtonKt.IconButton(dro3, testTag, !(str4 == null || str4.length() == 0), null, J.d.b(), composer3, ((i3 >> 9) & 14) | 24624, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), false, null, null, null, false, 0, null, null, TextFieldDefaults.INSTANCE.m682textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 48, 2097151), composer2, (i3 & 112) | 907542912, 0, 261272);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseSearchField$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void b(Composer composer3, int i4) {
                P.e(str, drm, dro, dro2, composer3, i | 1);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer3, Integer num) {
                b(composer3, num.intValue());
                return dpR.c;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final MutableState<D> mutableState, final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-532055190);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(mutableState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? JSONzip.end : 128;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-532055190, i3, -1, "com.airbnb.android.showkase.ui.ShowkaseAppBarActions (ShowkaseBrowserApp.kt:339)");
            }
            if (!mutableState.getValue().h() && !C8632dsu.c((Object) str, (Object) ShowkaseCurrentScreen.COMPONENT_DETAIL.name()) && !C8632dsu.c((Object) str, (Object) ShowkaseCurrentScreen.SHOWKASE_CATEGORIES.name())) {
                Modifier testTag = TestTagKt.testTag(modifier, "SearchIcon");
                startRestartGroup.startReplaceableGroup(1157296644);
                boolean changed = startRestartGroup.changed(mutableState);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new drO<dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseAppBarActions$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // o.drO
                        public /* synthetic */ dpR invoke() {
                            a();
                            return dpR.c;
                        }

                        public final void a() {
                            MutableState<D> mutableState2 = mutableState;
                            mutableState2.setValue(D.e(mutableState2.getValue(), null, null, null, null, true, null, 47, null));
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                IconButtonKt.IconButton((drO) rememberedValue, testTag, false, null, J.d.d(), startRestartGroup, 24576, 12);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseAppBarActions$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void c(Composer composer2, int i5) {
                P.a(mutableState, str, modifier2, composer2, i | 1, i2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                c(composer2, num.intValue());
                return dpR.c;
            }
        });
    }

    public static final void a(final NavHostController navHostController, final Map<String, ? extends List<C>> map, final Map<String, ? extends List<A>> map2, final Map<String, ? extends List<F>> map3, final MutableState<D> mutableState, Composer composer, final int i) {
        C8632dsu.c((Object) navHostController, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) map2, "");
        C8632dsu.c((Object) map3, "");
        C8632dsu.c((Object) mutableState, "");
        Composer startRestartGroup = composer.startRestartGroup(-1969216089);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1969216089, i, -1, "com.airbnb.android.showkase.ui.ShowkaseBodyContent (ShowkaseBrowserApp.kt:365)");
        }
        NavHostKt.NavHost(navHostController, ShowkaseCurrentScreen.SHOWKASE_CATEGORIES.name(), null, null, new drM<NavGraphBuilder, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseBodyContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(NavGraphBuilder navGraphBuilder) {
                a(navGraphBuilder);
                return dpR.c;
            }

            public final void a(NavGraphBuilder navGraphBuilder) {
                C8632dsu.c((Object) navGraphBuilder, "");
                String name = ShowkaseCurrentScreen.SHOWKASE_CATEGORIES.name();
                final MutableState<D> mutableState2 = mutableState;
                final NavHostController navHostController2 = navHostController;
                final Map<String, List<C>> map4 = map;
                final Map<String, List<A>> map5 = map2;
                final Map<String, List<F>> map6 = map3;
                final int i2 = i;
                NavGraphBuilderKt.composable$default(navGraphBuilder, name, null, null, ComposableLambdaKt.composableLambdaInstance(-557136510, true, new InterfaceC8612dsa<NavBackStackEntry, Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseBodyContent$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // o.InterfaceC8612dsa
                    public /* synthetic */ dpR invoke(NavBackStackEntry navBackStackEntry, Composer composer2, Integer num) {
                        c(navBackStackEntry, composer2, num.intValue());
                        return dpR.c;
                    }

                    public final void c(NavBackStackEntry navBackStackEntry, Composer composer2, int i3) {
                        Map d2;
                        C8632dsu.c((Object) navBackStackEntry, "");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-557136510, i3, -1, "com.airbnb.android.showkase.ui.ShowkaseBodyContent.<anonymous>.<anonymous> (ShowkaseBrowserApp.kt:376)");
                        }
                        MutableState<D> mutableState3 = mutableState2;
                        NavHostController navHostController3 = navHostController2;
                        d2 = P.d(map4, map5, map6);
                        S.a(mutableState3, navHostController3, d2, composer2, ((i2 >> 12) & 14) | 576);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 6, null);
                String name2 = ShowkaseCurrentScreen.COMPONENT_GROUPS.name();
                final Map<String, List<C>> map7 = map;
                final MutableState<D> mutableState3 = mutableState;
                final NavHostController navHostController3 = navHostController;
                final int i3 = i;
                NavGraphBuilderKt.composable$default(navGraphBuilder, name2, null, null, ComposableLambdaKt.composableLambdaInstance(298829547, true, new InterfaceC8612dsa<NavBackStackEntry, Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseBodyContent$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // o.InterfaceC8612dsa
                    public /* synthetic */ dpR invoke(NavBackStackEntry navBackStackEntry, Composer composer2, Integer num) {
                        b(navBackStackEntry, composer2, num.intValue());
                        return dpR.c;
                    }

                    public final void b(NavBackStackEntry navBackStackEntry, Composer composer2, int i4) {
                        C8632dsu.c((Object) navBackStackEntry, "");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(298829547, i4, -1, "com.airbnb.android.showkase.ui.ShowkaseBodyContent.<anonymous>.<anonymous> (ShowkaseBrowserApp.kt:387)");
                        }
                        V.d(map7, mutableState3, navHostController3, composer2, ((i3 >> 9) & 112) | 520);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 6, null);
                String name3 = ShowkaseCurrentScreen.COMPONENTS_IN_A_GROUP.name();
                final Map<String, List<C>> map8 = map;
                final MutableState<D> mutableState4 = mutableState;
                final NavHostController navHostController4 = navHostController;
                final int i4 = i;
                NavGraphBuilderKt.composable$default(navGraphBuilder, name3, null, null, ComposableLambdaKt.composableLambdaInstance(542366410, true, new InterfaceC8612dsa<NavBackStackEntry, Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseBodyContent$1.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // o.InterfaceC8612dsa
                    public /* synthetic */ dpR invoke(NavBackStackEntry navBackStackEntry, Composer composer2, Integer num) {
                        b(navBackStackEntry, composer2, num.intValue());
                        return dpR.c;
                    }

                    public final void b(NavBackStackEntry navBackStackEntry, Composer composer2, int i5) {
                        C8632dsu.c((Object) navBackStackEntry, "");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(542366410, i5, -1, "com.airbnb.android.showkase.ui.ShowkaseBodyContent.<anonymous>.<anonymous> (ShowkaseBrowserApp.kt:394)");
                        }
                        U.c(map8, mutableState4, navHostController4, composer2, ((i4 >> 9) & 112) | 520);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 6, null);
                String name4 = ShowkaseCurrentScreen.COMPONENT_STYLES.name();
                final Map<String, List<C>> map9 = map;
                final MutableState<D> mutableState5 = mutableState;
                final NavHostController navHostController5 = navHostController;
                final int i5 = i;
                NavGraphBuilderKt.composable$default(navGraphBuilder, name4, null, null, ComposableLambdaKt.composableLambdaInstance(785903273, true, new InterfaceC8612dsa<NavBackStackEntry, Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseBodyContent$1.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // o.InterfaceC8612dsa
                    public /* synthetic */ dpR invoke(NavBackStackEntry navBackStackEntry, Composer composer2, Integer num) {
                        e(navBackStackEntry, composer2, num.intValue());
                        return dpR.c;
                    }

                    public final void e(NavBackStackEntry navBackStackEntry, Composer composer2, int i6) {
                        C8632dsu.c((Object) navBackStackEntry, "");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(785903273, i6, -1, "com.airbnb.android.showkase.ui.ShowkaseBodyContent.<anonymous>.<anonymous> (ShowkaseBrowserApp.kt:401)");
                        }
                        T.b(map9, mutableState5, navHostController5, composer2, ((i5 >> 9) & 112) | 520);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 6, null);
                String name5 = ShowkaseCurrentScreen.COMPONENT_DETAIL.name();
                final Map<String, List<C>> map10 = map;
                final MutableState<D> mutableState6 = mutableState;
                final NavHostController navHostController6 = navHostController;
                final int i6 = i;
                NavGraphBuilderKt.composable$default(navGraphBuilder, name5, null, null, ComposableLambdaKt.composableLambdaInstance(1029440136, true, new InterfaceC8612dsa<NavBackStackEntry, Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseBodyContent$1.5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // o.InterfaceC8612dsa
                    public /* synthetic */ dpR invoke(NavBackStackEntry navBackStackEntry, Composer composer2, Integer num) {
                        b(navBackStackEntry, composer2, num.intValue());
                        return dpR.c;
                    }

                    public final void b(NavBackStackEntry navBackStackEntry, Composer composer2, int i7) {
                        C8632dsu.c((Object) navBackStackEntry, "");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1029440136, i7, -1, "com.airbnb.android.showkase.ui.ShowkaseBodyContent.<anonymous>.<anonymous> (ShowkaseBrowserApp.kt:408)");
                        }
                        R.a(map10, mutableState6, navHostController6, composer2, ((i6 >> 9) & 112) | 520);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 6, null);
                String name6 = ShowkaseCurrentScreen.COLOR_GROUPS.name();
                final Map<String, List<A>> map11 = map2;
                final MutableState<D> mutableState7 = mutableState;
                final NavHostController navHostController7 = navHostController;
                final int i7 = i;
                NavGraphBuilderKt.composable$default(navGraphBuilder, name6, null, null, ComposableLambdaKt.composableLambdaInstance(1272976999, true, new InterfaceC8612dsa<NavBackStackEntry, Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseBodyContent$1.6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // o.InterfaceC8612dsa
                    public /* synthetic */ dpR invoke(NavBackStackEntry navBackStackEntry, Composer composer2, Integer num) {
                        d(navBackStackEntry, composer2, num.intValue());
                        return dpR.c;
                    }

                    public final void d(NavBackStackEntry navBackStackEntry, Composer composer2, int i8) {
                        C8632dsu.c((Object) navBackStackEntry, "");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1272976999, i8, -1, "com.airbnb.android.showkase.ui.ShowkaseBodyContent.<anonymous>.<anonymous> (ShowkaseBrowserApp.kt:415)");
                        }
                        V.b(map11, mutableState7, navHostController7, composer2, ((i7 >> 9) & 112) | 520);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 6, null);
                String name7 = ShowkaseCurrentScreen.COLORS_IN_A_GROUP.name();
                final Map<String, List<A>> map12 = map2;
                final MutableState<D> mutableState8 = mutableState;
                final NavHostController navHostController8 = navHostController;
                final int i8 = i;
                NavGraphBuilderKt.composable$default(navGraphBuilder, name7, null, null, ComposableLambdaKt.composableLambdaInstance(1516513862, true, new InterfaceC8612dsa<NavBackStackEntry, Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseBodyContent$1.7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // o.InterfaceC8612dsa
                    public /* synthetic */ dpR invoke(NavBackStackEntry navBackStackEntry, Composer composer2, Integer num) {
                        a(navBackStackEntry, composer2, num.intValue());
                        return dpR.c;
                    }

                    public final void a(NavBackStackEntry navBackStackEntry, Composer composer2, int i9) {
                        C8632dsu.c((Object) navBackStackEntry, "");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1516513862, i9, -1, "com.airbnb.android.showkase.ui.ShowkaseBodyContent.<anonymous>.<anonymous> (ShowkaseBrowserApp.kt:422)");
                        }
                        O.e(map12, mutableState8, navHostController8, composer2, ((i8 >> 9) & 112) | 520);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 6, null);
                String name8 = ShowkaseCurrentScreen.TYPOGRAPHY_GROUPS.name();
                final Map<String, List<F>> map13 = map3;
                final MutableState<D> mutableState9 = mutableState;
                final NavHostController navHostController9 = navHostController;
                final int i9 = i;
                NavGraphBuilderKt.composable$default(navGraphBuilder, name8, null, null, ComposableLambdaKt.composableLambdaInstance(1760050725, true, new InterfaceC8612dsa<NavBackStackEntry, Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseBodyContent$1.8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // o.InterfaceC8612dsa
                    public /* synthetic */ dpR invoke(NavBackStackEntry navBackStackEntry, Composer composer2, Integer num) {
                        c(navBackStackEntry, composer2, num.intValue());
                        return dpR.c;
                    }

                    public final void c(NavBackStackEntry navBackStackEntry, Composer composer2, int i10) {
                        C8632dsu.c((Object) navBackStackEntry, "");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1760050725, i10, -1, "com.airbnb.android.showkase.ui.ShowkaseBodyContent.<anonymous>.<anonymous> (ShowkaseBrowserApp.kt:429)");
                        }
                        V.e(map13, mutableState9, navHostController9, composer2, ((i9 >> 9) & 112) | 520);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 6, null);
                String name9 = ShowkaseCurrentScreen.TYPOGRAPHY_IN_A_GROUP.name();
                final Map<String, List<F>> map14 = map3;
                final MutableState<D> mutableState10 = mutableState;
                final NavHostController navHostController10 = navHostController;
                final int i10 = i;
                NavGraphBuilderKt.composable$default(navGraphBuilder, name9, null, null, ComposableLambdaKt.composableLambdaInstance(2003587588, true, new InterfaceC8612dsa<NavBackStackEntry, Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseBodyContent$1.9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // o.InterfaceC8612dsa
                    public /* synthetic */ dpR invoke(NavBackStackEntry navBackStackEntry, Composer composer2, Integer num) {
                        a(navBackStackEntry, composer2, num.intValue());
                        return dpR.c;
                    }

                    public final void a(NavBackStackEntry navBackStackEntry, Composer composer2, int i11) {
                        C8632dsu.c((Object) navBackStackEntry, "");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2003587588, i11, -1, "com.airbnb.android.showkase.ui.ShowkaseBodyContent.<anonymous>.<anonymous> (ShowkaseBrowserApp.kt:436)");
                        }
                        Y.c(map14, mutableState10, navHostController10, composer2, ((i10 >> 9) & 112) | 520);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 6, null);
            }
        }, startRestartGroup, 8, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ShowkaseBrowserAppKt$ShowkaseBodyContent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void d(Composer composer2, int i2) {
                P.a(NavHostController.this, map, map2, map3, mutableState, composer2, i | 1);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                d(composer2, num.intValue());
                return dpR.c;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<ShowkaseCategory, Integer> d(Map<String, ? extends List<C>> map, Map<String, ? extends List<A>> map2, Map<String, ? extends List<F>> map3) {
        Map<ShowkaseCategory, Integer> c2;
        c2 = dqE.c(dpD.a(ShowkaseCategory.COMPONENTS, Integer.valueOf(e(map))), dpD.a(ShowkaseCategory.COLORS, Integer.valueOf(a(map2))), dpD.a(ShowkaseCategory.TYPOGRAPHY, Integer.valueOf(a(map3))));
        return c2;
    }

    public static final void e(NavHostController navHostController, ShowkaseCurrentScreen showkaseCurrentScreen) {
        C8632dsu.c((Object) navHostController, "");
        C8632dsu.c((Object) showkaseCurrentScreen, "");
        NavController.navigate$default(navHostController, showkaseCurrentScreen.name(), null, null, 6, null);
    }

    private static final int a(Map<String, ? extends List<?>> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends List<?>> entry : map.entrySet()) {
            C8571dqn.b(arrayList, entry.getValue());
        }
        return arrayList.size();
    }

    private static final int e(Map<String, ? extends List<C>> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends List<C>> entry : map.entrySet()) {
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : entry.getValue()) {
                C c2 = (C) obj;
                String d2 = c2.d();
                String e2 = c2.e();
                if (hashSet.add(d2 + "_" + e2)) {
                    arrayList2.add(obj);
                }
            }
            C8571dqn.b(arrayList, arrayList2);
        }
        return arrayList.size();
    }

    private static final NavBackStackEntry c(State<NavBackStackEntry> state) {
        return state.getValue();
    }

    static {
        b();
        e = androidx.compose.ui.unit.Dp.m2492constructorimpl(16);
    }

    private static void f(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$192);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
