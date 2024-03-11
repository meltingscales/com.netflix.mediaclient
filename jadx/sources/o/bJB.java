package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* loaded from: classes4.dex */
public class bJB extends C3786bKp {
    private boolean b;
    private boolean e;
    public static final a d = new a(null);
    public static final int a = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bJB(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bJB(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public final void setInteractionsLocked(boolean z) {
        this.b = z;
    }

    public final void setScrollingLocked(boolean z) {
        this.e = z;
    }

    public /* synthetic */ bJB(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bJB(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
    }

    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("EpoxyLockableRecyclerView");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C8632dsu.c((Object) motionEvent, "");
        return (this.e || this.b) ? this.b : super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.e || this.b) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }
}
