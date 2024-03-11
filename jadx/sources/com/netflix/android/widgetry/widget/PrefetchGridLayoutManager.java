package com.netflix.android.widgetry.widget;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class PrefetchGridLayoutManager extends GridLayoutManager {
    private OrientationHelper a;
    private int e;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        C8632dsu.c((Object) state, "");
        C8632dsu.c((Object) layoutPrefetchRegistry, "");
        super.collectAdjacentPrefetchPositions(i, i2, state, layoutPrefetchRegistry);
        if (getChildCount() == 0 || this.e == 0) {
            return;
        }
        if (getOrientation() != 0) {
            i = i2;
        }
        View childAt = getChildAt(getLayoutDirection() == -1 ? 0 : getChildCount() - 1);
        if (i <= 0 || childAt == null) {
            return;
        }
        int decoratedEnd = this.a.getDecoratedEnd(childAt);
        int endAfterPadding = this.a.getEndAfterPadding();
        int position = getPosition(childAt);
        int i3 = this.e;
        for (int i4 = position + 2; i4 < position + 1 + i3 + 1; i4++) {
            if (i4 >= 0 && i4 < state.getItemCount()) {
                layoutPrefetchRegistry.addPosition(i4, Math.max(0, decoratedEnd - endAfterPadding));
            }
        }
    }
}
