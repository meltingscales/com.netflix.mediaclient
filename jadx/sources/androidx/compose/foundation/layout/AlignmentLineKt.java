package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import o.C8657dts;
import o.dpR;
import o.drM;

/* loaded from: classes5.dex */
public final class AlignmentLineKt {
    /* renamed from: paddingFrom-4j6BHR0$default  reason: not valid java name */
    public static /* synthetic */ Modifier m226paddingFrom4j6BHR0$default(Modifier modifier, AlignmentLine alignmentLine, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = Dp.Companion.m2501getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f2 = Dp.Companion.m2501getUnspecifiedD9Ej5fM();
        }
        return m225paddingFrom4j6BHR0(modifier, alignmentLine, f, f2);
    }

    /* renamed from: paddingFromBaseline-VpY3zN4  reason: not valid java name */
    public static final Modifier m227paddingFromBaselineVpY3zN4(Modifier modifier, float f, float f2) {
        Modifier modifier2;
        Modifier modifier3;
        Dp.Companion companion = Dp.Companion;
        if (!Dp.m2494equalsimpl0(f, companion.m2501getUnspecifiedD9Ej5fM())) {
            modifier2 = m226paddingFrom4j6BHR0$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), f, 0.0f, 4, null);
        } else {
            modifier2 = Modifier.Companion;
        }
        Modifier then = modifier.then(modifier2);
        if (!Dp.m2494equalsimpl0(f2, companion.m2501getUnspecifiedD9Ej5fM())) {
            modifier3 = m226paddingFrom4j6BHR0$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0.0f, f2, 2, null);
        } else {
            modifier3 = Modifier.Companion;
        }
        return then.then(modifier3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: alignmentLineOffsetMeasure-tjqqzMA  reason: not valid java name */
    public static final MeasureResult m224alignmentLineOffsetMeasuretjqqzMA(MeasureScope measureScope, final AlignmentLine alignmentLine, final float f, float f2, Measurable measurable, long j) {
        final int c;
        final int c2;
        int max;
        int height;
        final Placeable mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(getHorizontal(alignmentLine) ? Constraints.m2464copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null) : Constraints.m2464copyZbe2FdA$default(j, 0, 0, 0, 0, 14, null));
        int i = mo1803measureBRTryo0.get(alignmentLine);
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        int height2 = getHorizontal(alignmentLine) ? mo1803measureBRTryo0.getHeight() : mo1803measureBRTryo0.getWidth();
        int m2472getMaxHeightimpl = getHorizontal(alignmentLine) ? Constraints.m2472getMaxHeightimpl(j) : Constraints.m2473getMaxWidthimpl(j);
        Dp.Companion companion = Dp.Companion;
        int i2 = m2472getMaxHeightimpl - height2;
        c = C8657dts.c((!Dp.m2494equalsimpl0(f, companion.m2501getUnspecifiedD9Ej5fM()) ? measureScope.mo187roundToPx0680j_4(f) : 0) - i, 0, i2);
        c2 = C8657dts.c(((!Dp.m2494equalsimpl0(f2, companion.m2501getUnspecifiedD9Ej5fM()) ? measureScope.mo187roundToPx0680j_4(f2) : 0) - height2) + i, 0, i2 - c);
        if (getHorizontal(alignmentLine)) {
            max = mo1803measureBRTryo0.getWidth();
        } else {
            max = Math.max(mo1803measureBRTryo0.getWidth() + c + c2, Constraints.m2475getMinWidthimpl(j));
        }
        final int i3 = max;
        if (getHorizontal(alignmentLine)) {
            height = Math.max(mo1803measureBRTryo0.getHeight() + c + c2, Constraints.m2474getMinHeightimpl(j));
        } else {
            height = mo1803measureBRTryo0.getHeight();
        }
        final int i4 = height;
        return MeasureScope.layout$default(measureScope, i3, i4, null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$alignmentLineOffsetMeasure$1
            /* JADX INFO: Access modifiers changed from: package-private */
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
                boolean horizontal;
                int width;
                int i5;
                boolean horizontal2;
                horizontal = AlignmentLineKt.getHorizontal(AlignmentLine.this);
                int i6 = 0;
                if (horizontal) {
                    i5 = 0;
                } else {
                    if (Dp.m2494equalsimpl0(f, Dp.Companion.m2501getUnspecifiedD9Ej5fM())) {
                        width = (i3 - c2) - mo1803measureBRTryo0.getWidth();
                    } else {
                        width = c;
                    }
                    i5 = width;
                }
                horizontal2 = AlignmentLineKt.getHorizontal(AlignmentLine.this);
                if (horizontal2) {
                    if (Dp.m2494equalsimpl0(f, Dp.Companion.m2501getUnspecifiedD9Ej5fM())) {
                        i6 = (i4 - c2) - mo1803measureBRTryo0.getHeight();
                    } else {
                        i6 = c;
                    }
                }
                Placeable.PlacementScope.placeRelative$default(placementScope, mo1803measureBRTryo0, i5, i6, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHorizontal(AlignmentLine alignmentLine) {
        return alignmentLine instanceof HorizontalAlignmentLine;
    }

    /* renamed from: paddingFrom-4j6BHR0  reason: not valid java name */
    public static final Modifier m225paddingFrom4j6BHR0(Modifier modifier, final AlignmentLine alignmentLine, final float f, final float f2) {
        return modifier.then(new AlignmentLineOffsetDpElement(alignmentLine, f, f2, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-4j6BHR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("paddingFrom");
                inspectorInfo.getProperties().set("alignmentLine", AlignmentLine.this);
                inspectorInfo.getProperties().set("before", Dp.m2490boximpl(f));
                inspectorInfo.getProperties().set("after", Dp.m2490boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }
}
