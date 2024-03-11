package androidx.compose.material;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.zip.JSONzip;
import java.util.ArrayList;
import java.util.List;
import o.C8632dsu;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;
import org.linphone.core.Privacy;

/* loaded from: classes.dex */
public final class ListItemKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0169 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x018c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ListItem(androidx.compose.ui.Modifier r21, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r22, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r23, boolean r24, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r25, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r26, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ListItemKt.ListItem(androidx.compose.ui.Modifier, o.drX, o.drX, boolean, o.drX, o.drX, o.drX, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BaselinesOffsetColumn(final List<Dp> list, Modifier modifier, final drX<? super Composer, ? super Integer, dpR> drx, Composer composer, final int i, final int i2) {
        Composer startRestartGroup = composer.startRestartGroup(1631148337);
        if ((i2 & 2) != 0) {
            modifier = Modifier.Companion;
        }
        final Modifier modifier2 = modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1631148337, i, -1, "androidx.compose.material.BaselinesOffsetColumn (ListItem.kt:354)");
        }
        MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.ListItemKt$BaselinesOffsetColumn$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo9measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list2, long j) {
                int i3;
                long m2464copyZbe2FdA$default = Constraints.m2464copyZbe2FdA$default(j, 0, 0, 0, Integer.MAX_VALUE, 3, null);
                final ArrayList arrayList = new ArrayList(list2.size());
                int size = list2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList.add(list2.get(i4).mo1803measureBRTryo0(m2464copyZbe2FdA$default));
                }
                int size2 = arrayList.size();
                Integer num = 0;
                for (int i5 = 0; i5 < size2; i5++) {
                    num = Integer.valueOf(Math.max(num.intValue(), ((Placeable) arrayList.get(i5)).getWidth()));
                }
                int intValue = num.intValue();
                int size3 = arrayList.size();
                final Integer[] numArr = new Integer[size3];
                for (int i6 = 0; i6 < size3; i6++) {
                    numArr[i6] = 0;
                }
                List<Dp> list3 = list;
                int size4 = arrayList.size();
                int i7 = 0;
                for (int i8 = 0; i8 < size4; i8++) {
                    Placeable placeable = (Placeable) arrayList.get(i8);
                    if (i8 > 0) {
                        int i9 = i8 - 1;
                        i3 = ((Placeable) arrayList.get(i9)).getHeight() - ((Placeable) arrayList.get(i9)).get(AlignmentLineKt.getLastBaseline());
                    } else {
                        i3 = 0;
                    }
                    int max = Math.max(0, (measureScope.mo187roundToPx0680j_4(list3.get(i8).m2498unboximpl()) - placeable.get(AlignmentLineKt.getFirstBaseline())) - i3);
                    numArr[i8] = Integer.valueOf(max + i7);
                    i7 += max + placeable.getHeight();
                }
                return MeasureScope.layout$default(measureScope, intValue, i7, null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.material.ListItemKt$BaselinesOffsetColumn$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
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
                        List<Placeable> list4 = arrayList;
                        Integer[] numArr2 = numArr;
                        int size5 = list4.size();
                        for (int i10 = 0; i10 < size5; i10++) {
                            Placeable.PlacementScope.placeRelative$default(placementScope, list4.get(i10), 0, numArr2[i10].intValue(), 0.0f, 4, null);
                        }
                    }
                }, 4, null);
            }
        };
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        drO<ComposeUiNode> constructor = companion.getConstructor();
        InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
        int i3 = (((((i >> 6) & 14) | (i & 112)) << 9) & 7168) | 6;
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
        Updater.m1013setimpl(m1009constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        drx.invoke(startRestartGroup, Integer.valueOf((i3 >> 9) & 14));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material.ListItemKt$BaselinesOffsetColumn$2
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

                public final void invoke(Composer composer2, int i4) {
                    ListItemKt.BaselinesOffsetColumn(list, modifier2, drx, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OffsetToBaselineOrCenter-Kz89ssw  reason: not valid java name */
    public static final void m613OffsetToBaselineOrCenterKz89ssw(final float f, Modifier modifier, final drX<? super Composer, ? super Integer, dpR> drx, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1062692685);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(drx) ? JSONzip.end : 128;
        }
        if ((i3 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1062692685, i3, -1, "androidx.compose.material.OffsetToBaselineOrCenter (ListItem.kt:396)");
            }
            startRestartGroup.startReplaceableGroup(-670195426);
            boolean changed = startRestartGroup.changed(f);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo9measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                        int max;
                        final int m2534getYimpl;
                        final Placeable mo1803measureBRTryo0 = list.get(0).mo1803measureBRTryo0(Constraints.m2464copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                        int i5 = mo1803measureBRTryo0.get(AlignmentLineKt.getFirstBaseline());
                        if (i5 != Integer.MIN_VALUE) {
                            m2534getYimpl = measureScope.mo187roundToPx0680j_4(f) - i5;
                            max = Math.max(Constraints.m2474getMinHeightimpl(j), mo1803measureBRTryo0.getHeight() + m2534getYimpl);
                        } else {
                            max = Math.max(Constraints.m2474getMinHeightimpl(j), mo1803measureBRTryo0.getHeight());
                            m2534getYimpl = IntOffset.m2534getYimpl(Alignment.Companion.getCenter().mo1056alignKFBX0sM(IntSize.Companion.m2551getZeroYbymL2g(), IntSizeKt.IntSize(0, max - mo1803measureBRTryo0.getHeight()), measureScope.getLayoutDirection()));
                        }
                        return MeasureScope.layout$default(measureScope, mo1803measureBRTryo0.getWidth(), max, null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$1$1.1
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
                                Placeable.PlacementScope.placeRelative$default(placementScope, Placeable.this, 0, m2534getYimpl, 0.0f, 4, null);
                            }
                        }, 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            drO<ComposeUiNode> constructor = companion.getConstructor();
            InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
            int i5 = ((((i3 & 112) | ((i3 >> 6) & 14)) << 9) & 7168) | 6;
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
            Updater.m1013setimpl(m1009constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            drx.invoke(startRestartGroup, Integer.valueOf((i5 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$2
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

                public final void invoke(Composer composer2, int i6) {
                    ListItemKt.m613OffsetToBaselineOrCenterKz89ssw(f, modifier2, drx, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    private static final drX<Composer, Integer, dpR> applyTextStyle(final TextStyle textStyle, final float f, final drX<? super Composer, ? super Integer, dpR> drx) {
        if (drx == null) {
            return null;
        }
        final LineHeightStyle lineHeightStyle = new LineHeightStyle(LineHeightStyle.Alignment.Companion.m2399getProportionalPIaL0Z0(), LineHeightStyle.Trim.Companion.m2408getBothEVpEnUU(), null);
        return ComposableLambdaKt.composableLambdaInstance(-830176860, true, new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material.ListItemKt$applyTextStyle$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return dpR.c;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-830176860, i, -1, "androidx.compose.material.applyTextStyle.<anonymous> (ListItem.kt:430)");
                    }
                    ProvidedValue<Float> provides = ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(f));
                    final TextStyle textStyle2 = textStyle;
                    final LineHeightStyle lineHeightStyle2 = lineHeightStyle;
                    final drX<Composer, Integer, dpR> drx2 = drx;
                    CompositionLocalKt.CompositionLocalProvider(provides, ComposableLambdaKt.composableLambda(composer, 1665877604, true, new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material.ListItemKt$applyTextStyle$1.1
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

                        public final void invoke(Composer composer2, int i2) {
                            TextStyle m2166copyp1EtxEg;
                            if ((i2 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1665877604, i2, -1, "androidx.compose.material.applyTextStyle.<anonymous>.<anonymous> (ListItem.kt:431)");
                            }
                            m2166copyp1EtxEg = r5.m2166copyp1EtxEg((r48 & 1) != 0 ? r5.spanStyle.m2131getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r5.spanStyle.m2132getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? r5.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r5.spanStyle.m2133getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r5.spanStyle.m2134getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r5.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r5.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r5.spanStyle.m2135getLetterSpacingXSAIIZE() : 0L, (r48 & JSONzip.end) != 0 ? r5.spanStyle.m2130getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r5.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r5.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r5.spanStyle.m2129getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r5.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r5.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r5.spanStyle.getDrawStyle() : null, (r48 & Privacy.DEFAULT) != 0 ? r5.paragraphStyle.m2097getTextAligne0LSkKk() : 0, (r48 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? r5.paragraphStyle.m2098getTextDirections_7Xco() : 0, (r48 & 131072) != 0 ? r5.paragraphStyle.m2096getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r5.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r5.platformStyle : null, (r48 & 1048576) != 0 ? r5.paragraphStyle.getLineHeightStyle() : lineHeightStyle2, (r48 & 2097152) != 0 ? r5.paragraphStyle.m2095getLineBreakrAG3T2k() : 0, (r48 & 4194304) != 0 ? r5.paragraphStyle.m2094getHyphensvmbZdU8() : 0, (r48 & 8388608) != 0 ? TextStyle.this.paragraphStyle.getTextMotion() : null);
                            TextKt.ProvideTextStyle(m2166copyp1EtxEg, drx2, composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        });
    }
}
