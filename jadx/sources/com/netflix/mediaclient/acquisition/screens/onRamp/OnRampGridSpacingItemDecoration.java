package com.netflix.mediaclient.acquisition.screens.onRamp;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class OnRampGridSpacingItemDecoration extends RecyclerView.ItemDecoration {
    public static final int $stable = 0;
    private final int spacingPixels;
    private final int spanCount;

    public OnRampGridSpacingItemDecoration(int i, int i2) {
        this.spanCount = i;
        this.spacingPixels = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        C8632dsu.c((Object) rect, "");
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) recyclerView, "");
        C8632dsu.c((Object) state, "");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.spanCount;
        int i2 = childAdapterPosition % i;
        int i3 = this.spacingPixels;
        rect.left = (i2 * i3) / i;
        rect.right = i3 - (((i2 + 1) * i3) / i);
        if (childAdapterPosition >= i) {
            rect.top = i3;
        }
    }
}
