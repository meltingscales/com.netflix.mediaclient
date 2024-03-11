package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: o.zj  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9955zj extends LinearLayout {
    private Rect a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9955zj(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9955zj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9955zj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ C9955zj(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        a();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        a();
    }

    private final void a() {
        if (this.a == null) {
            this.a = new Rect();
        }
        Rect rect = this.a;
        if (rect != null) {
            rect.set(getLeft(), (int) (-getTranslationY()), getRight(), getHeight());
        }
        super.setClipBounds(this.a);
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        C8632dsu.c((Object) canvas, "");
        Rect rect = this.a;
        if (rect == null || !rect.isEmpty()) {
            super.draw(canvas);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        C8632dsu.c((Object) canvas, "");
        Rect rect = this.a;
        if (rect == null || !rect.isEmpty()) {
            super.onDraw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        C8632dsu.c((Object) canvas, "");
        Rect rect = this.a;
        if (rect == null || !rect.isEmpty()) {
            super.dispatchDraw(canvas);
        }
    }
}
