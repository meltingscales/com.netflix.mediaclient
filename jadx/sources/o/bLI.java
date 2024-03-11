package o;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes4.dex */
public class bLI extends bJB {
    public static final c b = new c(null);
    public static final int e = 8;
    private int f;
    private boolean g;
    private final PointF i;
    private boolean j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bLI(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bLI(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        C8632dsu.c((Object) view, "");
    }

    public /* synthetic */ bLI(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* loaded from: classes4.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bLI(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        this.i = new PointF();
        this.f = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.j || !this.g) {
            return;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C8632dsu.c((Object) motionEvent, "");
        boolean z = false;
        if (motionEvent.getAction() == 0) {
            this.i.x = motionEvent.getX();
            this.i.y = motionEvent.getY();
            this.j = false;
            this.g = false;
        } else if (motionEvent.getAction() == 2 && !this.g && !this.j) {
            float abs = Math.abs(this.i.y - motionEvent.getY());
            float abs2 = Math.abs(this.i.x - motionEvent.getX());
            float f = this.f;
            this.j = abs > f;
            if (abs2 > f && abs2 > abs) {
                z = true;
            }
            this.g = z;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // o.bJB, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C8632dsu.c((Object) motionEvent, "");
        return !b(motionEvent) && super.onInterceptTouchEvent(motionEvent);
    }

    private final boolean b(MotionEvent motionEvent) {
        return motionEvent.getAction() == 2 && this.g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i, int i2) {
        return super.fling(i, (int) (i2 * 0.8f));
    }
}
