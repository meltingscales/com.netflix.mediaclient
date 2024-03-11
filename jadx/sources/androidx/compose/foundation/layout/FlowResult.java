package androidx.compose.foundation.layout;

import androidx.compose.runtime.collection.MutableVector;

/* loaded from: classes.dex */
public final class FlowResult {
    public static final int $stable = MutableVector.$stable;
    private final int crossAxisTotalSize;
    private final MutableVector<RowColumnMeasureHelperResult> items;
    private final int mainAxisTotalSize;

    public final int getCrossAxisTotalSize() {
        return this.crossAxisTotalSize;
    }

    public final MutableVector<RowColumnMeasureHelperResult> getItems() {
        return this.items;
    }

    public final int getMainAxisTotalSize() {
        return this.mainAxisTotalSize;
    }

    public FlowResult(int i, int i2, MutableVector<RowColumnMeasureHelperResult> mutableVector) {
        this.mainAxisTotalSize = i;
        this.crossAxisTotalSize = i2;
        this.items = mutableVector;
    }
}
