package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import o.C8627dsp;

/* loaded from: classes.dex */
public final class LazyListScrollPosition {
    private boolean hadFirstNotEmptyLayout;
    private final MutableIntState index$delegate;
    private Object lastKnownFirstItemKey;
    private final LazyLayoutNearestRangeState nearestRangeState;
    private final MutableIntState scrollOffset$delegate;

    public LazyListScrollPosition() {
        this(0, 0, 3, null);
    }

    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public LazyListScrollPosition(int i, int i2) {
        this.index$delegate = SnapshotIntStateKt.mutableIntStateOf(i);
        this.scrollOffset$delegate = SnapshotIntStateKt.mutableIntStateOf(i2);
        this.nearestRangeState = new LazyLayoutNearestRangeState(i, 30, 100);
    }

    public /* synthetic */ LazyListScrollPosition(int i, int i2, int i3, C8627dsp c8627dsp) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public final void updateFromMeasureResult(LazyListMeasureResult lazyListMeasureResult) {
        LazyListMeasuredItem firstVisibleItem = lazyListMeasureResult.getFirstVisibleItem();
        this.lastKnownFirstItemKey = firstVisibleItem != null ? firstVisibleItem.getKey() : null;
        if (this.hadFirstNotEmptyLayout || lazyListMeasureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            int firstVisibleItemScrollOffset = lazyListMeasureResult.getFirstVisibleItemScrollOffset();
            if (firstVisibleItemScrollOffset < 0.0f) {
                throw new IllegalStateException(("scrollOffset should be non-negative (" + firstVisibleItemScrollOffset + ')').toString());
            }
            LazyListMeasuredItem firstVisibleItem2 = lazyListMeasureResult.getFirstVisibleItem();
            update(firstVisibleItem2 != null ? firstVisibleItem2.getIndex() : 0, firstVisibleItemScrollOffset);
        }
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

    public final int updateScrollPositionIfTheFirstItemWasMoved(LazyListItemProvider lazyListItemProvider, int i) {
        int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyListItemProvider, this.lastKnownFirstItemKey, i);
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

    public final void setIndex(int i) {
        this.index$delegate.setIntValue(i);
    }

    public final int getScrollOffset() {
        return this.scrollOffset$delegate.getIntValue();
    }

    private final void setScrollOffset(int i) {
        this.scrollOffset$delegate.setIntValue(i);
    }
}
