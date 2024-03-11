package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import o.C8657dts;
import o.dpR;

/* loaded from: classes.dex */
public abstract class LazyGridMeasuredLineProvider {
    private final int gridItemsCount;
    private final boolean isVertical;
    private final LazyGridMeasuredItemProvider measuredItemProvider;
    private final LazyGridSlots slots;
    private final int spaceBetweenLines;
    private final LazyGridSpanLayoutProvider spanLayoutProvider;

    public abstract LazyGridMeasuredLine createLine(int i, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, List<GridItemSpan> list, int i2);

    public LazyGridMeasuredLineProvider(boolean z, LazyGridSlots lazyGridSlots, int i, int i2, LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider) {
        this.isVertical = z;
        this.slots = lazyGridSlots;
        this.gridItemsCount = i;
        this.spaceBetweenLines = i2;
        this.measuredItemProvider = lazyGridMeasuredItemProvider;
        this.spanLayoutProvider = lazyGridSpanLayoutProvider;
    }

    /* renamed from: childConstraints-JhjzzOo$foundation_release  reason: not valid java name */
    public final long m355childConstraintsJhjzzOo$foundation_release(int i, int i2) {
        int i3;
        int b;
        if (i2 == 1) {
            i3 = this.slots.getSizes()[i];
        } else {
            int i4 = (i2 + i) - 1;
            i3 = (this.slots.getPositions()[i4] + this.slots.getSizes()[i4]) - this.slots.getPositions()[i];
        }
        b = C8657dts.b(i3, 0);
        if (this.isVertical) {
            return Constraints.Companion.m2482fixedWidthOenEA2s(b);
        }
        return Constraints.Companion.m2481fixedHeightOenEA2s(b);
    }

    /* renamed from: itemConstraints-OenEA2s  reason: not valid java name */
    public final long m356itemConstraintsOenEA2s(int i) {
        LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider = this.spanLayoutProvider;
        return m355childConstraintsJhjzzOo$foundation_release(0, lazyGridSpanLayoutProvider.spanOf(i, lazyGridSpanLayoutProvider.getSlotsPerLine()));
    }

    public final LazyGridMeasuredLine getAndMeasure(int i) {
        LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = this.spanLayoutProvider.getLineConfiguration(i);
        int size = lineConfiguration.getSpans().size();
        int i2 = (size == 0 || lineConfiguration.getFirstItemIndex() + size == this.gridItemsCount) ? 0 : this.spaceBetweenLines;
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = new LazyGridMeasuredItem[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int m342getCurrentLineSpanimpl = GridItemSpan.m342getCurrentLineSpanimpl(lineConfiguration.getSpans().get(i4).m345unboximpl());
            LazyGridMeasuredItem m354getAndMeasure3p2s80s = this.measuredItemProvider.m354getAndMeasure3p2s80s(lineConfiguration.getFirstItemIndex() + i4, i2, m355childConstraintsJhjzzOo$foundation_release(i3, m342getCurrentLineSpanimpl));
            i3 += m342getCurrentLineSpanimpl;
            dpR dpr = dpR.c;
            lazyGridMeasuredItemArr[i4] = m354getAndMeasure3p2s80s;
        }
        return createLine(i, lazyGridMeasuredItemArr, lineConfiguration.getSpans(), i2);
    }
}
