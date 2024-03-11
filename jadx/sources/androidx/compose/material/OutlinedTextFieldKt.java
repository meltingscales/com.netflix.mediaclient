package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.zip.JSONzip;
import o.C8632dsu;
import o.C8657dts;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;
import o.dsT;

/* loaded from: classes5.dex */
public final class OutlinedTextFieldKt {
    private static final float OutlinedTextFieldInnerPadding = Dp.m2492constructorimpl(4);
    private static final float OutlinedTextFieldTopPadding = Dp.m2492constructorimpl(8);

    public static final void OutlinedTextFieldLayout(final Modifier modifier, final drX<? super Composer, ? super Integer, dpR> drx, final InterfaceC8612dsa<? super Modifier, ? super Composer, ? super Integer, dpR> interfaceC8612dsa, final drX<? super Composer, ? super Integer, dpR> drx2, final drX<? super Composer, ? super Integer, dpR> drx3, final drX<? super Composer, ? super Integer, dpR> drx4, final boolean z, final float f, final drM<? super Size, dpR> drm, final drX<? super Composer, ? super Integer, dpR> drx5, final PaddingValues paddingValues, Composer composer, final int i, final int i2) {
        int i3;
        float c;
        float c2;
        Composer startRestartGroup = composer.startRestartGroup(-2049536174);
        int i4 = (i & 14) == 0 ? i | (startRestartGroup.changed(modifier) ? 4 : 2) : i;
        if ((i & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(drx) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i4 |= startRestartGroup.changedInstance(interfaceC8612dsa) ? JSONzip.end : 128;
        }
        if ((i & 7168) == 0) {
            i4 |= startRestartGroup.changedInstance(drx2) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(drx3) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(drx4) ? 131072 : AleCryptoBouncyCastle.MAX_RANDOM_BYTES;
        }
        if ((3670016 & i) == 0) {
            i4 |= startRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i4 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(drm) ? 67108864 : 33554432;
        }
        if ((1879048192 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(drx5) ? 536870912 : 268435456;
        }
        int i5 = i4;
        int i6 = (i2 & 14) == 0 ? i2 | (startRestartGroup.changed(paddingValues) ? 4 : 2) : i2;
        if ((i5 & 1533916891) != 306783378 || (i6 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2049536174, i5, i6, "androidx.compose.material.OutlinedTextFieldLayout (OutlinedTextField.kt:492)");
            }
            Object[] objArr = {drm, Boolean.valueOf(z), Float.valueOf(f), paddingValues};
            startRestartGroup.startReplaceableGroup(-568225417);
            int i7 = 0;
            boolean z2 = false;
            for (int i8 = 4; i7 < i8; i8 = 4) {
                z2 |= startRestartGroup.changed(objArr[i7]);
                i7++;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new OutlinedTextFieldMeasurePolicy(drm, z, f, paddingValues);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) rememberedValue;
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
            Updater.m1013setimpl(m1009constructorimpl, outlinedTextFieldMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            drx5.invoke(startRestartGroup, Integer.valueOf((i5 >> 27) & 14));
            startRestartGroup.startReplaceableGroup(1169918334);
            if (drx3 != null) {
                Modifier then = LayoutIdKt.layoutId(Modifier.Companion, "Leading").then(TextFieldImplKt.getIconDefaultSizeModifier());
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
                drx3.invoke(startRestartGroup, Integer.valueOf((i5 >> 12) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1169918619);
            if (drx4 != null) {
                Modifier then2 = LayoutIdKt.layoutId(Modifier.Companion, "Trailing").then(TextFieldImplKt.getIconDefaultSizeModifier());
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
                drx4.invoke(startRestartGroup, Integer.valueOf((i5 >> 15) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            float calculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
            float calculateEndPadding = PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
            Modifier.Companion companion2 = Modifier.Companion;
            if (drx3 != null) {
                i3 = 0;
                c2 = C8657dts.c(Dp.m2492constructorimpl(calculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m2492constructorimpl(0));
                calculateStartPadding = Dp.m2492constructorimpl(c2);
            } else {
                i3 = 0;
            }
            float f2 = calculateStartPadding;
            if (drx4 != null) {
                c = C8657dts.c(Dp.m2492constructorimpl(calculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m2492constructorimpl(i3));
                calculateEndPadding = Dp.m2492constructorimpl(c);
            }
            Modifier m277paddingqDBjuR0$default = PaddingKt.m277paddingqDBjuR0$default(companion2, f2, 0.0f, calculateEndPadding, 0.0f, 10, null);
            startRestartGroup.startReplaceableGroup(1169919630);
            if (interfaceC8612dsa != null) {
                interfaceC8612dsa.invoke(LayoutIdKt.layoutId(companion2, "Hint").then(m277paddingqDBjuR0$default), startRestartGroup, Integer.valueOf((i5 >> 3) & 112));
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then3 = LayoutIdKt.layoutId(companion2, "TextField").then(m277paddingqDBjuR0$default);
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), true, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            drO<ComposeUiNode> constructor4 = companion.getConstructor();
            InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(then3);
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
            drx.invoke(startRestartGroup, Integer.valueOf((i5 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-614207693);
            if (drx2 != null) {
                Modifier layoutId = LayoutIdKt.layoutId(companion2, "Label");
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                drO<ComposeUiNode> constructor5 = companion.getConstructor();
                InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(layoutId);
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
                drx2.invoke(startRestartGroup, Integer.valueOf((i5 >> 9) & 14));
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
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextFieldLayout$2
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

                public final void invoke(Composer composer2, int i9) {
                    OutlinedTextFieldKt.OutlinedTextFieldLayout(Modifier.this, drx, interfaceC8612dsa, drx2, drx3, drx4, z, f, drm, drx5, paddingValues, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-O3s9Psw  reason: not valid java name */
    public static final int m618calculateWidthO3s9Psw(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, PaddingValues paddingValues) {
        int e;
        int max = Math.max(i3, Math.max(MathHelpersKt.lerp(i4, 0, f), i5));
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        e = dsT.e((i4 + (Dp.m2492constructorimpl(paddingValues.mo249calculateLeftPaddingu2uoSUM(layoutDirection) + paddingValues.mo250calculateRightPaddingu2uoSUM(layoutDirection)) * f2)) * f);
        return Math.max(i + max + i2, Math.max(e, Constraints.m2475getMinWidthimpl(j)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-O3s9Psw  reason: not valid java name */
    public static final int m617calculateHeightO3s9Psw(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, PaddingValues paddingValues) {
        int e;
        int max = Math.max(i3, Math.max(i5, MathHelpersKt.lerp(i4, 0, f)));
        float mo251calculateTopPaddingD9Ej5fM = paddingValues.mo251calculateTopPaddingD9Ej5fM() * f2;
        float lerp = MathHelpersKt.lerp(mo251calculateTopPaddingD9Ej5fM, Math.max(mo251calculateTopPaddingD9Ej5fM, i4 / 2.0f), f);
        float mo248calculateBottomPaddingD9Ej5fM = paddingValues.mo248calculateBottomPaddingD9Ej5fM();
        int m2474getMinHeightimpl = Constraints.m2474getMinHeightimpl(j);
        e = dsT.e(lerp + max + (mo248calculateBottomPaddingD9Ej5fM * f2));
        return Math.max(m2474getMinHeightimpl, Math.max(i, Math.max(i2, e)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void place(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, float f, boolean z, float f2, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        int e;
        int e2;
        int e3;
        e = dsT.e(paddingValues.mo251calculateTopPaddingD9Ej5fM() * f2);
        e2 = dsT.e(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * f2);
        float horizontalIconPadding = TextFieldImplKt.getHorizontalIconPadding();
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i2 - placeable2.getWidth(), Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            int lerp = MathHelpersKt.lerp(z ? Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), i) : e, -(placeable4.getHeight() / 2), f);
            e3 = dsT.e(placeable == null ? 0.0f : (TextFieldImplKt.widthOrZero(placeable) - (horizontalIconPadding * f2)) * (1 - f));
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, e3 + e2, lerp, 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable), Math.max(z ? Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), i) : e, TextFieldImplKt.heightOrZero(placeable4) / 2), 0.0f, 4, null);
        if (placeable5 != null) {
            if (z) {
                e = Alignment.Companion.getCenterVertically().align(placeable5.getHeight(), i);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, TextFieldImplKt.widthOrZero(placeable), Math.max(e, TextFieldImplKt.heightOrZero(placeable4) / 2), 0.0f, 4, null);
        }
        Placeable.PlacementScope.m1827place70tqf50$default(placementScope, placeable6, IntOffset.Companion.m2538getZeronOccac(), 0.0f, 2, null);
    }

    /* renamed from: outlineCutout-12SF9DM  reason: not valid java name */
    public static final Modifier m619outlineCutout12SF9DM(Modifier modifier, final long j, final PaddingValues paddingValues) {
        return DrawModifierKt.drawWithContent(modifier, new drM<ContentDrawScope, dpR>() { // from class: androidx.compose.material.OutlinedTextFieldKt$outlineCutout$1

            /* loaded from: classes5.dex */
            public final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LayoutDirection.values().length];
                    try {
                        iArr[LayoutDirection.Rtl.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                float f;
                float c;
                float c2;
                float m1176getWidthimpl = Size.m1176getWidthimpl(j);
                if (m1176getWidthimpl > 0.0f) {
                    f = OutlinedTextFieldKt.OutlinedTextFieldInnerPadding;
                    float mo193toPx0680j_4 = contentDrawScope.mo193toPx0680j_4(f);
                    float mo193toPx0680j_42 = contentDrawScope.mo193toPx0680j_4(paddingValues.mo249calculateLeftPaddingu2uoSUM(contentDrawScope.getLayoutDirection())) - mo193toPx0680j_4;
                    float f2 = 2;
                    float f3 = m1176getWidthimpl + mo193toPx0680j_42 + (mo193toPx0680j_4 * f2);
                    LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
                    int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                    if (iArr[layoutDirection.ordinal()] == 1) {
                        c = Size.m1176getWidthimpl(contentDrawScope.mo1562getSizeNHjbRc()) - f3;
                    } else {
                        c = C8657dts.c(mo193toPx0680j_42, 0.0f);
                    }
                    float f4 = c;
                    if (iArr[contentDrawScope.getLayoutDirection().ordinal()] == 1) {
                        float m1176getWidthimpl2 = Size.m1176getWidthimpl(contentDrawScope.mo1562getSizeNHjbRc());
                        c2 = C8657dts.c(mo193toPx0680j_42, 0.0f);
                        f3 = m1176getWidthimpl2 - c2;
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
