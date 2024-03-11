package com.netflix.android.mdxpanel;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.netflix.mediaclient.android.widget.NetflixBottomSheetBehavior;
import o.C1045Mp;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class MdxBottomSheetBehavior<V extends View> extends NetflixBottomSheetBehavior<V> {
    public static final d c = new d(null);
    private boolean a;
    private final Rect b;

    public final Rect c() {
        return this.b;
    }

    public final void c(boolean z) {
        this.a = z;
    }

    public MdxBottomSheetBehavior() {
        setGestureInsetBottomIgnored(true);
        this.a = true;
        this.b = new Rect();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MdxBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) attributeSet, "");
        setGestureInsetBottomIgnored(true);
        this.a = true;
        this.b = new Rect();
    }

    @Override // com.netflix.mediaclient.android.widget.NetflixBottomSheetBehavior, com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C8632dsu.c((Object) coordinatorLayout, "");
        C8632dsu.c((Object) v, "");
        C8632dsu.c((Object) motionEvent, "");
        return this.a && super.onTouchEvent(coordinatorLayout, v, motionEvent);
    }

    @Override // com.netflix.mediaclient.android.widget.NetflixBottomSheetBehavior, com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C8632dsu.c((Object) coordinatorLayout, "");
        C8632dsu.c((Object) v, "");
        C8632dsu.c((Object) motionEvent, "");
        if (!this.a) {
            if (this.b.contains((int) (motionEvent.getX() - v.getX()), (int) (motionEvent.getY() - v.getY()))) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(coordinatorLayout, v, motionEvent);
    }

    /* loaded from: classes2.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("MdxBottomSheetBehavior");
        }

        public final <V extends View> MdxBottomSheetBehavior<V> c(V v) {
            C8632dsu.c((Object) v, "");
            ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
            CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
            }
            CoordinatorLayout.Behavior behavior = layoutParams2.getBehavior();
            BottomSheetBehavior bottomSheetBehavior = behavior instanceof BottomSheetBehavior ? (BottomSheetBehavior) behavior : null;
            if (bottomSheetBehavior == null) {
                throw new IllegalArgumentException("The view is not associated with MdxBottomSheetBehavior");
            }
            return (MdxBottomSheetBehavior) bottomSheetBehavior;
        }
    }
}
