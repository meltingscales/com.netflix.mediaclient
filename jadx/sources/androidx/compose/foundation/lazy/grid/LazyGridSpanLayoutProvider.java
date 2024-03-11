package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.IntervalList;
import java.util.ArrayList;
import java.util.List;
import o.C8569dql;
import o.C8627dsp;
import o.drM;

/* loaded from: classes.dex */
public final class LazyGridSpanLayoutProvider {
    private final ArrayList<Bucket> buckets;
    private final List<Integer> cachedBucket;
    private int cachedBucketIndex;
    private final LazyGridIntervalContent gridContent;
    private int lastLineIndex;
    private int lastLineStartItemIndex;
    private int lastLineStartKnownSpan;
    private List<GridItemSpan> previousDefaultSpans;
    private int slotsPerLine;

    public final int getSlotsPerLine() {
        return this.slotsPerLine;
    }

    public LazyGridSpanLayoutProvider(LazyGridIntervalContent lazyGridIntervalContent) {
        List<GridItemSpan> i;
        this.gridContent = lazyGridIntervalContent;
        ArrayList<Bucket> arrayList = new ArrayList<>();
        arrayList.add(new Bucket(0, 0, 2, null));
        this.buckets = arrayList;
        this.cachedBucketIndex = -1;
        this.cachedBucket = new ArrayList();
        i = C8569dql.i();
        this.previousDefaultSpans = i;
    }

    /* loaded from: classes.dex */
    public static final class LineConfiguration {
        private final int firstItemIndex;
        private final List<GridItemSpan> spans;

        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        public final List<GridItemSpan> getSpans() {
            return this.spans;
        }

        public LineConfiguration(int i, List<GridItemSpan> list) {
            this.firstItemIndex = i;
            this.spans = list;
        }
    }

    private final int getBucketSize() {
        return ((int) Math.sqrt((getTotalSize() * 1.0d) / this.slotsPerLine)) + 1;
    }

    private final List<GridItemSpan> getDefaultSpans(int i) {
        if (i == this.previousDefaultSpans.size()) {
            return this.previousDefaultSpans;
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(GridItemSpan.m339boximpl(LazyGridSpanKt.GridItemSpan(1)));
        }
        this.previousDefaultSpans = arrayList;
        return arrayList;
    }

    public final int getTotalSize() {
        return this.gridContent.getIntervals().getSize();
    }

    public final void setSlotsPerLine(int i) {
        if (i != this.slotsPerLine) {
            this.slotsPerLine = i;
            invalidateCache();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
        if (r7 < r6) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.LineConfiguration getLineConfiguration(int r11) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.getLineConfiguration(int):androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$LineConfiguration");
    }

    public final int getLineIndexOfItem(final int i) {
        int a;
        if (getTotalSize() <= 0) {
            return 0;
        }
        if (i >= getTotalSize()) {
            throw new IllegalArgumentException("ItemIndex > total count".toString());
        }
        if (!this.gridContent.getHasCustomSpans$foundation_release()) {
            return i / this.slotsPerLine;
        }
        a = C8569dql.a(this.buckets, 0, 0, new drM<Bucket, Integer>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public final Integer invoke(LazyGridSpanLayoutProvider.Bucket bucket) {
                return Integer.valueOf(bucket.getFirstItemIndex() - i);
            }
        }, 3, null);
        if (a < 0) {
            a = (-a) - 2;
        }
        int bucketSize = getBucketSize() * a;
        int firstItemIndex = this.buckets.get(a).getFirstItemIndex();
        if (firstItemIndex <= i) {
            int i2 = 0;
            while (firstItemIndex < i) {
                int i3 = firstItemIndex + 1;
                int spanOf = spanOf(firstItemIndex, this.slotsPerLine - i2);
                i2 += spanOf;
                int i4 = this.slotsPerLine;
                if (i2 >= i4) {
                    bucketSize++;
                    i2 = i2 == i4 ? 0 : spanOf;
                }
                if (bucketSize % getBucketSize() == 0 && bucketSize / getBucketSize() >= this.buckets.size()) {
                    this.buckets.add(new Bucket(i3 - (i2 > 0 ? 1 : 0), 0, 2, null));
                }
                firstItemIndex = i3;
            }
            return i2 + spanOf(i, this.slotsPerLine - i2) > this.slotsPerLine ? bucketSize + 1 : bucketSize;
        }
        throw new IllegalArgumentException("currentItemIndex > itemIndex".toString());
    }

    public final int spanOf(int i, int i2) {
        LazyGridItemSpanScopeImpl lazyGridItemSpanScopeImpl = LazyGridItemSpanScopeImpl.INSTANCE;
        lazyGridItemSpanScopeImpl.setMaxCurrentLineSpan(i2);
        lazyGridItemSpanScopeImpl.setMaxLineSpan(this.slotsPerLine);
        IntervalList.Interval<LazyGridInterval> interval = this.gridContent.getIntervals().get(i);
        return GridItemSpan.m342getCurrentLineSpanimpl(interval.getValue().getSpan().invoke(lazyGridItemSpanScopeImpl, Integer.valueOf(i - interval.getStartIndex())).m345unboximpl());
    }

    private final void invalidateCache() {
        this.buckets.clear();
        this.buckets.add(new Bucket(0, 0, 2, null));
        this.lastLineIndex = 0;
        this.lastLineStartItemIndex = 0;
        this.lastLineStartKnownSpan = 0;
        this.cachedBucketIndex = -1;
        this.cachedBucket.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class Bucket {
        private final int firstItemIndex;
        private final int firstItemKnownSpan;

        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        public final int getFirstItemKnownSpan() {
            return this.firstItemKnownSpan;
        }

        public Bucket(int i, int i2) {
            this.firstItemIndex = i;
            this.firstItemKnownSpan = i2;
        }

        public /* synthetic */ Bucket(int i, int i2, int i3, C8627dsp c8627dsp) {
            this(i, (i3 & 2) != 0 ? 0 : i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class LazyGridItemSpanScopeImpl implements LazyGridItemSpanScope {
        public static final LazyGridItemSpanScopeImpl INSTANCE = new LazyGridItemSpanScopeImpl();
        private static int maxCurrentLineSpan;
        private static int maxLineSpan;

        public void setMaxCurrentLineSpan(int i) {
            maxCurrentLineSpan = i;
        }

        public void setMaxLineSpan(int i) {
            maxLineSpan = i;
        }

        private LazyGridItemSpanScopeImpl() {
        }
    }
}
