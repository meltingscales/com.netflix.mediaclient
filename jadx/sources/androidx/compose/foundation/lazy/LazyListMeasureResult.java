package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class LazyListMeasureResult implements LazyListLayoutInfo, MeasureResult {
    private final /* synthetic */ MeasureResult $$delegate_0;
    private final int afterContentPadding;
    private boolean canScrollForward;
    private float consumedScroll;
    private final LazyListMeasuredItem firstVisibleItem;
    private int firstVisibleItemScrollOffset;
    private final int mainAxisItemSpacing;
    private final Orientation orientation;
    private final boolean remeasureNeeded;
    private final boolean reverseLayout;
    private final float scrollBackAmount;
    private final int totalItemsCount;
    private final int viewportEndOffset;
    private final int viewportStartOffset;
    private final List<LazyListMeasuredItem> visibleItemsInfo;

    @Override // androidx.compose.ui.layout.MeasureResult
    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.$$delegate_0.getAlignmentLines();
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    public final LazyListMeasuredItem getFirstVisibleItem() {
        return this.firstVisibleItem;
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.firstVisibleItemScrollOffset;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.$$delegate_0.getHeight();
    }

    public final float getScrollBackAmount() {
        return this.scrollBackAmount;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public List<LazyListMeasuredItem> getVisibleItemsInfo() {
        return this.visibleItemsInfo;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getWidth() {
        return this.$$delegate_0.getWidth();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public void placeChildren() {
        this.$$delegate_0.placeChildren();
    }

    public LazyListMeasureResult(LazyListMeasuredItem lazyListMeasuredItem, int i, boolean z, float f, MeasureResult measureResult, float f2, boolean z2, List<LazyListMeasuredItem> list, int i2, int i3, int i4, boolean z3, Orientation orientation, int i5, int i6) {
        this.firstVisibleItem = lazyListMeasuredItem;
        this.firstVisibleItemScrollOffset = i;
        this.canScrollForward = z;
        this.consumedScroll = f;
        this.scrollBackAmount = f2;
        this.remeasureNeeded = z2;
        this.visibleItemsInfo = list;
        this.viewportStartOffset = i2;
        this.viewportEndOffset = i3;
        this.totalItemsCount = i4;
        this.reverseLayout = z3;
        this.orientation = orientation;
        this.afterContentPadding = i5;
        this.mainAxisItemSpacing = i6;
        this.$$delegate_0 = measureResult;
    }

    public final boolean getCanScrollBackward() {
        LazyListMeasuredItem lazyListMeasuredItem = this.firstVisibleItem;
        return ((lazyListMeasuredItem == null || lazyListMeasuredItem.getIndex() == 0) && this.firstVisibleItemScrollOffset == 0) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
        if (java.lang.Math.min((r0.getOffset() + r0.getSizeWithSpacings()) - getViewportStartOffset(), (r2.getOffset() + r2.getSizeWithSpacings()) - getViewportEndOffset()) > (-r8)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
        if (java.lang.Math.min(getViewportStartOffset() - r0.getOffset(), getViewportEndOffset() - r2.getOffset()) > r8) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
        r7.firstVisibleItemScrollOffset -= r8;
        r0 = getVisibleItemsInfo();
        r2 = r0.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
        if (r1 >= r2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
        r0.get(r1).applyScrollDelta(r8, r9);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
        r7.consumedScroll = r8;
        r1 = true;
        r1 = true;
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
        if (r7.canScrollForward != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
        if (r8 <= 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
        r7.canScrollForward = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean tryToApplyScrollWithoutRemeasure(int r8, boolean r9) {
        /*
            r7 = this;
            boolean r0 = r7.remeasureNeeded
            r1 = 0
            if (r0 != 0) goto La4
            java.util.List r0 = r7.getVisibleItemsInfo()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto La4
            androidx.compose.foundation.lazy.LazyListMeasuredItem r0 = r7.firstVisibleItem
            if (r0 == 0) goto La4
            int r0 = r0.getSizeWithSpacings()
            int r2 = r7.firstVisibleItemScrollOffset
            int r2 = r2 - r8
            if (r2 < 0) goto La4
            if (r2 >= r0) goto La4
            java.util.List r0 = r7.getVisibleItemsInfo()
            java.lang.Object r0 = o.C8570dqm.b(r0)
            androidx.compose.foundation.lazy.LazyListMeasuredItem r0 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) r0
            java.util.List r2 = r7.getVisibleItemsInfo()
            java.lang.Object r2 = o.C8570dqm.g(r2)
            androidx.compose.foundation.lazy.LazyListMeasuredItem r2 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) r2
            boolean r3 = r0.getNonScrollableItem()
            if (r3 != 0) goto La4
            boolean r3 = r2.getNonScrollableItem()
            if (r3 == 0) goto L3f
            goto La4
        L3f:
            if (r8 >= 0) goto L65
            int r3 = r0.getOffset()
            int r0 = r0.getSizeWithSpacings()
            int r4 = r7.getViewportStartOffset()
            int r5 = r2.getOffset()
            int r2 = r2.getSizeWithSpacings()
            int r6 = r7.getViewportEndOffset()
            int r3 = r3 + r0
            int r3 = r3 - r4
            int r5 = r5 + r2
            int r5 = r5 - r6
            int r0 = java.lang.Math.min(r3, r5)
            int r2 = -r8
            if (r0 <= r2) goto La4
            goto L7d
        L65:
            int r3 = r7.getViewportStartOffset()
            int r0 = r0.getOffset()
            int r4 = r7.getViewportEndOffset()
            int r2 = r2.getOffset()
            int r3 = r3 - r0
            int r4 = r4 - r2
            int r0 = java.lang.Math.min(r3, r4)
            if (r0 <= r8) goto La4
        L7d:
            int r0 = r7.firstVisibleItemScrollOffset
            int r0 = r0 - r8
            r7.firstVisibleItemScrollOffset = r0
            java.util.List r0 = r7.getVisibleItemsInfo()
            int r2 = r0.size()
        L8a:
            if (r1 >= r2) goto L98
            java.lang.Object r3 = r0.get(r1)
            androidx.compose.foundation.lazy.LazyListMeasuredItem r3 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) r3
            r3.applyScrollDelta(r8, r9)
            int r1 = r1 + 1
            goto L8a
        L98:
            float r9 = (float) r8
            r7.consumedScroll = r9
            boolean r9 = r7.canScrollForward
            r1 = 1
            if (r9 != 0) goto La4
            if (r8 <= 0) goto La4
            r7.canScrollForward = r1
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListMeasureResult.tryToApplyScrollWithoutRemeasure(int, boolean):boolean");
    }
}
