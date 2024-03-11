package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.airbnb.epoxy.Carousel;

/* renamed from: o.bJg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3750bJg extends Carousel {
    private boolean a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3750bJg(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3750bJg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    @Override // com.airbnb.epoxy.Carousel
    public Carousel.e c() {
        return null;
    }

    public final void setScrollingLocked(boolean z) {
        this.a = z;
    }

    public /* synthetic */ C3750bJg(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3750bJg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        setItemAnimator(null);
    }

    public final void setClipToPaddingToRow(boolean z) {
        setClipToPadding(z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C8632dsu.c((Object) motionEvent, "");
        if (this.a) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.a) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }
}
