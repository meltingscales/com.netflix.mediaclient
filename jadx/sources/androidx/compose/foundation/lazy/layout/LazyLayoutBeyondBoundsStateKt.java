package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import java.util.ArrayList;
import java.util.List;
import o.C8569dql;
import o.C8654dtp;

/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsStateKt {
    public static final List<Integer> calculateLazyLayoutPinnedIndices(LazyLayoutItemProvider lazyLayoutItemProvider, LazyLayoutPinnedItemList lazyLayoutPinnedItemList, LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo) {
        C8654dtp d;
        List<Integer> i;
        if (!lazyLayoutBeyondBoundsInfo.hasIntervals() && lazyLayoutPinnedItemList.isEmpty()) {
            i = C8569dql.i();
            return i;
        }
        ArrayList arrayList = new ArrayList();
        if (lazyLayoutBeyondBoundsInfo.hasIntervals()) {
            d = new C8654dtp(lazyLayoutBeyondBoundsInfo.getStart(), Math.min(lazyLayoutBeyondBoundsInfo.getEnd(), lazyLayoutItemProvider.getItemCount() - 1));
        } else {
            d = C8654dtp.e.d();
        }
        int size = lazyLayoutPinnedItemList.size();
        for (int i2 = 0; i2 < size; i2++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = lazyLayoutPinnedItemList.get(i2);
            int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyLayoutItemProvider, pinnedItem.getKey(), pinnedItem.getIndex());
            int d2 = d.d();
            if ((findIndexByKey > d.e() || d2 > findIndexByKey) && findIndexByKey >= 0 && findIndexByKey < lazyLayoutItemProvider.getItemCount()) {
                arrayList.add(Integer.valueOf(findIndexByKey));
            }
        }
        int d3 = d.d();
        int e = d.e();
        if (d3 <= e) {
            while (true) {
                arrayList.add(Integer.valueOf(d3));
                if (d3 == e) {
                    break;
                }
                d3++;
            }
        }
        return arrayList;
    }
}
