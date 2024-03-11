package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.collection.MutableVector;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class MutableIntervalList<T> implements IntervalList<T> {
    private final MutableVector<IntervalList.Interval<T>> intervals = new MutableVector<>(new IntervalList.Interval[16], 0);
    private IntervalList.Interval<? extends T> lastInterval;
    private int size;

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public int getSize() {
        return this.size;
    }

    public final void addInterval(int i, T t) {
        if (i < 0) {
            throw new IllegalArgumentException(("size should be >=0, but was " + i).toString());
        } else if (i == 0) {
        } else {
            IntervalList.Interval<T> interval = new IntervalList.Interval<>(getSize(), i, t);
            this.size = getSize() + i;
            this.intervals.add(interval);
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public void forEach(int i, int i2, drM<? super IntervalList.Interval<? extends T>, dpR> drm) {
        int binarySearch;
        checkIndexBounds(i);
        checkIndexBounds(i2);
        if (i2 >= i) {
            binarySearch = IntervalListKt.binarySearch(this.intervals, i);
            int startIndex = this.intervals.getContent()[binarySearch].getStartIndex();
            while (startIndex <= i2) {
                IntervalList.Interval<T> interval = this.intervals.getContent()[binarySearch];
                drm.invoke(interval);
                startIndex += interval.getSize();
                binarySearch++;
            }
            return;
        }
        throw new IllegalArgumentException(("toIndex (" + i2 + ") should be not smaller than fromIndex (" + i + ')').toString());
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public IntervalList.Interval<T> get(int i) {
        checkIndexBounds(i);
        return getIntervalForIndex(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final IntervalList.Interval<T> getIntervalForIndex(int i) {
        int binarySearch;
        IntervalList.Interval interval = (IntervalList.Interval<? extends T>) this.lastInterval;
        if (interval == null || !contains(interval, i)) {
            MutableVector<IntervalList.Interval<T>> mutableVector = this.intervals;
            binarySearch = IntervalListKt.binarySearch(mutableVector, i);
            IntervalList.Interval interval2 = (IntervalList.Interval<T>) mutableVector.getContent()[binarySearch];
            this.lastInterval = interval2;
            return interval2;
        }
        return interval;
    }

    private final void checkIndexBounds(int i) {
        if (i < 0 || i >= getSize()) {
            throw new IndexOutOfBoundsException("Index " + i + ", size " + getSize());
        }
    }

    private final boolean contains(IntervalList.Interval<? extends T> interval, int i) {
        return i < interval.getStartIndex() + interval.getSize() && interval.getStartIndex() <= i;
    }
}
