package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import o.C8563dqf;
import o.C8571dqn;
import o.C8646dth;
import o.C8657dts;

/* loaded from: classes.dex */
public final class LazyGridMeasureKt {
    private static final int calculateItemsOffsets$reverseAware(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017c  */
    /* renamed from: measureLazyGrid-W2FL7xs  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.foundation.lazy.grid.LazyGridMeasureResult m351measureLazyGridW2FL7xs(int r33, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider r34, androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider r35, int r36, int r37, int r38, int r39, int r40, int r41, float r42, long r43, boolean r45, androidx.compose.foundation.layout.Arrangement.Vertical r46, androidx.compose.foundation.layout.Arrangement.Horizontal r47, boolean r48, androidx.compose.ui.unit.Density r49, androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator r50, androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider r51, java.util.List<java.lang.Integer> r52, o.dwU r53, final androidx.compose.runtime.MutableState<o.dpR> r54, o.InterfaceC8612dsa<? super java.lang.Integer, ? super java.lang.Integer, ? super o.drM<? super androidx.compose.ui.layout.Placeable.PlacementScope, o.dpR>, ? extends androidx.compose.ui.layout.MeasureResult> r55) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.m351measureLazyGridW2FL7xs(int, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider, androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider, int, int, int, int, int, int, float, long, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, boolean, androidx.compose.ui.unit.Density, androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator, androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider, java.util.List, o.dwU, androidx.compose.runtime.MutableState, o.dsa):androidx.compose.foundation.lazy.grid.LazyGridMeasureResult");
    }

    private static final List<LazyGridMeasuredItem> calculateItemsOffsets(List<LazyGridMeasuredLine> list, List<LazyGridMeasuredItem> list2, List<LazyGridMeasuredItem> list3, int i, int i2, int i3, int i4, int i5, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density) {
        C8646dth i6;
        int i7 = z ? i2 : i;
        boolean z3 = i3 < Math.min(i7, i4);
        if (z3 && i5 != 0) {
            throw new IllegalStateException("non-zero firstLineScrollOffset".toString());
        }
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += list.get(i9).getItems().length;
        }
        ArrayList arrayList = new ArrayList(i8);
        if (z3) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("no items".toString());
            }
            int size2 = list.size();
            int[] iArr = new int[size2];
            for (int i10 = 0; i10 < size2; i10++) {
                iArr[i10] = list.get(calculateItemsOffsets$reverseAware(i10, z2, size2)).getMainAxisSize();
            }
            int[] iArr2 = new int[size2];
            for (int i11 = 0; i11 < size2; i11++) {
                iArr2[i11] = 0;
            }
            if (z) {
                if (vertical == null) {
                    throw new IllegalArgumentException("null verticalArrangement".toString());
                }
                vertical.arrange(density, i7, iArr, iArr2);
            } else if (horizontal == null) {
                throw new IllegalArgumentException("null horizontalArrangement".toString());
            } else {
                horizontal.arrange(density, i7, iArr, LayoutDirection.Ltr, iArr2);
            }
            i6 = C8563dqf.i(iArr2);
            if (z2) {
                i6 = C8657dts.e(i6);
            }
            int d = i6.d();
            int e = i6.e();
            int a = i6.a();
            if ((a > 0 && d <= e) || (a < 0 && e <= d)) {
                while (true) {
                    int i12 = iArr2[d];
                    LazyGridMeasuredLine lazyGridMeasuredLine = list.get(calculateItemsOffsets$reverseAware(d, z2, size2));
                    if (z2) {
                        i12 = (i7 - i12) - lazyGridMeasuredLine.getMainAxisSize();
                    }
                    C8571dqn.e(arrayList, lazyGridMeasuredLine.position(i12, i, i2));
                    if (d == e) {
                        break;
                    }
                    d += a;
                }
            }
        } else {
            int size3 = list2.size() - 1;
            if (size3 >= 0) {
                int i13 = i5;
                while (true) {
                    int i14 = size3 - 1;
                    LazyGridMeasuredItem lazyGridMeasuredItem = list2.get(size3);
                    int mainAxisSizeWithSpacings = i13 - lazyGridMeasuredItem.getMainAxisSizeWithSpacings();
                    lazyGridMeasuredItem.position(mainAxisSizeWithSpacings, 0, i, i2, (r16 & 16) != 0 ? -1 : 0, (r16 & 32) != 0 ? -1 : 0);
                    arrayList.add(lazyGridMeasuredItem);
                    if (i14 < 0) {
                        break;
                    }
                    size3 = i14;
                    i13 = mainAxisSizeWithSpacings;
                }
            }
            int size4 = list.size();
            int i15 = i5;
            for (int i16 = 0; i16 < size4; i16++) {
                LazyGridMeasuredLine lazyGridMeasuredLine2 = list.get(i16);
                C8571dqn.e(arrayList, lazyGridMeasuredLine2.position(i15, i, i2));
                i15 += lazyGridMeasuredLine2.getMainAxisSizeWithSpacings();
            }
            int i17 = i15;
            int i18 = 0;
            for (int size5 = list3.size(); i18 < size5; size5 = size5) {
                LazyGridMeasuredItem lazyGridMeasuredItem2 = list3.get(i18);
                lazyGridMeasuredItem2.position(i17, 0, i, i2, (r16 & 16) != 0 ? -1 : 0, (r16 & 32) != 0 ? -1 : 0);
                arrayList.add(lazyGridMeasuredItem2);
                i17 += lazyGridMeasuredItem2.getMainAxisSizeWithSpacings();
                i18++;
            }
        }
        return arrayList;
    }
}
