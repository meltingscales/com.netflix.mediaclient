package androidx.compose.foundation.lazy.layout;

import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public interface IntervalList<T> {
    void forEach(int i, int i2, drM<? super Interval<? extends T>, dpR> drm);

    Interval<T> get(int i);

    int getSize();

    /* loaded from: classes.dex */
    public static final class Interval<T> {
        private final int size;
        private final int startIndex;
        private final T value;

        public final int getSize() {
            return this.size;
        }

        public final int getStartIndex() {
            return this.startIndex;
        }

        public final T getValue() {
            return this.value;
        }

        public Interval(int i, int i2, T t) {
            this.startIndex = i;
            this.size = i2;
            this.value = t;
            if (i < 0) {
                throw new IllegalArgumentException(("startIndex should be >= 0, but was " + i).toString());
            } else if (i2 > 0) {
            } else {
                throw new IllegalArgumentException(("size should be >0, but was " + i2).toString());
            }
        }
    }
}
