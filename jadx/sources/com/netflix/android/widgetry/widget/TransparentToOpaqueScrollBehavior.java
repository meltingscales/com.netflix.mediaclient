package com.netflix.android.widgetry.widget;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import o.C1045Mp;
import o.C8627dsp;
import o.C8632dsu;
import o.C8657dts;
import o.C9895yc;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes2.dex */
public final class TransparentToOpaqueScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public static final d b = new d(null);
    public static final int c = 8;
    private int a;
    private final C9895yc d;
    private final int e;
    private final a f;
    private WeakReference<RecyclerView> g;
    private final int[] h;
    private final float i;
    private int j;

    public final C9895yc c() {
        return this.d;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        C8632dsu.c((Object) coordinatorLayout, "");
        C8632dsu.c((Object) v, "");
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) view2, "");
        return (i & 2) != 0;
    }

    public /* synthetic */ TransparentToOpaqueScrollBehavior(int i, int i2, int i3, float f, int i4, C8627dsp c8627dsp) {
        this(i, (i4 & 2) != 0 ? i : i2, (i4 & 4) != 0 ? PrivateKeyType.INVALID : i3, (i4 & 8) != 0 ? 0.7f : f);
    }

    public TransparentToOpaqueScrollBehavior(int i, int i2, int i3, float f) {
        this.j = i;
        this.a = i2;
        this.e = i3;
        this.i = f;
        this.d = new C9895yc(GradientDrawable.Orientation.TOP_BOTTOM, null);
        this.h = new int[2];
        this.f = new a(this);
        c(this.j, this.a);
    }

    /* loaded from: classes2.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("TransparentToOpaqueScrollBehavior");
        }
    }

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.OnScrollListener {
        final /* synthetic */ TransparentToOpaqueScrollBehavior<V> b;

        a(TransparentToOpaqueScrollBehavior<V> transparentToOpaqueScrollBehavior) {
            this.b = transparentToOpaqueScrollBehavior;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C8632dsu.c((Object) recyclerView, "");
            if (i2 == 0) {
                TransparentToOpaqueScrollBehavior<V> transparentToOpaqueScrollBehavior = this.b;
                transparentToOpaqueScrollBehavior.a(transparentToOpaqueScrollBehavior.b(recyclerView));
            }
        }
    }

    public final void c(RecyclerView recyclerView) {
        C8632dsu.c((Object) recyclerView, "");
        this.g = new WeakReference<>(recyclerView);
        recyclerView.addOnScrollListener(this.f);
        a(b(recyclerView));
    }

    public static /* synthetic */ void c(TransparentToOpaqueScrollBehavior transparentToOpaqueScrollBehavior, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = i;
        }
        transparentToOpaqueScrollBehavior.c(i, i2);
    }

    public final void c(int i, int i2) {
        RecyclerView recyclerView;
        this.j = i;
        this.a = i2;
        int[] iArr = this.h;
        iArr[0] = i;
        iArr[1] = i2;
        WeakReference<RecyclerView> weakReference = this.g;
        if (weakReference == null || (recyclerView = weakReference.get()) == null) {
            return;
        }
        a(b(recyclerView));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
        RecyclerView recyclerView;
        C8632dsu.c((Object) layoutParams, "");
        super.onAttachedToLayoutParams(layoutParams);
        WeakReference<RecyclerView> weakReference = this.g;
        if (weakReference == null || (recyclerView = weakReference.get()) == null) {
            return;
        }
        a(b(recyclerView));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
        C8632dsu.c((Object) coordinatorLayout, "");
        C8632dsu.c((Object) v, "");
        C8632dsu.c((Object) view, "");
        WeakReference<RecyclerView> weakReference = this.g;
        if (weakReference != null) {
            weakReference.get();
        }
        if (view instanceof RecyclerView) {
            WeakReference<RecyclerView> weakReference2 = this.g;
            if (C8632dsu.c(view, weakReference2 != null ? weakReference2.get() : null)) {
                RecyclerView recyclerView = (RecyclerView) view;
                a(b(recyclerView));
                d(i4, recyclerView, i5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float b(RecyclerView recyclerView) {
        float f;
        int height;
        float c2;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        Integer valueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.findFirstVisibleItemPosition()) : null;
        if (valueOf == null || valueOf.intValue() <= 0) {
            f = (recyclerView.getChildCount() <= 0 || (height = recyclerView.getChildAt(0).getHeight()) <= 0) ? 0.0f : (-recyclerView.getChildAt(0).getTop()) / height;
        } else {
            f = 1.0f;
        }
        c2 = C8657dts.c(f, 0.0f);
        return c2 / this.i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(float f) {
        this.h[0] = b(this.j, f);
        this.h[1] = b(this.a, f);
        this.d.setColors(this.h);
    }

    private final int b(int i, float f) {
        int c2;
        int alpha = Color.alpha(i);
        int i2 = this.e;
        c2 = C8657dts.c((int) (((i2 - alpha) * f) + alpha), alpha, i2);
        return ColorUtils.setAlphaComponent(i, c2);
    }

    private final void d(int i, RecyclerView recyclerView, int i2) {
        if (i2 == 1) {
            if ((i >= 0 || recyclerView.canScrollVertically(-1)) && (i <= 0 || recyclerView.canScrollVertically(1))) {
                return;
            }
            ViewCompat.stopNestedScroll(recyclerView, 1);
        }
    }
}
