package o;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.zip.JSONzip;
import kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;
import o.C8632dsu;
import o.C8657dts;
import o.LT;
import o.dpR;

/* loaded from: classes3.dex */
public final class LT {
    private static final float e = androidx.compose.ui.unit.Dp.m2492constructorimpl(4);
    private static final float c = androidx.compose.ui.unit.Dp.m2492constructorimpl(8);

    public static final void b(final Modifier modifier, final drX<? super Composer, ? super Integer, dpR> drx, final InterfaceC8612dsa<? super Modifier, ? super Composer, ? super Integer, dpR> interfaceC8612dsa, final drX<? super Composer, ? super Integer, dpR> drx2, final drX<? super Composer, ? super Integer, dpR> drx3, final drX<? super Composer, ? super Integer, dpR> drx4, final drX<? super Composer, ? super Integer, dpR> drx5, final drX<? super Composer, ? super Integer, dpR> drx6, final boolean z, final float f, final drM<? super Size, dpR> drm, final drX<? super Composer, ? super Integer, dpR> drx7, final drX<? super Composer, ? super Integer, dpR> drx8, final PaddingValues paddingValues, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        float f2;
        float c2;
        float c3;
        C8632dsu.c((Object) modifier, "");
        C8632dsu.c((Object) drx, "");
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) drx7, "");
        C8632dsu.c((Object) paddingValues, "");
        Composer startRestartGroup = composer.startRestartGroup(792811399);
        if ((i & 14) == 0) {
            i3 = i | (startRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(drx) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(interfaceC8612dsa) ? JSONzip.end : 128;
        }
        if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changedInstance(drx2) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(drx3) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(drx4) ? 131072 : AleCryptoBouncyCastle.MAX_RANDOM_BYTES;
        }
        if ((3670016 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(drx5) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(drx6) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i3 |= startRestartGroup.changed(z) ? 67108864 : 33554432;
        }
        if ((1879048192 & i) == 0) {
            i3 |= startRestartGroup.changed(f) ? 536870912 : 268435456;
        }
        int i6 = i3;
        if ((i2 & 14) == 0) {
            i4 = i2 | (startRestartGroup.changedInstance(drm) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(drx7) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i4 |= startRestartGroup.changedInstance(drx8) ? JSONzip.end : 128;
        }
        if ((i2 & 7168) == 0) {
            paddingValues2 = paddingValues;
            i4 |= startRestartGroup.changed(paddingValues2) ? 2048 : 1024;
        } else {
            paddingValues2 = paddingValues;
        }
        int i7 = i4;
        if ((i6 & 1533916891) != 306783378 || (i7 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(792811399, i6, i7, "com.netflix.hawkins.internal.material3.OutlinedTextFieldLayout (OutlinedTextField.kt:526)");
            }
            startRestartGroup.startReplaceableGroup(183597798);
            boolean z2 = (i7 & 14) == 4;
            boolean z3 = (234881024 & i6) == 67108864;
            boolean z4 = (1879048192 & i6) == 536870912;
            boolean z5 = (i7 & 7168) == 2048;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if ((z2 | z3 | z4 | z5) || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new LV(drm, z, f, paddingValues2);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            LV lv = (LV) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            drO<ComposeUiNode> constructor = companion.getConstructor();
            InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
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
            Updater.m1013setimpl(m1009constructorimpl, lv, companion.getSetMeasurePolicy());
            Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            drx7.invoke(startRestartGroup, Integer.valueOf((i7 >> 3) & 14));
            startRestartGroup.startReplaceableGroup(868504207);
            if (drx3 != null) {
                Modifier then = LayoutIdKt.layoutId(Modifier.Companion, "Leading").then(C1033Ma.a());
                Alignment center = Alignment.Companion.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                drO<ComposeUiNode> constructor2 = companion.getConstructor();
                InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(then);
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
                Updater.m1013setimpl(m1009constructorimpl2, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m1013setimpl(m1009constructorimpl2, currentCompositionLocalMap2, companion.getSetResolvedCompositionLocals());
                drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash2 = companion.getSetCompositeKeyHash();
                if (m1009constructorimpl2.getInserting() || !C8632dsu.c(m1009constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m1009constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m1009constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                drx3.invoke(startRestartGroup, Integer.valueOf((i6 >> 12) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(868504542);
            if (drx4 != null) {
                Modifier then2 = LayoutIdKt.layoutId(Modifier.Companion, "Trailing").then(C1033Ma.a());
                Alignment center2 = Alignment.Companion.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                drO<ComposeUiNode> constructor3 = companion.getConstructor();
                InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(then2);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m1009constructorimpl3 = Updater.m1009constructorimpl(startRestartGroup);
                Updater.m1013setimpl(m1009constructorimpl3, rememberBoxMeasurePolicy2, companion.getSetMeasurePolicy());
                Updater.m1013setimpl(m1009constructorimpl3, currentCompositionLocalMap3, companion.getSetResolvedCompositionLocals());
                drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash3 = companion.getSetCompositeKeyHash();
                if (m1009constructorimpl3.getInserting() || !C8632dsu.c(m1009constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m1009constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m1009constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                modifierMaterializerOf3.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                drx4.invoke(startRestartGroup, Integer.valueOf((i6 >> 15) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            float calculateStartPadding = PaddingKt.calculateStartPadding(paddingValues2, layoutDirection);
            float calculateEndPadding = PaddingKt.calculateEndPadding(paddingValues2, layoutDirection);
            if (drx3 != null) {
                i5 = 0;
                c3 = C8657dts.c(androidx.compose.ui.unit.Dp.m2492constructorimpl(calculateStartPadding - C1033Ma.b()), androidx.compose.ui.unit.Dp.m2492constructorimpl(0));
                calculateStartPadding = androidx.compose.ui.unit.Dp.m2492constructorimpl(c3);
            } else {
                i5 = 0;
            }
            if (drx4 != null) {
                c2 = C8657dts.c(androidx.compose.ui.unit.Dp.m2492constructorimpl(calculateEndPadding - C1033Ma.b()), androidx.compose.ui.unit.Dp.m2492constructorimpl(i5));
                calculateEndPadding = androidx.compose.ui.unit.Dp.m2492constructorimpl(c2);
            }
            startRestartGroup.startReplaceableGroup(868505479);
            if (drx5 != null) {
                Modifier m277paddingqDBjuR0$default = PaddingKt.m277paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m290heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "Prefix"), C1033Ma.d(), 0.0f, 2, null), null, false, 3, null), calculateStartPadding, 0.0f, C1033Ma.g(), 0.0f, 10, null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                drO<ComposeUiNode> constructor4 = companion.getConstructor();
                InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(m277paddingqDBjuR0$default);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor4);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m1009constructorimpl4 = Updater.m1009constructorimpl(startRestartGroup);
                Updater.m1013setimpl(m1009constructorimpl4, rememberBoxMeasurePolicy3, companion.getSetMeasurePolicy());
                Updater.m1013setimpl(m1009constructorimpl4, currentCompositionLocalMap4, companion.getSetResolvedCompositionLocals());
                drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash4 = companion.getSetCompositeKeyHash();
                if (m1009constructorimpl4.getInserting() || !C8632dsu.c(m1009constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m1009constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m1009constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                modifierMaterializerOf4.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                drx5.invoke(startRestartGroup, Integer.valueOf((i6 >> 18) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(868505878);
            if (drx6 != null) {
                Modifier m277paddingqDBjuR0$default2 = PaddingKt.m277paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m290heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "Suffix"), C1033Ma.d(), 0.0f, 2, null), null, false, 3, null), C1033Ma.g(), 0.0f, calculateEndPadding, 0.0f, 10, null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                drO<ComposeUiNode> constructor5 = companion.getConstructor();
                InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(m277paddingqDBjuR0$default2);
                f2 = calculateEndPadding;
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor5);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m1009constructorimpl5 = Updater.m1009constructorimpl(startRestartGroup);
                Updater.m1013setimpl(m1009constructorimpl5, rememberBoxMeasurePolicy4, companion.getSetMeasurePolicy());
                Updater.m1013setimpl(m1009constructorimpl5, currentCompositionLocalMap5, companion.getSetResolvedCompositionLocals());
                drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash5 = companion.getSetCompositeKeyHash();
                if (m1009constructorimpl5.getInserting() || !C8632dsu.c(m1009constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    m1009constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    m1009constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                modifierMaterializerOf5.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                drx6.invoke(startRestartGroup, Integer.valueOf((i6 >> 21) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            } else {
                f2 = calculateEndPadding;
            }
            startRestartGroup.endReplaceableGroup();
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.m290heightInVpY3zN4$default(companion2, C1033Ma.d(), 0.0f, 2, null), null, false, 3, null);
            if (drx5 != null) {
                calculateStartPadding = androidx.compose.ui.unit.Dp.m2492constructorimpl(0);
            }
            Modifier m277paddingqDBjuR0$default3 = PaddingKt.m277paddingqDBjuR0$default(wrapContentHeight$default, calculateStartPadding, 0.0f, drx6 == null ? f2 : androidx.compose.ui.unit.Dp.m2492constructorimpl(0), 0.0f, 10, null);
            startRestartGroup.startReplaceableGroup(868506586);
            if (interfaceC8612dsa != null) {
                interfaceC8612dsa.invoke(LayoutIdKt.layoutId(companion2, "Hint").then(m277paddingqDBjuR0$default3), startRestartGroup, Integer.valueOf((i6 >> 3) & 112));
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then3 = LayoutIdKt.layoutId(companion2, "TextField").then(m277paddingqDBjuR0$default3);
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), true, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
            drO<ComposeUiNode> constructor6 = companion.getConstructor();
            InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(then3);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor6);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1009constructorimpl6 = Updater.m1009constructorimpl(startRestartGroup);
            Updater.m1013setimpl(m1009constructorimpl6, rememberBoxMeasurePolicy5, companion.getSetMeasurePolicy());
            Updater.m1013setimpl(m1009constructorimpl6, currentCompositionLocalMap6, companion.getSetResolvedCompositionLocals());
            drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash6 = companion.getSetCompositeKeyHash();
            if (m1009constructorimpl6.getInserting() || !C8632dsu.c(m1009constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                m1009constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                m1009constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
            }
            modifierMaterializerOf6.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
            drx.invoke(startRestartGroup, Integer.valueOf((i6 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(868507049);
            if (drx2 != null) {
                Modifier layoutId = LayoutIdKt.layoutId(SizeKt.wrapContentHeight$default(SizeKt.m290heightInVpY3zN4$default(companion2, DpKt.m2504lerpMdfbLM(C1033Ma.d(), C1033Ma.c(), f), 0.0f, 2, null), null, false, 3, null), "Label");
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap7 = startRestartGroup.getCurrentCompositionLocalMap();
                drO<ComposeUiNode> constructor7 = companion.getConstructor();
                InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(layoutId);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor7);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m1009constructorimpl7 = Updater.m1009constructorimpl(startRestartGroup);
                Updater.m1013setimpl(m1009constructorimpl7, rememberBoxMeasurePolicy6, companion.getSetMeasurePolicy());
                Updater.m1013setimpl(m1009constructorimpl7, currentCompositionLocalMap7, companion.getSetResolvedCompositionLocals());
                drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash7 = companion.getSetCompositeKeyHash();
                if (m1009constructorimpl7.getInserting() || !C8632dsu.c(m1009constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                    m1009constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                    m1009constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                }
                modifierMaterializerOf7.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                drx2.invoke(startRestartGroup, Integer.valueOf((i6 >> 9) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(183601475);
            if (drx8 != null) {
                Modifier padding = PaddingKt.padding(SizeKt.wrapContentHeight$default(SizeKt.m290heightInVpY3zN4$default(LayoutIdKt.layoutId(companion2, "Supporting"), C1033Ma.e(), 0.0f, 2, null), null, false, 3, null), LY.b(LY.b, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap8 = startRestartGroup.getCurrentCompositionLocalMap();
                drO<ComposeUiNode> constructor8 = companion.getConstructor();
                InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(padding);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor8);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m1009constructorimpl8 = Updater.m1009constructorimpl(startRestartGroup);
                Updater.m1013setimpl(m1009constructorimpl8, rememberBoxMeasurePolicy7, companion.getSetMeasurePolicy());
                Updater.m1013setimpl(m1009constructorimpl8, currentCompositionLocalMap8, companion.getSetResolvedCompositionLocals());
                drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash8 = companion.getSetCompositeKeyHash();
                if (m1009constructorimpl8.getInserting() || !C8632dsu.c(m1009constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                    m1009constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                    m1009constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                }
                modifierMaterializerOf8.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                drx8.invoke(startRestartGroup, Integer.valueOf((i7 >> 6) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.hawkins.internal.material3.OutlinedTextFieldKt$OutlinedTextFieldLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void c(Composer composer2, int i8) {
                    LT.b(Modifier.this, drx, interfaceC8612dsa, drx2, drx3, drx4, drx5, drx6, z, f, drm, drx7, drx8, paddingValues, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    c(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, float f2, PaddingValues paddingValues) {
        int e2;
        int i8 = i3 + i4;
        int max = Math.max(i5 + i8, Math.max(i7 + i8, MathHelpersKt.lerp(i6, 0, f)));
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        e2 = dsT.e((i6 + (androidx.compose.ui.unit.Dp.m2492constructorimpl(paddingValues.mo249calculateLeftPaddingu2uoSUM(layoutDirection) + paddingValues.mo250calculateRightPaddingu2uoSUM(layoutDirection)) * f2)) * f);
        return Math.max(i + max + i2, Math.max(e2, Constraints.m2475getMinWidthimpl(j)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, long j, float f2, PaddingValues paddingValues) {
        int maxOf;
        int e2;
        maxOf = ComparisonsKt___ComparisonsJvmKt.maxOf(i5, i7, i3, i4, MathHelpersKt.lerp(i6, 0, f));
        float mo251calculateTopPaddingD9Ej5fM = paddingValues.mo251calculateTopPaddingD9Ej5fM() * f2;
        float lerp = MathHelpersKt.lerp(mo251calculateTopPaddingD9Ej5fM, Math.max(mo251calculateTopPaddingD9Ej5fM, i6 / 2.0f), f);
        float mo248calculateBottomPaddingD9Ej5fM = paddingValues.mo248calculateBottomPaddingD9Ej5fM();
        int m2474getMinHeightimpl = Constraints.m2474getMinHeightimpl(j);
        e2 = dsT.e(lerp + maxOf + (mo248calculateBottomPaddingD9Ej5fM * f2));
        return Math.max(m2474getMinHeightimpl, Math.max(i, Math.max(i2, e2)) + i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, float f, boolean z, float f2, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        int e2;
        int e3;
        int e4;
        Placeable.PlacementScope.m1827place70tqf50$default(placementScope, placeable8, IntOffset.Companion.m2538getZeronOccac(), 0.0f, 2, null);
        int c2 = i - C1033Ma.c(placeable9);
        e2 = dsT.e(paddingValues.mo251calculateTopPaddingD9Ej5fM() * f2);
        e3 = dsT.e(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * f2);
        float b = C1033Ma.b();
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.Companion.getCenterVertically().align(placeable.getHeight(), c2), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i2 - placeable2.getWidth(), Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), c2), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            int lerp = MathHelpersKt.lerp(z ? Alignment.Companion.getCenterVertically().align(placeable6.getHeight(), c2) : e2, -(placeable6.getHeight() / 2), f);
            e4 = dsT.e(placeable == null ? 0.0f : (C1033Ma.b(placeable) - (b * f2)) * (1 - f));
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, e4 + e3, lerp, 0.0f, 4, null);
        }
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, C1033Ma.b(placeable), b(z, c2, e2, placeable6, placeable3), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, (i2 - C1033Ma.b(placeable2)) - placeable4.getWidth(), b(z, c2, e2, placeable6, placeable4), 0.0f, 4, null);
        }
        int b2 = C1033Ma.b(placeable) + C1033Ma.b(placeable3);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, b2, b(z, c2, e2, placeable6, placeable5), 0.0f, 4, null);
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, b2, b(z, c2, e2, placeable6, placeable7), 0.0f, 4, null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, 0, c2, 0.0f, 4, null);
        }
    }

    private static final int b(boolean z, int i, int i2, Placeable placeable, Placeable placeable2) {
        if (z) {
            i2 = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i);
        }
        return Math.max(i2, C1033Ma.c(placeable) / 2);
    }

    public static final Modifier b(Modifier modifier, final long j, final PaddingValues paddingValues) {
        C8632dsu.c((Object) modifier, "");
        C8632dsu.c((Object) paddingValues, "");
        return DrawModifierKt.drawWithContent(modifier, new drM<ContentDrawScope, dpR>() { // from class: com.netflix.hawkins.internal.material3.OutlinedTextFieldKt$outlineCutout$1

            /* loaded from: classes3.dex */
            public final /* synthetic */ class e {
                public static final /* synthetic */ int[] c;

                static {
                    int[] iArr = new int[LayoutDirection.values().length];
                    try {
                        iArr[LayoutDirection.Rtl.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    c = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(ContentDrawScope contentDrawScope) {
                c(contentDrawScope);
                return dpR.c;
            }

            public final void c(ContentDrawScope contentDrawScope) {
                float f;
                float c2;
                float c3;
                C8632dsu.c((Object) contentDrawScope, "");
                float m1176getWidthimpl = Size.m1176getWidthimpl(j);
                if (m1176getWidthimpl > 0.0f) {
                    f = LT.e;
                    float mo193toPx0680j_4 = contentDrawScope.mo193toPx0680j_4(f);
                    float mo193toPx0680j_42 = contentDrawScope.mo193toPx0680j_4(paddingValues.mo249calculateLeftPaddingu2uoSUM(contentDrawScope.getLayoutDirection())) - mo193toPx0680j_4;
                    float f2 = 2;
                    float f3 = m1176getWidthimpl + mo193toPx0680j_42 + (mo193toPx0680j_4 * f2);
                    LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
                    int[] iArr = e.c;
                    if (iArr[layoutDirection.ordinal()] == 1) {
                        c2 = Size.m1176getWidthimpl(contentDrawScope.mo1562getSizeNHjbRc()) - f3;
                    } else {
                        c2 = C8657dts.c(mo193toPx0680j_42, 0.0f);
                    }
                    float f4 = c2;
                    if (iArr[contentDrawScope.getLayoutDirection().ordinal()] == 1) {
                        float m1176getWidthimpl2 = Size.m1176getWidthimpl(contentDrawScope.mo1562getSizeNHjbRc());
                        c3 = C8657dts.c(mo193toPx0680j_42, 0.0f);
                        f3 = m1176getWidthimpl2 - c3;
                    }
                    float f5 = f3;
                    float m1174getHeightimpl = Size.m1174getHeightimpl(j);
                    float f6 = (-m1174getHeightimpl) / f2;
                    float f7 = m1174getHeightimpl / f2;
                    int m1282getDifferencertfAjoo = ClipOp.Companion.m1282getDifferencertfAjoo();
                    DrawContext drawContext = contentDrawScope.getDrawContext();
                    long mo1538getSizeNHjbRc = drawContext.mo1538getSizeNHjbRc();
                    drawContext.getCanvas().save();
                    drawContext.getTransform().mo1541clipRectN_I0leg(f4, f6, f5, f7, m1282getDifferencertfAjoo);
                    contentDrawScope.drawContent();
                    drawContext.getCanvas().restore();
                    drawContext.mo1539setSizeuvyYCjk(mo1538getSizeNHjbRc);
                    return;
                }
                contentDrawScope.drawContent();
            }
        });
    }
}
