package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import o.C8627dsp;

/* loaded from: classes.dex */
public final class LazyGridScrollPosition {
    private boolean hadFirstNotEmptyLayout;
    private final MutableIntState index$delegate;
    private Object lastKnownFirstItemKey;
    private final LazyLayoutNearestRangeState nearestRangeState;
    private final MutableIntState scrollOffset$delegate;

    public LazyGridScrollPosition() {
        this(0, 0, 3, null);
    }

    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public LazyGridScrollPosition(int i, int i2) {
        this.index$delegate = SnapshotIntStateKt.mutableIntStateOf(i);
        this.scrollOffset$delegate = SnapshotIntStateKt.mutableIntStateOf(i2);
        this.nearestRangeState = new LazyLayoutNearestRangeState(i, 90, 200);
    }

    public /* synthetic */ LazyGridScrollPosition(int i, int i2, int i3, C8627dsp c8627dsp) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void updateFromMeasureResult(androidx.compose.foundation.lazy.grid.LazyGridMeasureResult r4) {
        /*
            r3 = this;
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r0 = r4.getFirstVisibleLine()
            if (r0 == 0) goto L19
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] r0 = r0.getItems()
            if (r0 == 0) goto L19
            java.lang.Object r0 = o.C8561dqd.g(r0)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem r0 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) r0
            if (r0 == 0) goto L19
            java.lang.Object r0 = r0.getKey()
            goto L1a
        L19:
            r0 = 0
        L1a:
            r3.lastKnownFirstItemKey = r0
            boolean r0 = r3.hadFirstNotEmptyLayout
            if (r0 != 0) goto L26
            int r0 = r4.getTotalItemsCount()
            if (r0 <= 0) goto L50
        L26:
            r0 = 1
            r3.hadFirstNotEmptyLayout = r0
            int r0 = r4.getFirstVisibleLineScrollOffset()
            float r1 = (float) r0
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L51
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r4 = r4.getFirstVisibleLine()
            if (r4 == 0) goto L4c
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] r4 = r4.getItems()
            if (r4 == 0) goto L4c
            java.lang.Object r4 = o.C8561dqd.g(r4)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem r4 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) r4
            if (r4 == 0) goto L4c
            int r4 = r4.getIndex()
            goto L4d
        L4c:
            r4 = 0
        L4d:
            r3.update(r4, r0)
        L50:
            return
        L51:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "scrollOffset should be non-negative ("
            r4.append(r1)
            r4.append(r0)
            r0 = 41
            r4.append(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridScrollPosition.updateFromMeasureResult(androidx.compose.foundation.lazy.grid.LazyGridMeasureResult):void");
    }

    public final void updateScrollOffset(int i) {
        if (i < 0.0f) {
            throw new IllegalStateException(("scrollOffset should be non-negative (" + i + ')').toString());
        }
        setScrollOffset(i);
    }

    public final void requestPosition(int i, int i2) {
        update(i, i2);
        this.lastKnownFirstItemKey = null;
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved(LazyGridItemProvider lazyGridItemProvider, int i) {
        int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyGridItemProvider, this.lastKnownFirstItemKey, i);
        if (i != findIndexByKey) {
            setIndex(findIndexByKey);
            this.nearestRangeState.update(i);
        }
        return findIndexByKey;
    }

    private final void update(int i, int i2) {
        if (i < 0.0f) {
            throw new IllegalArgumentException(("Index should be non-negative (" + i + ')').toString());
        }
        setIndex(i);
        this.nearestRangeState.update(i);
        setScrollOffset(i2);
    }

    public final int getIndex() {
        return this.index$delegate.getIntValue();
    }

    private final void setIndex(int i) {
        this.index$delegate.setIntValue(i);
    }

    public final int getScrollOffset() {
        return this.scrollOffset$delegate.getIntValue();
    }

    private final void setScrollOffset(int i) {
        this.scrollOffset$delegate.setIntValue(i);
    }
}
