package com.netflix.android.widgetry.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.android.widgetry.widget.TrackedLayoutManager;

/* loaded from: classes2.dex */
public abstract class TrackedGridLayoutManager extends GridLayoutManager implements TrackedLayoutManager {
    public TrackedGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public TrackedGridLayoutManager(Context context, int i) {
        super(context, i);
    }

    public TrackedGridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i, i2, z);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            super.onLayoutChildren(recycler, state);
        } catch (IndexOutOfBoundsException e) {
            throw new TrackedLayoutManager.TrackedLayoutManagerException(e, c());
        }
    }
}
