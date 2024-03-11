package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.layout.AlignmentLineKt;
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
import java.util.List;
import java.util.NoSuchElementException;
import o.C8632dsu;
import o.C8657dts;
import o.dpR;
import o.drM;
import o.drX;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class TextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    public TextFieldMeasurePolicy(boolean z, float f, PaddingValues paddingValues) {
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
        int i;
        Measurable measurable4;
        final int m694calculateWidthVsPV1Ek;
        final int m693calculateHeightO3s9Psw;
        List<? extends Measurable> list2 = list;
        final int mo187roundToPx0680j_4 = measureScope.mo187roundToPx0680j_4(this.paddingValues.mo251calculateTopPaddingD9Ej5fM());
        int mo187roundToPx0680j_42 = measureScope.mo187roundToPx0680j_4(this.paddingValues.mo248calculateBottomPaddingD9Ej5fM());
        final int mo187roundToPx0680j_43 = measureScope.mo187roundToPx0680j_4(TextFieldKt.getTextFieldTopPadding());
        long m2464copyZbe2FdA$default = Constraints.m2464copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                measurable = null;
                break;
            }
            measurable = list2.get(i2);
            if (C8632dsu.c(LayoutIdKt.getLayoutId(measurable), (Object) "Leading")) {
                break;
            }
            i2++;
        }
        Measurable measurable5 = measurable;
        Placeable mo1803measureBRTryo0 = measurable5 != null ? measurable5.mo1803measureBRTryo0(m2464copyZbe2FdA$default) : null;
        int widthOrZero = TextFieldImplKt.widthOrZero(mo1803measureBRTryo0);
        int size2 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                measurable2 = null;
                break;
            }
            measurable2 = list2.get(i3);
            if (C8632dsu.c(LayoutIdKt.getLayoutId(measurable2), (Object) "Trailing")) {
                break;
            }
            i3++;
        }
        Measurable measurable6 = measurable2;
        Placeable mo1803measureBRTryo02 = measurable6 != null ? measurable6.mo1803measureBRTryo0(ConstraintsKt.m2489offsetNN6EwU$default(m2464copyZbe2FdA$default, -widthOrZero, 0, 2, null)) : null;
        int i4 = -mo187roundToPx0680j_42;
        int i5 = -(widthOrZero + TextFieldImplKt.widthOrZero(mo1803measureBRTryo02));
        long m2488offsetNN6EwU = ConstraintsKt.m2488offsetNN6EwU(m2464copyZbe2FdA$default, i5, i4);
        int size3 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size3) {
                measurable3 = null;
                break;
            }
            measurable3 = list2.get(i6);
            int i7 = size3;
            if (C8632dsu.c(LayoutIdKt.getLayoutId(measurable3), (Object) "Label")) {
                break;
            }
            i6++;
            size3 = i7;
        }
        Measurable measurable7 = measurable3;
        Placeable mo1803measureBRTryo03 = measurable7 != null ? measurable7.mo1803measureBRTryo0(m2488offsetNN6EwU) : null;
        if (mo1803measureBRTryo03 != null) {
            i = mo1803measureBRTryo03.get(AlignmentLineKt.getLastBaseline());
            if (i == Integer.MIN_VALUE) {
                i = mo1803measureBRTryo03.getHeight();
            }
        } else {
            i = 0;
        }
        final int max = Math.max(i, mo187roundToPx0680j_4);
        long m2488offsetNN6EwU2 = ConstraintsKt.m2488offsetNN6EwU(Constraints.m2464copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null), i5, mo1803measureBRTryo03 != null ? (i4 - mo187roundToPx0680j_43) - max : (-mo187roundToPx0680j_4) - mo187roundToPx0680j_42);
        int size4 = list.size();
        int i8 = 0;
        while (i8 < size4) {
            Measurable measurable8 = list2.get(i8);
            if (C8632dsu.c(LayoutIdKt.getLayoutId(measurable8), (Object) "TextField")) {
                final Placeable mo1803measureBRTryo04 = measurable8.mo1803measureBRTryo0(m2488offsetNN6EwU2);
                long m2464copyZbe2FdA$default2 = Constraints.m2464copyZbe2FdA$default(m2488offsetNN6EwU2, 0, 0, 0, 0, 14, null);
                int size5 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size5) {
                        measurable4 = null;
                        break;
                    }
                    measurable4 = list2.get(i9);
                    if (C8632dsu.c(LayoutIdKt.getLayoutId(measurable4), (Object) "Hint")) {
                        break;
                    }
                    i9++;
                    list2 = list;
                }
                Measurable measurable9 = measurable4;
                Placeable mo1803measureBRTryo05 = measurable9 != null ? measurable9.mo1803measureBRTryo0(m2464copyZbe2FdA$default2) : null;
                m694calculateWidthVsPV1Ek = TextFieldKt.m694calculateWidthVsPV1Ek(TextFieldImplKt.widthOrZero(mo1803measureBRTryo0), TextFieldImplKt.widthOrZero(mo1803measureBRTryo02), mo1803measureBRTryo04.getWidth(), TextFieldImplKt.widthOrZero(mo1803measureBRTryo03), TextFieldImplKt.widthOrZero(mo1803measureBRTryo05), j);
                m693calculateHeightO3s9Psw = TextFieldKt.m693calculateHeightO3s9Psw(mo1803measureBRTryo04.getHeight(), mo1803measureBRTryo03 != null, max, TextFieldImplKt.heightOrZero(mo1803measureBRTryo0), TextFieldImplKt.heightOrZero(mo1803measureBRTryo02), TextFieldImplKt.heightOrZero(mo1803measureBRTryo05), j, measureScope.getDensity(), this.paddingValues);
                final Placeable placeable = mo1803measureBRTryo03;
                final int i10 = i;
                final Placeable placeable2 = mo1803measureBRTryo05;
                final Placeable placeable3 = mo1803measureBRTryo0;
                final Placeable placeable4 = mo1803measureBRTryo02;
                return MeasureScope.layout$default(measureScope, m694calculateWidthVsPV1Ek, m693calculateHeightO3s9Psw, null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$measure$1
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
                        boolean z;
                        PaddingValues paddingValues;
                        int b;
                        boolean z2;
                        float f;
                        if (Placeable.this == null) {
                            int i11 = m694calculateWidthVsPV1Ek;
                            int i12 = m693calculateHeightO3s9Psw;
                            Placeable placeable5 = mo1803measureBRTryo04;
                            Placeable placeable6 = placeable2;
                            Placeable placeable7 = placeable3;
                            Placeable placeable8 = placeable4;
                            z = this.singleLine;
                            float density = measureScope.getDensity();
                            paddingValues = this.paddingValues;
                            TextFieldKt.placeWithoutLabel(placementScope, i11, i12, placeable5, placeable6, placeable7, placeable8, z, density, paddingValues);
                            return;
                        }
                        b = C8657dts.b(mo187roundToPx0680j_4 - i10, 0);
                        int i13 = m694calculateWidthVsPV1Ek;
                        int i14 = m693calculateHeightO3s9Psw;
                        Placeable placeable9 = mo1803measureBRTryo04;
                        Placeable placeable10 = Placeable.this;
                        Placeable placeable11 = placeable2;
                        Placeable placeable12 = placeable3;
                        Placeable placeable13 = placeable4;
                        z2 = this.singleLine;
                        int i15 = max;
                        int i16 = mo187roundToPx0680j_43;
                        f = this.animationProgress;
                        TextFieldKt.placeWithLabel(placementScope, i13, i14, placeable9, placeable10, placeable11, placeable12, placeable13, z2, b, i15 + i16, f, measureScope.getDensity());
                    }
                }, 4, null);
            }
            i8++;
            list2 = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$maxIntrinsicHeight$1
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
        return intrinsicHeight(intrinsicMeasureScope, list, i, new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$minIntrinsicHeight$1
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
        return intrinsicWidth(list, i, new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$maxIntrinsicWidth$1
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
        return intrinsicWidth(list, i, new drX<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material.TextFieldMeasurePolicy$minIntrinsicWidth$1
            @Override // o.drX
            public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i2) {
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i2));
            }
        });
    }

    private final int intrinsicWidth(List<? extends IntrinsicMeasurable> list, int i, drX<? super IntrinsicMeasurable, ? super Integer, Integer> drx) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        IntrinsicMeasurable intrinsicMeasurable3;
        IntrinsicMeasurable intrinsicMeasurable4;
        int m694calculateWidthVsPV1Ek;
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
                m694calculateWidthVsPV1Ek = TextFieldKt.m694calculateWidthVsPV1Ek(intValue4, intValue3, intValue, intValue2, intrinsicMeasurable10 != null ? drx.invoke(intrinsicMeasurable10, Integer.valueOf(i)).intValue() : 0, TextFieldImplKt.getZeroConstraints());
                return m694calculateWidthVsPV1Ek;
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
        int m693calculateHeightO3s9Psw;
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
        int intValue = intrinsicMeasurable7 != null ? drx.invoke(intrinsicMeasurable7, Integer.valueOf(i2)).intValue() : 0;
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
                m693calculateHeightO3s9Psw = TextFieldKt.m693calculateHeightO3s9Psw(intValue2, intValue > 0, intValue, i3, i4, intrinsicMeasurable10 != null ? drx.invoke(intrinsicMeasurable10, Integer.valueOf(i2)).intValue() : 0, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
                return m693calculateHeightO3s9Psw;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
