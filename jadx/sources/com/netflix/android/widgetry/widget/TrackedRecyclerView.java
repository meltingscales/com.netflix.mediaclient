package com.netflix.android.widgetry.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class TrackedRecyclerView extends RecyclerView {
    private int a;

    protected abstract String c();

    public TrackedRecyclerView(Context context) {
        super(context);
        this.a = 0;
    }

    public TrackedRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
    }

    public TrackedRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            super.onLayout(z, i, i2, i3, i4);
            this.a = e(super.getAdapter());
        } catch (IndexOutOfBoundsException e) {
            throw new RowRecyclerException(e, c(), this.a, super.getAdapter());
        }
    }

    /* loaded from: classes2.dex */
    static class RowRecyclerException extends RuntimeException {
        private RowRecyclerException(IndexOutOfBoundsException indexOutOfBoundsException, String str, int i, RecyclerView.Adapter adapter) {
            super(String.format(Locale.US, "%s in %s, last layout count: %s, current count %s", indexOutOfBoundsException.getMessage(), str, Integer.valueOf(i), Integer.valueOf(TrackedRecyclerView.e(adapter))), indexOutOfBoundsException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int e(RecyclerView.Adapter adapter) {
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }
}
