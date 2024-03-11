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
import o.LX;
import o.dpR;

/* loaded from: classes3.dex */
public final class LX {
    private static final float a = androidx.compose.ui.unit.Dp.m2492constructorimpl(8);

    public static final float a() {
        return a;
    }

    public static final void c(final Modifier modifier, final drX<? super Composer, ? super Integer, dpR> drx, final drX<? super Composer, ? super Integer, dpR> drx2, final InterfaceC8612dsa<? super Modifier, ? super Composer, ? super Integer, dpR> interfaceC8612dsa, final drX<? super Composer, ? super Integer, dpR> drx3, final drX<? super Composer, ? super Integer, dpR> drx4, final drX<? super Composer, ? super Integer, dpR> drx5, final drX<? super Composer, ? super Integer, dpR> drx6, final boolean z, final float f, final drX<? super Composer, ? super Integer, dpR> drx7, final drX<? super Composer, ? super Integer, dpR> drx8, final PaddingValues paddingValues, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        float f2;
        float c;
        float c2;
        C8632dsu.c((Object) modifier, "");
        C8632dsu.c((Object) drx, "");
        C8632dsu.c((Object) drx7, "");
        C8632dsu.c((Object) paddingValues, "");
        Composer startRestartGroup = composer.startRestartGroup(-1323046666);
        if ((i & 14) == 0) {
            i3 = i | (startRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(drx) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(drx2) ? JSONzip.end : 128;
        }
        if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changedInstance(interfaceC8612dsa) ? 2048 : 1024;
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
        if ((i & 234881024) == 0) {
            i3 |= startRestartGroup.changed(z) ? 67108864 : 33554432;
        }
        if ((i & 1879048192) == 0) {
            i3 |= startRestartGroup.changed(f) ? 536870912 : 268435456;
        }
        int i6 = i3;
        if ((i2 & 14) == 0) {
            i4 = i2 | (startRestartGroup.changedInstance(drx7) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(drx8) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            paddingValues2 = paddingValues;
            i4 |= startRestartGroup.changed(paddingValues2) ? JSONzip.end : 128;
        } else {
            paddingValues2 = paddingValues;
        }
        int i7 = i4;
        if ((i6 & 1533916891) != 306783378 || (i7 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1323046666, i6, i7, "com.netflix.hawkins.internal.material3.TextFieldLayout (TextField.kt:524)");
            }
            startRestartGroup.startReplaceableGroup(474334411);
            boolean z2 = (234881024 & i6) == 67108864;
            boolean z3 = (i6 & 1879048192) == 536870912;
            boolean z4 = (i7 & 896) == 256;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if ((z3 | z2 | z4) || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new C1034Mb(z, f, paddingValues2);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            C1034Mb c1034Mb = (C1034Mb) rememberedValue;
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
            Updater.m1013setimpl(m1009constructorimpl, c1034Mb, companion.getSetMeasurePolicy());
            Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            drx7.invoke(startRestartGroup, Integer.valueOf(i7 & 14));
            startRestartGroup.startReplaceableGroup(830722058);
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
            startRestartGroup.startReplaceableGroup(830722394);
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
                c2 = C8657dts.c(androidx.compose.ui.unit.Dp.m2492constructorimpl(calculateStartPadding - C1033Ma.b()), androidx.compose.ui.unit.Dp.m2492constructorimpl(0));
                calculateStartPadding = androidx.compose.ui.unit.Dp.m2492constructorimpl(c2);
            } else {
                i5 = 0;
            }
            if (drx4 != null) {
                c = C8657dts.c(androidx.compose.ui.unit.Dp.m2492constructorimpl(calculateEndPadding - C1033Ma.b()), androidx.compose.ui.unit.Dp.m2492constructorimpl(i5));
                calculateEndPadding = androidx.compose.ui.unit.Dp.m2492constructorimpl(c);
            }
            startRestartGroup.startReplaceableGroup(830723332);
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
            startRestartGroup.startReplaceableGroup(830723732);
            if (drx6 != null) {
                Modifier m277paddingqDBjuR0$default2 = PaddingKt.m277paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m290heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "Suffix"), C1033Ma.d(), 0.0f, 2, null), null, false, 3, null), C1033Ma.g(), 0.0f, calculateEndPadding, 0.0f, 10, null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                drO<ComposeUiNode> constructor5 = companion.getConstructor();
                InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(m277paddingqDBjuR0$default2);
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
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(830724130);
            if (drx2 != null) {
                Modifier m277paddingqDBjuR0$default3 = PaddingKt.m277paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m290heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "Label"), DpKt.m2504lerpMdfbLM(C1033Ma.d(), C1033Ma.c(), f), 0.0f, 2, null), null, false, 3, null), calculateStartPadding, 0.0f, calculateEndPadding, 0.0f, 10, null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
                drO<ComposeUiNode> constructor6 = companion.getConstructor();
                InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(m277paddingqDBjuR0$default3);
                f2 = calculateEndPadding;
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
                drx2.invoke(startRestartGroup, Integer.valueOf((i6 >> 6) & 14));
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
            Modifier m277paddingqDBjuR0$default4 = PaddingKt.m277paddingqDBjuR0$default(wrapContentHeight$default, calculateStartPadding, 0.0f, drx6 == null ? f2 : androidx.compose.ui.unit.Dp.m2492constructorimpl(0), 0.0f, 10, null);
            startRestartGroup.startReplaceableGroup(830724959);
            if (interfaceC8612dsa != null) {
                interfaceC8612dsa.invoke(LayoutIdKt.layoutId(companion2, "Hint").then(m277paddingqDBjuR0$default4), startRestartGroup, Integer.valueOf((i6 >> 6) & 112));
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then3 = LayoutIdKt.layoutId(companion2, "TextField").then(m277paddingqDBjuR0$default4);
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), true, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = startRestartGroup.getCurrentCompositionLocalMap();
            drO<ComposeUiNode> constructor7 = companion.getConstructor();
            InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(then3);
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
            BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
            drx.invoke(startRestartGroup, Integer.valueOf((i6 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(474338318);
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
                drx8.invoke(startRestartGroup, Integer.valueOf((i7 >> 3) & 14));
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
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.hawkins.internal.material3.TextFieldKt$TextFieldLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void c(Composer composer2, int i8) {
                    LX.c(Modifier.this, drx, drx2, interfaceC8612dsa, drx3, drx4, drx5, drx6, z, f, drx7, drx8, paddingValues, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    c(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    public static final int a(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        int i8 = i3 + i4;
        return Math.max(i + Math.max(i5 + i8, Math.max(i7 + i8, i6)) + i2, Constraints.m2475getMinWidthimpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, long j, float f2, PaddingValues paddingValues) {
        int maxOf;
        int e;
        boolean z = i2 > 0;
        float m2492constructorimpl = androidx.compose.ui.unit.Dp.m2492constructorimpl(paddingValues.mo251calculateTopPaddingD9Ej5fM() + paddingValues.mo248calculateBottomPaddingD9Ej5fM()) * f2;
        if (z) {
            m2492constructorimpl = MathHelpersKt.lerp(androidx.compose.ui.unit.Dp.m2492constructorimpl(C1033Ma.j() * 2) * f2, m2492constructorimpl, f);
        }
        maxOf = ComparisonsKt___ComparisonsJvmKt.maxOf(i, i7, i5, i6, MathHelpersKt.lerp(i2, 0, f));
        int m2474getMinHeightimpl = Constraints.m2474getMinHeightimpl(j);
        e = dsT.e(m2492constructorimpl + MathHelpersKt.lerp(0, i2, f) + maxOf);
        return Math.max(m2474getMinHeightimpl, Math.max(i3, Math.max(i4, e)) + i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, boolean z, int i3, int i4, float f, float f2) {
        int e;
        int e2;
        Placeable.PlacementScope.m1827place70tqf50$default(placementScope, placeable8, IntOffset.Companion.m2538getZeronOccac(), 0.0f, 2, null);
        int c = i2 - C1033Ma.c(placeable9);
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), c), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i - placeable5.getWidth(), Alignment.Companion.getCenterVertically().align(placeable5.getHeight(), c), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            if (z) {
                e = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), c);
            } else {
                e = dsT.e(C1033Ma.j() * f2);
            }
            e2 = dsT.e((e - i3) * f);
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, C1033Ma.b(placeable4), e - e2, 0.0f, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, C1033Ma.b(placeable4), i4, 0.0f, 4, null);
        }
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, (i - C1033Ma.b(placeable5)) - placeable7.getWidth(), i4, 0.0f, 4, null);
        }
        int b = C1033Ma.b(placeable4) + C1033Ma.b(placeable6);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, b, i4, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, b, i4, 0.0f, 4, null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, 0, c, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, boolean z, float f, PaddingValues paddingValues) {
        int e;
        Placeable.PlacementScope.m1827place70tqf50$default(placementScope, placeable7, IntOffset.Companion.m2538getZeronOccac(), 0.0f, 2, null);
        int c = i2 - C1033Ma.c(placeable8);
        e = dsT.e(paddingValues.mo251calculateTopPaddingD9Ej5fM() * f);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), c), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i - placeable4.getWidth(), Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), c), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, C1033Ma.b(placeable3), a(z, c, e, placeable5), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            int b = C1033Ma.b(placeable4);
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, (i - b) - placeable6.getWidth(), a(z, c, e, placeable6), 0.0f, 4, null);
        }
        int b2 = C1033Ma.b(placeable3) + C1033Ma.b(placeable5);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, b2, a(z, c, e, placeable), 0.0f, 4, null);
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, b2, a(z, c, e, placeable2), 0.0f, 4, null);
        }
        if (placeable8 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable8, 0, c, 0.0f, 4, null);
        }
    }

    private static final int a(boolean z, int i, int i2, Placeable placeable) {
        return z ? Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i) : i2;
    }
}
