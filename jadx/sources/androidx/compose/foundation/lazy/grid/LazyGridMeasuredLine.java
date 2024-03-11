package androidx.compose.foundation.lazy.grid;

import java.util.List;
import o.C8657dts;
import o.dpR;

/* loaded from: classes.dex */
public final class LazyGridMeasuredLine {
    private final int index;
    private final boolean isVertical;
    private final LazyGridMeasuredItem[] items;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private final int mainAxisSpacing;
    private final LazyGridSlots slots;
    private final List<GridItemSpan> spans;

    public final int getIndex() {
        return this.index;
    }

    public final LazyGridMeasuredItem[] getItems() {
        return this.items;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public LazyGridMeasuredLine(int i, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, LazyGridSlots lazyGridSlots, List<GridItemSpan> list, boolean z, int i2) {
        int b;
        this.index = i;
        this.items = lazyGridMeasuredItemArr;
        this.slots = lazyGridSlots;
        this.spans = list;
        this.isVertical = z;
        this.mainAxisSpacing = i2;
        int i3 = 0;
        for (LazyGridMeasuredItem lazyGridMeasuredItem : lazyGridMeasuredItemArr) {
            i3 = Math.max(i3, lazyGridMeasuredItem.getMainAxisSize());
        }
        this.mainAxisSize = i3;
        b = C8657dts.b(i3 + this.mainAxisSpacing, 0);
        this.mainAxisSizeWithSpacings = b;
    }

    public final boolean isEmpty() {
        return this.items.length == 0;
    }

    public final LazyGridMeasuredItem[] position(int i, int i2, int i3) {
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = this.items;
        int length = lazyGridMeasuredItemArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            LazyGridMeasuredItem lazyGridMeasuredItem = lazyGridMeasuredItemArr[i4];
            int m342getCurrentLineSpanimpl = GridItemSpan.m342getCurrentLineSpanimpl(this.spans.get(i5).m345unboximpl());
            int i7 = this.slots.getPositions()[i6];
            boolean z = this.isVertical;
            lazyGridMeasuredItem.position(i, i7, i2, i3, z ? this.index : i6, z ? i6 : this.index);
            dpR dpr = dpR.c;
            i6 += m342getCurrentLineSpanimpl;
            i4++;
            i5++;
        }
        return this.items;
    }
}
