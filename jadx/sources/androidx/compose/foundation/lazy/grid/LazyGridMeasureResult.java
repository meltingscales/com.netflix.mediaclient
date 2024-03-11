package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class LazyGridMeasureResult implements LazyGridLayoutInfo, MeasureResult {
    private final /* synthetic */ MeasureResult $$delegate_0;
    private final int afterContentPadding;
    private boolean canScrollForward;
    private float consumedScroll;
    private final LazyGridMeasuredLine firstVisibleLine;
    private int firstVisibleLineScrollOffset;
    private final int mainAxisItemSpacing;
    private final Orientation orientation;
    private final boolean remeasureNeeded;
    private final boolean reverseLayout;
    private final int totalItemsCount;
    private final int viewportEndOffset;
    private final int viewportStartOffset;
    private final List<LazyGridMeasuredItem> visibleItemsInfo;

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

    public final LazyGridMeasuredLine getFirstVisibleLine() {
        return this.firstVisibleLine;
    }

    public final int getFirstVisibleLineScrollOffset() {
        return this.firstVisibleLineScrollOffset;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.$$delegate_0.getHeight();
    }

    public Orientation getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public List<LazyGridMeasuredItem> getVisibleItemsInfo() {
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

    public LazyGridMeasureResult(LazyGridMeasuredLine lazyGridMeasuredLine, int i, boolean z, float f, MeasureResult measureResult, boolean z2, List<LazyGridMeasuredItem> list, int i2, int i3, int i4, boolean z3, Orientation orientation, int i5, int i6) {
        this.firstVisibleLine = lazyGridMeasuredLine;
        this.firstVisibleLineScrollOffset = i;
        this.canScrollForward = z;
        this.consumedScroll = f;
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
        LazyGridMeasuredLine lazyGridMeasuredLine = this.firstVisibleLine;
        return ((lazyGridMeasuredLine == null || lazyGridMeasuredLine.getIndex() == 0) && this.firstVisibleLineScrollOffset == 0) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
        if (java.lang.Math.min((androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(r0, getOrientation()) + r0.getMainAxisSizeWithSpacings()) - getViewportStartOffset(), (androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(r2, getOrientation()) + r2.getMainAxisSizeWithSpacings()) - getViewportEndOffset()) > (-r8)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008c, code lost:
        if (java.lang.Math.min(getViewportStartOffset() - androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(r0, getOrientation()), getViewportEndOffset() - androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(r2, getOrientation())) > r8) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
        r7.firstVisibleLineScrollOffset -= r8;
        r0 = getVisibleItemsInfo();
        r2 = r0.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
        if (r1 >= r2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
        r0.get(r1).applyScrollDelta(r8);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a9, code lost:
        r7.consumedScroll = r8;
        r1 = true;
        r1 = true;
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00af, code lost:
        if (r7.canScrollForward != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b1, code lost:
        if (r8 <= 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b3, code lost:
        r7.canScrollForward = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean tryToApplyScrollWithoutRemeasure(int r8) {
        /*
            r7 = this;
            boolean r0 = r7.remeasureNeeded
            r1 = 0
            if (r0 != 0) goto Lb5
            java.util.List r0 = r7.getVisibleItemsInfo()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb5
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r0 = r7.firstVisibleLine
            if (r0 == 0) goto Lb5
            int r0 = r0.getMainAxisSizeWithSpacings()
            int r2 = r7.firstVisibleLineScrollOffset
            int r2 = r2 - r8
            if (r2 < 0) goto Lb5
            if (r2 >= r0) goto Lb5
            java.util.List r0 = r7.getVisibleItemsInfo()
            java.lang.Object r0 = o.C8570dqm.b(r0)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem r0 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) r0
            java.util.List r2 = r7.getVisibleItemsInfo()
            java.lang.Object r2 = o.C8570dqm.g(r2)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem r2 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) r2
            boolean r3 = r0.getNonScrollableItem()
            if (r3 != 0) goto Lb5
            boolean r3 = r2.getNonScrollableItem()
            if (r3 == 0) goto L40
            goto Lb5
        L40:
            if (r8 >= 0) goto L6e
            androidx.compose.foundation.gestures.Orientation r3 = r7.getOrientation()
            int r3 = androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(r0, r3)
            int r0 = r0.getMainAxisSizeWithSpacings()
            int r4 = r7.getViewportStartOffset()
            androidx.compose.foundation.gestures.Orientation r5 = r7.getOrientation()
            int r5 = androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(r2, r5)
            int r2 = r2.getMainAxisSizeWithSpacings()
            int r6 = r7.getViewportEndOffset()
            int r3 = r3 + r0
            int r3 = r3 - r4
            int r5 = r5 + r2
            int r5 = r5 - r6
            int r0 = java.lang.Math.min(r3, r5)
            int r2 = -r8
            if (r0 <= r2) goto Lb5
            goto L8e
        L6e:
            int r3 = r7.getViewportStartOffset()
            androidx.compose.foundation.gestures.Orientation r4 = r7.getOrientation()
            int r0 = androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(r0, r4)
            int r4 = r7.getViewportEndOffset()
            androidx.compose.foundation.gestures.Orientation r5 = r7.getOrientation()
            int r2 = androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(r2, r5)
            int r3 = r3 - r0
            int r4 = r4 - r2
            int r0 = java.lang.Math.min(r3, r4)
            if (r0 <= r8) goto Lb5
        L8e:
            int r0 = r7.firstVisibleLineScrollOffset
            int r0 = r0 - r8
            r7.firstVisibleLineScrollOffset = r0
            java.util.List r0 = r7.getVisibleItemsInfo()
            int r2 = r0.size()
        L9b:
            if (r1 >= r2) goto La9
            java.lang.Object r3 = r0.get(r1)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem r3 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) r3
            r3.applyScrollDelta(r8)
            int r1 = r1 + 1
            goto L9b
        La9:
            float r0 = (float) r8
            r7.consumedScroll = r0
            boolean r0 = r7.canScrollForward
            r1 = 1
            if (r0 != 0) goto Lb5
            if (r8 <= 0) goto Lb5
            r7.canScrollForward = r1
        Lb5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridMeasureResult.tryToApplyScrollWithoutRemeasure(int):boolean");
    }
}
