package com.netflix.android.widgetry.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.android.widgetry.widget.TrackedLayoutManager;

/* loaded from: classes2.dex */
public abstract class TrackedLinearLayoutManager extends LinearLayoutManager implements TrackedLayoutManager {
    public TrackedLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    public TrackedLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            super.onLayoutChildren(recycler, state);
        } catch (IndexOutOfBoundsException e) {
            throw new TrackedLayoutManager.TrackedLayoutManagerException(e, c());
        }
    }
}
