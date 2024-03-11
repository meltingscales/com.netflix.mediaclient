package androidx.compose.material;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.zip.JSONzip;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8569dql;
import o.C8586drb;
import o.C8589dre;
import o.C8632dsu;
import o.C8657dts;
import o.C8737dwr;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.InterfaceC8650dtl;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;
import o.dwU;

/* loaded from: classes.dex */
public final class SliderKt {
    private static final Modifier DefaultSliderConstraints;
    private static final float SliderHeight;
    private static final float SliderMinWidth;
    private static final TweenSpec<Float> SliderToTickAnimation;
    private static final float ThumbRadius = Dp.m2492constructorimpl(10);
    private static final float ThumbRippleRadius = Dp.m2492constructorimpl(24);
    private static final float ThumbDefaultElevation = Dp.m2492constructorimpl(1);
    private static final float ThumbPressedElevation = Dp.m2492constructorimpl(6);
    private static final float TrackHeight = Dp.m2492constructorimpl(4);

    public static final float getThumbRadius() {
        return ThumbRadius;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Slider(final float r38, final o.drM<? super java.lang.Float, o.dpR> r39, androidx.compose.ui.Modifier r40, boolean r41, o.InterfaceC8650dtl<java.lang.Float> r42, int r43, o.drO<o.dpR> r44, androidx.compose.foundation.interaction.MutableInteractionSource r45, androidx.compose.material.SliderColors r46, androidx.compose.runtime.Composer r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.Slider(float, o.drM, androidx.compose.ui.Modifier, boolean, o.dtl, int, o.drO, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.SliderColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SliderImpl(final boolean z, final float f, final List<Float> list, final SliderColors sliderColors, final float f2, final MutableInteractionSource mutableInteractionSource, final Modifier modifier, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1679682785);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1679682785, i, -1, "androidx.compose.material.SliderImpl (Slider.kt:590)");
        }
        Modifier then = modifier.then(DefaultSliderConstraints);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        drO<ComposeUiNode> constructor = companion.getConstructor();
        InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(then);
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
        Updater.m1013setimpl(m1009constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        float mo193toPx0680j_4 = density.mo193toPx0680j_4(TrackHeight);
        float f3 = ThumbRadius;
        float mo193toPx0680j_42 = density.mo193toPx0680j_4(f3);
        float mo189toDpu2uoSUM = density.mo189toDpu2uoSUM(f2);
        float m2492constructorimpl = Dp.m2492constructorimpl(f3 * 2);
        float m2492constructorimpl2 = Dp.m2492constructorimpl(mo189toDpu2uoSUM * f);
        Modifier.Companion companion2 = Modifier.Companion;
        int i2 = i >> 6;
        Track(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), sliderColors, z, 0.0f, f, list, mo193toPx0680j_42, mo193toPx0680j_4, startRestartGroup, (i2 & 112) | 265222 | ((i << 6) & 896) | ((i << 9) & 57344));
        m638SliderThumbPcYyNuk(boxScopeInstance, companion2, m2492constructorimpl2, mutableInteractionSource, sliderColors, z, m2492constructorimpl, startRestartGroup, (i2 & 7168) | 1572918 | ((i << 3) & 57344) | ((i << 15) & 458752));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material.SliderKt$SliderImpl$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i3) {
                    SliderKt.SliderImpl(z, f, list, sliderColors, f2, mutableInteractionSource, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SliderThumb-PcYyNuk  reason: not valid java name */
    public static final void m638SliderThumbPcYyNuk(final BoxScope boxScope, final Modifier modifier, final float f, final MutableInteractionSource mutableInteractionSource, final SliderColors sliderColors, final boolean z, final float f2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(428907178);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(f) ? JSONzip.end : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(sliderColors) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changed(z) ? 131072 : AleCryptoBouncyCastle.MAX_RANDOM_BYTES;
        }
        if ((3670016 & i) == 0) {
            i2 |= startRestartGroup.changed(f2) ? 1048576 : 524288;
        }
        int i3 = i2;
        if ((2995931 & i3) != 599186 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(428907178, i3, -1, "androidx.compose.material.SliderThumb (Slider.kt:694)");
            }
            Modifier m277paddingqDBjuR0$default = PaddingKt.m277paddingqDBjuR0$default(Modifier.Companion, f, 0.0f, 0.0f, 0.0f, 14, null);
            Alignment.Companion companion = Alignment.Companion;
            Modifier align = boxScope.align(m277paddingqDBjuR0$default, companion.getCenterStart());
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            drO<ComposeUiNode> constructor = companion2.getConstructor();
            InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(align);
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
            Updater.m1013setimpl(m1009constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.Companion;
            if (rememberedValue == companion3.getEmpty()) {
                rememberedValue = SnapshotStateKt.mutableStateListOf();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
            startRestartGroup.startReplaceableGroup(1457381730);
            boolean changed = startRestartGroup.changed(mutableInteractionSource);
            boolean changed2 = startRestartGroup.changed(snapshotStateList);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changed | changed2) || rememberedValue2 == companion3.getEmpty()) {
                rememberedValue2 = new SliderKt$SliderThumb$1$1$1(mutableInteractionSource, snapshotStateList, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            int i4 = i3 >> 9;
            EffectsKt.LaunchedEffect(mutableInteractionSource, (drX) rememberedValue2, startRestartGroup, (i4 & 14) | 64);
            SpacerKt.Spacer(BackgroundKt.m109backgroundbw27NRU(ShadowKt.m1073shadows4CzXII$default(HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m297sizeVpY3zN4(modifier, f2, f2), mutableInteractionSource, RippleKt.m710rememberRipple9IZ8Weo(false, ThumbRippleRadius, 0L, startRestartGroup, 54, 4)), mutableInteractionSource, false, 2, null), z ? snapshotStateList.isEmpty() ^ true ? ThumbPressedElevation : ThumbDefaultElevation : Dp.m2492constructorimpl(0), RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), sliderColors.thumbColor(z, startRestartGroup, ((i3 >> 15) & 14) | (i4 & 112)).getValue().m1302unboximpl(), RoundedCornerShapeKt.getCircleShape()), startRestartGroup, 0);
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
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material.SliderKt$SliderThumb$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i5) {
                    SliderKt.m638SliderThumbPcYyNuk(BoxScope.this, modifier, f, mutableInteractionSource, sliderColors, z, f2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Track(final Modifier modifier, final SliderColors sliderColors, final boolean z, final float f, final float f2, final List<Float> list, final float f3, final float f4, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1833126050);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1833126050, i, -1, "androidx.compose.material.Track (Slider.kt:742)");
        }
        int i2 = ((i >> 6) & 14) | 48 | ((i << 3) & 896);
        final State<Color> trackColor = sliderColors.trackColor(z, false, startRestartGroup, i2);
        final State<Color> trackColor2 = sliderColors.trackColor(z, true, startRestartGroup, i2);
        final State<Color> tickColor = sliderColors.tickColor(z, false, startRestartGroup, i2);
        final State<Color> tickColor2 = sliderColors.tickColor(z, true, startRestartGroup, i2);
        CanvasKt.Canvas(modifier, new drM<DrawScope, dpR>() { // from class: androidx.compose.material.SliderKt$Track$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope) {
                boolean z2 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                long Offset = OffsetKt.Offset(f3, Offset.m1138getYimpl(drawScope.mo1561getCenterF1C5BW0()));
                long Offset2 = OffsetKt.Offset(Size.m1176getWidthimpl(drawScope.mo1562getSizeNHjbRc()) - f3, Offset.m1138getYimpl(drawScope.mo1561getCenterF1C5BW0()));
                long j = z2 ? Offset2 : Offset;
                if (!z2) {
                    Offset = Offset2;
                }
                long m1302unboximpl = trackColor.getValue().m1302unboximpl();
                float f5 = f4;
                StrokeCap.Companion companion = StrokeCap.Companion;
                long j2 = j;
                DrawScope.m1551drawLineNGM6Ib0$default(drawScope, m1302unboximpl, j, Offset, f5, companion.m1449getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                DrawScope.m1551drawLineNGM6Ib0$default(drawScope, trackColor2.getValue().m1302unboximpl(), OffsetKt.Offset(Offset.m1137getXimpl(j2) + ((Offset.m1137getXimpl(Offset) - Offset.m1137getXimpl(j2)) * f), Offset.m1138getYimpl(drawScope.mo1561getCenterF1C5BW0())), OffsetKt.Offset(Offset.m1137getXimpl(j2) + ((Offset.m1137getXimpl(Offset) - Offset.m1137getXimpl(j2)) * f2), Offset.m1138getYimpl(drawScope.mo1561getCenterF1C5BW0())), f4, companion.m1449getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                List<Float> list2 = list;
                float f6 = f2;
                float f7 = f;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : list2) {
                    float floatValue = ((Number) obj).floatValue();
                    Boolean valueOf = Boolean.valueOf(floatValue > f6 || floatValue < f7);
                    Object obj2 = linkedHashMap.get(valueOf);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(valueOf, obj2);
                    }
                    ((List) obj2).add(obj);
                }
                State<Color> state = tickColor;
                State<Color> state2 = tickColor2;
                float f8 = f4;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
                    List list3 = (List) entry.getValue();
                    ArrayList arrayList = new ArrayList(list3.size());
                    int size = list3.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        arrayList.add(Offset.m1126boximpl(OffsetKt.Offset(Offset.m1137getXimpl(OffsetKt.m1152lerpWko1d7g(j2, Offset, ((Number) list3.get(i3)).floatValue())), Offset.m1138getYimpl(drawScope.mo1561getCenterF1C5BW0()))));
                    }
                    DrawScope.m1555drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.Companion.m1424getPointsr_lszbg(), (booleanValue ? state : state2).getValue().m1302unboximpl(), f8, StrokeCap.Companion.m1449getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                }
            }
        }, startRestartGroup, i & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material.SliderKt$Track$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i3) {
                    SliderKt.Track(Modifier.this, sliderColors, z, f, f2, list, f3, f4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Float> stepsToTickFractions(int i) {
        List<Float> i2;
        if (i == 0) {
            i2 = C8569dql.i();
            return i2;
        }
        int i3 = i + 2;
        ArrayList arrayList = new ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            arrayList.add(Float.valueOf(i4 / (i + 1)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scale(float f, float f2, float f3, float f4, float f5) {
        return MathHelpersKt.lerp(f4, f5, calcFraction(f, f2, f3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calcFraction(float f, float f2, float f3) {
        float a;
        float f4 = f2 - f;
        a = C8657dts.a(f4 == 0.0f ? 0.0f : (f3 - f) / f4, 0.0f, 1.0f);
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CorrectValueSideEffect(final drM<? super Float, Float> drm, final InterfaceC8650dtl<Float> interfaceC8650dtl, final InterfaceC8650dtl<Float> interfaceC8650dtl2, final MutableState<Float> mutableState, final float f, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-743965752);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(drm) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(interfaceC8650dtl) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(interfaceC8650dtl2) ? JSONzip.end : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(mutableState) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(f) ? 16384 : 8192;
        }
        if ((46811 & i2) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-743965752, i2, -1, "androidx.compose.material.CorrectValueSideEffect (Slider.kt:842)");
            }
            startRestartGroup.startReplaceableGroup(1457387012);
            boolean changed = startRestartGroup.changed(interfaceC8650dtl);
            boolean changedInstance = startRestartGroup.changedInstance(drm);
            boolean changed2 = startRestartGroup.changed(f);
            boolean changed3 = startRestartGroup.changed(mutableState);
            boolean changed4 = startRestartGroup.changed(interfaceC8650dtl2);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changed | changedInstance | changed2 | changed3 | changed4) || rememberedValue == Composer.Companion.getEmpty()) {
                drO<dpR> dro = new drO<dpR>() { // from class: androidx.compose.material.SliderKt$CorrectValueSideEffect$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // o.drO
                    public /* bridge */ /* synthetic */ dpR invoke() {
                        invoke2();
                        return dpR.c;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        float floatValue = (interfaceC8650dtl.g().floatValue() - interfaceC8650dtl.h().floatValue()) / 1000;
                        float floatValue2 = drm.invoke(Float.valueOf(f)).floatValue();
                        if (Math.abs(floatValue2 - mutableState.getValue().floatValue()) <= floatValue || !interfaceC8650dtl2.e(mutableState.getValue())) {
                            return;
                        }
                        mutableState.setValue(Float.valueOf(floatValue2));
                    }
                };
                startRestartGroup.updateRememberedValue(dro);
                rememberedValue = dro;
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((drO) rememberedValue, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material.SliderKt$CorrectValueSideEffect$2
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
                    SliderKt.CorrectValueSideEffect(drm, interfaceC8650dtl, interfaceC8650dtl2, mutableState, f, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    private static final Modifier sliderSemantics(Modifier modifier, float f, final boolean z, final drM<? super Float, dpR> drm, final drO<dpR> dro, final InterfaceC8650dtl<Float> interfaceC8650dtl, final int i) {
        final float a;
        a = C8657dts.a(f, interfaceC8650dtl.h().floatValue(), interfaceC8650dtl.g().floatValue());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new drM<SemanticsPropertyReceiver, dpR>() { // from class: androidx.compose.material.SliderKt$sliderSemantics$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                if (!z) {
                    SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                }
                final InterfaceC8650dtl<Float> interfaceC8650dtl2 = interfaceC8650dtl;
                final int i2 = i;
                final float f2 = a;
                final drM<Float, dpR> drm2 = drm;
                final drO<dpR> dro2 = dro;
                SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new drM<Float, Boolean>() { // from class: androidx.compose.material.SliderKt$sliderSemantics$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ Boolean invoke(Float f3) {
                        return invoke(f3.floatValue());
                    }

                    public final Boolean invoke(float f3) {
                        float a2;
                        int i3;
                        a2 = C8657dts.a(f3, interfaceC8650dtl2.h().floatValue(), interfaceC8650dtl2.g().floatValue());
                        int i4 = i2;
                        boolean z2 = true;
                        if (i4 > 0 && (i3 = i4 + 1) >= 0) {
                            float f4 = a2;
                            float f5 = f4;
                            int i5 = 0;
                            while (true) {
                                float lerp = MathHelpersKt.lerp(interfaceC8650dtl2.h().floatValue(), interfaceC8650dtl2.g().floatValue(), i5 / (i2 + 1));
                                float f6 = lerp - a2;
                                if (Math.abs(f6) <= f4) {
                                    f4 = Math.abs(f6);
                                    f5 = lerp;
                                }
                                if (i5 == i3) {
                                    break;
                                }
                                i5++;
                            }
                            a2 = f5;
                        }
                        if (a2 == f2) {
                            z2 = false;
                        } else {
                            drm2.invoke(Float.valueOf(a2));
                            drO<dpR> dro3 = dro2;
                            if (dro3 != null) {
                                dro3.invoke();
                            }
                        }
                        return Boolean.valueOf(z2);
                    }
                }, 1, null);
            }
        }, 1, null), f, interfaceC8650dtl, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object animateToTarget(DraggableState draggableState, float f, float f2, float f3, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object drag$default = DraggableState.drag$default(draggableState, null, new SliderKt$animateToTarget$2(f, f2, f3, null), interfaceC8585dra, 1, null);
        e = C8586drb.e();
        return drag$default == e ? drag$default : dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float snapValueToTick(float f, List<Float> list, float f2, float f3) {
        int t;
        Float f4;
        if (list.isEmpty()) {
            f4 = null;
        } else {
            Float f5 = list.get(0);
            float abs = Math.abs(MathHelpersKt.lerp(f2, f3, f5.floatValue()) - f);
            t = C8569dql.t(list);
            int i = 1;
            if (1 <= t) {
                while (true) {
                    Float f6 = list.get(i);
                    float abs2 = Math.abs(MathHelpersKt.lerp(f2, f3, f6.floatValue()) - f);
                    if (Float.compare(abs, abs2) > 0) {
                        f5 = f6;
                        abs = abs2;
                    }
                    if (i == t) {
                        break;
                    }
                    i++;
                }
            }
            f4 = f5;
        }
        Float f7 = f4;
        return f7 != null ? MathHelpersKt.lerp(f2, f3, f7.floatValue()) : f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier sliderTapModifier(Modifier modifier, final DraggableState draggableState, final MutableInteractionSource mutableInteractionSource, final float f, final boolean z, final State<Float> state, final State<? extends drM<? super Float, dpR>> state2, final MutableState<Float> mutableState, final boolean z2) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.material.SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("sliderTapModifier");
                inspectorInfo.getProperties().set("draggableState", DraggableState.this);
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("maxPx", Float.valueOf(f));
                inspectorInfo.getProperties().set("isRtl", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("rawOffset", state);
                inspectorInfo.getProperties().set("gestureEndAction", state2);
                inspectorInfo.getProperties().set("pressOffset", mutableState);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC8612dsa<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material.SliderKt$sliderTapModifier$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.startReplaceableGroup(1945228890);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1945228890, i, -1, "androidx.compose.material.sliderTapModifier.<anonymous> (Slider.kt:910)");
                }
                if (z2) {
                    composer.startReplaceableGroup(773894976);
                    composer.startReplaceableGroup(-492369756);
                    Object rememberedValue = composer.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.e, composer));
                        composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        rememberedValue = compositionScopedCoroutineScopeCanceller;
                    }
                    composer.endReplaceableGroup();
                    dwU coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                    composer.endReplaceableGroup();
                    modifier2 = SuspendingPointerInputFilterKt.pointerInput(modifier2, new Object[]{draggableState, mutableInteractionSource, Float.valueOf(f), Boolean.valueOf(z)}, (drX<? super PointerInputScope, ? super InterfaceC8585dra<? super dpR>, ? extends Object>) new AnonymousClass1(z, f, mutableState, state, coroutineScope, draggableState, state2, null));
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifier2;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements drX<PointerInputScope, InterfaceC8585dra<? super dpR>, Object> {
                final /* synthetic */ DraggableState $draggableState;
                final /* synthetic */ State<drM<Float, dpR>> $gestureEndAction;
                final /* synthetic */ boolean $isRtl;
                final /* synthetic */ float $maxPx;
                final /* synthetic */ MutableState<Float> $pressOffset;
                final /* synthetic */ State<Float> $rawOffset;
                final /* synthetic */ dwU $scope;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(boolean z, float f, MutableState<Float> mutableState, State<Float> state, dwU dwu, DraggableState draggableState, State<? extends drM<? super Float, dpR>> state2, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
                    super(2, interfaceC8585dra);
                    this.$isRtl = z;
                    this.$maxPx = f;
                    this.$pressOffset = mutableState;
                    this.$rawOffset = state;
                    this.$scope = dwu;
                    this.$draggableState = draggableState;
                    this.$gestureEndAction = state2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, this.$scope, this.$draggableState, this.$gestureEndAction, interfaceC8585dra);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // o.drX
                public final Object invoke(PointerInputScope pointerInputScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    return ((AnonymousClass1) create(pointerInputScope, interfaceC8585dra)).invokeSuspend(dpR.c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object e;
                    e = C8586drb.e();
                    int i = this.label;
                    if (i == 0) {
                        C8556dpz.d(obj);
                        PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                        C00251 c00251 = new C00251(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, null);
                        final dwU dwu = this.$scope;
                        final DraggableState draggableState = this.$draggableState;
                        final State<drM<Float, dpR>> state = this.$gestureEndAction;
                        drM<Offset, dpR> drm = new drM<Offset, dpR>() { // from class: androidx.compose.material.SliderKt.sliderTapModifier.2.1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // o.drM
                            public /* synthetic */ dpR invoke(Offset offset) {
                                m641invokek4lQ0M(offset.m1146unboximpl());
                                return dpR.c;
                            }

                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1  reason: invalid class name and collision with other inner class name */
                            /* loaded from: classes.dex */
                            public static final class C00261 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                                final /* synthetic */ DraggableState $draggableState;
                                final /* synthetic */ State<drM<Float, dpR>> $gestureEndAction;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                C00261(DraggableState draggableState, State<? extends drM<? super Float, dpR>> state, InterfaceC8585dra<? super C00261> interfaceC8585dra) {
                                    super(2, interfaceC8585dra);
                                    this.$draggableState = draggableState;
                                    this.$gestureEndAction = state;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                                    return new C00261(this.$draggableState, this.$gestureEndAction, interfaceC8585dra);
                                }

                                @Override // o.drX
                                public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                                    return ((C00261) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                                }

                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1$1  reason: invalid class name and collision with other inner class name */
                                /* loaded from: classes.dex */
                                public static final class C00271 extends SuspendLambda implements drX<DragScope, InterfaceC8585dra<? super dpR>, Object> {
                                    private /* synthetic */ Object L$0;
                                    int label;

                                    C00271(InterfaceC8585dra<? super C00271> interfaceC8585dra) {
                                        super(2, interfaceC8585dra);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                                        C00271 c00271 = new C00271(interfaceC8585dra);
                                        c00271.L$0 = obj;
                                        return c00271;
                                    }

                                    @Override // o.drX
                                    public final Object invoke(DragScope dragScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                                        return ((C00271) create(dragScope, interfaceC8585dra)).invokeSuspend(dpR.c);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        C8586drb.e();
                                        if (this.label == 0) {
                                            C8556dpz.d(obj);
                                            ((DragScope) this.L$0).dragBy(0.0f);
                                            return dpR.c;
                                        }
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object e;
                                    e = C8586drb.e();
                                    int i = this.label;
                                    if (i == 0) {
                                        C8556dpz.d(obj);
                                        DraggableState draggableState = this.$draggableState;
                                        MutatePriority mutatePriority = MutatePriority.UserInput;
                                        C00271 c00271 = new C00271(null);
                                        this.label = 1;
                                        if (draggableState.drag(mutatePriority, c00271, this) == e) {
                                            return e;
                                        }
                                    } else if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    } else {
                                        C8556dpz.d(obj);
                                    }
                                    this.$gestureEndAction.getValue().invoke(C8589dre.e(0.0f));
                                    return dpR.c;
                                }
                            }

                            /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
                            public final void m641invokek4lQ0M(long j) {
                                C8737dwr.c(dwU.this, null, null, new C00261(draggableState, state, null), 3, null);
                            }
                        };
                        this.label = 1;
                        if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, c00251, drm, this, 3, null) == e) {
                            return e;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        C8556dpz.d(obj);
                    }
                    return dpR.c;
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$1  reason: invalid class name and collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C00251 extends SuspendLambda implements InterfaceC8612dsa<PressGestureScope, Offset, InterfaceC8585dra<? super dpR>, Object> {
                    final /* synthetic */ boolean $isRtl;
                    final /* synthetic */ float $maxPx;
                    final /* synthetic */ MutableState<Float> $pressOffset;
                    final /* synthetic */ State<Float> $rawOffset;
                    /* synthetic */ long J$0;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00251(boolean z, float f, MutableState<Float> mutableState, State<Float> state, InterfaceC8585dra<? super C00251> interfaceC8585dra) {
                        super(3, interfaceC8585dra);
                        this.$isRtl = z;
                        this.$maxPx = f;
                        this.$pressOffset = mutableState;
                        this.$rawOffset = state;
                    }

                    @Override // o.InterfaceC8612dsa
                    public /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                        return m640invoked4ec7I(pressGestureScope, offset.m1146unboximpl(), interfaceC8585dra);
                    }

                    /* renamed from: invoke-d-4ec7I  reason: not valid java name */
                    public final Object m640invoked4ec7I(PressGestureScope pressGestureScope, long j, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                        C00251 c00251 = new C00251(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, interfaceC8585dra);
                        c00251.L$0 = pressGestureScope;
                        c00251.J$0 = j;
                        return c00251.invokeSuspend(dpR.c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object e;
                        e = C8586drb.e();
                        int i = this.label;
                        try {
                            if (i == 0) {
                                C8556dpz.d(obj);
                                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                                long j = this.J$0;
                                this.$pressOffset.setValue(C8589dre.e((this.$isRtl ? this.$maxPx - Offset.m1137getXimpl(j) : Offset.m1137getXimpl(j)) - this.$rawOffset.getValue().floatValue()));
                                this.label = 1;
                                if (pressGestureScope.awaitRelease(this) == e) {
                                    return e;
                                }
                            } else if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                C8556dpz.d(obj);
                            }
                        } catch (GestureCancellationException unused) {
                            this.$pressOffset.setValue(C8589dre.e(0.0f));
                        }
                        return dpR.c;
                    }
                }
            }
        });
    }

    static {
        float m2492constructorimpl = Dp.m2492constructorimpl(48);
        SliderHeight = m2492constructorimpl;
        float m2492constructorimpl2 = Dp.m2492constructorimpl(144);
        SliderMinWidth = m2492constructorimpl2;
        DefaultSliderConstraints = SizeKt.m290heightInVpY3zN4$default(SizeKt.m302widthInVpY3zN4$default(Modifier.Companion, m2492constructorimpl2, 0.0f, 2, null), 0.0f, m2492constructorimpl, 1, null);
        SliderToTickAnimation = new TweenSpec<>(100, 0, null, 6, null);
    }
}
