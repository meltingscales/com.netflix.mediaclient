package androidx.compose.foundation.lazy;

import java.util.List;
import o.C8569dql;
import o.C8576dqs;

/* loaded from: classes.dex */
public final class LazyListHeadersKt {
    public static final LazyListMeasuredItem findOrComposeLazyListHeader(List<LazyListMeasuredItem> list, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, List<Integer> list2, int i, int i2, int i3) {
        Object y;
        int i4;
        int t;
        y = C8576dqs.y(list);
        int index = ((LazyListMeasuredItem) y).getIndex();
        int size = list2.size();
        int i5 = -1;
        int i6 = -1;
        int i7 = 0;
        while (i7 < size && list2.get(i7).intValue() <= index) {
            i5 = list2.get(i7).intValue();
            i7++;
            if (i7 >= 0) {
                t = C8569dql.t(list2);
                if (i7 <= t) {
                    i4 = list2.get(i7);
                    i6 = i4.intValue();
                }
            }
            i4 = -1;
            i6 = i4.intValue();
        }
        int size2 = list.size();
        int i8 = Integer.MIN_VALUE;
        int i9 = Integer.MIN_VALUE;
        int i10 = -1;
        for (int i11 = 0; i11 < size2; i11++) {
            LazyListMeasuredItem lazyListMeasuredItem = list.get(i11);
            if (lazyListMeasuredItem.getIndex() == i5) {
                i8 = lazyListMeasuredItem.getOffset();
                i10 = i11;
            } else if (lazyListMeasuredItem.getIndex() == i6) {
                i9 = lazyListMeasuredItem.getOffset();
            }
        }
        if (i5 == -1) {
            return null;
        }
        LazyListMeasuredItem andMeasure = lazyListMeasuredItemProvider.getAndMeasure(i5);
        andMeasure.setNonScrollableItem(true);
        int max = i8 != Integer.MIN_VALUE ? Math.max(-i, i8) : -i;
        if (i9 != Integer.MIN_VALUE) {
            max = Math.min(max, i9 - andMeasure.getSize());
        }
        andMeasure.position(max, i2, i3);
        if (i10 != -1) {
            list.set(i10, andMeasure);
        } else {
            list.add(0, andMeasure);
        }
        return andMeasure;
    }
}
