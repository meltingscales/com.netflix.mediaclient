package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import java.util.NoSuchElementException;
import o.C8576dqs;
import o.C8632dsu;
import o.C8657dts;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes5.dex */
public final class SnackbarKt {
    private static final float HorizontalSpacingButtonSide;
    private static final float TextEndExtraSpacing;
    private static final float HeightToFirstLine = Dp.m2492constructorimpl(30);
    private static final float HorizontalSpacing = Dp.m2492constructorimpl(16);
    private static final float SeparateButtonExtraY = Dp.m2492constructorimpl(2);
    private static final float SnackbarVerticalPadding = Dp.m2492constructorimpl(6);
    private static final float LongButtonVerticalOffset = Dp.m2492constructorimpl(12);
    private static final float SnackbarMinHeightOneLine = Dp.m2492constructorimpl(48);
    private static final float SnackbarMinHeightTwoLines = Dp.m2492constructorimpl(68);

    /* JADX WARN: Removed duplicated region for block: B:109:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011b  */
    /* renamed from: Snackbar-7zSek6w  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m642Snackbar7zSek6w(androidx.compose.ui.Modifier r27, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r28, boolean r29, androidx.compose.ui.graphics.Shape r30, long r31, long r33, float r35, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarKt.m642Snackbar7zSek6w(androidx.compose.ui.Modifier, o.drX, boolean, androidx.compose.ui.graphics.Shape, long, long, float, o.drX, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0120  */
    /* renamed from: Snackbar-sPrSdHI  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m643SnackbarsPrSdHI(final androidx.compose.material.SnackbarData r29, androidx.compose.ui.Modifier r30, boolean r31, androidx.compose.ui.graphics.Shape r32, long r33, long r35, long r37, float r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarKt.m643SnackbarsPrSdHI(androidx.compose.material.SnackbarData, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TextOnlySnackbar(final drX<? super Composer, ? super Integer, dpR> drx, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(917397959);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(drx) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(917397959, i2, -1, "androidx.compose.material.TextOnlySnackbar (Snackbar.kt:236)");
            }
            SnackbarKt$TextOnlySnackbar$2 snackbarKt$TextOnlySnackbar$2 = new MeasurePolicy() { // from class: androidx.compose.material.SnackbarKt$TextOnlySnackbar$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo9measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                    Object y;
                    float f;
                    if (list.size() != 1) {
                        throw new IllegalArgumentException("text for Snackbar expected to have exactly only one child".toString());
                    }
                    y = C8576dqs.y(list);
                    final Placeable mo1803measureBRTryo0 = ((Measurable) y).mo1803measureBRTryo0(j);
                    int i3 = mo1803measureBRTryo0.get(AlignmentLineKt.getFirstBaseline());
                    int i4 = mo1803measureBRTryo0.get(AlignmentLineKt.getLastBaseline());
                    if (i3 != Integer.MIN_VALUE) {
                        if (i4 == Integer.MIN_VALUE) {
                            throw new IllegalArgumentException("No baselines for text".toString());
                        }
                        if (i3 == i4) {
                            f = SnackbarKt.SnackbarMinHeightOneLine;
                        } else {
                            f = SnackbarKt.SnackbarMinHeightTwoLines;
                        }
                        final int max = Math.max(measureScope.mo187roundToPx0680j_4(f), mo1803measureBRTryo0.getHeight());
                        return MeasureScope.layout$default(measureScope, Constraints.m2473getMaxWidthimpl(j), max, null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.material.SnackbarKt$TextOnlySnackbar$2.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // o.drM
                            public /* bridge */ /* synthetic */ dpR invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return dpR.c;
                            }

                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                Placeable.PlacementScope.placeRelative$default(placementScope, mo1803measureBRTryo0, 0, (max - mo1803measureBRTryo0.getHeight()) / 2, 0.0f, 4, null);
                            }
                        }, 4, null);
                    }
                    throw new IllegalArgumentException("No baselines for text".toString());
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.Companion;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            drO<ComposeUiNode> constructor = companion2.getConstructor();
            InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
            Updater.m1013setimpl(m1009constructorimpl, snackbarKt$TextOnlySnackbar$2, companion2.getSetMeasurePolicy());
            Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            Modifier m274paddingVpY3zN4 = PaddingKt.m274paddingVpY3zN4(companion, HorizontalSpacing, SnackbarVerticalPadding);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            drO<ComposeUiNode> constructor2 = companion2.getConstructor();
            InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m274paddingVpY3zN4);
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
            Updater.m1013setimpl(m1009constructorimpl2, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1013setimpl(m1009constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (m1009constructorimpl2.getInserting() || !C8632dsu.c(m1009constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1009constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1009constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            drx.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
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
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material.SnackbarKt$TextOnlySnackbar$3
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

                public final void invoke(Composer composer2, int i3) {
                    SnackbarKt.TextOnlySnackbar(drx, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NewLineButtonSnackbar(final drX<? super Composer, ? super Integer, dpR> drx, final drX<? super Composer, ? super Integer, dpR> drx2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1229075900);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(drx) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(drx2) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1229075900, i2, -1, "androidx.compose.material.NewLineButtonSnackbar (Snackbar.kt:274)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            float f = HorizontalSpacing;
            float f2 = HorizontalSpacingButtonSide;
            Modifier m277paddingqDBjuR0$default = PaddingKt.m277paddingqDBjuR0$default(fillMaxWidth$default, f, 0.0f, f2, SeparateButtonExtraY, 2, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            drO<ComposeUiNode> constructor = companion3.getConstructor();
            InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m277paddingqDBjuR0$default);
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
            Updater.m1013setimpl(m1009constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier m277paddingqDBjuR0$default2 = PaddingKt.m277paddingqDBjuR0$default(androidx.compose.foundation.layout.AlignmentLineKt.m227paddingFromBaselineVpY3zN4(companion, HeightToFirstLine, LongButtonVerticalOffset), 0.0f, 0.0f, f2, 0.0f, 11, null);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            drO<ComposeUiNode> constructor2 = companion3.getConstructor();
            InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m277paddingqDBjuR0$default2);
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
            Updater.m1013setimpl(m1009constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1013setimpl(m1009constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1009constructorimpl2.getInserting() || !C8632dsu.c(m1009constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1009constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1009constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            drx.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Modifier align = columnScopeInstance.align(companion, companion2.getEnd());
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            drO<ComposeUiNode> constructor3 = companion3.getConstructor();
            InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(align);
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
            Updater.m1013setimpl(m1009constructorimpl3, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1013setimpl(m1009constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m1009constructorimpl3.getInserting() || !C8632dsu.c(m1009constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1009constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1009constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            drx2.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
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
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material.SnackbarKt$NewLineButtonSnackbar$2
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

                public final void invoke(Composer composer2, int i3) {
                    SnackbarKt.NewLineButtonSnackbar(drx, drx2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OneRowSnackbar(final drX<? super Composer, ? super Integer, dpR> drx, final drX<? super Composer, ? super Integer, dpR> drx2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-534813202);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(drx) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(drx2) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-534813202, i2, -1, "androidx.compose.material.OneRowSnackbar (Snackbar.kt:295)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m277paddingqDBjuR0$default = PaddingKt.m277paddingqDBjuR0$default(companion, HorizontalSpacing, 0.0f, HorizontalSpacingButtonSide, 0.0f, 10, null);
            startRestartGroup.startReplaceableGroup(-749985289);
            boolean changed = startRestartGroup.changed(SignupConstants.Error.DEBUG_INFO_ACTION);
            boolean changed2 = startRestartGroup.changed("text");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changed | changed2) || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material.SnackbarKt$OneRowSnackbar$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo9measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                        float f;
                        int b;
                        float f2;
                        float f3;
                        final int i3;
                        final int height;
                        int i4;
                        float f4;
                        String str = r1;
                        int size = list.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            Measurable measurable = list.get(i5);
                            if (C8632dsu.c(LayoutIdKt.getLayoutId(measurable), (Object) str)) {
                                final Placeable mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(j);
                                int m2473getMaxWidthimpl = Constraints.m2473getMaxWidthimpl(j);
                                int width = mo1803measureBRTryo0.getWidth();
                                f = SnackbarKt.TextEndExtraSpacing;
                                b = C8657dts.b((m2473getMaxWidthimpl - width) - measureScope.mo187roundToPx0680j_4(f), Constraints.m2475getMinWidthimpl(j));
                                String str2 = r2;
                                int size2 = list.size();
                                for (int i6 = 0; i6 < size2; i6++) {
                                    Measurable measurable2 = list.get(i6);
                                    if (C8632dsu.c(LayoutIdKt.getLayoutId(measurable2), (Object) str2)) {
                                        final Placeable mo1803measureBRTryo02 = measurable2.mo1803measureBRTryo0(Constraints.m2464copyZbe2FdA$default(j, 0, b, 0, 0, 9, null));
                                        int i7 = mo1803measureBRTryo02.get(AlignmentLineKt.getFirstBaseline());
                                        if (i7 == Integer.MIN_VALUE) {
                                            throw new IllegalArgumentException("No baselines for text".toString());
                                        }
                                        int i8 = mo1803measureBRTryo02.get(AlignmentLineKt.getLastBaseline());
                                        if (i8 == Integer.MIN_VALUE) {
                                            throw new IllegalArgumentException("No baselines for text".toString());
                                        }
                                        boolean z = i7 == i8;
                                        int m2473getMaxWidthimpl2 = Constraints.m2473getMaxWidthimpl(j);
                                        int width2 = mo1803measureBRTryo0.getWidth();
                                        if (z) {
                                            f4 = SnackbarKt.SnackbarMinHeightOneLine;
                                            i4 = Math.max(measureScope.mo187roundToPx0680j_4(f4), mo1803measureBRTryo0.getHeight());
                                            int height2 = (i4 - mo1803measureBRTryo02.getHeight()) / 2;
                                            int i9 = mo1803measureBRTryo0.get(AlignmentLineKt.getFirstBaseline());
                                            height = i9 != Integer.MIN_VALUE ? (i7 + height2) - i9 : 0;
                                            i3 = height2;
                                        } else {
                                            f2 = SnackbarKt.HeightToFirstLine;
                                            int mo187roundToPx0680j_4 = measureScope.mo187roundToPx0680j_4(f2) - i7;
                                            f3 = SnackbarKt.SnackbarMinHeightTwoLines;
                                            int max = Math.max(measureScope.mo187roundToPx0680j_4(f3), mo1803measureBRTryo02.getHeight() + mo187roundToPx0680j_4);
                                            i3 = mo187roundToPx0680j_4;
                                            height = (max - mo1803measureBRTryo0.getHeight()) / 2;
                                            i4 = max;
                                        }
                                        final int i10 = m2473getMaxWidthimpl2 - width2;
                                        return MeasureScope.layout$default(measureScope, Constraints.m2473getMaxWidthimpl(j), i4, null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.material.SnackbarKt$OneRowSnackbar$2$1.4
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // o.drM
                                            public /* bridge */ /* synthetic */ dpR invoke(Placeable.PlacementScope placementScope) {
                                                invoke2(placementScope);
                                                return dpR.c;
                                            }

                                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                                Placeable.PlacementScope.placeRelative$default(placementScope, Placeable.this, 0, i3, 0.0f, 4, null);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, mo1803measureBRTryo0, i10, height, 0.0f, 4, null);
                                            }
                                        }, 4, null);
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            drO<ComposeUiNode> constructor = companion2.getConstructor();
            InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m277paddingqDBjuR0$default);
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
            Updater.m1013setimpl(m1009constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            Modifier m275paddingVpY3zN4$default = PaddingKt.m275paddingVpY3zN4$default(LayoutIdKt.layoutId(companion, "text"), 0.0f, SnackbarVerticalPadding, 1, null);
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            drO<ComposeUiNode> constructor2 = companion2.getConstructor();
            InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m275paddingVpY3zN4$default);
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
            Updater.m1013setimpl(m1009constructorimpl2, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1013setimpl(m1009constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (m1009constructorimpl2.getInserting() || !C8632dsu.c(m1009constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1009constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1009constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            drx.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Modifier layoutId = LayoutIdKt.layoutId(companion, SignupConstants.Error.DEBUG_INFO_ACTION);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            drO<ComposeUiNode> constructor3 = companion2.getConstructor();
            InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(layoutId);
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
            Updater.m1013setimpl(m1009constructorimpl3, rememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m1013setimpl(m1009constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
            drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
            if (m1009constructorimpl3.getInserting() || !C8632dsu.c(m1009constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1009constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1009constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            drx2.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
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
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material.SnackbarKt$OneRowSnackbar$3
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

                public final void invoke(Composer composer2, int i3) {
                    SnackbarKt.OneRowSnackbar(drx, drx2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    static {
        float f = 8;
        HorizontalSpacingButtonSide = Dp.m2492constructorimpl(f);
        TextEndExtraSpacing = Dp.m2492constructorimpl(f);
    }
}
