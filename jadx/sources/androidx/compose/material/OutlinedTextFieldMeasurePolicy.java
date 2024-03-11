package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import java.util.List;
import java.util.NoSuchElementException;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drX;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class OutlinedTextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;
    private final drM<Size, dpR> onLabelMeasured;
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    /* JADX WARN: Multi-variable type inference failed */
    public OutlinedTextFieldMeasurePolicy(drM<? super Size, dpR> drm, boolean z, float f, PaddingValues paddingValues) {
        this.onLabelMeasured = drm;
        this.singleLine = z;
        this.animationProgress = f;
        this.paddingValues = paddingValues;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo9measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Measurable measurable;
        Measurable measurable2;
        Measurable measurable3;
        Measurable measurable4;
        final int m618calculateWidthO3s9Psw;
        final int m617calculateHeightO3s9Psw;
        int mo187roundToPx0680j_4 = measureScope.mo187roundToPx0680j_4(this.paddingValues.mo248calculateBottomPaddingD9Ej5fM());
        long m2464copyZbe2FdA$default = Constraints.m2464copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                measurable = null;
                break;
            }
            measurable = list.get(i);
            if (C8632dsu.c(LayoutIdKt.getLayoutId(measurable), (Object) "Leading")) {
                break;
            }
            i++;
        }
        Measurable measurable5 = measurable;
        Placeable mo1803measureBRTryo0 = measurable5 != null ? measurable5.mo1803measureBRTryo0(m2464copyZbe2FdA$default) : null;
        int widthOrZero = TextFieldImplKt.widthOrZero(mo1803measureBRTryo0);
        int size2 = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                measurable2 = null;
                break;
            }
            measurable2 = list.get(i2);
            if (C8632dsu.c(LayoutIdKt.getLayoutId(measurable2), (Object) "Trailing")) {
                break;
            }
            i2++;
        }
        Measurable measurable6 = measurable2;
        Placeable mo1803measureBRTryo02 = measurable6 != null ? measurable6.mo1803measureBRTryo0(ConstraintsKt.m2489offsetNN6EwU$default(m2464copyZbe2FdA$default, -widthOrZero, 0, 2, null)) : null;
        int widthOrZero2 = TextFieldImplKt.widthOrZero(mo1803measureBRTryo02);
        int mo187roundToPx0680j_42 = measureScope.mo187roundToPx0680j_4(this.paddingValues.mo249calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection())) + measureScope.mo187roundToPx0680j_4(this.paddingValues.mo250calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection()));
        int i3 = -(widthOrZero + widthOrZero2);
        int i4 = -mo187roundToPx0680j_4;
        long m2488offsetNN6EwU = ConstraintsKt.m2488offsetNN6EwU(m2464copyZbe2FdA$default, MathHelpersKt.lerp(i3 - mo187roundToPx0680j_42, -mo187roundToPx0680j_42, this.animationProgress), i4);
        int size3 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                measurable3 = null;
                break;
            }
            measurable3 = list.get(i5);
            if (C8632dsu.c(LayoutIdKt.getLayoutId(measurable3), (Object) "Label")) {
                break;
            }
            i5++;
        }
        Measurable measurable7 = measurable3;
        Placeable mo1803measureBRTryo03 = measurable7 != null ? measurable7.mo1803measureBRTryo0(m2488offsetNN6EwU) : null;
        if (mo1803measureBRTryo03 != null) {
            this.onLabelMeasured.invoke(Size.m1170boximpl(SizeKt.Size(mo1803measureBRTryo03.getWidth(), mo1803measureBRTryo03.getHeight())));
        }
        long m2464copyZbe2FdA$default2 = Constraints.m2464copyZbe2FdA$default(ConstraintsKt.m2488offsetNN6EwU(j, i3, i4 - Math.max(TextFieldImplKt.heightOrZero(mo1803measureBRTryo03) / 2, measureScope.mo187roundToPx0680j_4(this.paddingValues.mo251calculateTopPaddingD9Ej5fM()))), 0, 0, 0, 0, 11, null);
        int size4 = list.size();
        for (int i6 = 0; i6 < size4; i6++) {
            Measurable measurable8 = list.get(i6);
            if (C8632dsu.c(LayoutIdKt.getLayoutId(measurable8), (Object) "TextField")) {
                final Placeable mo1803measureBRTryo04 = measurable8.mo1803measureBRTryo0(m2464copyZbe2FdA$default2);
                long m2464copyZbe2FdA$default3 = Constraints.m2464copyZbe2FdA$default(m2464copyZbe2FdA$default2, 0, 0, 0, 0, 14, null);
                int size5 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size5) {
                        measurable4 = null;
                        break;
                    }
                    measurable4 = list.get(i7);
                    int i8 = size5;
                    if (C8632dsu.c(LayoutIdKt.getLayoutId(measurable4), (Object) "Hint")) {
                        break;
                    }
                    i7++;
                    size5 = i8;
                }
                Measurable measurable9 = measurable4;
                final Placeable mo1803measureBRTryo05 = measurable9 != null ? measurable9.mo1803measureBRTryo0(m2464copyZbe2FdA$default3) : null;
                m618calculateWidthO3s9Psw = OutlinedTextFieldKt.m618calculateWidthO3s9Psw(TextFieldImplKt.widthOrZero(mo1803measureBRTryo0), TextFieldImplKt.widthOrZero(mo1803measureBRTryo02), mo1803measureBRTryo04.getWidth(), TextFieldImplKt.widthOrZero(mo1803measureBRTryo03), TextFieldImplKt.widthOrZero(mo1803measureBRTryo05), this.animationProgress, j, measureScope.getDensity(), this.paddingValues);
                m617calculateHeightO3s9Psw = OutlinedTextFieldKt.m617calculateHeightO3s9Psw(TextFieldImplKt.heightOrZero(mo1803measureBRTryo0), TextFieldImplKt.heightOrZero(mo1803measureBRTryo02), mo1803measureBRTryo04.getHeight(), TextFieldImplKt.heightOrZero(mo1803measureBRTryo03), TextFieldImplKt.heightOrZero(mo1803measureBRTryo05), this.animationProgress, j, measureScope.getDensity(), this.paddingValues);
                int size6 = list.size();
                for (int i9 = 0; i9 < size6; i9++) {
                    Measurable measurable10 = list.get(i9);
                    if (C8632dsu.c(LayoutIdKt.getLayoutId(measurable10), (Object) "border")) {
                        final Placeable mo1803measureBRTryo06 = measurable10.mo1803measureBRTryo0(ConstraintsKt.Constraints(m618calculateWidthO3s9Psw != Integer.MAX_VALUE ? m618calculateWidthO3s9Psw : 0, m618calculateWidthO3s9Psw, m617calculateHeightO3s9Psw != Integer.MAX_VALUE ? m617calculateHeightO3s9Psw : 0, m617calculateHeightO3s9Psw));
                        final Placeable placeable = mo1803measureBRTryo0;
                        final Placeable placeable2 = mo1803measureBRTryo02;
                        final Placeable placeable3 = mo1803measureBRTryo03;
                        return MeasureScope.layout$default(measureScope, m618calculateWidthO3s9Psw, m617calculateHeightO3s9Psw, null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$measure$2
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
                                float f;
                                boolean z;
                                PaddingValues paddingValues;
                                int i10 = m617calculateHeightO3s9Psw;
                                int i11 = m618calculateWidthO3s9Psw;
                                Placeable placeable4 = placeable;
                                Placeable placeable5 = placeable2;
                                Placeable placeable6 = mo1803measureBRTryo04;
                                Placeable placeable7 = placeable3;
                                Placeable placeable8 = mo1803measureBRTryo05;
                                Placeable placeable9 = mo1803measureBRTryo06;
                                f = this.animationProgress;
                                z = this.singleLine;
                                float density = measureScope.getDensity();
                                LayoutDirection layoutDirection = measureScope.getLayoutDirection();
                                paddingValues = this.paddingValues;
                                OutlinedTextFieldKt.place(placementScope, i10, i11, placeable4, placeable5, placeable6, placeable7, placeable8, placeable9, f, z, density, layoutDirection, paddingValues);
                            }
                        }, 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1
            @Override // o.drX
            public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i2) {
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i2));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1
            @Override // o.drX
            public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i2) {
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i2));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicWidth(intrinsicMeasureScope, list, i, new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1
            @Override // o.drX
            public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i2) {
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i2));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicWidth(intrinsicMeasureScope, list, i, new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1
            @Override // o.drX
            public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i2) {
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i2));
            }
        });
    }

    private final int intrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i, drX<? super IntrinsicMeasurable, ? super Integer, Integer> drx) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        IntrinsicMeasurable intrinsicMeasurable3;
        IntrinsicMeasurable intrinsicMeasurable4;
        int m618calculateWidthO3s9Psw;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            IntrinsicMeasurable intrinsicMeasurable5 = list.get(i2);
            if (C8632dsu.c(TextFieldImplKt.getLayoutId(intrinsicMeasurable5), (Object) "TextField")) {
                int intValue = drx.invoke(intrinsicMeasurable5, Integer.valueOf(i)).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    intrinsicMeasurable = null;
                    if (i3 >= size2) {
                        intrinsicMeasurable2 = null;
                        break;
                    }
                    intrinsicMeasurable2 = list.get(i3);
                    if (C8632dsu.c(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), (Object) "Label")) {
                        break;
                    }
                    i3++;
                }
                IntrinsicMeasurable intrinsicMeasurable6 = intrinsicMeasurable2;
                int intValue2 = intrinsicMeasurable6 != null ? drx.invoke(intrinsicMeasurable6, Integer.valueOf(i)).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        intrinsicMeasurable3 = null;
                        break;
                    }
                    intrinsicMeasurable3 = list.get(i4);
                    if (C8632dsu.c(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), (Object) "Trailing")) {
                        break;
                    }
                    i4++;
                }
                IntrinsicMeasurable intrinsicMeasurable7 = intrinsicMeasurable3;
                int intValue3 = intrinsicMeasurable7 != null ? drx.invoke(intrinsicMeasurable7, Integer.valueOf(i)).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        intrinsicMeasurable4 = null;
                        break;
                    }
                    intrinsicMeasurable4 = list.get(i5);
                    if (C8632dsu.c(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), (Object) "Leading")) {
                        break;
                    }
                    i5++;
                }
                IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable4;
                int intValue4 = intrinsicMeasurable8 != null ? drx.invoke(intrinsicMeasurable8, Integer.valueOf(i)).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable9 = list.get(i6);
                    if (C8632dsu.c(TextFieldImplKt.getLayoutId(intrinsicMeasurable9), (Object) "Hint")) {
                        intrinsicMeasurable = intrinsicMeasurable9;
                        break;
                    }
                    i6++;
                }
                IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable;
                m618calculateWidthO3s9Psw = OutlinedTextFieldKt.m618calculateWidthO3s9Psw(intValue4, intValue3, intValue, intValue2, intrinsicMeasurable10 != null ? drx.invoke(intrinsicMeasurable10, Integer.valueOf(i)).intValue() : 0, this.animationProgress, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
                return m618calculateWidthO3s9Psw;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i, drX<? super IntrinsicMeasurable, ? super Integer, Integer> drx) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        int i2;
        int i3;
        IntrinsicMeasurable intrinsicMeasurable3;
        int i4;
        IntrinsicMeasurable intrinsicMeasurable4;
        int m617calculateHeightO3s9Psw;
        int size = list.size();
        int i5 = 0;
        while (true) {
            intrinsicMeasurable = null;
            if (i5 >= size) {
                intrinsicMeasurable2 = null;
                break;
            }
            intrinsicMeasurable2 = list.get(i5);
            if (C8632dsu.c(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), (Object) "Leading")) {
                break;
            }
            i5++;
        }
        IntrinsicMeasurable intrinsicMeasurable5 = intrinsicMeasurable2;
        if (intrinsicMeasurable5 != null) {
            i2 = i - intrinsicMeasurable5.maxIntrinsicWidth(Integer.MAX_VALUE);
            i3 = drx.invoke(intrinsicMeasurable5, Integer.valueOf(i)).intValue();
        } else {
            i2 = i;
            i3 = 0;
        }
        int size2 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                intrinsicMeasurable3 = null;
                break;
            }
            intrinsicMeasurable3 = list.get(i6);
            if (C8632dsu.c(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), (Object) "Trailing")) {
                break;
            }
            i6++;
        }
        IntrinsicMeasurable intrinsicMeasurable6 = intrinsicMeasurable3;
        if (intrinsicMeasurable6 != null) {
            i2 -= intrinsicMeasurable6.maxIntrinsicWidth(Integer.MAX_VALUE);
            i4 = drx.invoke(intrinsicMeasurable6, Integer.valueOf(i)).intValue();
        } else {
            i4 = 0;
        }
        int size3 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                intrinsicMeasurable4 = null;
                break;
            }
            intrinsicMeasurable4 = list.get(i7);
            if (C8632dsu.c(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), (Object) "Label")) {
                break;
            }
            i7++;
        }
        IntrinsicMeasurable intrinsicMeasurable7 = intrinsicMeasurable4;
        int intValue = intrinsicMeasurable7 != null ? drx.invoke(intrinsicMeasurable7, Integer.valueOf(MathHelpersKt.lerp(i2, i, this.animationProgress))).intValue() : 0;
        int size4 = list.size();
        for (int i8 = 0; i8 < size4; i8++) {
            IntrinsicMeasurable intrinsicMeasurable8 = list.get(i8);
            if (C8632dsu.c(TextFieldImplKt.getLayoutId(intrinsicMeasurable8), (Object) "TextField")) {
                int intValue2 = drx.invoke(intrinsicMeasurable8, Integer.valueOf(i2)).intValue();
                int size5 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size5) {
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable9 = list.get(i9);
                    if (C8632dsu.c(TextFieldImplKt.getLayoutId(intrinsicMeasurable9), (Object) "Hint")) {
                        intrinsicMeasurable = intrinsicMeasurable9;
                        break;
                    }
                    i9++;
                }
                IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable;
                m617calculateHeightO3s9Psw = OutlinedTextFieldKt.m617calculateHeightO3s9Psw(i3, i4, intValue2, intValue, intrinsicMeasurable10 != null ? drx.invoke(intrinsicMeasurable10, Integer.valueOf(i2)).intValue() : 0, this.animationProgress, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
                return m617calculateHeightO3s9Psw;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
