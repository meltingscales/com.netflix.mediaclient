package com.airbnb.epoxy.stickyheader;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import o.C8632dsu;
import o.C8657dts;
import o.Z;
import o.dpR;
import o.drO;

/* loaded from: classes5.dex */
public final class StickyHeaderLinearLayoutManager extends LinearLayoutManager {
    private final List<Integer> a;
    private int b;
    private int c;
    private Z d;
    private final c e;
    private int f;
    private float g;
    private View h;
    private float i;

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(int i, int i2) {
        this.c = i;
        this.b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        C8632dsu.c((Object) recyclerView, "");
        super.onAttachedToWindow(recyclerView);
        a(recyclerView.getAdapter());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter<?> adapter, RecyclerView.Adapter<?> adapter2) {
        super.onAdapterChanged(adapter, adapter2);
        a(adapter2);
    }

    private final void a(RecyclerView.Adapter<?> adapter) {
        Z z = this.d;
        if (z != null) {
            z.unregisterAdapterDataObserver(this.e);
        }
        if (adapter instanceof Z) {
            Z z2 = (Z) adapter;
            this.d = z2;
            if (z2 != null) {
                z2.registerAdapterDataObserver(this.e);
            }
            this.e.onChanged();
            return;
        }
        this.d = null;
        this.a.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState != null) {
            return new SavedState(onSaveInstanceState, this.c, this.b);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        C8632dsu.c((Object) parcelable, "");
        SavedState savedState = (SavedState) parcelable;
        this.c = savedState.e();
        this.b = savedState.b();
        super.onRestoreInstanceState(savedState.d());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(final int i, final RecyclerView.Recycler recycler, final RecyclerView.State state) {
        C8632dsu.c((Object) recycler, "");
        C8632dsu.c((Object) state, "");
        int intValue = ((Number) d(new drO<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$scrollVerticallyBy$scrolled$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final Integer invoke() {
                int scrollVerticallyBy;
                scrollVerticallyBy = super/*androidx.recyclerview.widget.LinearLayoutManager*/.scrollVerticallyBy(i, recycler, state);
                return Integer.valueOf(scrollVerticallyBy);
            }
        })).intValue();
        if (intValue != 0) {
            b(recycler, false);
        }
        return intValue;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(final int i, final RecyclerView.Recycler recycler, final RecyclerView.State state) {
        C8632dsu.c((Object) recycler, "");
        C8632dsu.c((Object) state, "");
        int intValue = ((Number) d(new drO<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$scrollHorizontallyBy$scrolled$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final Integer invoke() {
                int scrollHorizontallyBy;
                scrollHorizontallyBy = super/*androidx.recyclerview.widget.LinearLayoutManager*/.scrollHorizontallyBy(i, recycler, state);
                return Integer.valueOf(scrollHorizontallyBy);
            }
        })).intValue();
        if (intValue != 0) {
            b(recycler, false);
        }
        return intValue;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(final RecyclerView.Recycler recycler, final RecyclerView.State state) {
        C8632dsu.c((Object) recycler, "");
        C8632dsu.c((Object) state, "");
        d(new drO<dpR>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$onLayoutChildren$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public final void a() {
                super/*androidx.recyclerview.widget.LinearLayoutManager*/.onLayoutChildren(recycler, state);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                a();
                return dpR.c;
            }
        });
        if (state.isPreLayout()) {
            return;
        }
        b(recycler, true);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        scrollToPositionWithOffset(i, Integer.MIN_VALUE);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void scrollToPositionWithOffset(int i, int i2) {
        a(i, i2, true);
    }

    private final void a(int i, int i2, boolean z) {
        b(-1, Integer.MIN_VALUE);
        if (!z) {
            super.scrollToPositionWithOffset(i, i2);
            return;
        }
        int e = e(i);
        if (e == -1 || d(i) != -1) {
            super.scrollToPositionWithOffset(i, i2);
            return;
        }
        int i3 = i - 1;
        if (d(i3) != -1) {
            super.scrollToPositionWithOffset(i3, i2);
        } else if (this.h != null && e == d(this.f)) {
            if (i2 == Integer.MIN_VALUE) {
                i2 = 0;
            }
            View view = this.h;
            C8632dsu.d(view);
            super.scrollToPositionWithOffset(i, i2 + view.getHeight());
        } else {
            b(i, i2);
            super.scrollToPositionWithOffset(i, i2);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(final RecyclerView.State state) {
        C8632dsu.c((Object) state, "");
        return ((Number) d(new drO<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$computeVerticalScrollExtent$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final Integer invoke() {
                int computeVerticalScrollExtent;
                computeVerticalScrollExtent = super/*androidx.recyclerview.widget.LinearLayoutManager*/.computeVerticalScrollExtent(state);
                return Integer.valueOf(computeVerticalScrollExtent);
            }
        })).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(final RecyclerView.State state) {
        C8632dsu.c((Object) state, "");
        return ((Number) d(new drO<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$computeVerticalScrollOffset$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final Integer invoke() {
                int computeVerticalScrollOffset;
                computeVerticalScrollOffset = super/*androidx.recyclerview.widget.LinearLayoutManager*/.computeVerticalScrollOffset(state);
                return Integer.valueOf(computeVerticalScrollOffset);
            }
        })).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(final RecyclerView.State state) {
        C8632dsu.c((Object) state, "");
        return ((Number) d(new drO<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$computeVerticalScrollRange$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final Integer invoke() {
                int computeVerticalScrollRange;
                computeVerticalScrollRange = super/*androidx.recyclerview.widget.LinearLayoutManager*/.computeVerticalScrollRange(state);
                return Integer.valueOf(computeVerticalScrollRange);
            }
        })).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(final RecyclerView.State state) {
        C8632dsu.c((Object) state, "");
        return ((Number) d(new drO<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$computeHorizontalScrollExtent$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final Integer invoke() {
                int computeHorizontalScrollExtent;
                computeHorizontalScrollExtent = super/*androidx.recyclerview.widget.LinearLayoutManager*/.computeHorizontalScrollExtent(state);
                return Integer.valueOf(computeHorizontalScrollExtent);
            }
        })).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(final RecyclerView.State state) {
        C8632dsu.c((Object) state, "");
        return ((Number) d(new drO<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$computeHorizontalScrollOffset$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final Integer invoke() {
                int computeHorizontalScrollOffset;
                computeHorizontalScrollOffset = super/*androidx.recyclerview.widget.LinearLayoutManager*/.computeHorizontalScrollOffset(state);
                return Integer.valueOf(computeHorizontalScrollOffset);
            }
        })).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(final RecyclerView.State state) {
        C8632dsu.c((Object) state, "");
        return ((Number) d(new drO<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$computeHorizontalScrollRange$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final Integer invoke() {
                int computeHorizontalScrollRange;
                computeHorizontalScrollRange = super/*androidx.recyclerview.widget.LinearLayoutManager*/.computeHorizontalScrollRange(state);
                return Integer.valueOf(computeHorizontalScrollRange);
            }
        })).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public PointF computeScrollVectorForPosition(final int i) {
        return (PointF) d(new drO<PointF>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$computeScrollVectorForPosition$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final PointF invoke() {
                PointF computeScrollVectorForPosition;
                computeScrollVectorForPosition = super/*androidx.recyclerview.widget.LinearLayoutManager*/.computeScrollVectorForPosition(i);
                return computeScrollVectorForPosition;
            }
        });
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View onFocusSearchFailed(final View view, final int i, final RecyclerView.Recycler recycler, final RecyclerView.State state) {
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) recycler, "");
        C8632dsu.c((Object) state, "");
        return (View) d(new drO<View>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$onFocusSearchFailed$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final View invoke() {
                View onFocusSearchFailed;
                onFocusSearchFailed = super/*androidx.recyclerview.widget.LinearLayoutManager*/.onFocusSearchFailed(view, i, recycler, state);
                return onFocusSearchFailed;
            }
        });
    }

    private final <T> T d(drO<? extends T> dro) {
        View view = this.h;
        if (view != null) {
            detachView(view);
        }
        T invoke = dro.invoke();
        View view2 = this.h;
        if (view2 != null) {
            attachView(view2);
        }
        return invoke;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
        if (getItemViewType(r5) == r6.getItemViewType(r7)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
        if (getPosition(r10) != r7) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(androidx.recyclerview.widget.RecyclerView.Recycler r9, boolean r10) {
        /*
            r8 = this;
            java.util.List<java.lang.Integer> r0 = r8.a
            int r0 = r0.size()
            int r1 = r8.getChildCount()
            if (r0 <= 0) goto Lc2
            if (r1 <= 0) goto Lc2
            r2 = 0
        Lf:
            r3 = 0
            r4 = -1
            if (r2 >= r1) goto L31
            android.view.View r5 = r8.getChildAt(r2)
            o.C8632dsu.d(r5)
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            o.C8632dsu.d(r6)
            androidx.recyclerview.widget.RecyclerView$LayoutParams r6 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r6
            boolean r7 = r8.c(r5, r6)
            if (r7 == 0) goto L2e
            int r1 = r6.getViewAdapterPosition()
            goto L34
        L2e:
            int r2 = r2 + 1
            goto Lf
        L31:
            r5 = r3
            r1 = r4
            r2 = r1
        L34:
            if (r5 == 0) goto Lc2
            if (r1 == r4) goto Lc2
            int r6 = r8.e(r1)
            if (r6 == r4) goto L4b
            java.util.List<java.lang.Integer> r7 = r8.a
            java.lang.Object r7 = r7.get(r6)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            goto L4c
        L4b:
            r7 = r4
        L4c:
            int r6 = r6 + 1
            if (r0 <= r6) goto L5d
            java.util.List<java.lang.Integer> r0 = r8.a
            java.lang.Object r0 = r0.get(r6)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L5e
        L5d:
            r0 = r4
        L5e:
            if (r7 == r4) goto Lc2
            if (r7 != r1) goto L68
            boolean r5 = r8.c(r5)
            if (r5 == 0) goto Lc2
        L68:
            int r5 = r7 + 1
            if (r0 == r5) goto Lc2
            android.view.View r5 = r8.h
            if (r5 == 0) goto L85
            o.Z r6 = r8.d
            if (r6 == 0) goto L82
            o.C8632dsu.d(r5)
            int r5 = r8.getItemViewType(r5)
            int r6 = r6.getItemViewType(r7)
            if (r5 != r6) goto L82
            goto L85
        L82:
            r8.a(r9)
        L85:
            android.view.View r5 = r8.h
            if (r5 != 0) goto L8c
            r8.c(r9, r7)
        L8c:
            if (r10 != 0) goto L99
            android.view.View r10 = r8.h
            o.C8632dsu.d(r10)
            int r10 = r8.getPosition(r10)
            if (r10 == r7) goto La1
        L99:
            android.view.View r10 = r8.h
            o.C8632dsu.d(r10)
            r8.d(r9, r10, r7)
        La1:
            android.view.View r9 = r8.h
            if (r9 == 0) goto Lc1
            if (r0 == r4) goto Lb3
            int r0 = r0 - r1
            int r2 = r2 + r0
            android.view.View r10 = r8.getChildAt(r2)
            android.view.View r0 = r8.h
            if (r10 != r0) goto Lb2
            goto Lb3
        Lb2:
            r3 = r10
        Lb3:
            float r10 = r8.e(r9, r3)
            r9.setTranslationX(r10)
            float r10 = r8.b(r9, r3)
            r9.setTranslationY(r10)
        Lc1:
            return
        Lc2:
            android.view.View r10 = r8.h
            if (r10 == 0) goto Lc9
            r8.a(r9)
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager.b(androidx.recyclerview.widget.RecyclerView$Recycler, boolean):void");
    }

    private final void c(RecyclerView.Recycler recycler, int i) {
        View viewForPosition = recycler.getViewForPosition(i);
        C8632dsu.a(viewForPosition, "");
        Z z = this.d;
        if (z != null) {
            z.d(viewForPosition);
        }
        addView(viewForPosition);
        e(viewForPosition);
        ignoreView(viewForPosition);
        this.h = viewForPosition;
        this.f = i;
    }

    private final void d(RecyclerView.Recycler recycler, View view, int i) {
        recycler.bindViewToPosition(view, i);
        this.f = i;
        e(view);
        if (this.c != -1) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new d(view, this));
        }
    }

    /* loaded from: classes5.dex */
    public static final class d implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ StickyHeaderLinearLayoutManager a;
        final /* synthetic */ View d;

        d(View view, StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager) {
            this.d = view;
            this.a = stickyHeaderLinearLayoutManager;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (this.a.c != -1) {
                StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager = this.a;
                stickyHeaderLinearLayoutManager.scrollToPositionWithOffset(stickyHeaderLinearLayoutManager.c, this.a.b);
                this.a.b(-1, Integer.MIN_VALUE);
            }
        }
    }

    private final void e(View view) {
        measureChildWithMargins(view, 0, 0);
        if (getOrientation() == 1) {
            view.layout(getPaddingLeft(), 0, getWidth() - getPaddingRight(), view.getMeasuredHeight());
        } else {
            view.layout(0, getPaddingTop(), view.getMeasuredWidth(), getHeight() - getPaddingBottom());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(RecyclerView.Recycler recycler) {
        View view = this.h;
        if (view == null) {
            return;
        }
        this.h = null;
        this.f = -1;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        Z z = this.d;
        if (z != null) {
            z.a(view);
        }
        stopIgnoringView(view);
        removeView(view);
        if (recycler != null) {
            recycler.recycleView(view);
        }
    }

    private final boolean c(View view, RecyclerView.LayoutParams layoutParams) {
        if (!layoutParams.isItemRemoved() && !layoutParams.isViewInvalid()) {
            if (getOrientation() == 1) {
                if (getReverseLayout()) {
                    if (view.getTop() + view.getTranslationY() <= getHeight() + this.g) {
                        return true;
                    }
                } else if (view.getBottom() - view.getTranslationY() >= this.g) {
                    return true;
                }
            } else if (getReverseLayout()) {
                if (view.getLeft() + view.getTranslationX() <= getWidth() + this.i) {
                    return true;
                }
            } else if (view.getRight() - view.getTranslationX() >= this.i) {
                return true;
            }
        }
        return false;
    }

    private final boolean c(View view) {
        if (getOrientation() == 1) {
            if (getReverseLayout()) {
                if (view.getBottom() - view.getTranslationY() > getHeight() + this.g) {
                    return true;
                }
            } else if (view.getTop() + view.getTranslationY() < this.g) {
                return true;
            }
        } else if (getReverseLayout()) {
            if (view.getRight() - view.getTranslationX() > getWidth() + this.i) {
                return true;
            }
        } else if (view.getLeft() + view.getTranslationX() < this.i) {
            return true;
        }
        return false;
    }

    private final float b(View view, View view2) {
        if (getOrientation() == 1) {
            float f = this.g;
            if (getReverseLayout()) {
                f += getHeight() - view.getHeight();
            }
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int i = marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0;
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                return getReverseLayout() ? C8657dts.c(view2.getBottom() + i, f) : C8657dts.h((view2.getTop() - (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) - view.getHeight(), f);
            }
            return f;
        }
        return this.g;
    }

    private final float e(View view, View view2) {
        if (getOrientation() == 0) {
            float f = this.i;
            if (getReverseLayout()) {
                f += getWidth() - view.getWidth();
            }
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int i = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                return getReverseLayout() ? C8657dts.c(view2.getRight() + (marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0), f) : C8657dts.h((view2.getLeft() - i) - view.getWidth(), f);
            }
            return f;
        }
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int d(int i) {
        int size = this.a.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            if (this.a.get(i3).intValue() > i) {
                size = i3 - 1;
            } else if (this.a.get(i3).intValue() >= i) {
                return i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private final int e(int i) {
        int size = this.a.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            if (this.a.get(i3).intValue() <= i) {
                if (i3 < this.a.size() - 1) {
                    int i4 = i3 + 1;
                    if (this.a.get(i4).intValue() <= i) {
                        i2 = i4;
                    }
                }
                return i3;
            }
            size = i3 - 1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int a(int i) {
        int size = this.a.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (this.a.get(i4).intValue() >= i) {
                    size = i4;
                }
            }
            if (this.a.get(i3).intValue() >= i) {
                return i3;
            }
            i2 = i3 + 1;
        }
        return -1;
    }

    /* loaded from: classes5.dex */
    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Creator();
        private final int a;
        private final int c;
        private final Parcelable e;

        /* loaded from: classes5.dex */
        public static final class Creator implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final SavedState createFromParcel(Parcel parcel) {
                C8632dsu.c((Object) parcel, "");
                return new SavedState(parcel.readParcelable(SavedState.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: d */
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public final int b() {
            return this.c;
        }

        public final Parcelable d() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final int e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SavedState) {
                SavedState savedState = (SavedState) obj;
                return C8632dsu.c(this.e, savedState.e) && this.a == savedState.a && this.c == savedState.c;
            }
            return false;
        }

        public int hashCode() {
            return (((this.e.hashCode() * 31) + Integer.hashCode(this.a)) * 31) + Integer.hashCode(this.c);
        }

        public String toString() {
            return "SavedState(superState=" + this.e + ", scrollPosition=" + this.a + ", scrollOffset=" + this.c + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C8632dsu.c((Object) parcel, "");
            parcel.writeParcelable(this.e, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.c);
        }

        public SavedState(Parcelable parcelable, int i, int i2) {
            C8632dsu.c((Object) parcelable, "");
            this.e = parcelable;
            this.a = i;
            this.c = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class c extends RecyclerView.AdapterDataObserver {
        final /* synthetic */ StickyHeaderLinearLayoutManager d;

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            this.d.a.clear();
            Z z = this.d.d;
            int itemCount = z != null ? z.getItemCount() : 0;
            for (int i = 0; i < itemCount; i++) {
                Z z2 = this.d.d;
                if (z2 != null && z2.c(i)) {
                    this.d.a.add(Integer.valueOf(i));
                }
            }
            if (this.d.h == null || this.d.a.contains(Integer.valueOf(this.d.f))) {
                return;
            }
            this.d.a((RecyclerView.Recycler) null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            int size = this.d.a.size();
            if (size > 0) {
                for (int a = this.d.a(i); a != -1 && a < size; a++) {
                    this.d.a.set(a, Integer.valueOf(((Number) this.d.a.get(a)).intValue() + i2));
                }
            }
            for (int i3 = i; i3 < i2 + i; i3++) {
                Z z = this.d.d;
                if (z != null && z.c(i3)) {
                    int a2 = this.d.a(i3);
                    if (a2 != -1) {
                        this.d.a.add(a2, Integer.valueOf(i3));
                    } else {
                        this.d.a.add(Integer.valueOf(i3));
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            int size = this.d.a.size();
            if (size > 0) {
                int i3 = i + i2;
                int i4 = i3 - 1;
                if (i <= i4) {
                    while (true) {
                        int d = this.d.d(i4);
                        if (d != -1) {
                            this.d.a.remove(d);
                            size--;
                        }
                        if (i4 == i) {
                            break;
                        }
                        i4--;
                    }
                }
                if (this.d.h != null && !this.d.a.contains(Integer.valueOf(this.d.f))) {
                    this.d.a((RecyclerView.Recycler) null);
                }
                for (int a = this.d.a(i3); a != -1 && a < size; a++) {
                    this.d.a.set(a, Integer.valueOf(((Number) this.d.a.get(a)).intValue() - i2));
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            int size = this.d.a.size();
            if (size > 0) {
                if (i < i2) {
                    for (int a = this.d.a(i); a != -1 && a < size; a++) {
                        int intValue = ((Number) this.d.a.get(a)).intValue();
                        if (intValue >= i && intValue < i + i3) {
                            this.d.a.set(a, Integer.valueOf(intValue - (i2 - i)));
                            c(a);
                        } else if (intValue < i + i3 || intValue > i2) {
                            return;
                        } else {
                            this.d.a.set(a, Integer.valueOf(intValue - i3));
                            c(a);
                        }
                    }
                    return;
                }
                for (int a2 = this.d.a(i2); a2 != -1 && a2 < size; a2++) {
                    int intValue2 = ((Number) this.d.a.get(a2)).intValue();
                    if (intValue2 >= i && intValue2 < i + i3) {
                        this.d.a.set(a2, Integer.valueOf(intValue2 + (i2 - i)));
                        c(a2);
                    } else if (i2 > intValue2 || intValue2 > i) {
                        return;
                    } else {
                        this.d.a.set(a2, Integer.valueOf(intValue2 + i3));
                        c(a2);
                    }
                }
            }
        }

        private final void c(int i) {
            int intValue = ((Number) this.d.a.remove(i)).intValue();
            int a = this.d.a(intValue);
            if (a != -1) {
                this.d.a.add(a, Integer.valueOf(intValue));
            } else {
                this.d.a.add(Integer.valueOf(intValue));
            }
        }
    }
}
