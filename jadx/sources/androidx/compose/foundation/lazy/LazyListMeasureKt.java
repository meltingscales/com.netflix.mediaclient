package androidx.compose.foundation.lazy;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import o.C8563dqf;
import o.C8569dql;
import o.C8646dth;
import o.C8657dts;

/* loaded from: classes.dex */
public final class LazyListMeasureKt {
    private static final int calculateItemsOffsets$reverseAware(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b3  */
    /* renamed from: measureLazyList-5IMabDg  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.foundation.lazy.LazyListMeasureResult m333measureLazyList5IMabDg(int r37, androidx.compose.foundation.lazy.LazyListMeasuredItemProvider r38, int r39, int r40, int r41, int r42, int r43, int r44, float r45, long r46, boolean r48, java.util.List<java.lang.Integer> r49, androidx.compose.foundation.layout.Arrangement.Vertical r50, androidx.compose.foundation.layout.Arrangement.Horizontal r51, boolean r52, androidx.compose.ui.unit.Density r53, androidx.compose.foundation.lazy.LazyListItemAnimator r54, int r55, java.util.List<java.lang.Integer> r56, boolean r57, final boolean r58, androidx.compose.foundation.lazy.LazyListLayoutInfo r59, o.dwU r60, final androidx.compose.runtime.MutableState<o.dpR> r61, o.InterfaceC8612dsa<? super java.lang.Integer, ? super java.lang.Integer, ? super o.drM<? super androidx.compose.ui.layout.Placeable.PlacementScope, o.dpR>, ? extends androidx.compose.ui.layout.MeasureResult> r62) {
        /*
            Method dump skipped, instructions count: 923
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListMeasureKt.m333measureLazyList5IMabDg(int, androidx.compose.foundation.lazy.LazyListMeasuredItemProvider, int, int, int, int, int, int, float, long, boolean, java.util.List, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, boolean, androidx.compose.ui.unit.Density, androidx.compose.foundation.lazy.LazyListItemAnimator, int, java.util.List, boolean, boolean, androidx.compose.foundation.lazy.LazyListLayoutInfo, o.dwU, androidx.compose.runtime.MutableState, o.dsa):androidx.compose.foundation.lazy.LazyListMeasureResult");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
        r7 = r7.get(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.util.List<androidx.compose.foundation.lazy.LazyListMeasuredItem> createItemsAfterList(java.util.List<androidx.compose.foundation.lazy.LazyListMeasuredItem> r14, androidx.compose.foundation.lazy.LazyListMeasuredItemProvider r15, int r16, int r17, java.util.List<java.lang.Integer> r18, float r19, boolean r20, androidx.compose.foundation.lazy.LazyListLayoutInfo r21) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListMeasureKt.createItemsAfterList(java.util.List, androidx.compose.foundation.lazy.LazyListMeasuredItemProvider, int, int, java.util.List, float, boolean, androidx.compose.foundation.lazy.LazyListLayoutInfo):java.util.List");
    }

    private static final List<LazyListMeasuredItem> createItemsBeforeList(int i, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i2, List<Integer> list) {
        List<LazyListMeasuredItem> i3;
        int max = Math.max(0, i - i2);
        int i4 = i - 1;
        ArrayList arrayList = null;
        if (max <= i4) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lazyListMeasuredItemProvider.getAndMeasure(i4));
                if (i4 == max) {
                    break;
                }
                i4--;
            }
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i5 = size - 1;
                int intValue = list.get(size).intValue();
                if (intValue < max) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(lazyListMeasuredItemProvider.getAndMeasure(intValue));
                }
                if (i5 < 0) {
                    break;
                }
                size = i5;
            }
        }
        if (arrayList == null) {
            i3 = C8569dql.i();
            return i3;
        }
        return arrayList;
    }

    private static final List<LazyListMeasuredItem> calculateItemsOffsets(List<LazyListMeasuredItem> list, List<LazyListMeasuredItem> list2, List<LazyListMeasuredItem> list3, int i, int i2, int i3, int i4, int i5, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density) {
        C8646dth i6;
        int i7 = z ? i2 : i;
        boolean z3 = i3 < Math.min(i7, i4);
        if (z3 && i5 != 0) {
            throw new IllegalStateException("non-zero itemsScrollOffset".toString());
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z3) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("no extra items".toString());
            }
            int size = list.size();
            int[] iArr = new int[size];
            for (int i8 = 0; i8 < size; i8++) {
                iArr[i8] = list.get(calculateItemsOffsets$reverseAware(i8, z2, size)).getSize();
            }
            int[] iArr2 = new int[size];
            for (int i9 = 0; i9 < size; i9++) {
                iArr2[i9] = 0;
            }
            if (z) {
                if (vertical == null) {
                    throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                }
                vertical.arrange(density, i7, iArr, iArr2);
            } else if (horizontal == null) {
                throw new IllegalArgumentException("null horizontalArrangement when isVertical == false".toString());
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
                    int i10 = iArr2[d];
                    LazyListMeasuredItem lazyListMeasuredItem = list.get(calculateItemsOffsets$reverseAware(d, z2, size));
                    if (z2) {
                        i10 = (i7 - i10) - lazyListMeasuredItem.getSize();
                    }
                    lazyListMeasuredItem.position(i10, i, i2);
                    arrayList.add(lazyListMeasuredItem);
                    if (d == e) {
                        break;
                    }
                    d += a;
                }
            }
        } else {
            int size2 = list2.size();
            int i11 = i5;
            for (int i12 = 0; i12 < size2; i12++) {
                LazyListMeasuredItem lazyListMeasuredItem2 = list2.get(i12);
                i11 -= lazyListMeasuredItem2.getSizeWithSpacings();
                lazyListMeasuredItem2.position(i11, i, i2);
                arrayList.add(lazyListMeasuredItem2);
            }
            int size3 = list.size();
            int i13 = i5;
            for (int i14 = 0; i14 < size3; i14++) {
                LazyListMeasuredItem lazyListMeasuredItem3 = list.get(i14);
                lazyListMeasuredItem3.position(i13, i, i2);
                arrayList.add(lazyListMeasuredItem3);
                i13 += lazyListMeasuredItem3.getSizeWithSpacings();
            }
            int size4 = list3.size();
            for (int i15 = 0; i15 < size4; i15++) {
                LazyListMeasuredItem lazyListMeasuredItem4 = list3.get(i15);
                lazyListMeasuredItem4.position(i13, i, i2);
                arrayList.add(lazyListMeasuredItem4);
                i13 += lazyListMeasuredItem4.getSizeWithSpacings();
            }
        }
        return arrayList;
    }
}
