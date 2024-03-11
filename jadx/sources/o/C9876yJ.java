package o;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.window.PopupProperties;
import com.netflix.android.widgetry.utils.compose.HawkinsTooltipCompatKt$showTooltip$2;
import o.C1025Ls;
import o.C9876yJ;
import o.dpR;
import o.drM;

/* renamed from: o.yJ */
/* loaded from: classes2.dex */
public final class C9876yJ {
    public static /* synthetic */ void b(C9872yF c9872yF, View view, Modifier modifier, C1025Ls.c cVar, PopupProperties popupProperties, boolean z, drM drm, InterfaceC8613dsb interfaceC8613dsb, int i, Object obj) {
        c(c9872yF, view, (i & 2) != 0 ? Modifier.Companion : modifier, (i & 4) != 0 ? null : cVar, (i & 8) != 0 ? new PopupProperties(true, false, false, null, false, false, 62, null) : popupProperties, (i & 16) != 0 ? true : z, (i & 32) != 0 ? null : drm, interfaceC8613dsb);
    }

    public static final void c(C9872yF c9872yF, View view, Modifier modifier, C1025Ls.c cVar, PopupProperties popupProperties, boolean z, final drM<? super Boolean, dpR> drm, InterfaceC8613dsb<? super BoxScope, ? super InterfaceC9877yK, ? super Composer, ? super Integer, dpR> interfaceC8613dsb) {
        C8632dsu.c((Object) c9872yF, "");
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) modifier, "");
        C8632dsu.c((Object) popupProperties, "");
        C8632dsu.c((Object) interfaceC8613dsb, "");
        c9872yF.a(z, new drO<dpR>() { // from class: com.netflix.android.widgetry.utils.compose.HawkinsTooltipCompatKt$showTooltip$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            public final void d() {
                drM<Boolean, dpR> drm2 = drm;
                if (drm2 != null) {
                    drm2.invoke(Boolean.FALSE);
                }
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                d();
                return dpR.c;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1000863189, true, new HawkinsTooltipCompatKt$showTooltip$2(b(view), c9872yF, cVar, modifier, popupProperties, drm, interfaceC8613dsb)));
    }

    private static final Rect b(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        if (view.getLayoutDirection() == 1) {
            iArr[0] = (view.getResources().getDisplayMetrics().widthPixels - iArr[0]) - view.getWidth();
        }
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2);
    }

    public static final void a(final Rect rect, final InterfaceC8612dsa<? super BoxScope, ? super Composer, ? super Integer, dpR> interfaceC8612dsa, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1801289797);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1801289797, i, -1, "com.netflix.android.widgetry.utils.compose.TooltipAnchor (HawkinsTooltipCompat.kt:100)");
        }
        Modifier.Companion companion = Modifier.Companion;
        Modifier m110backgroundbw27NRU$default = BackgroundKt.m110backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Color.Companion.m1308getTransparent0d7_KjU(), null, 2, null);
        startRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        drO<ComposeUiNode> constructor = companion3.getConstructor();
        InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m110backgroundbw27NRU$default);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m1009constructorimpl = Updater.m1009constructorimpl(startRestartGroup);
        Updater.m1013setimpl(m1009constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        Modifier m288height3ABfNKs = SizeKt.m288height3ABfNKs(SizeKt.m300width3ABfNKs(OffsetKt.m253offsetVpY3zN4(companion, density.mo190toDpu2uoSUM(rect.left), density.mo190toDpu2uoSUM(rect.top)), density.mo190toDpu2uoSUM(rect.width())), density.mo190toDpu2uoSUM(rect.height()));
        int i2 = (i << 6) & 7168;
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        drO<ComposeUiNode> constructor2 = companion3.getConstructor();
        InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m288height3ABfNKs);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor2);
        } else {
            startRestartGroup.useNode();
        }
        Composer m1009constructorimpl2 = Updater.m1009constructorimpl(startRestartGroup);
        Updater.m1013setimpl(m1009constructorimpl2, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m1013setimpl(m1009constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (m1009constructorimpl2.getInserting() || !C8632dsu.c(m1009constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m1009constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m1009constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        interfaceC8612dsa.invoke(boxScopeInstance, startRestartGroup, Integer.valueOf(((i2 >> 6) & 112) | 6));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.android.widgetry.utils.compose.HawkinsTooltipCompatKt$TooltipAnchor$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void c(Composer composer2, int i3) {
                    C9876yJ.a(rect, interfaceC8612dsa, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    c(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }
}
