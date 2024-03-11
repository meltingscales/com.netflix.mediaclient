package androidx.compose.ui.layout;

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
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import com.netflix.android.org.json.zip.JSONzip;
import o.C8632dsu;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes.dex */
public final class LayoutKt {
    public static final InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf(final Modifier modifier) {
        return ComposableLambdaKt.composableLambdaInstance(-1586257396, true, new InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR>() { // from class: androidx.compose.ui.layout.LayoutKt$materializerOf$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ dpR invoke(SkippableUpdater<ComposeUiNode> skippableUpdater, Composer composer, Integer num) {
                m1815invokeDeg8D_g(skippableUpdater.m1008unboximpl(), composer, num.intValue());
                return dpR.c;
            }

            /* renamed from: invoke-Deg8D_g  reason: not valid java name */
            public final void m1815invokeDeg8D_g(Composer composer, Composer composer2, int i) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1586257396, i, -1, "androidx.compose.ui.layout.materializerOf.<anonymous> (Layout.kt:203)");
                }
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, Modifier.this);
                composer.startReplaceableGroup(509942095);
                Composer m1009constructorimpl = Updater.m1009constructorimpl(composer);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                Updater.m1013setimpl(m1009constructorimpl, materializeModifier, companion.getSetModifier());
                drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public static final InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> materializerOf(final Modifier modifier) {
        return ComposableLambdaKt.composableLambdaInstance(-55743822, true, new InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR>() { // from class: androidx.compose.ui.layout.LayoutKt$materializerOfWithCompositionLocalInjection$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ dpR invoke(SkippableUpdater<ComposeUiNode> skippableUpdater, Composer composer, Integer num) {
                m1816invokeDeg8D_g(skippableUpdater.m1008unboximpl(), composer, num.intValue());
                return dpR.c;
            }

            /* renamed from: invoke-Deg8D_g  reason: not valid java name */
            public final void m1816invokeDeg8D_g(Composer composer, Composer composer2, int i) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-55743822, i, -1, "androidx.compose.ui.layout.materializerOfWithCompositionLocalInjection.<anonymous> (Layout.kt:226)");
                }
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                Modifier materializeWithCompositionLocalInjectionInternal = ComposedModifierKt.materializeWithCompositionLocalInjectionInternal(composer2, Modifier.this);
                composer.startReplaceableGroup(509942095);
                Composer m1009constructorimpl = Updater.m1009constructorimpl(composer);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                Updater.m1013setimpl(m1009constructorimpl, materializeWithCompositionLocalInjectionInternal, companion.getSetModifier());
                drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public static final void MultiMeasureLayout(Modifier modifier, final drX<? super Composer, ? super Integer, dpR> drx, final MeasurePolicy measurePolicy, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(1949933075);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(drx) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(measurePolicy) ? JSONzip.end : 128;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1949933075, i3, -1, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:246)");
            }
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            drO<LayoutNode> constructor$ui_release = LayoutNode.Companion.getConstructor$ui_release();
            startRestartGroup.startReplaceableGroup(-692256719);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor$ui_release);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1009constructorimpl = Updater.m1009constructorimpl(startRestartGroup);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Updater.m1013setimpl(m1009constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Updater.m1012initimpl(m1009constructorimpl, new drM<LayoutNode, dpR>() { // from class: androidx.compose.ui.layout.LayoutKt$MultiMeasureLayout$1$1
                @Override // o.drM
                public /* bridge */ /* synthetic */ dpR invoke(LayoutNode layoutNode) {
                    invoke2(layoutNode);
                    return dpR.c;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(LayoutNode layoutNode) {
                    layoutNode.setCanMultiMeasure$ui_release(true);
                }
            });
            Updater.m1013setimpl(m1009constructorimpl, materializeModifier, companion.getSetModifier());
            drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            drx.invoke(startRestartGroup, Integer.valueOf(((((i3 << 3) & 896) | 6) >> 6) & 14));
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.ui.layout.LayoutKt$MultiMeasureLayout$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i5) {
                    LayoutKt.MultiMeasureLayout(Modifier.this, drx, measurePolicy, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }
}
