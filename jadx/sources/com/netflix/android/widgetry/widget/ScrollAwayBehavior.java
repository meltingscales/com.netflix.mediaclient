package com.netflix.android.widgetry.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Keep;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.android.widgetry.lolomo.LolomoRecyclerView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.C9834xU;

/* loaded from: classes2.dex */
public class ScrollAwayBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    protected int a;
    protected View b;
    protected int c;
    protected View d;
    private int e;
    private int h;
    private YTranslationListener i;

    @Keep
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Edge {
    }

    @Keep
    /* loaded from: classes2.dex */
    public interface YTranslationListener {
        void onAttached();

        void onDetached();

        void onTranslateYChanged(View view, float f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public int b(Context context) {
        return context.getResources().getDimensionPixelSize(C9834xU.a.n);
    }

    public ScrollAwayBehavior(int i) {
        this(i, (View) null);
    }

    public ScrollAwayBehavior(int i, View view) {
        this.c = 0;
        this.e = 0;
        this.h = 0;
        this.a = i;
        this.d = view;
    }

    public ScrollAwayBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
        this.d = null;
        this.a = 48;
        this.e = 0;
        this.h = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof LolomoRecyclerView;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.b = v;
        coordinatorLayout.onLayoutChild(v, i);
        c(v, this.c);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
        a((View) v, i2);
        if (view instanceof RecyclerView) {
            e(i4, (RecyclerView) view, i5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
        if ((r0 + r7) < 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0042, code lost:
        if ((r0 + r1) > 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void a(android.view.View r6, int r7) {
        /*
            r5 = this;
            int r0 = r6.getHeight()
            int r1 = r5.e
            int r0 = r0 - r1
            int r1 = r5.a
            r2 = 48
            if (r1 == r2) goto L2c
            r2 = 80
            if (r1 == r2) goto L13
            r0 = 0
            goto L47
        L13:
            if (r7 <= 0) goto L20
            int r1 = r5.c
            if (r1 != r0) goto L1a
            return
        L1a:
            int r2 = r1 + r7
            if (r2 <= r0) goto L2a
            int r0 = r0 - r1
            goto L47
        L20:
            int r0 = r5.c
            if (r0 != 0) goto L25
            return
        L25:
            int r1 = r0 + r7
            if (r1 >= 0) goto L2a
            goto L44
        L2a:
            r0 = r7
            goto L47
        L2c:
            int r1 = -r7
            if (r1 >= 0) goto L3b
            int r2 = r5.c
            if (r2 != r0) goto L34
            return
        L34:
            int r3 = r2 + r1
            int r4 = -r0
            if (r3 >= r4) goto L46
            int r0 = r0 + r2
            goto L44
        L3b:
            int r0 = r5.c
            if (r0 != 0) goto L40
            return
        L40:
            int r2 = r0 + r1
            if (r2 <= 0) goto L46
        L44:
            int r0 = -r0
            goto L47
        L46:
            r0 = r1
        L47:
            int r1 = r5.c
            int r1 = r1 + r0
            r5.c = r1
            if (r7 <= 0) goto L77
            android.view.View r7 = r5.d
            if (r7 == 0) goto L77
            int r0 = r5.h
            if (r0 > 0) goto L62
            android.content.Context r7 = r7.getContext()
            int r7 = r5.b(r7)
            int r7 = r7 * (-1)
            r5.h = r7
        L62:
            int r7 = r5.h
            int r0 = r5.c
            android.view.View r1 = r5.d
            int r1 = r1.getHeight()
            int r1 = -r1
            int r0 = java.lang.Math.max(r0, r1)
            int r7 = java.lang.Math.max(r7, r0)
            r5.c = r7
        L77:
            int r7 = r5.c
            float r7 = (float) r7
            r5.c(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.android.widgetry.widget.ScrollAwayBehavior.a(android.view.View, int):void");
    }

    protected void c(View view, float f) {
        view.setTranslationY(f);
        a(view, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(View view, float f) {
        YTranslationListener yTranslationListener = this.i;
        if (yTranslationListener != null) {
            yTranslationListener.onTranslateYChanged(view, f);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        YTranslationListener yTranslationListener = this.i;
        if (yTranslationListener != null) {
            yTranslationListener.onAttached();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        YTranslationListener yTranslationListener = this.i;
        if (yTranslationListener != null) {
            yTranslationListener.onDetached();
        }
        d();
    }

    public void d() {
        View view = this.b;
        if (view != null) {
            c(view, 0.0f);
        }
        this.c = 0;
    }

    private void e(int i, RecyclerView recyclerView, int i2) {
        if (i2 == 1) {
            if ((i >= 0 || recyclerView.canScrollVertically(-1)) && (i <= 0 || recyclerView.canScrollVertically(1))) {
                return;
            }
            ViewCompat.stopNestedScroll(recyclerView, 1);
        }
    }
}
