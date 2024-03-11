package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Iterator;
import java.util.List;
import o.C8627dsp;
import o.C8632dsu;
import o.C8654dtp;
import o.C8657dts;
import o.dqB;
import o.dsT;

/* loaded from: classes.dex */
public final class RowColumnMeasurementHelper {
    private final float arrangementSpacing;
    private final CrossAxisAlignment crossAxisAlignment;
    private final SizeMode crossAxisSize;
    private final Arrangement.Horizontal horizontalArrangement;
    private final List<Measurable> measurables;
    private final LayoutOrientation orientation;
    private final Placeable[] placeables;
    private final RowColumnParentData[] rowColumnParentData;
    private final Arrangement.Vertical verticalArrangement;

    public /* synthetic */ RowColumnMeasurementHelper(LayoutOrientation layoutOrientation, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, List list, Placeable[] placeableArr, C8627dsp c8627dsp) {
        this(layoutOrientation, horizontal, vertical, f, sizeMode, crossAxisAlignment, list, placeableArr);
    }

    /* renamed from: getArrangementSpacing-D9Ej5fM  reason: not valid java name */
    public final float m284getArrangementSpacingD9Ej5fM() {
        return this.arrangementSpacing;
    }

    public final List<Measurable> getMeasurables() {
        return this.measurables;
    }

    public final Placeable[] getPlaceables() {
        return this.placeables;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private RowColumnMeasurementHelper(LayoutOrientation layoutOrientation, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, List<? extends Measurable> list, Placeable[] placeableArr) {
        this.orientation = layoutOrientation;
        this.horizontalArrangement = horizontal;
        this.verticalArrangement = vertical;
        this.arrangementSpacing = f;
        this.crossAxisSize = sizeMode;
        this.crossAxisAlignment = crossAxisAlignment;
        this.measurables = list;
        this.placeables = placeableArr;
        int size = list.size();
        RowColumnParentData[] rowColumnParentDataArr = new RowColumnParentData[size];
        for (int i = 0; i < size; i++) {
            rowColumnParentDataArr[i] = RowColumnImplKt.getRowColumnParentData(this.measurables.get(i));
        }
        this.rowColumnParentData = rowColumnParentDataArr;
    }

    public final int mainAxisSize(Placeable placeable) {
        return this.orientation == LayoutOrientation.Horizontal ? placeable.getWidth() : placeable.getHeight();
    }

    public final int crossAxisSize(Placeable placeable) {
        return this.orientation == LayoutOrientation.Horizontal ? placeable.getHeight() : placeable.getWidth();
    }

    /* renamed from: measureWithoutPlacing-_EkL_-Y  reason: not valid java name */
    public final RowColumnMeasureHelperResult m285measureWithoutPlacing_EkL_Y(MeasureScope measureScope, long j, int i, int i2) {
        int m2475getMinWidthimpl;
        long e;
        C8654dtp g;
        int i3;
        int i4;
        long b;
        int i5;
        int i6;
        float f;
        int a;
        int e2;
        int e3;
        int i7;
        int i8;
        long e4;
        int max;
        int i9;
        int i10;
        int i11;
        long j2;
        long e5;
        long e6;
        int i12;
        int i13 = i2;
        long m261constructorimpl = OrientationIndependentConstraints.m261constructorimpl(j, this.orientation);
        long mo187roundToPx0680j_4 = measureScope.mo187roundToPx0680j_4(this.arrangementSpacing);
        int i14 = i13 - i;
        long j3 = 0;
        int i15 = i;
        long j4 = 0;
        float f2 = 0.0f;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        boolean z = false;
        while (true) {
            boolean z2 = true;
            if (i15 >= i13) {
                break;
            }
            Measurable measurable = this.measurables.get(i15);
            RowColumnParentData rowColumnParentData = this.rowColumnParentData[i15];
            float weight = RowColumnImplKt.getWeight(rowColumnParentData);
            if (weight > 0.0f) {
                f2 += weight;
                i18++;
                i10 = i15;
                j2 = j3;
            } else {
                int m2473getMaxWidthimpl = Constraints.m2473getMaxWidthimpl(m261constructorimpl);
                Placeable placeable = this.placeables[i15];
                if (placeable == null) {
                    if (m2473getMaxWidthimpl == Integer.MAX_VALUE) {
                        i12 = Integer.MAX_VALUE;
                    } else {
                        e6 = C8657dts.e(m2473getMaxWidthimpl - j4, j3);
                        i12 = (int) e6;
                    }
                    i9 = i17;
                    int i19 = i12;
                    i10 = i15;
                    i11 = m2473getMaxWidthimpl;
                    placeable = measurable.mo1803measureBRTryo0(OrientationIndependentConstraints.m266toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m263copyyUG9Ft0$default(m261constructorimpl, 0, i19, 0, 0, 8, null), this.orientation));
                } else {
                    i9 = i17;
                    i10 = i15;
                    i11 = m2473getMaxWidthimpl;
                }
                j2 = 0;
                e5 = C8657dts.e((i11 - j4) - mainAxisSize(placeable), 0L);
                int min = Math.min((int) mo187roundToPx0680j_4, (int) e5);
                j4 += mainAxisSize(placeable) + min;
                int max2 = Math.max(i9, crossAxisSize(placeable));
                if (!z && !RowColumnImplKt.isRelative(rowColumnParentData)) {
                    z2 = false;
                }
                this.placeables[i10] = placeable;
                i16 = min;
                i17 = max2;
                z = z2;
            }
            j3 = j2;
            i15 = i10 + 1;
        }
        long j5 = j3;
        if (i18 == 0) {
            j4 -= i16;
            i3 = i14;
            i4 = 0;
            i5 = 0;
        } else {
            int i20 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            if (i20 > 0 && Constraints.m2473getMaxWidthimpl(m261constructorimpl) != Integer.MAX_VALUE) {
                m2475getMinWidthimpl = Constraints.m2473getMaxWidthimpl(m261constructorimpl);
            } else {
                m2475getMinWidthimpl = Constraints.m2475getMinWidthimpl(m261constructorimpl);
            }
            long j6 = mo187roundToPx0680j_4 * (i18 - 1);
            e = C8657dts.e((m2475getMinWidthimpl - j4) - j6, j5);
            float f3 = i20 > 0 ? ((float) e) / f2 : 0.0f;
            g = C8657dts.g(i, i2);
            Iterator<Integer> it = g.iterator();
            int i21 = 0;
            while (it.hasNext()) {
                e3 = dsT.e(RowColumnImplKt.getWeight(this.rowColumnParentData[((dqB) it).nextInt()]) * f3);
                i21 += e3;
            }
            long j7 = e - i21;
            int i22 = i;
            int i23 = 0;
            while (i22 < i13) {
                if (this.placeables[i22] == null) {
                    Measurable measurable2 = this.measurables.get(i22);
                    RowColumnParentData rowColumnParentData2 = this.rowColumnParentData[i22];
                    float weight2 = RowColumnImplKt.getWeight(rowColumnParentData2);
                    if (weight2 <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                    a = dsT.a(j7);
                    i6 = i14;
                    j7 -= a;
                    e2 = dsT.e(weight2 * f3);
                    int max3 = Math.max(0, e2 + a);
                    f = f3;
                    Placeable mo1803measureBRTryo0 = measurable2.mo1803measureBRTryo0(OrientationIndependentConstraints.m266toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m259constructorimpl((!RowColumnImplKt.getFill(rowColumnParentData2) || max3 == Integer.MAX_VALUE) ? 0 : max3, max3, 0, Constraints.m2472getMaxHeightimpl(m261constructorimpl)), this.orientation));
                    i23 += mainAxisSize(mo1803measureBRTryo0);
                    i17 = Math.max(i17, crossAxisSize(mo1803measureBRTryo0));
                    boolean z3 = z || RowColumnImplKt.isRelative(rowColumnParentData2);
                    this.placeables[i22] = mo1803measureBRTryo0;
                    z = z3;
                } else {
                    i6 = i14;
                    f = f3;
                }
                i22++;
                i14 = i6;
                i13 = i2;
                f3 = f;
            }
            i3 = i14;
            i4 = 0;
            b = C8657dts.b(i23 + j6, 0L, Constraints.m2473getMaxWidthimpl(m261constructorimpl) - j4);
            i5 = (int) b;
        }
        if (z) {
            int i24 = i4;
            i7 = i24;
            for (int i25 = i; i25 < i2; i25++) {
                Placeable placeable2 = this.placeables[i25];
                C8632dsu.d(placeable2);
                CrossAxisAlignment crossAxisAlignment = RowColumnImplKt.getCrossAxisAlignment(this.rowColumnParentData[i25]);
                Integer calculateAlignmentLinePosition$foundation_layout_release = crossAxisAlignment != null ? crossAxisAlignment.calculateAlignmentLinePosition$foundation_layout_release(placeable2) : null;
                if (calculateAlignmentLinePosition$foundation_layout_release != null) {
                    int intValue = calculateAlignmentLinePosition$foundation_layout_release.intValue();
                    if (intValue == Integer.MIN_VALUE) {
                        intValue = i4;
                    }
                    i24 = Math.max(i24, intValue);
                    int crossAxisSize = crossAxisSize(placeable2);
                    int intValue2 = calculateAlignmentLinePosition$foundation_layout_release.intValue();
                    if (intValue2 == Integer.MIN_VALUE) {
                        intValue2 = crossAxisSize(placeable2);
                    }
                    i7 = Math.max(i7, crossAxisSize - intValue2);
                }
            }
            i8 = i24;
        } else {
            i7 = i4;
            i8 = i7;
        }
        e4 = C8657dts.e(j4 + i5, 0L);
        int max4 = Math.max((int) e4, Constraints.m2475getMinWidthimpl(m261constructorimpl));
        if (Constraints.m2472getMaxHeightimpl(m261constructorimpl) == Integer.MAX_VALUE || this.crossAxisSize != SizeMode.Expand) {
            max = Math.max(i17, Math.max(Constraints.m2474getMinHeightimpl(m261constructorimpl), i7 + i8));
        } else {
            max = Constraints.m2472getMaxHeightimpl(m261constructorimpl);
        }
        int i26 = i3;
        int[] iArr = new int[i26];
        for (int i27 = i4; i27 < i26; i27++) {
            iArr[i27] = i4;
        }
        int[] iArr2 = new int[i26];
        for (int i28 = i4; i28 < i26; i28++) {
            Placeable placeable3 = this.placeables[i28 + i];
            C8632dsu.d(placeable3);
            iArr2[i28] = mainAxisSize(placeable3);
        }
        return new RowColumnMeasureHelperResult(max, max4, i, i2, i8, mainAxisPositions(max4, iArr2, iArr, measureScope));
    }

    private final int[] mainAxisPositions(int i, int[] iArr, int[] iArr2, MeasureScope measureScope) {
        if (this.orientation == LayoutOrientation.Vertical) {
            Arrangement.Vertical vertical = this.verticalArrangement;
            if (vertical == null) {
                throw new IllegalArgumentException("null verticalArrangement in Column".toString());
            }
            vertical.arrange(measureScope, i, iArr, iArr2);
        } else {
            Arrangement.Horizontal horizontal = this.horizontalArrangement;
            if (horizontal == null) {
                throw new IllegalArgumentException("null horizontalArrangement in Row".toString());
            }
            horizontal.arrange(measureScope, i, iArr, measureScope.getLayoutDirection(), iArr2);
        }
        return iArr2;
    }

    private final int getCrossAxisPosition(Placeable placeable, RowColumnParentData rowColumnParentData, int i, LayoutDirection layoutDirection, int i2) {
        CrossAxisAlignment crossAxisAlignment;
        if (rowColumnParentData == null || (crossAxisAlignment = rowColumnParentData.getCrossAxisAlignment()) == null) {
            crossAxisAlignment = this.crossAxisAlignment;
        }
        int crossAxisSize = crossAxisSize(placeable);
        if (this.orientation == LayoutOrientation.Horizontal) {
            layoutDirection = LayoutDirection.Ltr;
        }
        return crossAxisAlignment.align$foundation_layout_release(i - crossAxisSize, layoutDirection, placeable, i2);
    }

    public final void placeHelper(Placeable.PlacementScope placementScope, RowColumnMeasureHelperResult rowColumnMeasureHelperResult, int i, LayoutDirection layoutDirection) {
        int endIndex = rowColumnMeasureHelperResult.getEndIndex();
        for (int startIndex = rowColumnMeasureHelperResult.getStartIndex(); startIndex < endIndex; startIndex++) {
            Placeable placeable = this.placeables[startIndex];
            C8632dsu.d(placeable);
            int[] mainAxisPositions = rowColumnMeasureHelperResult.getMainAxisPositions();
            Object parentData = this.measurables.get(startIndex).getParentData();
            int crossAxisPosition = getCrossAxisPosition(placeable, parentData instanceof RowColumnParentData ? (RowColumnParentData) parentData : null, rowColumnMeasureHelperResult.getCrossAxisSize(), layoutDirection, rowColumnMeasureHelperResult.getBeforeCrossAxisAlignmentLine()) + i;
            if (this.orientation == LayoutOrientation.Horizontal) {
                Placeable.PlacementScope.place$default(placementScope, placeable, mainAxisPositions[startIndex - rowColumnMeasureHelperResult.getStartIndex()], crossAxisPosition, 0.0f, 4, null);
            } else {
                Placeable.PlacementScope.place$default(placementScope, placeable, crossAxisPosition, mainAxisPositions[startIndex - rowColumnMeasureHelperResult.getStartIndex()], 0.0f, 4, null);
            }
        }
    }
}
