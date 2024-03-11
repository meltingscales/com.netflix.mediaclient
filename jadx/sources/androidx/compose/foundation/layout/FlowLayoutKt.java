package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.CrossAxisAlignment;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import java.util.NoSuchElementException;
import o.C8563dqf;
import o.C8576dqs;
import o.C8632dsu;
import o.C8654dtp;
import o.InterfaceC8612dsa;
import o.dpR;
import o.dqB;
import o.drM;

/* loaded from: classes.dex */
public final class FlowLayoutKt {
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_START;
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_TOP;

    public static final MeasurePolicy rowMeasurementHelper(Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, int i, Composer composer, int i2) {
        composer.startReplaceableGroup(1479255111);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1479255111, i2, -1, "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:156)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(horizontal);
        boolean changed2 = composer.changed(vertical);
        boolean changed3 = composer.changed(Integer.valueOf(i));
        Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2 | changed3) || rememberedValue == Composer.Companion.getEmpty()) {
            FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(LayoutOrientation.Horizontal, horizontal, vertical, horizontal.mo233getSpacingD9Ej5fM(), SizeMode.Wrap, CROSS_AXIS_ALIGNMENT_TOP, vertical.mo233getSpacingD9Ej5fM(), i, null);
            composer.updateRememberedValue(flowMeasurePolicy);
            rememberedValue = flowMeasurePolicy;
        }
        composer.endReplaceableGroup();
        FlowMeasurePolicy flowMeasurePolicy2 = (FlowMeasurePolicy) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return flowMeasurePolicy2;
    }

    public static final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, InterfaceC8612dsa<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> interfaceC8612dsa, InterfaceC8612dsa<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> interfaceC8612dsa2, int i, int i2, int i3, int i4) {
        int k;
        int g;
        int g2;
        int size = list.size();
        int[] iArr = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr[i5] = 0;
        }
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        for (int i6 = 0; i6 < size2; i6++) {
            iArr2[i6] = 0;
        }
        int size3 = list.size();
        for (int i7 = 0; i7 < size3; i7++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i7);
            int intValue = interfaceC8612dsa.invoke(intrinsicMeasurable, Integer.valueOf(i7), Integer.valueOf(i)).intValue();
            iArr[i7] = intValue;
            iArr2[i7] = interfaceC8612dsa2.invoke(intrinsicMeasurable, Integer.valueOf(i7), Integer.valueOf(intValue)).intValue();
        }
        k = C8563dqf.k(iArr);
        if (size2 != 0) {
            int i8 = iArr2[0];
            g = C8563dqf.g(iArr2);
            dqB it = new C8654dtp(1, g).iterator();
            while (it.hasNext()) {
                int i9 = iArr2[it.nextInt()];
                if (i8 < i9) {
                    i8 = i9;
                }
            }
            if (size != 0) {
                int i10 = iArr[0];
                g2 = C8563dqf.g(iArr);
                dqB it2 = new C8654dtp(1, g2).iterator();
                while (it2.hasNext()) {
                    int i11 = iArr[it2.nextInt()];
                    if (i10 < i11) {
                        i10 = i11;
                    }
                }
                int i12 = k;
                while (i10 < i12 && i8 != i) {
                    int i13 = (i10 + i12) / 2;
                    i8 = intrinsicCrossAxisSize(list, iArr, iArr2, i13, i2, i3, i4);
                    if (i8 == i) {
                        return i13;
                    }
                    if (i8 > i) {
                        i10 = i13 + 1;
                    } else {
                        i12 = i13 - 1;
                    }
                    k = i13;
                }
                return k;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    private static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, final int[] iArr, final int[] iArr2, int i, int i2, int i3, int i4) {
        return intrinsicCrossAxisSize(list, new InterfaceC8612dsa<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$intrinsicCrossAxisSize$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i5, int i6) {
                return Integer.valueOf(iArr[i5]);
            }
        }, new InterfaceC8612dsa<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$intrinsicCrossAxisSize$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i5, int i6) {
                return Integer.valueOf(iArr2[i5]);
            }
        }, i, i2, i3, i4);
    }

    public static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, InterfaceC8612dsa<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> interfaceC8612dsa, InterfaceC8612dsa<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> interfaceC8612dsa2, int i, int i2, int i3, int i4) {
        Object f;
        Object f2;
        if (list.isEmpty()) {
            return 0;
        }
        f = C8576dqs.f((List<? extends Object>) list, 0);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) f;
        int intValue = intrinsicMeasurable != null ? interfaceC8612dsa2.invoke(intrinsicMeasurable, 0, Integer.valueOf(i)).intValue() : 0;
        int intValue2 = intrinsicMeasurable != null ? interfaceC8612dsa.invoke(intrinsicMeasurable, 0, Integer.valueOf(intValue)).intValue() : 0;
        int size = list.size();
        int i5 = i;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i6 < size) {
            list.get(i6);
            C8632dsu.d(f);
            i5 -= intValue2;
            int max = Math.max(i8, intValue);
            i6++;
            f2 = C8576dqs.f((List<? extends Object>) list, i6);
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) f2;
            int intValue3 = intrinsicMeasurable2 != null ? interfaceC8612dsa2.invoke(intrinsicMeasurable2, Integer.valueOf(i6), Integer.valueOf(i)).intValue() : 0;
            int intValue4 = intrinsicMeasurable2 != null ? interfaceC8612dsa.invoke(intrinsicMeasurable2, Integer.valueOf(i6), Integer.valueOf(intValue3)).intValue() + i2 : 0;
            if (i5 >= 0 && i6 != list.size()) {
                if (i6 - i9 != i4 && i5 - intValue4 >= 0) {
                    int i10 = intValue3;
                    i8 = max;
                    f = f2;
                    intValue2 = intValue4;
                    intValue = i10;
                }
            }
            i7 += max + i3;
            intValue4 -= i2;
            i5 = i;
            max = 0;
            i9 = i6;
            int i102 = intValue3;
            i8 = max;
            f = f2;
            intValue2 = intValue4;
            intValue = i102;
        }
        return i7 - i3;
    }

    public static final int mainAxisMin(Measurable measurable, LayoutOrientation layoutOrientation, int i) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return measurable.minIntrinsicWidth(i);
        }
        return measurable.minIntrinsicHeight(i);
    }

    public static final int mainAxisSize(Placeable placeable, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? placeable.getWidth() : placeable.getHeight();
    }

    static {
        CrossAxisAlignment.Companion companion = CrossAxisAlignment.Companion;
        Alignment.Companion companion2 = Alignment.Companion;
        CROSS_AXIS_ALIGNMENT_TOP = companion.vertical$foundation_layout_release(companion2.getTop());
        CROSS_AXIS_ALIGNMENT_START = companion.horizontal$foundation_layout_release(companion2.getStart());
    }

    /* renamed from: measureAndCache-6m2dt9o */
    private static final int m247measureAndCache6m2dt9o(Measurable measurable, long j, LayoutOrientation layoutOrientation, drM<? super Placeable, dpR> drm) {
        if (RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(measurable)) == 0.0f) {
            Placeable mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(OrientationIndependentConstraints.m266toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m263copyyUG9Ft0$default(j, 0, 0, 0, 0, 14, null), layoutOrientation));
            drm.invoke(mo1803measureBRTryo0);
            return mainAxisSize(mo1803measureBRTryo0, layoutOrientation);
        }
        return mainAxisMin(measurable, layoutOrientation, Integer.MAX_VALUE);
    }

    public static final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, InterfaceC8612dsa<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> interfaceC8612dsa, int i, int i2, int i3) {
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 < size) {
            int intValue = interfaceC8612dsa.invoke(list.get(i4), Integer.valueOf(i4), Integer.valueOf(i)).intValue() + i2;
            int i8 = i4 + 1;
            if (i8 - i6 == i3 || i8 == list.size()) {
                i5 = Math.max(i5, (i7 + intValue) - i2);
                i7 = 0;
                i6 = i4;
            } else {
                i7 += intValue;
            }
            i4 = i8;
        }
        return i5;
    }

    /* renamed from: breakDownItems-w1Onq5I */
    public static final FlowResult m246breakDownItemsw1Onq5I(MeasureScope measureScope, RowColumnMeasurementHelper rowColumnMeasurementHelper, LayoutOrientation layoutOrientation, long j, int i) {
        Object f;
        Object c;
        Object c2;
        Object f2;
        int i2;
        Integer num;
        MutableVector mutableVector = new MutableVector(new RowColumnMeasureHelperResult[16], 0);
        int m2473getMaxWidthimpl = Constraints.m2473getMaxWidthimpl(j);
        int m2475getMinWidthimpl = Constraints.m2475getMinWidthimpl(j);
        int m2472getMaxHeightimpl = Constraints.m2472getMaxHeightimpl(j);
        List<Measurable> measurables = rowColumnMeasurementHelper.getMeasurables();
        final Placeable[] placeables = rowColumnMeasurementHelper.getPlaceables();
        int ceil = (int) Math.ceil(measureScope.mo193toPx0680j_4(rowColumnMeasurementHelper.m284getArrangementSpacingD9Ej5fM()));
        long m259constructorimpl = OrientationIndependentConstraints.m259constructorimpl(m2475getMinWidthimpl, m2473getMaxWidthimpl, 0, m2472getMaxHeightimpl);
        f = C8576dqs.f((List<? extends Object>) measurables, 0);
        Measurable measurable = (Measurable) f;
        Integer valueOf = measurable != null ? Integer.valueOf(m247measureAndCache6m2dt9o(measurable, m259constructorimpl, layoutOrientation, new drM<Placeable, dpR>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$nextSize$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Placeable placeable) {
                invoke2(placeable);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable placeable) {
                placeables[0] = placeable;
            }
        })) : null;
        Integer[] numArr = new Integer[measurables.size()];
        int size = measurables.size();
        int i3 = m2473getMaxWidthimpl;
        final int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 < size) {
            C8632dsu.d(valueOf);
            int intValue = valueOf.intValue();
            int i8 = i5 + intValue;
            i3 -= intValue;
            int i9 = i4 + 1;
            f2 = C8576dqs.f((List<? extends Object>) measurables, i9);
            Measurable measurable2 = (Measurable) f2;
            if (measurable2 != null) {
                i2 = size;
                num = Integer.valueOf(m247measureAndCache6m2dt9o(measurable2, m259constructorimpl, layoutOrientation, new drM<Placeable, dpR>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* bridge */ /* synthetic */ dpR invoke(Placeable placeable) {
                        invoke2(placeable);
                        return dpR.c;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(Placeable placeable) {
                        placeables[i4 + 1] = placeable;
                    }
                }) + ceil);
            } else {
                i2 = size;
                num = null;
            }
            if (i9 < measurables.size() && i9 - i6 < i) {
                if (i3 - (num != null ? num.intValue() : 0) >= 0) {
                    i4 = i9;
                    size = i2;
                    valueOf = num;
                    i5 = i8;
                }
            }
            m2475getMinWidthimpl = Math.min(Math.max(m2475getMinWidthimpl, i8), m2473getMaxWidthimpl);
            numArr[i7] = Integer.valueOf(i9);
            i7++;
            num = num != null ? Integer.valueOf(num.intValue() - ceil) : null;
            i3 = m2473getMaxWidthimpl;
            i6 = i9;
            i8 = 0;
            i4 = i9;
            size = i2;
            valueOf = num;
            i5 = i8;
        }
        long m266toBoxConstraintsOenEA2s = OrientationIndependentConstraints.m266toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m263copyyUG9Ft0$default(m259constructorimpl, m2475getMinWidthimpl, 0, 0, 0, 14, null), layoutOrientation);
        int i10 = 0;
        c = C8563dqf.c(numArr, 0);
        int i11 = 0;
        Integer num2 = (Integer) c;
        int i12 = m2475getMinWidthimpl;
        int i13 = 0;
        while (num2 != null) {
            Integer[] numArr2 = numArr;
            RowColumnMeasureHelperResult m285measureWithoutPlacing_EkL_Y = rowColumnMeasurementHelper.m285measureWithoutPlacing_EkL_Y(measureScope, m266toBoxConstraintsOenEA2s, i11, num2.intValue());
            i10 += m285measureWithoutPlacing_EkL_Y.getCrossAxisSize();
            i12 = Math.max(i12, m285measureWithoutPlacing_EkL_Y.getMainAxisSize());
            mutableVector.add(m285measureWithoutPlacing_EkL_Y);
            i11 = num2.intValue();
            i13++;
            c2 = C8563dqf.c(numArr2, i13);
            num2 = (Integer) c2;
            numArr = numArr2;
        }
        return new FlowResult(Math.max(i12, Constraints.m2475getMinWidthimpl(j)), Math.max(i10, Constraints.m2474getMinHeightimpl(j)), mutableVector);
    }
}
